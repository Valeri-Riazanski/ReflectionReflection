package com.val.riazanski;

import java.lang.reflect.Field;

public class Test {

        @AnnotatedField(value = "default value")
        public String defaultValue ;

        @AnnotatedField(value = "My custom value")
        public String customValue;

        public static void main(String[] args) throws IllegalAccessException{
           Book book = Book.instanceOfBook(3);
           book.print();
           System.out.println("annotation name  = " + Book.class.getAnnotation(AnnotatedClass.class).name());
           for (Field fields : Book.class.getFields()) {
               System.out.println("fields of Book class " + fields.toString());
               AnnotatedField list = fields.getAnnotation(AnnotatedField.class);
               fields.set(book, list.value());
           }
            System.out.println();
            System.out.println();

            Test m = new Test();
            for(Field field : Test.class.getFields()) {
                System.out.println("fields of Test class " + field.toString());
                AnnotatedField customValue = field.getAnnotation(AnnotatedField.class);
                field.set(m, customValue.value());
            }
            System.out.println(m.customValue);
            System.out.println(m.defaultValue);
        }
}


