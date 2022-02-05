package com.amitgade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by amitgade on 05-Feb-2022
 */
public class Excercise2 {
    public static void main(String[] args) {
        List<String> topNames = Arrays.asList(
                "Alexandra",
                "Alia",
                "Aryan",
                "Emily",
                "Ira",
                "Charlie",
                "Jack",
                "harry",
                "gauranga",
                "nitya"
        );

        List<String> firstUpperCaseList = new ArrayList<>();
//        topNames.forEach(name-> firstUpperCaseList.add(name.substring(0, 1).toUpperCase() + name.substring(1)));
////        firstUpperCaseList.sort((s1, s2) -> s1.compareTo(s2));
////        firstUpperCaseList.forEach(s -> System.out.println(s));
//        firstUpperCaseList.sort(String::compareTo);
//        firstUpperCaseList.forEach(System.out::println);

        System.out.println("---------Using Stream-----------");
        topNames
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);

        System.out.println("---------Starting with 'A'-----------");
        long namesbeginingWithA = topNames
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println("Names begin with A :" + namesbeginingWithA);

        System.out.println("============================");
        List<String> sortedNames = topNames
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }
}
