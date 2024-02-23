package matrixTest;

import java.util.Random;

public class Lotto2 {
    public static void main(String[] args) {
//      1~45범위에서 서로 겹치지 않는 숫자 6개 생성
        int[] arr = new int[6];
//        중복되지 않은 상태
        arr = createArrayWithoutDuplicate(arr);
//        오름차순 정렬
        arr = sortAscending(arr);
//        출력
        printLotto(arr);
    }

    private static void printLotto(int[] arr) {
        System.out.println("-----로또번호-----");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

    }
    private static int[] sortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        return arr;
    }
    private static int[] createArrayWithoutDuplicate(int[] arr) {
        for(int i=0;i<arr.length;i++){
            boolean check =false;
            int randomNumber = createRandomNumber(1,8);
            for(int j=0;j<arr.length;j++){

                if(arr[j] == randomNumber){
                    //중복되면 check를 true로 바꿔라
                    check = true;
                }
            }
            if(check ==false){
                // 중복되지 않았으니 배열에 담아라.
                arr[i] =randomNumber;
            }else{
                i--; // 중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
            }

        }
        return arr;
    }
    private static int createRandomNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt(end)+start;
    }
}
