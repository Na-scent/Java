package ch05;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        // 배열 선언
        int[] arr1;
        int[] arr2;
        int[] arr3;

        // 배열 할당
        arr1 = new int[] {1, 2, 3};
        arr2 = new int[] {1, 2, 3};
        arr3 = arr2;

        // 참조타입의 비교는 같은 객체를 참조하고 있는가를 따짐.
        System.out.println(arr1 == arr2); // 서로 다른 객체를 참조하고 있으므로 False
        System.out.println(arr3 == arr2); // 같은 객체를 참조(Stack에 저장된 heap 메모리 주소가 같음)하고 있으므로 True
    }
}
