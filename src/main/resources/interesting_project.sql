/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50551
Source Host           : localhost:3306
Source Database       : interesting_project

Target Server Type    : MYSQL
Target Server Version : 50551
File Encoding         : 65001

Date: 2018-07-26 11:16:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `content`
-- ----------------------------
DROP TABLE IF EXISTS `content`;
CREATE TABLE `content` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `uid` int(16) DEFAULT '0' COMMENT '发布用户id',
  `type_id` int(16) DEFAULT '0' COMMENT '所属话题组id',
  `title` varchar(256) DEFAULT '' COMMENT '标题',
  `content` varchar(2048) DEFAULT '' COMMENT '内容',
  `imgs` varchar(256) DEFAULT '' COMMENT '图片路径数组通过、分割',
  `likes` int(16) DEFAULT '0' COMMENT '点赞数',
  `comments` int(16) DEFAULT '0' COMMENT '评论数',
  `type` int(4) DEFAULT '0' COMMENT '内容类型 -1敏感内容 0普通内容 1推荐内容 2精华内容',
  `updated` datetime DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='发布信息详情表';

-- ----------------------------
-- Records of content
-- ----------------------------

-- ----------------------------
-- Table structure for `group`
-- ----------------------------
DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `owner_id` int(16) DEFAULT '0' COMMENT '圈主id',
  `title` varchar(32) DEFAULT '' COMMENT '圈子标题',
  `type_id` int(16) DEFAULT '0' COMMENT '分组id',
  `views` int(32) DEFAULT '0' COMMENT '访问量',
  `topics` int(16) DEFAULT '0' COMMENT '话题数',
  `peoples` int(16) DEFAULT '0' COMMENT '圈成员数',
  `updated` datetime DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='圈子基础信息表';

-- ----------------------------
-- Records of group
-- ----------------------------

-- ----------------------------
-- Table structure for `interactive`
-- ----------------------------
DROP TABLE IF EXISTS `interactive`;
CREATE TABLE `interactive` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `content_id` int(16) DEFAULT '0' COMMENT '内容信息id',
  `like` int(2) DEFAULT '0' COMMENT '点赞',
  `comment` varchar(256) DEFAULT '' COMMENT '评论内容',
  `from_uid` int(16) DEFAULT '0' COMMENT '评论用户id',
  `to_uid` int(16) DEFAULT '0' COMMENT '回复用户id',
  `updated` datetime DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='记录用户点赞评论表';

-- ----------------------------
-- Records of interactive
-- ----------------------------

-- ----------------------------
-- Table structure for `type`
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `title` varchar(16) DEFAULT '' COMMENT '分组标题',
  `img_url` varchar(64) DEFAULT '' COMMENT '分组标题图',
  `updated` datetime DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='话题组基础信息表';

-- ----------------------------
-- Records of type
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `group_id` int(16) DEFAULT '0' COMMENT '所属圈子',
  `nickname` varchar(32) DEFAULT '' COMMENT '昵称',
  `account` varchar(32) DEFAULT '',
  `password` varchar(256) DEFAULT '',
  `type` int(8) DEFAULT '0' COMMENT '账号类型 0普通用户 1管理员 2高级管理员',
  `phone` varchar(16) DEFAULT '',
  `email` varchar(32) DEFAULT '',
  `gender` int(4) DEFAULT '0' COMMENT '性别 0女 1男',
  `avatar` varchar(64) DEFAULT '' COMMENT '头像文件路径',
  `signature` varchar(256) DEFAULT '' COMMENT '个性签名',
  `popularity` int(16) DEFAULT '0' COMMENT '人气值',
  `address` varchar(64) DEFAULT '' COMMENT '地址',
  `integral` int(32) DEFAULT '0' COMMENT '积分',
  `wx_id` int(16) DEFAULT '0' COMMENT '微信详情表id',
  `updated` datetime DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表-->存储用户基础信息、关联微信表';

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for `wx_info`
-- ----------------------------
DROP TABLE IF EXISTS `wx_info`;
CREATE TABLE `wx_info` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(64) DEFAULT '' COMMENT '微信昵称',
  `avatar_url` varchar(256) DEFAULT '' COMMENT '微信头像url',
  `gender` int(4) DEFAULT '0' COMMENT '0未知 1男 2女',
  `country` varchar(16) DEFAULT '' COMMENT '所在国家',
  `province` varchar(16) DEFAULT '' COMMENT '省',
  `city` varchar(16) DEFAULT '' COMMENT '所在市',
  `updated` datetime DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='微信信息详情表';

-- ----------------------------
-- Records of wx_info
-- ----------------------------
