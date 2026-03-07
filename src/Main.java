class Student{
    int rno;
    String name;
    float marks;

    void display(){
        System.out.println("Roll no: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
public class Main {
    public static void main(String[] args){
        Student akshu = new Student();

        akshu.rno = 1;
        akshu.name = "Akshu";
        akshu.marks = 90.5f;

        akshu.display();
    }
}