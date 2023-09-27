package ch03;

public class BitShiftExample {
    public static void main(String[] args) {
        // 비트 연산자는 2가지 종류가 있음 >>(<<) or >>>(<<<)

        // 1. >>
        // <<의 경우 왼쪽으로 비트 밀고 빈 공간 0으로 채움(2의 거듭제곱을 곱한 것과 일치)
        // >>의 경우 오른쪽으로 비트 밀고 빈 공간 MSB로 채움(2의 거듭제곱을 나눈 것과 일치, 양수의 끝은 0, 음수의 끝은 -1)
        int num = 1;
        System.out.println(num << 3); // 1 * 2^3
        System.out.println(num >> 5); // 1 * 2^(-5) 1보다 작으므로 0


        // 2. >>>
        // <<<은 없음
        // >>>의 경우 오른쪽으로 비트 밀고 빈 공간 0으로 채움
        int num2 = -1;
        System.out.println(num2 >>> 5);

    }
}
