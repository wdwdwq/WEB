package org.example; // org.example 패키지에 속해 있음

public class Main {
    public static void main(String[] args) {
        int 결과1 = Math.nToMSum(2, 3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 5

        int 결과2 = Math.nToMSum(5, 10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 45
    }
}

class Math {
    public static int nToMSum(int a, int b) {
        int sum = 0;
        for(int j = a; j <= b; j++){
            sum += j;
        }
        return sum;
    }
}