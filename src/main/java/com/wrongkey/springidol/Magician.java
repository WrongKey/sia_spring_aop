package com.wrongkey.springidol;

/**
 *@author wrongkey
 *@description
 *@date 2014/11/5
 *@version v1.0
 *
 */
public class Magician implements MindReader{
    private String thoughts;

    /**
     *@author wrongkey
     *@description 截听志愿者心中的想法
     *@date 2014/11/5
     *@version v1.0
     *
     */
    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts...");
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
