package mahtTest;

public class RandomTest {

    static int returnRandom() {
        int  randomNumber = (int)(Math.random()*100);
        System.out.printf("랜덤값 : %d", randomNumber);
        return randomNumber;
    }

    public static void main(String[] args) {
        int num1 = returnRandom();
        System.out.println("리턴된 값 : " +num1);

        returnRandom();
    }
}
