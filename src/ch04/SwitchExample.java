package ch04;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int) Math.random()*6 +1;

        switch (num){
            case 1:
                System.out.println(num);
                break;
            case 2:
                System.out.println(num);
                break;
            case 3:
                System.out.println(num);
                break;
            case 4:
                System.out.println(num);
                break;
            default:
                System.out.println("tt");

        }

        // java 12 이후 switch문에서 Expression 가능

        switch (num){
            case 1 ->{
                System.out.println(num);
            }
            case 2 -> {
                System.out.println(num);
            }
            case 3 -> {
                System.out.println(num);
            }
            case 4-> {
                System.out.println(num);
            }
            default->{
                System.out.println("tt");
            }
        }

    }
}
