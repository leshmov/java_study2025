class Person {
    String name = "사람";

    void whoami() {
        System.out.println("나는 사람입니다.");
    }
}

class Student extends Person {
    int number = 7;

    void work() {
        System.out.println("나는 공부한다.");
    }
}

public class TypeConverterMain {
    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();

        downcast(p);
        downcast(s);
    }

    static void downcast(Person p) { // person type, student type 가능
        if (p instanceof Student) {
            Student s = (Student) p;
            System.out.println("다운캐스팅 성공: Person -> Student");
        } else {
            System.out.println("다운캐스팅 불가: 객체가 student 타입이 아님");
        }
    }
}
