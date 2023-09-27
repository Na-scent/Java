package ch03;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        // ? True / : False
        char grade = score > 90 ? 'A':(score > 80 ? 'B' : 'C');
        System.out.println(grade);
    }
}
