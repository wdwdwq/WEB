package org.example; // org.example 패키지에 속해 있음

import java.awt.*; // Point 클래스를 사용
import java.util.Arrays; //배열을 문자열로 변환 Arryay 사용
// import하면 기능들을 사용할 수 있음
public class Main2 {
    public static void main(String[] args) { // 시작점 메소드

        String msg = greet("JIn"); // String은  문자열을 나타낼 수 있음
        System.out.println(msg);  //greet 메서드 호출해 msg 저장한 후 콘솔 출력
// 문자열만 담을 수 있는 변수 mas에 greet 함수 실행 결과를 가져온다.
        Point point = createPoint(5, 10);
        System.out.println("Point create at (" + point.x + ", " + point.y + ")"); // createPoint 호출 좌표 Point 객체 생성해 변수에 저장한 후 출력

        int[] evens = firstNEvenNumbers(5);
        System.out.println("First 5 even numbers : " + Arrays.toString(evens));// 5개의 짝수 포함하는 배열 생성 evens에 저장 내용
    }
// static은 인스턴화 없이 사용
    //인스턴스를 생성하지 않고 클래스 이름으로 직접 가져와 쓸 수 있다
    public static String greet(String name) {
// 문자열 매개변수 받는 greet 메서드,
        return "Hello, " + name + "!"; // 문자열 입력 받아서 출력 입력받은 name 와 같이 출력
    }

    public static Point createPoint(int x, int y) { // Point 객체 생성
        return new Point(x, y); //정수 좌표 입력받아 객체 생성해 반환
    }

    public static int[] firstNEvenNumbers(int n) {
        // 정수 n 을 입력받아 첫 n개 짝수로 이루어진 배열
        int[] evenNumbers = new int[n]; // 배열 생성 초기화

        for(int i = 0, num = 2; i < n; i++, num += 2){ // 배열 초기화 첫 n개 짝수를 배열에 저장
            evenNumbers[i] = num; // 배열에 값을 할당
        }
        return evenNumbers;  //변수에 할당받은 값을 출력
    }
}
