// package JAVA_OOPS.staticExample;

public class StaticInt {
    static int a = 4;
    static int b;

    // will only run once when the class is loaded in memory
    static{
        System.out.println("I am in Static block");
        b = a*5;
    }
    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);

        StaticInt.b += 3;
        System.out.println(StaticInt.a + " " + StaticInt.b);

    }
}
