package ch02;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        // 2진수 : 0b
        int var1 = 0b1011;
        // 8진수 : 0
        int var2 = 0206;
        // 10진수
        int var3 = 365;
        // 16진수
        int var4 = 0xB3;

        System.out.println(var1 + " " + var2 + " " + var3 + " "  + var4);


        byte var5 = -128;
        // byte는 MSB를 제외하면 7bit, -2^7 ~ 2^7 -1 까지 표현 가능하므로 128은 범위 초과.
        // byte var6 = 128;

        long var7 = 1000000;
        // 정수 리터럴은 기본적으로 int 자료형으로 간주, 따라서 뒤에 L을 붙여줘야 long으로 인식함.
//        long var8 = 1000000000000;
        long var8 = 1000000000000L;
    }
}
