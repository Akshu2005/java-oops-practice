// package JAVA_OOPS.staticExample;

// class Test{
//     static String name;
//     public Test(String name){
//         this.name = name;
//     }
// }
public class InnerClasses {
    static class Test{
    String name;
    public Test(String name){
        this.name = name;
    }
}
    public static void main(String[] args){
        Test a = new Test("Akshu");
        Test b = new Test("Akanksha");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

