package com.korit.main;

import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main10 {
    public static void main(String[] args) {

//      파라마터로 값을 받아 해당 값을 처리 (결과를 return 해주지 않음)
        Consumer<String> consumer;

//      파라마터(T, U)로 값을 받아 해당 값을 처리(결과를 return 해주지 않음)
        BiConsumer<Integer, String> biConsumer;
        Map<String,Object> userMap = Map.of("userName", "admin", "password", "1234");
//      "userMame": "admin"     Map 에서 한 쌍 entry
//      "password": "1234"

//      Set 자료형으로 변환
        Set<Map.Entry<String,Object>> entries = userMap.entrySet();
//      Set 자료형으로 변환 시 향상된 for 문을 통해 Key, Value 값을 반환 할 수 있음
        for (Map.Entry<String,Object> entry : entries) {

            entry.getKey();
            entry.getValue();
        }
//      forEach 사용 시 자동으로 Set 자료형으로 변환
        userMap.forEach((Key, Value) -> {});

    }
    }


