package kaupOOP;

public class Person {
    private double height;
    private double weight;
    private double bmi;
    private String bodyMass;
    private String name;
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public double getBmi(){
        return bmi;
    }
    public String getBodyMass(){
        return bodyMass;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void createBmi(){
            this.bmi = weight / (height * height);
    }
    public void createBodyMass(){
//    18.5 저체중
//    18.5~23 정상
//    23~25 과체중
//    25~ 비만
        if(bmi<18.5){
            bodyMass = "저체중";
        }else if (18.5<=bmi && bmi <=23){
            bodyMass = "정상";
        }else if (23<bmi && bmi <=25){
            bodyMass = "과체중";
        }else {
            bodyMass = "비만";
        }
    }
    public void createHeight(){
        height = (Math.random() * 0.5) + 1.5;
    }
    public void createWeight(){
        weight = (Math.random() * 69) + 30;
    }


}
