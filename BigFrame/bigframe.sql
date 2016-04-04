/*
Navicat MySQL Data Transfer

Source Server         : me
Source Server Version : 50521
Source Host           : localhost:3306
Source Database       : bigframe

Target Server Type    : MYSQL
Target Server Version : 50521
File Encoding         : 65001

Date: 2013-11-26 19:54:49
*/
DROP DATABASE IF EXISTS `bigframe`;
CREATE DATABASE bigframe;
USE bigframe;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` text NOT NULL,
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('6', '1', '11', null);
INSERT INTO `article` VALUES ('7', '2', '22', null);
INSERT INTO `article` VALUES ('8', '3', '33', null);
INSERT INTO `article` VALUES ('9', '4', '44', null);
INSERT INTO `article` VALUES ('10', 'qqq', 'eee', '2013-11-22 23:23:02');
