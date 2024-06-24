package org.example;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // 일반
        int[] arr = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        // filter 시작
        int resultArrLen = 0;

        for (int n : arr) if (n % 2 == 0) resultArrLen++;

        int[] resultArr = new int[resultArrLen];

        int resultArrLastIndex = -1;

        for (int n : arr) {
            if (n % 2 != 0) continue;

            resultArr[++resultArrLastIndex] = n;
        }
        // filter 끝

        // map 시작
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] *= 2;
        }
        // map 끝

        System.out.println(Arrays.toString(resultArr));

        // 스트림
        arr = new int[]{33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        resultArr = Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .toArray();

        System.out.println(Arrays.toString(resultArr));
    }
}
