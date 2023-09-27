package ch04;

public class BreakOutterExample {
    // break로 바깥쪽 반복문까지 종료시키고 싶을 때

    public static void main(String[] args) {
        // 반복문 앞에 label을 붙여줌
        Outter : for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.println(j);
                if(j >5){
                    // 바깥쪽 반복문까지 나감.
                    break Outter;
                }
            }
        }
    }
}
