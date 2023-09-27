package ch03;

public class CompareOperatorExample {
    public static void main(String[] args) {
        // 문자 및 숫자 비교

        // 실수는 부동 소수점때문에 반드시 casting을 해줘야 비교가 가능함
        System.out.println(0.1f == 0.1); // False
        System.out.println(0.1f == (float) 0.1);

        // 문자열 비교
        // 문자열 비교는 ==로 불가. equals()
        String str1 = "나윤성";
        String str2 = "윤성나";

        System.out.println(str1.equals(str2));;
    }
}
