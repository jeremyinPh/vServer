/*
*********************************************************************
SQLyog Ultimate v12.08 (32 bit)
MySQL - 8.0.18 : Database - vhr
****/
 

CREATE DATABASE IF NOT EXISTS `VSQL`  DEFAULT CHARACTER SET utf8;

USE `VSQL`;

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(15) DEFAULT NULL COMMENT '昵称',
  `pwd` varchar(18) DEFAULT NULL COMMENT '密码',
   `token` varchar(18) DEFAULT NULL COMMENT '令牌',
  `lastlogin` date DEFAULT NULL COMMENT '最后登录日期',
  `ip` varchar(14) DEFAULT NULL COMMENT 'IP',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000000000 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `events`;
CREATE TABLE `events` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `level` int(1) NOT NULL COMMENT '重要程度',
  `happen` date DEFAULT NULL COMMENT '产生日期',
  `content` varchar(255) DEFAULT NULL COMMENT '事件内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3000000000 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
   `currency` varchar(20) DEFAULT NULL COMMENT '货币对',
  `st` date DEFAULT NULL COMMENT '起始日期',
  `en` date DEFAULT NULL COMMENT '关闭日期',
  `hand` varchar(10) DEFAULT NULL COMMENT '手数',
  `p1` varchar(10) DEFAULT NULL COMMENT '起始点',
  `p2` varchar(10) DEFAULT NULL COMMENT '关闭点',
  `profit` double DEFAULT NULL COMMENT '盈利',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5000000000 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `predicts`;
CREATE TABLE `predicts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time` date NOT NULL COMMENT '起始日期',
  `content` varchar(225) NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7000000000 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `tags`;
CREATE TABLE `tags` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
   `name` varchar(20) NOT NULL COMMENT '标签名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `tagsmap`;
CREATE TABLE `tagsmap` (
  `tagid` int(11) NOT NULL COMMENT '标签id',
   `tid` varchar(20) NOT NULL COMMENT '其他表id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert  into `tags`( `name`) values ('USD'),('JPY'),('GBP');
insert into `users`(`name`, `pwd`, `token`, `lastlogin`, `ip`) values ('admin','admin','sfasfasf','2020-02-15','192.168.2.2'), ('guest','','dewrewr','2020-02-15','192.168.1.0');

select * from `users`;
select * from `tags`;

