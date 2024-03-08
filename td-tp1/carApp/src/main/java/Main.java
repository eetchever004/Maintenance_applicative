public class Main {

    public static final int AGE = 20;
    public static final int NEW_SPEED1 = 80;
    public static final int NEW_SPEED2 = 30;

    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Blue");
        Driver moi = new Driver("John", AGE);

        myCar.startCar(moi);
        myCar.accelerate();
        myCar.switchSpeed(NEW_SPEED1, moi);
        myCar.slowDown();
        myCar.switchSpeed(NEW_SPEED2, moi);
        myCar.stopCar(moi);
        System.out.println("end");
    }
}
