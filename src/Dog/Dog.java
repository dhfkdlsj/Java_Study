package Dog;

public class Dog {
    String name;
    int age;
    Dog() {
        this.name ="강아지";
        this.age = 1;
    }
    Dog(String name) {
        this.name = name;
        this.age = 3;
    }
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
} //Dog 생성자 오버로딩