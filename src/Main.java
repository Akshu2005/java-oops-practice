class Student {
    int rno;
    String name;
    float marks;

    void display() {
        System.out.println("Roll No: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating object
        Student akshu = new Student();

        // Assigning values
        akshu.rno = 1;
        akshu.name = "Akanksha Srivastava";
        akshu.marks = 90.5f;

        // Calling method
        akshu.display();
    }
}