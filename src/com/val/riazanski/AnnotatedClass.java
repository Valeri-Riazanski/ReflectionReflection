package com.val.riazanski;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value=ElementType.TYPE)  //анотация класса
@Retention(value= RetentionPolicy.RUNTIME)
public @interface AnnotatedClass {
    String name();
}