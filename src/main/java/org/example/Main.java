package org.example;

public // 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.

class Main {
    public static void main(String[] args) {
        HRM HRM1 = new HRM();

        HRM1.Person("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        HRM1.Person("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        HRM1.Person("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        person persona = HRM1.getperson(1);
        persona.introduce();
        // 저는 1번, 홍길순, 33살 입니다.

        person personb = HRM1.getperson(2);
        personb.introduce();
        // 저는 2번, 홍길동, 20살 입니다.

        person personc = HRM1.getperson(3);
        personc.introduce();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}
class person{
    int id;
    String name;
    int age;
    person nextPerson;

    person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void introduce(){
        System.out.println("나는" + id + "번" + name + "," + age + "살 이야");

    }
}

class HRM{
    person firstPerson;
    int people;

    void Person(String name, int age){
        people++;
        person NewPerson = new person(people, name, age);

        if(firstPerson == null){
            firstPerson = NewPerson;
        }else {
            person lastPerson = firstPerson;
            while (lastPerson.nextPerson != null){
                lastPerson = lastPerson.nextPerson;
            }
            lastPerson.nextPerson = NewPerson;
        }
        System.out.println("나이가 " + name + "살인 " + people + "번째 사람(" + name + ")이 추가되었습니다.");
    }
    person getperson(int id) {
        person hPerson = firstPerson;
        while (hPerson != null && hPerson.id != id) {
            hPerson = hPerson.nextPerson;
        }
        return hPerson;
    }
}


