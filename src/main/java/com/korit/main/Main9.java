package com.korit.main;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main9 {
    public static void main(String[] args) {

//      파라미터로 값을 받아서 처리한 데이터(T)를, return(R) 해주는 역할
        Function<Integer, Integer> addFunction = num -> num + 10;
        Integer result = addFunction.apply(100);

//      파라미터로 값을 받아서 처리한 데이터(T, U, R)를, return(T, U) 해주는 역할
        BiFunction<Integer, Integer, Integer> addBiFunction = (num1, num2) -> num1 + num2;
        Integer result2 = addBiFunction.apply(100,200);
    }

}
