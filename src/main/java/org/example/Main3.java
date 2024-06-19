package org.example;

public class Main3 {
    public static void main(String[] args) {
        전사1 a전사 = new 전사1();

        a전사.나이 = 20;
        a전사.a무기 = new 활1();
        a전사.a무기 = new 칼1();

        // 추가 확인을 위한 출력문
        System.out.println("나이: " + a전사.나이);
        System.out.println("현재 무기: " + a전사.a무기.getClass().getSimpleName());
    }
}

class 전사1 {
    int 나이;
    무기1 a무기;
}

class 무기1 {
    // 무기 클래스는 공통된 속성이나 메서드를 가질 수 있음
}

class 칼1 extends 무기1 {
    // 칼 클래스의 속성과 메서드를 정의할 수 있음
}

class 활1 extends 무기1 {
    // 활 클래스의 속성과 메서드를 정의할 수 있음
}
