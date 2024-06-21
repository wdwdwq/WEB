package org.example;
//
public // 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.

class Main {
    public static void main(String[] args) {// 프로그램 시작
        HRM HRM1 = new HRM(); // 인력 사무소 열어

        HRM1.Person("홍길순", 33); // people 변수 증가
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
class person{ // 사람
    int id; // 번호
    String name; //이름
    int age;//나이
    person nextPerson; // 다음 사람 연력 리스트

    person(int id, String name, int age){ // 필드 초기화
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void introduce(){ // 자기소개
        System.out.println("나는" + id + "번" + name + "," + age + "살 이야");

    }
}

class HRM{ // 인력사무소
    person firstPerson; // 리스트 첫 번째 사람
    int people; //id 값으로 사용된다

    void Person(String name, int age){ // 새로운 사람을 추가하는데
        people++; //id 값을 증가시킨다
        person NewPerson = new person(people, name, age); // 새로운 사람 객체 생성

        if(firstPerson == null){ // 리스트가 비어있는지 확인하는데 있으면 첫번째 사람
            firstPerson = NewPerson;  // 첫번째 사람
        }else { // 사람이 있으면 실행된다
            person lastPerson = firstPerson; // 마지막 사람을 찾는다
            while (lastPerson.nextPerson != null){ // 찾았으면 다음사람이 있는거다 null이 아닌거니까
                lastPerson = lastPerson.nextPerson; //현재 마지막 사람으로 다음사람으로 옮기면 리스트 끝까지 이동
            } // 그럼 다시 lastPerson은 마지막 사람을 가리키고 nextPerson 다음 사람은 비어있게 된다
            lastPerson.nextPerson = NewPerson;//마지막 사람에 다름사람으로 설정하면 새로운 사람이 들어간다
        }
        System.out.println("나이가 " + age + "살인 " + people + "번째 사람(" + name + ")이 추가되었습니다.");
    }
    person getperson(int id) { //
        person hPerson = firstPerson;
        while (hPerson != null && hPerson.id != id) {
            hPerson = hPerson.nextPerson;
        }
        return hPerson;
    }
}


