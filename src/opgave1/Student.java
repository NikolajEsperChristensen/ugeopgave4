package opgave1;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private int id;

    private static ArrayList<Student> students = new ArrayList<>();
    private static int nextID = 1;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

        this.id = nextID;
        nextID++;

        students.add(this);
    }

    public void printInfo() {
        System.out.println(
                "Name: " + name +
                        ", Age: " + age +
                        ", ID: " + id
        );
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }
}