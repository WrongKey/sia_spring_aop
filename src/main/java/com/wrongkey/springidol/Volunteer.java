package com.wrongkey.springidol;

/**
 *@author wrongkey
 *@description 读心术表演的志愿者
 *@date 2014/11/5
 *@version v1.0
 *
 */
public class Volunteer implements Thinker{
    private String thoughts;
    /**
     *@author wrongkey
     *@description 心中考虑一些事
     *@date 2014/11/5
     *@version v1.0
     *
     */
    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
