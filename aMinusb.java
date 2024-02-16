import java.util.Scanner;

public class aMinusb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.next());
        int min = Integer.parseInt(scanner.next());

        int al = min - 45;

        if (al < 0) {
            hour = hour - 1;
            al = al + 60;
        } else if (59 < al) {
            hour = hour + 1;
            al = al - 60;
        } else {
        }
        if (hour < 0) {
            hour = hour + 24;
        } else if (23 < hour) {
            hour = hour - 23;
        } else {
        }
        System.out.println("알람 시간은 : " + hour + "시" + al + "분이다.");


    }
}
