package org.example; // org.example 패키지에 속해 있음

public class Main {
    public static void main(String[] args) {
        계산기.더한결과를_화면에_출력(10, 20);
        // 출력 => 결과 : 30

        계산기.더한결과를_화면에_출력(50, 20);
        // 출력 => 결과 : 70

        계산기.뺀결과를_화면에_출력(50, 20);
        // 출력 => 결과 : 30

        계산기.뺀결과를_화면에_출력(5, 2);
        // 출력 => 결과 : 3

        계산기.곱한결과를_화면에_출력(5, 2);
        // 출력 => 결과 : 10
    }
}
class  계산기 {

    public static void 더한결과를_화면에_출력(int i, int j) {
        System.out.println(i + j);
    }

    public static void 뺀결과를_화면에_출력(int i, int j) {
        System.out.println(i - j);
    }

    public static void 곱한결과를_화면에_출력(int i, int j) {
        System.out.println(i * j);
    }
}


