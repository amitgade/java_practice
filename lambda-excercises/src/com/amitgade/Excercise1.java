package com.amitgade;

import java.util.function.Function;
import java.util.function.Supplier;

public class Excercise1 {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        Function<String, String> lambdaFun = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

//        System.out.println(lambdaFun.apply("1234567890"));
        System.out.println(Excercise1.everySecondCharacter(lambdaFun, "1234567890"));

        Supplier<String> iLoveJava = () -> "I Love Java";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }

    private static String everySecondCharacter(Function<String, String> lambdaFun, String source) {
        return lambdaFun.apply(source);
    }
}
