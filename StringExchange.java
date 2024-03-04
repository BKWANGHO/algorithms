import java.util.Scanner;

public class StringExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ab = sc.next();
        int len = ab.length();
        int anum =0;
        int min = len;

        for(int i=0; i<len;i++){
            if(ab.charAt(i) == 'a'){
                anum++;
            }
        }
        for (int i=0;i<len;i++){
        int bnum =0;
            for(int j=i; j<i+anum;j++){
                if(ab.charAt(j%len) == 'b'){
                    bnum++;
                }
            }
                if(min>bnum){
                    min = bnum;
                }
        }
        System.out.println(min);
    }
}
