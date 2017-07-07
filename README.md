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
* 在你的Mysql中，创建一个数据库名称为 examination_system 的数据库，并导入我提供的 .sql 文件
* 使用 IntelliJ IDEA 导入项目，然后使用Maven构建该项目所需要的 jar包
* 在 IntelliJ IDEA 中，配置我们的 Tomcat， 然后把使用Maven构建好的项目添加到Tomcat中
* 运行

* 登录账户
  * 管理员账户：admin
  * 老师账户：1001
  * 学生账户：10001
  * 密码均为：123
