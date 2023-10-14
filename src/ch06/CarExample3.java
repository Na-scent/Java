package ch06;

public class CarExample3 {
    public static void main(String[] args) {
        Car3 myCar = new Car3();

        myCar.setSpeed(-50);
        System.out.println(myCar.getSpeed());

        myCar.setSpeed(150);
        System.out.println(myCar.getSpeed());

        myCar.setStop(true);
        System.out.println(myCar.getSpeed());
    }
}
