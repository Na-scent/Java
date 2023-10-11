package ch05;

public class ArrayExample {
    public static void main(String[] args) {
        // 배열 선언 및 할당 방법.

        // 1. 처음에 선언과 할당을 바로 해준다.
        int[] arr = {1, 2, 3};
        System.out.println(arr);

        // 2. 선언을 먼저 하고 이후에 할당을 해준다.
        int[] arr2;
        // 단 이후 할당을 할 때는 객체를 새로 생성하는 문구를 명시해야 한다.
        arr2 = new int[] {2, 3 ,4};
        System.out.println(arr2);

        // 3. 선언을 먼저 하고, 할당할 값은 없지만 길이만 미리 지정할 수 있음.
        int[] arr3;
        // 이때 int 배열은 모두 0으로, String 배열은 모두 null로 초기화됨
        arr3 = new int[5];
        System.out.println(arr3[0]);
        arr3[0] = 2;

        // 배열의 길이
        System.out.println(arr3.length);

        // 2차원 배열 생성
        int[][] arr4 = {{1, 2}, {3, 4}};
        System.out.println(arr4[0][0]);

        // 길이를 다르게 주기도 가능
        int[][] arr5 = new int[2][];
        arr5[0] = new int[3];
        arr5[1] = new int[2];
        System.out.println(arr5[0].length);
        System.out.println(arr5[1].length);

        // 배열 복사
        String[] oldStrA = {"Java", "array", "copy"};
        String[] newStrA = new String[5];

        // 원본 배열 / 원본 배열 복사 시작 인덱스 / 새 배열 / 새 배열 붙여넣기 인덱스 / 복사 항목 수
        System.arraycopy(oldStrA, 0, newStrA, 1, oldStrA.length);
        for( int i =0; i < newStrA.length; i++){
            System.out.println(newStrA[i]);
        }

        // 배열 반복문도 생성 가능
        for (String Str : newStrA){
            System.out.println(Str);
        }

        // 열거 타입
        Week today = Week.SUNDAY;
        System.out.println(today);
    }
}
