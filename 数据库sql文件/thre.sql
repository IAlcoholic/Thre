/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : thre

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2017-11-22 09:34:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for images
-- ----------------------------
DROP TABLE IF EXISTS `images`;
CREATE TABLE `images` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `imagename` varchar(255) DEFAULT NULL,
  `imagedescription` varchar(255) DEFAULT NULL,
  `imagekeyword` varchar(255) DEFAULT NULL,
  `imageurl` varchar(255) DEFAULT NULL,
  `state` int(11) DEFAULT NULL COMMENT '0可见  1不可见',
  `createtime` varchar(255) DEFAULT NULL,
  `userid` int(11) NOT NULL,
  `download` int(11) DEFAULT NULL COMMENT '0 可以下载 1不能下载',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of images
-- ----------------------------
INSERT INTO `images` VALUES ('1', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 18:55:26     ', '1', '0');
INSERT INTO `images` VALUES ('2', 'work_3.jpg', '我拍摄的风景照', '秋天', 'userimg', '1', '2017/11/19/ 18:55:43     ', '1', '0');
INSERT INTO `images` VALUES ('3', 'work_3.jpg', '我拍摄的风景照', '旅游', 'userimg', '0', '2017/11/19/ 18:58:58     ', '1', '0');
INSERT INTO `images` VALUES ('4', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 18:59:58     ', '1', '0');
INSERT INTO `images` VALUES ('5', 'work_3.jpg', '我拍摄的风景照', '旅游', 'userimg', '1', '2017/11/19/ 19:07:02     ', '1', '0');
INSERT INTO `images` VALUES ('6', 'work_3.jpg', '我拍摄的风景照', '雪', 'userimg', '0', '2017/11/19/ 19:07:02     ', '1', '0');
INSERT INTO `images` VALUES ('7', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:07:19     ', '1', '0');
INSERT INTO `images` VALUES ('8', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '1', '2017/11/19/ 19:07:19     ', '1', '0');
INSERT INTO `images` VALUES ('9', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:07:27     ', '1', '0');
INSERT INTO `images` VALUES ('10', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '1', '2017/11/19/ 19:07:27     ', '1', '0');
INSERT INTO `images` VALUES ('11', 'work_3.jpg', '我拍摄的风景照', '旅游', 'userimg', '1', '2017/11/19/ 19:07:31     ', '1', '0');
INSERT INTO `images` VALUES ('12', 'work_3.jpg', '我拍摄的风景照', '旅游', 'userimg', '0', '2017/11/19/ 19:07:31     ', '1', '0');
INSERT INTO `images` VALUES ('13', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '1', '2017/11/19/ 19:07:35     ', '1', '0');
INSERT INTO `images` VALUES ('14', 'work_3.jpg', '我拍摄的风景照', '旅游', 'userimg', '0', '2017/11/19/ 19:07:35     ', '1', '0');
INSERT INTO `images` VALUES ('15', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:09:52     ', '1', '0');
INSERT INTO `images` VALUES ('16', 'work_3.jpg', '我拍摄的风景照', '旅游', 'userimg', '1', '2017/11/19/ 19:09:52     ', '1', '0');
INSERT INTO `images` VALUES ('17', 'work_3.jpg', '我拍摄的风景照', '手机', 'userimg', '0', '2017/11/19/ 19:09:54     ', '1', '0');
INSERT INTO `images` VALUES ('18', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:09:54     ', '1', '0');
INSERT INTO `images` VALUES ('19', 'work_3.jpg', '我拍摄的风景照', '旅游', 'userimg', '0', '2017/11/19/ 19:09:57     ', '1', '0');
INSERT INTO `images` VALUES ('20', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:09:57     ', '1', '0');
INSERT INTO `images` VALUES ('21', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:09:58     ', '1', '0');
INSERT INTO `images` VALUES ('22', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:09:58     ', '1', '0');
INSERT INTO `images` VALUES ('23', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:09:58     ', '1', '0');
INSERT INTO `images` VALUES ('24', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:09:58     ', '1', '0');
INSERT INTO `images` VALUES ('25', 'work_3.jpg', '我拍摄的风景照', '图书馆', 'userimg', '0', '2017/11/19/ 19:09:59     ', '1', '0');
INSERT INTO `images` VALUES ('26', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:09:59     ', '1', '0');
INSERT INTO `images` VALUES ('27', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:09:59     ', '1', '0');
INSERT INTO `images` VALUES ('28', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:09:59     ', '1', '0');
INSERT INTO `images` VALUES ('29', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:09:59     ', '1', '0');
INSERT INTO `images` VALUES ('30', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:09:59     ', '1', '0');
INSERT INTO `images` VALUES ('31', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:10:00     ', '1', '0');
INSERT INTO `images` VALUES ('32', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:10:00     ', '1', '0');
INSERT INTO `images` VALUES ('33', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:10:00     ', '1', '0');
INSERT INTO `images` VALUES ('34', 'work_3.jpg', '我拍摄的风景照', '风景', 'userimg', '0', '2017/11/19/ 19:10:00     ', '1', '0');
INSERT INTO `images` VALUES ('35', 'true.jpg', null, '生日', 'true.jpg', '0', null, '1', null);
INSERT INTO `images` VALUES ('36', '颜色表.jpg', null, '生日', '颜色表.jpg', '0', null, '1', null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `qianming` varchar(255) DEFAULT NULL COMMENT '个性签名',
  `sex` varchar(255) DEFAULT NULL,
  `birthday` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `userimg` varchar(255) DEFAULT NULL,
  `regtime` datetime DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'yll', '123456', 'yll1', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('2', 'yll2', '123456', 'yll2', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('3', 'yll3', '123456', 'yll3', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('4', 'yll4', '123456', 'yll4', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('5', 'yll5', '123456', 'yll5', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('6', 'yll6', '123456', 'yll6', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('7', 'yll7', '123456', 'yll7', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('8', 'yll8', '123456', 'yll8', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('9', 'yll9', '123456', 'yll9', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('10', 'yll10', '123456', 'yll10', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('11', 'yll11', '123456', 'yll11', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('12', 'yll12', '123456', 'yll12', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('13', 'yll13', '123456', 'yll13', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('14', 'yll14', '123456', 'yll14', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('15', 'yll15', '123456', 'yll15', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('16', 'yll16', '123456', 'yll16', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('17', 'yll17', '123456', 'yll17', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('18', 'yll18', '123456', 'yll18', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('19', 'yll19', '123456', 'yll19', '这个人很懒，什么也没有。', '20', '2017/1/1', '125452555@qq.com', '111111111111', 'yll.png', null);
INSERT INTO `user` VALUES ('39', 'xubo123', '123456', null, '我很懒', null, '1996/2/3', null, null, null, null);
INSERT INTO `user` VALUES ('40', 'dyw7707832', '123456782', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('41', 'dyw770', '123456', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('42', 'dyw770', '123456', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('43', 'dyw770', '123456', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('44', '', '123456', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('45', 'dyw770', '123456452', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('46', 'dyw770', '123456', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('47', 'dyw770', '123456', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('48', '', '', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('49', '', '', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('50', 'dyw', '', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('51', 'dyw770', '123456', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('52', 'dyw770', '', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('53', '', '', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('54', '2453', '123456', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('55', '123456', '123456', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('56', '123456', '123', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('57', '123456', '123456', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('58', '123456', '345645', null, '', null, '', null, null, null, null);
INSERT INTO `user` VALUES ('59', '规范化', '1', null, '', null, '', null, null, null, null);

-- ----------------------------
-- Table structure for videos
-- ----------------------------
DROP TABLE IF EXISTS `videos`;
CREATE TABLE `videos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `videoname` varchar(255) DEFAULT NULL,
  `videodescription` varchar(255) DEFAULT NULL,
  `videokeyword` varchar(255) DEFAULT NULL,
  `videourl` varchar(255) DEFAULT NULL,
  `state` int(11) DEFAULT NULL COMMENT '0可见  1不可见',
  `createtime` varchar(255) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `download` int(11) DEFAULT NULL COMMENT '0 可以下载 1不能下载',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of videos
-- ----------------------------
INSERT INTO `videos` VALUES ('1', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:08:01     ', '1', '0');
INSERT INTO `videos` VALUES ('2', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:08:01     ', '1', '0');
INSERT INTO `videos` VALUES ('3', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:08:06     ', '1', '0');
INSERT INTO `videos` VALUES ('4', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:08:06     ', '1', '0');
INSERT INTO `videos` VALUES ('5', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:08:10     ', '1', '0');
INSERT INTO `videos` VALUES ('6', 'work_3.mp4', '我的生日视频', '聚会', 'uservideo', '0', '2017/11/19/ 19:08:10     ', '1', '0');
INSERT INTO `videos` VALUES ('7', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:08:13     ', '1', '0');
INSERT INTO `videos` VALUES ('8', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:08:13     ', '1', '0');
INSERT INTO `videos` VALUES ('9', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:08:17     ', '1', '0');
INSERT INTO `videos` VALUES ('10', 'work_3.mp4', '我的生日视频', '聚会', 'uservideo', '0', '2017/11/19/ 19:08:17     ', '1', '0');
INSERT INTO `videos` VALUES ('11', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:09:18     ', '1', '0');
INSERT INTO `videos` VALUES ('12', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:09:18     ', '1', '0');
INSERT INTO `videos` VALUES ('13', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:09:21     ', '1', '0');
INSERT INTO `videos` VALUES ('14', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:09:21     ', '1', '0');
INSERT INTO `videos` VALUES ('15', 'work_3.mp4', '我的生日视频', '聚会', 'uservideo', '0', '2017/11/19/ 19:09:26     ', '1', '0');
INSERT INTO `videos` VALUES ('16', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:09:26     ', '1', '0');
INSERT INTO `videos` VALUES ('17', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:09:27     ', '1', '0');
INSERT INTO `videos` VALUES ('18', 'work_3.mp4', '我的生日视频', '聚会', 'uservideo', '0', '2017/11/19/ 19:09:27     ', '1', '0');
INSERT INTO `videos` VALUES ('19', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:09:29     ', '1', '0');
INSERT INTO `videos` VALUES ('20', 'work_3.mp4', '我的生日视频', '聚会', 'uservideo', '0', '2017/11/19/ 19:09:29     ', '1', '0');
INSERT INTO `videos` VALUES ('21', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:09:31     ', '1', '0');
INSERT INTO `videos` VALUES ('22', 'work_3.mp4', '我的生日视频', '生日', 'uservideo', '0', '2017/11/19/ 19:09:31     ', '1', '0');
