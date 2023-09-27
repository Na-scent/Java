package ch03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i = 0; i < 5; i++){
            var1++;
            System.out.println(var1);
            // 127을 넘어가면 overflow가 일어남.
            // 반대로 -128보다 작아지면 Underflow가 일어남.
        }
    }
}
