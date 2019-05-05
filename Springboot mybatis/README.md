# SpringBoot学习手册  
最近开始学习SpringBoot，而springboot作为一个轻量化的框架给java的框架使用提出了一种比较新的思路。

## SpringBoot+MyBatis  
Springboot+mybatis有两种主要的部署方式，分别是XML部署和注解部署。在这个demo中主要是实现了XML部署。使用XML部署的话主要就是改3个地方 数据类实体(model) 方法映射(mapper接口) 以及mapper的XML描述(XXmapper.xml)  
数据类实体一般是用于描述某个表的结构，方法映射则是接口，用于描述各种数据库方法如增删改查等。mapper.xml则是用于描述具体的查询语句。  
### application.properties配置
在配置方面，首先需要配置resources中的application.properties。此文件实际上是配置文件，里面装载的是整个项目的设置。其中有些配置时比较基础的。  
```mybatis.mapper-locations=classpath:{location mapper.xml}```  
用于设置mapper.xml的位置，此处所定义的路径时与application.properties的相对路径，而这个参数也支持批量匹配即可以读入多个XML。  
```mybatis.type-aliases-package={package}```  
用于指定model包位置，避免找不到包，原则上应该是可以支持多匹配的，但还没尝试过。  
```spring.datasource.url=jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true```  
```spring.datasource.username=root```  
```spring.datasource.password=root```  
```spring.datasource.driver-class-name=com.mysql.jdbc.Driver```  
上面四个分别是spring的连接路径，用户名，密码，和指定驱动。  
最简单的配置大概就是如此，如果需要更高级的功能比如设置最大连接时长之类的则需要自己再翻翻手册了。  
### mapper.xml配置
mapper.xml主要是用于描述具体的sql实现方式的。  
这里引用mybatis的描述  
[mapper的官网描述]("http://www.mybatis.org/mybatis-3/zh/sqlmap-xml.html")   
这里需要说一点的是，```<resultMap>```中的元素的```jdbcType```最好可以声明，我之前碰到过几个无法找到类型的问题就是因为再此处没有声明```jdbcType```。


