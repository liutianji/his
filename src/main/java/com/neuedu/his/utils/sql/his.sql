/*
Navicat MySQL Data Transfer

Source Server         : MySQL5
Source Server Version : 50067
Source Host           : 127.0.0.1:3306
Source Database       : his

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2018-11-20 21:28:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `test_user`
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `uid` char(6) NOT NULL default '',
  `uname` char(20) default NULL,
  `upwd` char(32) default NULL,
  `ubirth` date default NULL,
  `uimg` char(30) default NULL,
  `ustate` int(2) default NULL,
  PRIMARY KEY  (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_user
-- ----------------------------
INSERT INTO `test_user` VALUES ('1', 'liu', '123', '1991-12-15', null, '0');
INSERT INTO `test_user` VALUES ('2', '刘', '123', '2018-11-20', null, '1');
