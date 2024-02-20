package gradeOOP;

public class Student {

    private String name;
    private int korean;
    private int english;
    private int math;
    private int average;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getKorean() {
        return this.korean;
    }

    public int getEnglish() {
        return this.english;
    }

    public int getMath() {
        return this.math;
    }

    public int getAverage() {
        return this.average;
    }

    public void createAverage() {
        average = (korean + english + math) / 3;
    }

    public void createKorean() {
        korean = (int) (Math.random() * 100);
    }

    public void createEnglish() {
        english = (int) (Math.random() * 100);
    }

    public void createMath() {
        math = (int) (Math.random() * 100);
    }
}


