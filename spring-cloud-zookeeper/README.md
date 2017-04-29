##spring-cloud-zookeeper

spring-cloud-zookeeper-service-provider is service provider, and 
spring-cloud-zookeeper-service-consumer is service consumer.

*  You need config the zookeeper ip and port(int application.yml). 
*  First, Set up the spring-cloud-zookeeper-service-provider.
*  Then, set up spring-cloud-zookeeper-service-consumer.
*  The 'http://localhost:8083/greeting', you can get the result if there is no something wrong with your config.

<br/>
CN:


这是一个基于zookeeper、spring的服务注册发现。spring-cloud-zookeeper-service-provider是服务提供者，
spring-cloud-zookeeper-service-consumer是服务消费者。


*  首先要配置下application.yml里面的zookeeper的ip和端口。
*  启动spring-cloud-zookeeper-service-provider，直接运行SpringCloudZookeeperServiceProviderApplication的main方法就行。
*  接着启动spring-cloud-zookeeper-service-consumer，直接运行SpringCloudZookeeperServiceConsumerApplication的main方法。
*  在浏览器里面输入http://localhost:8083/greeting ， 如果配置没什么问题的话，应该可以看到结果。


##Reference:
*  http://www.baeldung.com/spring-cloud-zookeeper?utm_content=buffer2741f&utm_medium=social&utm_source=facebook.com&utm_campaign=buffer
*  https://github.com/eugenp/tutorials/tree/master/spring-cloud/spring-cloud-zookeeper

<br/>
You can find more nice source code at 'https://github.com/eugenp/tutorials'.