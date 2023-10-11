package ch05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "95062413";

        // 문자열의 인덱스에 해당하는 문자를 추출
        char s = ssn.charAt(6);
        System.out.println(s);

        String oldStr = "자바 프로그래밍";
        // 문자열의 일부분을 새로운 문자열로 대체하는 함수
        String newStr = oldStr.replace("자바", "Java");
        System.out.println(newStr);

        // 슬라이싱. 1~4까지의 인덱스에 해당하는 문자열을 저장.
        String subStr = newStr.substring(1,5);
        System.out.println(subStr);

        // 파라미터를 하나만 넣으면 3번째 인덱스부터 끝까지 저장
        String subStr2 = newStr.substring(3);
        System.out.println(subStr2);

        // 문자열이 존재하면 시작 인덱스를 리턴, 없으면 -1 리턴
        int index = newStr.indexOf("프로그래밍");
        System.out.println(index);

        // 단순히 있는지만 조사하고 싶으면 contains 이용
        boolean flag = newStr.contains("자바");
        System.out.println(flag);

        // 문자열을 분리하고 싶으면 split(구분)
        String board = "번호,제목,내용,글쓴이";
        String[] arr = board.split(",");
        System.out.println(arr[0]);
    }
}
