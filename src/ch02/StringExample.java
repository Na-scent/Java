package ch02;

public class StringExample {
    public static void main(String[] args) {
        // 여러 개의 문자는 "" 과 String 자료형을 써줘야 함.
        String var1 = "A";
        String var2 = "나윤성\r성";
        System.out.println(var2);

        // """ 사용 시 줄바꿈까지 포함해서 저장됨. \ 를 넣으면 이어써줌
        String var3 = """
                안녕하세요
                반갑습니다.
                제 이름은 \
                나윤성입니다.
                """;

        System.out.println(var3);

    }
}
