package com.korit.main;

import java.util.ArrayList;
import java.util.List;

public class Main7 {
    public static void main(String[] args) throws InterruptedException {
//      스레드 (Thread): (Main 메서드의 역할)
//      @FunctionalInterface 를 사용하고 있음

        List<Runnable> programs = new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            final int finalI = i;

            Runnable r = () -> System.out.println("프로그램" + (finalI + 1));
            programs.add(r);
        }

        for (Runnable program : programs) {
            program.run();
        }
/*      프로그램1
        프로그램2
        프로그램3
        프로그램4
        프로그램5
*/
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 100; i++) {

                    try {
                        System.out.println("첫번째 반복문 i: " + i);
                        Thread.sleep(1000); // 출력하고 1초 딜레이

                    } catch (InterruptedException e) {  // 반복문을 사용중 sleep 오류 발생
                        System.out.println("프로그램에 오류가 발생함.");
                    }
                }

            }
        };

//      Runnable 인터페이스를 구현하고 있음
        Thread t1 = new Thread(runnable);
        t1.start();

        Runnable runnable2 = () -> {
            for (int i = 0; i < 100; i++) {

                try {
                    System.out.println("두번째 반복문 i: " + i);
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    System.out.println("프로그램에 오류가 발생함.");
                }
            }
        };

//      2번째 Thread
        Thread t2 = new Thread(runnable2);
        t2.start();

//      Main Thread
        for (int i = 0; i < 100; i++) {

            System.out.println("Main Thread: " + i);
            Thread.sleep(1000);
        }

        }
}
