package kaupTest;

public class KaupMain {
    public static void main(String[] args) {
//        카우프지수 구하는 프로그램을 작성해 주세요
//        체중, 키 를 받아서 BMI 지수를 구하세요 BMI = w/t제곱
//        랜덤으로 받는다 키는 150~200(단위:m) 몸무게 30~130(단위:kg) 둘다 실수

        double height = randomHeight();
        double weight = randomWeight();
        System.out.printf("height : %.1f, weight : %.1f, ", height,weight );
        double bmi = 0;
        bmi = weight/(height*height);
        System.out.printf("BMI : %.1f", bmi);

    }

    static double randomHeight() {
    double randomHeight = (Math.random()*0.5)+1.5 ;
    return randomHeight;
    }
    static double randomWeight() {
        double randomWeight = (Math.random()*69)+30 ;
        return randomWeight;
    }

}
