
var flag = 0;

var jsonData = "";//用于存储全部数据
//第一次加载时，通过 ajax 渲染页面
$(function(){
    init();
});

/*公共处理  方法  处理初始化页面
*/
function printinit(li_id,index,data){
    console.log("点击的id："+li_id);
    $('#ul_yesprint li i').css("color","blue");
    $('#ul_noprint li i').css("color","blue");
    $('#i_yes_id_0 i').css("color","green");
    $('#i_no_id_0 i').css("color","green");
    //局部改变样式
 /*   if(0==index){
        //给每个li 对应 的 i  设置样式
        $('#'+li_id+' i').css("color","green");

    }else{
        $('#'+li_id+' i').css("color","blue");
    }*/
    //统一设置 css及 class
    $('#ul_yesprint li i').addClass("layui-icon layui-icon-username");
    $('#ul_yesprint li a').css("font-size","16px");
    $('#ul_noprint li i').addClass("layui-icon layui-icon-username");
    $('#ul_noprint li a').css("font-size","16px");
    //局部改变 href  暂未设置
    //$('#ul_yesprint li a').attr("href","http://www.baidu.com");//设置访问的内容
    // $('#i_yes_id_'+index).on("click",yesprintOnClick(index));

    $('#'+li_id).click(function () {
        //alert(li_id);
        //用于刷新用户对应信息  以及  相关药品信息
        //1.未选中的标签变为蓝色,选中标签变为绿色
        $('#ul_yesprint li i').css("color","blue");
        $('#ul_noprint li i').css("color","blue");
        $('#'+li_id+' i').css("color","green");//点击后颜色变为绿色
        //处方号、发票号、挂号信息等  信息变更
        $('#recipeNo').attr("placeholder",data.recipeNo);
        $('#p_msg1').html("发票号："+data.invoiceNo+"&nbsp;&nbsp;&nbsp;门诊号："+data.cardNo
            +"&nbsp;&nbsp;&nbsp;姓名："+data.patientName+"&nbsp;&nbsp;&nbsp;性别："+data.sexCode
            +"&nbsp;&nbsp;&nbsp;年龄： "+data.age);

        $('#p_msg2').html("挂号日期："+timeTrans(data.regDate)+"&nbsp;&nbsp;收费人："+data.feeOper
            +"&nbsp;&nbsp;&nbsp;收费时间："+timeTrans(data.feeDate)+"&nbsp;&nbsp;&nbsp;看科室："+data.doctDept
            +"&nbsp;&nbsp;&nbsp;医生："+data.doctCode);


        /*console.log(index);
        console.log(data.recipeNo);*/
        //3.渲染  表格  每个处方对应各自的药品信息
        var url="http://localhost:8088/his/odJSON/recipes3/"+data.recipeNo;
        console.log(url);
        //使用 layUI自带表格进行渲染
        layTable1(data.recipeNo);

    });
}

/*
    (慎用layUI)用于处理页面中药品显示的方法  将每个处方对应的药品信息获取 并填充到对应的表格中
 */
function layTable1(recipeNo){
    var url="http://localhost:8088/his/odJSON/recipes3/"+recipeNo;
    layui.use('table', function(){
        var table = layui.table;

        //第一个实例，模拟数据在data/tableJson.json
        table.render({
            elem: '#demo'
            //,url: 'http://localhost:8088/his/data/tableJson1.json' //数据接口
            ,url: url //数据接口
            ,page: true //开启分页
            ,cols: [
                [ //表头
                    {field: 'tradeName', title: '药品名称[规格]', width:150, sort: true, fixed: 'left'}
                    ,{field: 'applyNum', title: '数量[单位]', width:120}
                    ,{field: 'usageCode', title: '用量', width:80, sort: true}
                    ,{field: 'dfqFreq', title: '频次', width:80}
                    ,{field: 'useName', title: '用法', width: 177}
                    ,{field: 'unitPrice', title: '单价', width: 80, sort: true}
                    ,{field: 'sumSale', title: '金额', width: 80, sort: true}
                    /*,{field: 'sum', title: '合计', width: 80}*/
                ]
            ]
        });
        //再次处理总金额   由于借助于layUI 框架  因此这里需要再次获取数据（需要修改！）
        $.getJSON(url,function(result){
            var allSumSale = 0.0;
            //遍历 对应的data 中的数据
            $.each(result.data,function (index,data) {
                //console.log(""+data.sumSale);
                allSumSale += data.sumSale;
            });
            console.log("总价:"+allSumSale);
            $('#allSumSale').text("总价"+allSumSale+"元");
        });
    });
}

//时间戳处理

function timeTrans(time) {
    if(null!=time){
        var date=new Date(time);
        var y = date.getFullYear();
        var m = date.getMonth() + 1;
        var d = date.getDate();
        var hour = date.getHours().toString();
        var minutes = date.getMinutes().toString();
        var seconds = date.getSeconds().toString();
        if (hour < 10) { hour = "0" + hour; } if (minutes < 10) { minutes = "0" + minutes; }
        if (seconds < 10) { seconds = "0" + seconds; }
        return y + '-' + (m < 10 ? ('0' + m) : m) + '-' + (d < 10 ? ('0' + d) : d) + " " + hour + ":" + minutes + ":" + seconds;

    }else{
        return "未交费！";
    }

}
function init() {
    //alert(1);
    var url = "http://localhost:8088/his/odJSON/recipes2";
    $.getJSON(url,function(result){
        jsonData = result;
        //动态处理所有已打印的病人信息
        $.each(result.yesPrintListVO,function (index,data) {
            var li_id = "i_yes_id_"+index;//设置已打印id编号
            $('#ul_yesprint').append("<li id='i_yes_id_"+index+"'><i></i>&nbsp;&nbsp;&nbsp;<a href=\"#\">"+data.patientName+"</a></li>");
            //给已经打印的处方号    设置对应内容，处理点击事件
            printinit(li_id,index,data);
        });
        //处理初次访问时，页面中信息
        showInfos(jsonData.yesPrintFirstVO);
        //动态处理所有未打印的病人信息
        $.each(result.noPrintListVO,function (index,data) {
            var li_id = "i_no_id_"+index;//设置未打印id编号
            $('#ul_noprint').append("<li id='"+li_id+"'><i></i>&nbsp;&nbsp;&nbsp;<a href=\"#\">"+data.patientName+"</a></li>");
            //给未经打印的处方号    设置对应内容，处理点击事件
            printinit(li_id,index,data);
        });

    });
}

/*
    已打印、未打印标签处理   信息显示不同进行相关处理
*/
function selectTag(i){
    if(0==i){//已打印选择框
        flag = 0;
        showInfos(jsonData.yesPrintFirstVO);
        printinit("i_yes_id_0",0,jsonData.yesPrintListVO[0]);
    }else{//未打印选择框
        flag = 1;
        showInfos(jsonData.noPrintFirstVO);
        printinit("i_no_id_0",0,jsonData.noPrintListVO[0]);

    }
    console.log("select:"+flag);
}

/*
    信息显示的方法
 */
function showInfos(dataName) {
    layTable1(dataName.recipeNo);
    //处理第一次信息
    $('#recipeNo').attr("placeholder",dataName.recipeNo);
    $('#p_msg1').html("发票号："+dataName.invoiceNo+"&nbsp;&nbsp;&nbsp;门诊号："+dataName.cardNo
        +"&nbsp;&nbsp;&nbsp;姓名："+dataName.patientName+"&nbsp;&nbsp;&nbsp;性别："+dataName.sexCode
        +"&nbsp;&nbsp;&nbsp;年龄： "+dataName.age);

    $('#p_msg2').html("挂号日期："+timeTrans(dataName.regDate)+"&nbsp;&nbsp;收费人："+dataName.feeOper
        +"&nbsp;&nbsp;&nbsp;收费时间："+timeTrans(dataName.feeDate)+"&nbsp;&nbsp;&nbsp;看科室："+dataName.doctDept
        +"&nbsp;&nbsp;&nbsp;医生："+dataName.doctCode);
}
