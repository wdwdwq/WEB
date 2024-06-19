package org.example;// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.


//올바른 리턴타입으로 메서드를 만들어주세요
public class
Main {
    public static void main(String[] args) {
        int i = 로봇.get정수();
        boolean b = 로봇.get논리();
        사람1 a사람 = 로봇.get사람();
        사람1 a사람2 = 로봇.get사람2();
        사람1 a사람3 = 로봇.get사람3();
        사람1 a사람4 = 로봇.get사람4();
        사람1 a사람5 = 로봇.get사람5(123,false);
        로봇.get사람6(123,false);

    }
}

class 사람1{
    int age;
    boolean gender;

    사람1(){
        this.age = 0;
        this.gender = true;
    }
    사람1(int age, boolean gender){
        this.age = age;
        this.gender = gender;
    }
}


class 로봇 {
    public static int get정수() {
        return 1;
    }

    public static boolean get논리() {
        return true;

    }

    public static 사람1 get사람() {
        return new 사람1();
    }


    public static 사람1 get사람2() {
        return new 사람1();
    }

    public static 사람1 get사람3() {
        return new 사람1();
    }

    public static 사람1 get사람4() {
        return new 사람1();
    }

    public static 사람1 get사람5(int age, boolean gender) {
        return new 사람1();
    }

    public static void get사람6(int age, boolean gender) {
        사람1 새로운사람 = new 사람1(age, gender);
    }
}
