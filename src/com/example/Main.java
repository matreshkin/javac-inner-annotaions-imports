package com.example;

import com.example.Second.SecondAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Main {


    public static void main(String[] args) {
        System.out.println("Val=" + MainAnnotation.MAIN_ANNOTATION_CONST
            + Second.getValue(SecondAnnotation.SECOND_ANNOTATION_CONST)
            + Second.getValue1(SecondAnnotation.SECOND_ANNOTATION_CONST));
    }

    @SecondAnnotation
    @Retention(RetentionPolicy.SOURCE)
    public @interface MainAnnotation {
        int MAIN_ANNOTATION_CONST = 0;
    }
}
