package opgave1;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Jonas", 20);
        Student student2 = new Student("Niklas", 22);
        Student student3 = new Student("Carl", 21);

        for (Student student : Student.getStudents()) {
            student.printInfo();
        }
    }
}