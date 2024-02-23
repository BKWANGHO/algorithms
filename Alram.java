import java.util.Scanner;

public class Alram {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

//            System.out.printf("현재 시간을 입력하세요 : ");
            int hour = sc.nextInt();
            int min = sc.nextInt();

//            System.out.println("현재시간 " + hour + "시" + min + "분");

            int al = min-45;
            if (al < 0) {
                hour -= 1;
                al+=60;
            }
            if (hour <0){
                hour +=24;
            }

            System.out.println( hour + " "+al );
        }
    }



