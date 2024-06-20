package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println((int) '가'); // 44032
        System.out.println((int) '힣'); // 55203
        // 출력하면 한글인지 아닌지 알 수 없다

        System.out.println(is('한'));
    }
    static boolean is(char c){
        return c >= '가' && c <= '힣';
    }
}
