package com.wrongkey.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@author wrongkey
 *@description 测试aop配置
 *@date 2014/11/4
 *@version v1.0
 *
 */
public class Test {
    public static void main(String[] args)throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com.wrongkey.springidol/springidol.xml");
        Performer performer = (Performer)ctx.getBean("poeticjuggler");

        performer.perform();

        System.out.println("---------------------读心术表演------------------------");
    }
}
