package ch06;

public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;
    // 생성자
    public Korean(String name, String ssn){
        // This : 필드와 파라미터를 구분해줌
        this.name = name;
        this.ssn = ssn;
    }
}
