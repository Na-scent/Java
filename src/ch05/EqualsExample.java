package ch05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        // 문자열 비교에서 == 는 같은 객체를 참조했는지를 확인
        if (strVar1 == strVar2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        // new ~~ 는 새 객체를 생성하겠다는 의미
        String strVar3 = new String("홍길동");

        // 따라서 둘이 값은 같지만 다른 객체이므로 false 출력
        if (strVar1 == strVar3){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        // .equals() 는 문자열만 비교하겠다는 의미
        // 따라서 true 출력
        if ( strVar1.equals(strVar3)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}

