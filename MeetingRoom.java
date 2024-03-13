import java.util.Arrays;
import java.util.Scanner;

public class MeetingRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meetingnum = sc.nextInt();
        int[][] meeting = new int[meetingnum][2];
        int[] end = new int[meetingnum];

        for (int i = 0; i < meetingnum; i++) {
            for (int j = 0; j < 2; j++) {
                meeting[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(meeting, (o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]);
        int result = 1;
        int start = 0;
        for (int i = 1; i < meetingnum; i++) {
            if (meeting[i][0] >= meeting[start][1]) {
                result++;
                start = i;
            }
        }
        System.out.println(result);
    }
}
