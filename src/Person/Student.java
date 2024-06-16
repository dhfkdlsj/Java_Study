package Person;

import Person.Person;

public class Student extends Person {
    String grade;
    String job;

    public Student(String name, int age, String grade, String job){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.job = job;
    }

    public void SayGrade(){
        System.out.println("제 학점은 "+grade+"입니다.");
    }
}
