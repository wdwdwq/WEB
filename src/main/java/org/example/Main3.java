package org.example;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(String.format("%a", 99.9)); // 0x1.8f9999999999ap6

        //%b
        boolean boo = true;
        System.out.println(String.format("%B, %b", boo, boo)); // TRUE, true

        //%c
        char c = 'm';
        System.out.println(String.format("%C, %c", c, c)); // M, m
        System.out.println(String.format("50 %c", 50)); // 50 2
        System.out.println(String.format("44032 %c", 44032)); // 44032 가

        //%d
        int i = 55;
        System.out.println(String.format("%d", i)); // 55
        System.out.println(String.format("%,d", 55555)); // 55,555

        //%e
        System.out.println(String.format("%e", 99.9)); // 9.990000e+01

        //%f
        double d = 987.6543;
        System.out.println(String.format("%f", d)); // 987.654300
        System.out.println(String.format("%f_", d)); // 987.654300_
        System.out.println(String.format("%10f_", d)); // 987.654300_
        System.out.println(String.format("%015f_", d)); // 00000987.654300_ (글자수 15, 앞부분을 빈칸이 아닌 0으로 채우라는 의미)
        System.out.println(String.format("%.2f_", d)); // 987.65_ (소수점 아래 2자리 나타내라는 의미)
        System.out.println(String.format("%-10f_", d)); // 987.654300_ (기본적으로 오른쪽 정렬이나 '-' 붙이면 왼쪽 정렬)

        //%g
        System.out.println(String.format("%f", 99.9)); // 99.900000

        //%h
        System.out.println(String.format("%f", 99.9));

        //%o
        System.out.println(String.format("%f", 12345.6789)); // 12345.678900

        //%s
        String s = "strawberry";
        System.out.println(String.format("%s", s)); // strawberry
        System.out.println(String.format("%20s", s)); //           strawberry
        System.out.println(String.format("%-20s", s)); // strawberry          (/구분)
        System.out.println(String.format("%10.2s", s)); //         st (2만큼 스트링을 자른 후 10만큼 공백을 채워 문자열 길이를 만든다.)

        //%t
        // y: 연 (year)
        // M: 월 (month)
        // d: 일 (day of month)
        // H: 시 (24-hour)
        // h: 시 (12-hour)
        // M: 분 (minute)
        // s: 초 (second)
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        System.out.format("%tB %te, %tY%n", cal, cal, cal); // 5월 26, 2022
        System.out.format("%tF%n", date); // 2022-05-26
        System.out.format("%tR%n", date); // 22:20


    }
}


//16진수 입력방법


