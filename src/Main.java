public class Main {
    private String name;
    private String value;
    private String number;

    public Main(String name, String value, String number) {
        this.name = name;
        this.value = value;
        this.number = number;
    }
    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String setValue() {
        return value;
    }
    public String getNumber() {
        return number;
    }

    //PhoneNumber
    public void showFullName() {
        System.out.println(name + " " + value + " " + number);
    }
}
