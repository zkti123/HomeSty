package com.green.javaHome.sty.study_one.process_thread;

public class ThreadEx2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));

        }
        System.out.println();
        System.out.print("소요시간 : " + (System.currentTimeMillis() - startTime));
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|"));
        }
        System.out.println();
        System.out.print("소요시간2 : " + (System.currentTimeMillis() - startTime));
    }
}
