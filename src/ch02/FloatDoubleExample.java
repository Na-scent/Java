package ch02;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // float 자료형은 숫자 뒤에 f을 붙여줌
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;

        // double 자로형이 float 자료형보다 2배 정도의 유효 자릿수를 가짐
        System.out.println(var1);
        System.out.println(var2);

        // e6 = 10^6
        double var3 = 3e6;
        float var4 = 2e-3f;
        System.out.println(var3);
        System.out.println(var4);
    }
}
