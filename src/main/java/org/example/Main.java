package org.example;


//문제 : n부터 m까지 소수의 합 출력하는 함수를 만들어주세요
class Main {
    public static void main(String[] args) {
        int rs = Math.n_to_n_prime_numbers_sum(2,10);
        System.out.println("rs : " + rs);
        // 출력 : rs : 4

        rs = Math.n_to_n_prime_numbers_sum(4,13);
        System.out.println("rs : " + rs);
        // 출력 : rs : 6
    }
}

class Math{
    static int n_to_n_prime_numbers_sum(int n, int m){
        int sum = 0;
        for(int i = n; i <= m; i++){
            if(isPrimeNumber(i)){
//                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
    static boolean isPrimeNumber(int num) {
        if (num == 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num + 1;

    }

}






