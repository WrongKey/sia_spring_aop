package com.wrongkey.springidol;

/**
 *@author wrongkey
 *@description
 *@date 2014/11/5
 *@version v1.0
 *
 */
public class GraciousContestant implements Contestant{
    @Override
    public void receiveAward() {
        System.out.println("Why, thank you all very much!");
    }
}
