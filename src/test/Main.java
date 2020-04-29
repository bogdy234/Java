package test;

public class Main {
    public static void main(String[] args) {
       int a=4;
       int b=8;
       a^=b;
       b^=a;
       a^=b;
        System.out.println(a + " "+b);




    }

    private static void update(int someNumber)
    {
        someNumber=3;
    }
}
