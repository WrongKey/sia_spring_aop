package com.wrongkey.springidol;

/**
 *@author wrongkey
 *@description 读心者
 *@date 2014/11/5
 *@version v1.0
 *
 */
public interface MindReader {
    void interceptThoughts(String thoughts);

    String getThoughts();
}
