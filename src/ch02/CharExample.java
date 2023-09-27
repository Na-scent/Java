package ch02;

public class CharExample {
    public static void main(String[] args) {

        // '' 로 감싼 것을 문자 리터럴이라고 함.
        // 문자 리터럴은 유니코드로 변환되어 저장됨. char 자료형에는 문자를 직접 입력하거나 유니코드를 입력할 수 있음
        char C1 = 'A';
        char C2 = 65;
        char C3 = '가';
        char C4 = 44032;

        // 출력 시 문자는 문자 그대로, 유니코드는 문자로 변환되어 출력
        System.out.println(C1+ " " + C2 +  " " + C3 + " " + C4);
    }
}
