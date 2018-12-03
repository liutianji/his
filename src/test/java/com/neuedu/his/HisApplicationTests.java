package com.neuedu.his;

import com.neuedu.his.dao.UserRepository;
import com.neuedu.his.jpa.pojo.PhaStoRecipeEntity;
import com.neuedu.his.jpa.pojo.TestUserEntity;
import com.neuedu.his.mapper.PhaStoRecipeEntityMapper;
import com.neuedu.his.pojo.TestUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HisApplicationTests {


	@Resource
	private RedisTemplate<String, Object> redisTemplate;
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	UserRepository userRepository;
	@Autowired
	PhaStoRecipeEntityMapper phaStoRecipeEntityMapper;
	private String testString = "testString";
	private String userKey = "neu_1";

	@Test
	public void contextLoads() {
	}

	/*
	测试字符串录入缓存
	 */
	@Test
	public void testAddString(){
		redisTemplate.opsForValue().set("test:set","testValue1");


	}

	/*
	测试对象录入缓存
	 */
	@Test
	public void testAddUser(){
		//1,添加一个Value为String
		stringRedisTemplate.opsForValue().set(testString, "测试存储字符串类型");
		//2,添加一个Value为对象
		TestUser user = new TestUser();
		user.setUid(userKey);
		user.setUname("刘");
		user.setUbirth(new Date());
		redisTemplate.opsForValue().set(user.getUid(), user);
	}

	/*
	测试 从缓存中取对象
	 */
	@Test
	public void testFindOne(){
		TestUser user =	(TestUser) redisTemplate.opsForValue().get(userKey);
		System.out.println(user.toString());
	}
	/*
	测试向缓存中录入集合  并取出集合
	 */
	@Test
	public void testFindList(){
		//向redis中添加数据
		List<TestUser> users = new ArrayList<TestUser>();
		TestUser user1 = new TestUser();
		user1.setUid("1");
		user1.setUname("刘");
		user1.setUbirth(new Date());
		TestUser user2 = new TestUser();
		user2.setUid("2");
		user2.setUname("neu");
		user2.setUbirth(new Date());
		users.add(user1);
		users.add(user2);
		redisTemplate.opsForValue().set("users", users);

		//从缓存中读取数据
		List<TestUser> getUsers = new ArrayList<TestUser>();
		getUsers = (List<TestUser>)redisTemplate.opsForValue().get("users");
		for(TestUser user:getUsers) {
			System.out.println(user.toString());
		}
	}
	/*
	测试JPA Example查询
	对象中为空的值  忽略
	 */
	@Test
	public void testJPAExample(){
		TestUserEntity user = new TestUserEntity();
		user.setUname("刘");
		Example<TestUserEntity> example = Example.of(user);
		List<TestUserEntity> list = userRepository.findAll(example);
		System.out.println("查询到的用户数量:"+list.size());
	}
	/*
	测试JPA 自定义规则查询
	 */
	@Test
	public void testExampleMatcher(){
		TestUserEntity user = new TestUserEntity();
		user.setUname("刘");
		user.setUpwd("1");
		ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("uname",ExampleMatcher.GenericPropertyMatchers.startsWith())//模糊查询匹配开头，即{uname}%
		.withMatcher("upwd",ExampleMatcher.GenericPropertyMatchers.contains());//全部模糊查询，即%{upwd}%
		Example<TestUserEntity> example = Example.of(user,matcher);
		List<TestUserEntity> list = userRepository.findAll(example);
		//使用Lambda表达式遍历
		list.forEach((u)-> System.out.println(u));
		System.out.println("~~~~~~~~");
		//java8中使用::  双冒号进行处理
		list.forEach(System.out::println);
	}

	/*
	测试xml文件中查询方法
	 */
	@Test
	public void testSelectByPrimaryKey(){
		PhaStoRecipeEntity recipe = phaStoRecipeEntityMapper.selectByPrimaryKey("RN000001");
		System.out.println(recipe.toString());
	}
}
