package org.example; // org.example 패키지에 속해 있음

public// 문제 : 사람을 말하게 해주세요.

class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.말하다();
    }
}

class 사람 {
    // 사람은 `말하다` 라는 기능을 가지고 있습니다.
    void 말하다() {
        System.out.println("사람이 말합니다.");
    }
}

