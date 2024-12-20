package com.korit.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> numbers2 = null;
        List<Integer> numbers3 = null;

        System.out.println(numbers);

        numbers2 = new ArrayList<>();

        for (Integer num : numbers) {

            numbers2.add(num * 10);
        }
        System.out.println(numbers2);



        numbers3 = numbers.stream()
                .map( num -> num * 10)
                .collect(Collectors.toList());
        System.out.println(numbers3);



    }
}
