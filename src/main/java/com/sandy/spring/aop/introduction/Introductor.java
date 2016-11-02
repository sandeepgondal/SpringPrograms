package com.sandy.spring.aop.introduction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class Introductor {

    @DeclareParents(value = "com.sandy.spring.aop.introduction.Calculator",
                    defaultImpl = InkPrinter.class)
    public static Printable printable;

}
