package org.example;

public class Main2 {
    //문제 : 1부터 n까지 소수의 객수를 출력하는 함수를 만들어주세요
    public static void main(String[] args) {
        boolean rs = Math2.isPrimeNumber(1);
        System.out.println("1은(는) 소수인가? : " + rs);
        //false
        rs = Math2.isPrimeNumber(2);
        System.out.println("2은(는) 소수인가? : " + rs);
        // ture
        rs = Math2.isPrimeNumber(4);
        System.out.println("4은(는) 소수인가? : " + rs);
        //false
        rs = Math2.isPrimeNumber(7);
        System.out.println("7은(는) 소수인가? : " + rs);
        //true
    }

    class Math2 {
        static boolean isPrimeNumber(int n) {
            if (n == 1) {
                return false;
            }
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum == n + 1;

        }
        }
    }





