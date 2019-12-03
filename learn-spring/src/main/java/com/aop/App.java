package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args)
    {

        // 实例化应用上下文(装载bean，将各种类实例化装载到内存heap空间, 没有被使用后, 由gc回收)
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop.beans.xml");

        // 不用bean代理
        ServiceInterface ms = (ServiceInterface) ac.getBean("myService");
        ms.sayHello();
        ServiceInterface2 ms2 = (ServiceInterface2) ms;
        ms2.sayBye();
        System.out.println("==============================================");

        // 使用bean代理
        // 这里只需拿到bean代理工厂实例, 根据接口来调用, 至于具体的类实例已经托管给框架来管理了
        // 并不调用任何具体的实现, 只调用抽象接口
        ServiceInterface ts = (ServiceInterface) ac.getBean("proxyFactoryBean");
        ts.sayHello();
        System.out.println("----------------------------------------");
        ServiceInterface2 ts2 = (ServiceInterface2) ts;
        ts2.sayBye();


        // 结论:
        //
    }
}
