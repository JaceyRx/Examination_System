# 简介
这个项目是一个简单的教务查询系统，该练手小项目希望能帮助到大家，熟悉SSM的整合开发

# 使用技术
IOC容器：Spring

Web框架：SpringMVC

ORM框架：Mybatis

安全框架：Shiro

数据源：C3P0

日志：log4j

前端框架：Bootstrap

# 快速上手
### 1、运行环境和所需工具
* 编译器：IntelliJ IDEA
* 项目构建工具：Maven
* 数据库：Mysql
* JDK版本：jdk1.8
* Tomcat版本：Tomcat8.x
### 2、初始化项目
* 在你的Mysql中，创建一个数据库名称为 examination_system 的数据库，并导入我提供的 .sql 文件,
* 进入src/main/resources修改mysql.properties配置文件,把数据库登录名和密码，改为你本地的
* 使用 IntelliJ IDEA 导入项目，选择Maven项目选项，一路点击next就行，导入项目后，如果src目录等，都没显示出来，别急先使用Maven构建该项目
* 在 IntelliJ IDEA 中，配置我们的 Tomcat， 然后把使用Maven构建好的项目添加到Tomcat中
* 运行
![image](http://imgsrc.baidu.com/forum/pic/item/5a8d9e1c8701a18b1ea553e4942f07082938fead.jpg)
* 登录账户
  * 管理员账户：admin
  * 老师账户：1001
  * 学生账户：10001
  * 密码均为：123
# 功能模块介绍
### 1、登录模块功能
使用Shiro权限管理框架，实现登录验证和登录信息的储存，根据不同的登录账户，分发权限角色，对不同页面url进行角色设置
### 2、管理员模块功能
管理员可对 教师信息、学生信息、课程信息 进行 增删改查 操作，管理员账户，可以重置非管理员账户的密码
* 课程管理：当课程已经有学生选课成功时，将不能删除
* 学生管理：添加学生信息时，其信息也会添加到登录表中
* 教师管理：同上
* 账户密码重置：
* 修改密码：
![image](http://imgsrc.baidu.com/forum/pic/item/96499412c8fcc3ce82d37e989845d688d53f20e7.jpg)
![image](http://imgsrc.baidu.com/forum/pic/item/e8829bfd5266d0165ce22a839d2bd40734fa357f.jpg)
![image](http://imgsrc.baidu.com/forum/pic/item/004a5ef082025aafccfdca60f1edab64024f1a23.jpg)
### 3、教师模块功能
教师登陆后，可以获取其，教授的课程列表，并可以给已经选择该课程的同学打分，无法对已经给完分的同学进行二次操作
* 我的课程
* 修改密码
![image](http://imgsrc.baidu.com/forum/pic/item/db884fd9f2d3572c8f662b778013632763d0c36b.jpg)
![image](http://imgsrc.baidu.com/forum/pic/item/7e08dedeb48f8c549e49728430292df5e1fe7f58.jpg)
![image](http://imgsrc.baidu.com/forum/pic/item/7c6d7482b2b7d0a2eb88b336c1ef76094a369ab6.jpg)
### 4、学生模块功能
学生登录后，根据学生信息，获取其已经选择的课程，和已经修完的课程
* 所有课程: 在这里选修课程，选好后，将会自动跳转到已选课程选项
* 已选课程: 这里显示的是，还没修完的课程，也就是老师还没给成绩，由于还没有给成绩，所以这里可以进行退课操作
* 已修课程: 显示已经修完，老师已经给成绩的课程
* 修改密码:
![image](http://imgsrc.baidu.com/forum/pic/item/8f86a0b1cb1349541f345ecf5c4e9258d0094ac8.jpg)
![image](http://imgsrc.baidu.com/forum/pic/item/4f0822b30f2442a7871a4b0edb43ad4bd01302da.jpg)
![image](http://imgsrc.baidu.com/forum/pic/item/821ad6f2b21193136cb8481b6f380cd790238d78.jpg)
