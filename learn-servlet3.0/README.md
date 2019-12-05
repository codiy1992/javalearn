## servlet3.0

> 主要增加了
>
> 异步处理支持、注解支持(使得从web.xml的配置中解放出来)、可插性支持
>
> 参考文档: https://www.ibm.com/developerworks/cn/java/j-lo-servlet30/index.html

> 另外3.0还引入了 javax.servlet.ServletContainerInitializer
> 使用ServletContainerInitializer在web容器启动时为开发者提供做初始化工作的机会
> 如注册filters, listeners, servlets等, Spring MVC正是利用了这一点.


> 在Servlet3.0环境中，
> 容器会在类路径中查找实现javax.servlet.ServletContainerInitializer接口的类，
> 如果能发现的话，就会用它来配置Servlet容器。
> Spring提供了这个接口的实现，名为SpringServletContainerInitializer，
> 这个类反过来又会查找实现WebApplicationInitializer的类并将配置的任务交给它们来完成。
> Spring3.2引入了一个便利的WebApplicationInitializer基础实现，
> 也就是AbstractAnnotationConfigDispatcherServletInitializer。
> 只要我们的实现类扩展了AbstractAnnotationConfigDispatcherServletInitializer（同时也就实现了WebApplicationInitializer），
> 因此当部署到Servlet3.0容器中的时候，容器会自动发现它，并用它来配置Servlet上下文。

