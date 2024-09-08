package ex_overloading;

public class Calculation2 {

    void sum2(int a, int b) {
        System.out.println(a + b);
    }

    void sum2(double a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Calculation2 obj = new Calculation2();
        obj.sum2(10.5, 20.5);
        obj.sum2(20, 10);

    }

}
