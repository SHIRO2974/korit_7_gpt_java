package com.korit.main;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) {

//      조건을 체크하는 역할 입력값을 받아 true,false 를 반환
        Predicate<String> predicate;

        List<Integer> nums = List.of(1,2,3,4,5);
        List<Integer> evenNums = nums.stream()
                .filter(num -> num % 2 == 0)    // 2로 나누었을때 0으로 떨어지면 true, 그렇지 않으면 false
                .collect(Collectors.toList());

        BiPredicate<Integer, Integer> biPredicate;

    }
}
