package com.wrongkey.springidol;

/**
 *@author wrongkey
 *@description 裁判
 *@date 2014/11/6
 *@version v1.0
 *
 */
public aspect JudgeAspect {
    public JudgeAspect() {
    }

    pointcut performance() : execution(* perform(..));

    after() returning() : performance(){
        System.out.println(criticismengine);
    }

    //injected
    private CriticismEngine criticismengine;

    public void setCriticismengine(CriticismEngine criticismengine) {
        this.criticismengine = criticismengine;
    }
}
