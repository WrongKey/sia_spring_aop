package com.wrongkey.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *@author wrongkey
 *@description
 *@date 2014/11/5
 *@version v1.0
 *
 */
@Aspect
public class Magician implements MindReader{
    private String thoughts;

    @Pointcut("execution(* com.wrongkey.springidol.Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts){

    }
    /**
     *@author wrongkey
     *@description 截听志愿者心中的想法
     *@date 2014/11/5
     *@version v1.0
     *
     */
    @Override
    @Before("thinking(thoughts)")
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts...");
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
