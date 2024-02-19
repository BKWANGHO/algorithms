import java.util.Scanner;
public class OvenTime {
        /* 현재 시간을 입력받는다.
         * 오븐 설정시간을 입력받는다.
         * 오븐 완료시간을 표시한다.
         * */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.printf("현재 시간을 입력하세요 : ");
            int hour = sc.nextInt();
            int min = sc.nextInt();

            System.out.println("현재시간 " + hour + "시" + min + "분");

            System.out.printf("오븐 설정시간을 입력하세요 : ");
            int time = sc.nextInt();

            if ((min + time) > 60) {
                hour += (min + time) / 60;
                min = (min + time) % 60;
            } else {
                min += time;
            }

            if (hour > 23) {
                hour -= 24;
            }

            System.out.println("요리완성시간 : " + hour + "시" + min + "분");
        }
    }


