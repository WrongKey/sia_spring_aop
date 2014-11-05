package com.wrongkey.springidol;

/**
 *@author wrongkey
 *@description 批评家
 *@date 2014/11/6
 *@version v1.0
 *
 */
public class CriticismEngineImpl implements CriticismEngine{
    public CriticismEngineImpl() {
    }

    private String[] criticisms;

    public void setCriticisms(String[] criticisms) {
        this.criticisms = criticisms;
    }

    public String getCriticism() {
        int i = (int) (Math.random()*criticisms.length);
        return criticisms[i];
    }
}
