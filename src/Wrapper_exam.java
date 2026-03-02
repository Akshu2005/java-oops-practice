public class Wrapper_exam {
    public static void main(String[] args){
        //  Wrapper class Example
        Integer a = 10;
        Integer b = 20;

        swap(a,b);

        // Values remain unchanged (Java is pass-by-value)
        System.out.println("After swap attempt: " + a + " " + b);

        // final with reference example
        final A akshu = new A("Akanksha");
        
        // Allowed modifying object state
        akshu.name = "Akshu";
        // Not allowed:
        // Akshu = new A("New Name"): Cannot reassign to final refrence variable

        // creating many object for Garabage collention demonstration

        A obj;
        for(int j = 0; j < 10000000; j++){
            obj = new A("Random name");
        }
    }
    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
}
class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected");
    }
}
