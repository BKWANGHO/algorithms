package memberOOP;

public class Member {
    private String id;
    private String pw;
    private String pwAgain;
    private String name;
    private int personId;
    private int phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;

//    카우프 지수에서 사용하는 생성자
    public Member(double height,double weight){
        this.height = height;
        this.weight = weight;
    }

//    회원가입에서 사용하는 생성자
    public Member(String id, String pw, String pwAgain, String name, int personId, int phoneNumber, String address, String job) {
        this.id = id;
        this.pw =pw;
        this.pwAgain = pwAgain;
        this.name = name;
        this.personId = personId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
    }



    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setPwAgain(String pwAgain) {
        this.pwAgain = pwAgain;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPw() {
        return pw;
    }

    public String getId() {
        return id;
    }

    public String getPwAgain() {
        return pwAgain;
    }
    public String getName() {
        return name;
    }
    public int getPersonId() {
        return personId;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public String getJob() {
        return job;
    }

    public void createHeight(double height){
        height = (Math.random()*0.2)+1.5;
        this.height=height;
    }
    @Override
    public String toString() {
        return "Person{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", personId=" + personId + ", phoneNumber=" + phoneNumber + ", address='" + address + '\'' + ", job='" + job + '\'' + '}';
    }

}

