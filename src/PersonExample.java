public class PersonExample {
    public static void main(String[] args) {
        Student s = new Student("이순신",102,"A","학생");
        s.Hi();
        s.Age();
        s.Name();
        s.SayGrade();
        System.out.println();

        Person p1 = new Person();
        p1.age = 13;
        p1.Age();
        p1.Name();
        // p1.SayGrade(); Person 객체기때문에 Student 객체에 있는 메서드는 쓰지못함
    }
}
