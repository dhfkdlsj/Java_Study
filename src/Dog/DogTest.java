package Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("dog.name : "+dog.name);
        Dog dog1 = new Dog("바다");
        System.out.println("dog1.name : "+dog1.name);
    }
} //Dog 객체 생성후 출력