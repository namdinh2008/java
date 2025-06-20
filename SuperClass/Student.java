package SuperClass;

public class Student extends Person {

    public Student(String name) {
        super(name);
        System.out.println("Student created: " + name);
    }
}
