# 单体springboot改造spring cloud
## 确定改造内容

* maven整合
* 新增服务注册中心 eureka
* 新增服务调用 feign
* 新增服务

## maven整合
顶级pom文件修改  
dependencyManagement 管理其版本  
版本管理交由spring-cloud统一管理  
spring-cloud版本：Finchley.SR2  
spring-boot版本：2.0.2release

## 新增注册中心 | eureka
* 新增suer-eureka 作为单机服务注册中心   

```java
* org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'org.springframework.context.event.internalEventListenerProcessor': Initialization of bean failed; nested exception is java.lang.NoClassDefFoundError: org/springframework/boot/context/properties/ConfigurationPropertiesBean 
```
错误  版本问题 \
java.lang.AbstractMethodError: null
* gson 版本问题  自定义gosn版本

## 新增服务调用 | feign
* 添加 suser-client
* 添加服务消费模块 sub-user sub-user 添加依赖suser-client
* 添加依赖（服务端，调用端）
```xml
<dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
<dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```
服务端添加@EnableFeignClients \
调用端添加@EnableFeignClients \
@EnableFeignClients(basePackages = {"com.sangtao.subuser.feign"}) 未添加basePackages 报错找不到相应的服务
 Load balancer does not have available server for client: 
 
 ## 新增注册中心 / zookeeper
* 1.安装[zookeeper](https://zookeeper.apache.org/releases.html)  
* 2.新建spring-boot module suser-zookeeper  
* 3.添加 zk  依赖
```xml
<dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-zookeeper-all</artifactId>
</dependency>
<dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-zookeeper-dependencies</artifactId>
                <version>2.0.2.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
```
* 4.添加配置文件  
application.yml
```yml
# 注册服务的端口
server:
  port: 8971

## 关闭安全控制
management:
  security:
    enabled: false
#配置服务的名称
spring:
  application:
    name: zk-client
```
bootstrap.yml
```yml
spring:
  cloud:
    zookeeper:
      discovery:
        instancePort: 8971 #端口号
        enabled: true
        register: true
      connectString: 127.0.0.1:2181 # 多节点配置,通过逗号分割127.0.0.1:2182,127.0.0.1:2183
```
* 5.添加服务注册 注解 @EnableDiscoveryClient
* 6.服务提供者   
添加依赖
```xml
<dependency>
     <groupId>org.springframework.cloud</groupId>
     <artifactId>spring-cloud-starter-zookeeper-discovery</artifactId>
</dependency>
```
若提示httpclient添加相应依赖
```xml
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpclient</artifactId>
</dependency>
```
_去除eureka依赖_
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
``` 
* 7.服务消费者  
同服务端修改一致
