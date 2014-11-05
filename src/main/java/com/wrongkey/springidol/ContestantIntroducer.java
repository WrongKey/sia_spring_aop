package com.wrongkey.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 *@author wrongkey
 *@description
 *@date 2014/11/5
 *@version v1.0
 *
 */
@Aspect
public class ContestantIntroducer {
    @DeclareParents(value = "com.wrongkey.springidol.Performer+",
            defaultImpl = GraciousContestant.class)
    public static Contestant contestant;
}
