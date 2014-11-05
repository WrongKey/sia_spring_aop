package com.wrongkey.springidol;

/**
 *@author wrongkey
 *@description Juggler，杂技师
 *@date 2014/10/26
 *@version v1.0
 *
 */
public class Juggler implements Performer{
    private String name;    //表演者姓名
    private int beanBags;   //抛豆袋子的数量

    public Juggler(String name){
        this.name = name;
    }

    public Juggler(String name,int beanBags){
        this.name = name;
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerformanceException{
        System.out.println(name+" juggling "+beanBags+" beanbags!");
    }
}
