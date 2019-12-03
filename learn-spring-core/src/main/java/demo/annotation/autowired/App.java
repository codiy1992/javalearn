package demo.annotation.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author codiy
 */
public class App {

    public static void main(String[] args)
    {
        // 实例化应用上下文(装载bean，将各种类实例化装载到内存heap空间, 没有被使用后, 由gc回收)
        ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.autowired.beans.xml");

        // 不使用注解
        Order order = (Order) ac.getBean("order");
        System.out.println(order);

        // 使用注解
        Order2 order2 = (Order2) ac.getBean("order2");
        System.out.println(order2);
    }
}
