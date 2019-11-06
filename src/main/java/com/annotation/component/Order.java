package com.annotation.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author codiy
 */
@Component
public class Order {

   public String id;

   /**
    * java语言支持注解语法
    * spring框架在装载bean时, 通过反射机制和依赖注入, 读取解析类的注解部分, 并注入
    */
   @Autowired
   private User user;

   @Autowired
   private Goods goods;

   @Override
   public String toString() {
      return "Order{" +
              "id='" + id + '\'' +
              ", user=" + user +
              ", goods=" + goods +
              '}';
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

}
