/*
Navicat MySQL Data Transfer

Source Server         : vm
Source Server Version : 50556
Source Host           : vm:3306
Source Database       : lgt

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2017-10-30 20:42:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for spend_commodity
-- ----------------------------
DROP TABLE IF EXISTS `spend_commodity`;
CREATE TABLE `spend_commodity` (
  `id` int(11) NOT NULL,
  `store_id` int(11) DEFAULT NULL COMMENT '商店id',
  `type_id` int(11) DEFAULT NULL COMMENT '类型',
  `name` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` float(10,2) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of spend_commodity
-- ----------------------------

-- ----------------------------
-- Table structure for spend_store
-- ----------------------------
DROP TABLE IF EXISTS `spend_store`;
CREATE TABLE `spend_store` (
  `id` int(11) NOT NULL,
  `name` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '店名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='店';

-- ----------------------------
-- Records of spend_store
-- ----------------------------

-- ----------------------------
-- Table structure for spend_type
-- ----------------------------
DROP TABLE IF EXISTS `spend_type`;
CREATE TABLE `spend_type` (
  `id` int(11) NOT NULL,
  `desc` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='花费类型';

-- ----------------------------
-- Records of spend_type
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for user_send_email
-- ----------------------------
DROP TABLE IF EXISTS `user_send_email`;
CREATE TABLE `user_send_email` (
  `id` int(11) NOT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `type` int(2) DEFAULT NULL COMMENT '1: 不发送；2: 发送',
  `send_time` datetime DEFAULT NULL COMMENT '发送时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='发送邮件';

-- ----------------------------
-- Records of user_send_email
-- ----------------------------

-- ----------------------------
-- Table structure for user_spend
-- ----------------------------
DROP TABLE IF EXISTS `user_spend`;
CREATE TABLE `user_spend` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL COMMENT '时间',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `type_id` int(11) DEFAULT NULL COMMENT '类型',
  `price` float(11,2) DEFAULT NULL COMMENT '价格',
  `discount` float(11,2) DEFAULT '0.00' COMMENT '优惠价格',
  `final_price` float(11,2) DEFAULT NULL COMMENT '最终价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_spend
-- ----------------------------

-- ----------------------------
-- Table structure for user_spend_detail
-- ----------------------------
DROP TABLE IF EXISTS `user_spend_detail`;
CREATE TABLE `user_spend_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `spend_id` int(11) DEFAULT NULL COMMENT 'spend id',
  `commodity_id` int(11) DEFAULT NULL COMMENT '商品id',
  `price` float(11,2) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_spend_detail
-- ----------------------------
