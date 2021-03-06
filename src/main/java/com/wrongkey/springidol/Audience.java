package com.wrongkey.springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 *@author wrongkey
 *@description 观众
 *@date 2014/11/4
 *@version v1.0
 *
 */
@Aspect
public class Audience {
    /**
     *@author wrongkey
     *@description
     *@date 2014/11/5
     *@version v1.0
     *
     */
    @Pointcut("execution(* com.wrongkey.springidol.Performer.perform(..))")
    public void performance(){

    }

    /**
     *@author wrongkey
     *@description 观众就坐
     *@date 2014/11/4
     *@version v1.0
     *
     */
    @Before("performance()")
    public void takeSeats(){
        System.out.println("The audience is taking their seats.");
    }

    /**
     *@author wrongkey
     *@description 关闭cellphone
     *@date 2014/11/4
     *@version v1.0
     *
     */
    @Before("performance()")
    public void turnOffCellPhones(){
          System.out.println("The audience is turning off their cellphones.");
    }

    /**
     *@author wrongkey
     *@description 观众鼓掌
     *@date 2014/11/4
     *@version v1.0
     *
     */
    @AfterReturning("performance()")
    public void applaud(){
        System.out.println("CLAP CLAP CLAP CLAP CLAP...");
    }

    /**
     *@author wrongkey
     *@description 观众要求退款
     *@date 2014/11/4
     *@version v1.0
     *
     */
    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Boo! We want our money back!");
    }

    /**
     *@author wrongkey
     *@description 环绕通知
     *@date 2014/11/5
     *@version v1.0
     *
     */
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinpoint){
        try{
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones.");
            long start = System.currentTimeMillis();

            joinpoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("CLAP CLAP CLAP CLAP CLAP...");
            System.out.println("The performance took "+(end-start)+" milliseconds.");

        }catch (Throwable t){
            System.out.println("Boo! We want our money back!");
        }
    }
}
