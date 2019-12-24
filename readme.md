# 一个简单的应用程序
## 涉及技术
|序号                       |技术名称                         |版本
|---------------------------|---------------------------------|---------------------------
|1                          |spring boot                      |2.0.2release
|2                          |mybatis                          |随mybatis-spring-starter
|3                          |druid                            |随druid-spring-boot-starter
|4                          |mysql                            |5.6    
|5                          |logback                          |    

## 可能遇到的问题
* spring boot 启动失败，检查启动文件路径，是否在包内
* 跨域请求头设置 WebMvcConfigurerAdapter已废弃，现在实现WebMvcConfigurer的具体方法即可

## 改造过程
* branch:suser-spring-cloud  
添加spring-cloud(eureka,feign,zookeeper)
 
