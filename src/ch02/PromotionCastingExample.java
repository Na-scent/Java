package ch02;

public class PromotionCastingExample {
    public static void main(String[] args) {
        // Promotion(자동 타입 변환)
        // 허용 범위가 작은 타입이 큰 타입으로 대입되면 자동으로 타입 변환이 일어남
        // byte < short, char < int < long < float < double

        byte bValue = 10;
        int iValue = bValue;
        System.out.println(iValue);

        long lValue = 10l;
        float fValue = lValue;
        System.out.println(fValue);

        // Casting(강제 타입 변환)
        // 큰 그릇을 작은 그릇 단위로 쪼개어서 넣는 방식
        // ()로 변환될 자료형을 표시해줌

        // 2진수로 표현하면 00000110 00100100 00011100 00001010
        // 00001010만 담을 수 있음
        int intValue = 103029770;
        byte byteValue = (byte) intValue;
        System.out.println(byteValue);

        // int -> char 캐스팅은 유니코드(0 ~ 2^16-1)의 숫자 내에서 캐스팅. char형은 부호가 없기 떄문에 ^16
        int vv = 65;
        char vc = (char) vv;
        System.out.println(vc);


        // byte, short 자료형은 연산 시 int로 자동 변환되어서 처리됨.
        // 서로 다른 자료형의 연산 시 더 큰 타입으로 변환되어서 연산됨.
    }
}
