package com.korit.main;

import lombok.AllArgsConstructor;

import java.util.function.Supplier;

@AllArgsConstructor
class Authority<T> implements Supplier<T> {
    private T role;

    @Override
    public T get() {
        return role;
    }
}

public class Main8 {
    public static void main(String[] args) {

//      파라미터로 값을 받지 않고 처리한 데이터를 return 해주는 역할
//      getter 만 가지고 있음
        Supplier<String> supplier;

        Authority<String> authority = new Authority<>("ROLE_ADMIN");
        String role = authority.get();

    }
}
