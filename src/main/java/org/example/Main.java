package org.example;
//문제 : 1부터 n까지 소수의 객수를 출력하는 함수를 만들어주세요
class Main {
    public static void main(String[] args) {
        int rs = Math.one_to_n_prime_numbers_count(10);
        System.out.println("rs : " + rs);
        // 출력 : rs : 4

        rs = Math.one_to_n_prime_numbers_count(13);
        System.out.println("rs : " + rs);
        // 출력 : rs : 6
    }
}

class Math {

    public static int one_to_n_prime_numbers_count(int n) {
        int count = 0;
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }
}
