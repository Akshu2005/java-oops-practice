public class Constructor {
    public static void main(String[] args){
        Student akshu = new Student();

        System.out.println("Roll No: " + akshu.rno);
        System.out.println("Name: " + akshu.name);
        System.out.println("Marks: " + akshu.marks);

        akshu.greeting();
        akshu.changeName("influencer");
        akshu.greeting();
    }
}

class Student {
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello, My name is " + this.name);
    }

    void changeName(String newName){
        name = newName;
    }

    Student(){
        this.rno = 15;
        this.name = "Akshu";
        this.marks = 90.5f;
    }

    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}