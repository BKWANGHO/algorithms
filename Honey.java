import java.util.Scanner;

public class Honey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int location = sc.nextInt();

        int[] arr ={9,9,4,1,4,9,9};

        int bee1 =0;
        int bee2 =0;
        int honeyCase = 0;
        int sumHoney = 0;
        int max =0;
        for(int i=0;i<arr.length;i++){
//            arr [i]= sc.nextInt();
            sumHoney +=arr[i];
        }
        System.out.println(sumHoney);
        for(int i=0;i<arr.length;i++){
//            arr [i]= sc.nextInt();
            sumHoney =arr[i]-arr[bee2];
            bee2++;
            System.out.println(bee2);
            if(max<sumHoney){
                max = sumHoney;}
            sumHoney=0;
        }

        System.out.println("sumHoney" );
        System.out.println("sumHoney" + max);


    }
}
