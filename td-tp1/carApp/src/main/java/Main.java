public class Main {

    public static final int AGE = 20;
    public static final int NEW_SPEED1 = 80;
    public static final int NEW_SPEED2 = 30;

    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Blue");
        Driver moi = new Driver("John", AGE);

        moi.startCar(myCar);
        myCar.accelerate();
        moi.switchSpeed(myCar, NEW_SPEED1);
        myCar.slowDown();
        moi.switchSpeed(myCar, NEW_SPEED2);
        moi.stopCar(myCar);
        System.out.println("end");
    }
}
