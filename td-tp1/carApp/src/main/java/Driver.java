public class Driver {
    public static final int ADULT_AGE = 10;
    private String name;
    private int age;

    public Driver(String name, int years) {
        this.name = name;
        this.age = years;
    }

    public boolean isAdult() {
        return age >= ADULT_AGE;
    }

    public String getName() {
        return this.name;
    }
}