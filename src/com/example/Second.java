package com.example;

import com.example.Main.MainAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Second {

    @Retention(RetentionPolicy.SOURCE)
    public @interface SecondAnnotation {
        int SECOND_ANNOTATION_CONST = 1;
    }

    public static int getValue1(@SecondAnnotation int val) {
      return val + 2;
    }

    public static int getValue(@MainAnnotation int val) {
      return val + 1;
    }
}
