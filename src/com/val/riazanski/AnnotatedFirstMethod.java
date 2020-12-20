package com.val.riazanski;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value=ElementType.METHOD)  //анотация метода
@Retention(value= RetentionPolicy.RUNTIME)
public @interface AnnotatedFirstMethod {
    String name();
}
