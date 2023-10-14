package ch06;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();

        System.out.println("모델명 " + myCar.model);
        System.out.println("시동여부 " + myCar.start);
        System.out.println("현재속도 " + myCar.speed);

        // 객체 수정
        // get, set은 이후에 배울 듯.
        myCar.start = false;
        System.out.println("시동여부 " + myCar.start);
    }
}
