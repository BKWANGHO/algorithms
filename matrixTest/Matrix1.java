package matrixTest;

public class Matrix1 {
    public static void main(String[] args) {

        int[][] mtx = new int[2][4];
        int k=1;
//        for (int i = 0; i < mtx.length; i++) {
//            for (int j = 0; j < mtx[i].length; j++) {
//                mtx[i][j] = k;
//                k--;
//            }
//        }
        for(int i=0;i<9;i++){
            for(int j=0;j<4;j++){
                int dan = j+2;
                System.out.printf("%3d * %d =%3d",(j+2),(i+1),(dan*(i+1)));
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i=0;i<9;i++){
            for(int j=0;j<4;j++){
                int dan =j+6;
                System.out.printf("%3d * %d =%3d",dan,(i+1),dan*(i+1));
            }
            System.out.println();
        }
    }
}