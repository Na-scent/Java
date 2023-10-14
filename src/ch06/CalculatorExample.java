package ch06;

public class CalculatorExample {

    static void simulate(){
        System.out.println("HELLO");
    }

    public static void main(String[] args) {

        // static으로 선언된 변수나 메소드는 객체 생성없이 바로 사용 가능.
        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(1, 2);
        int result3 = Calculator.minus(1, 2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(Calculator.pi);
        simulate();
    }
}
