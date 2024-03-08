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

    public void startCar(Car car) {
        if (isAdult()) {
            System.out.println(name + " is starting the car.");
        } else {
            System.out.println("The driver isn't old enough to drive.");
        }
    }

    public void stopCar(Car car) {
        System.out.println(name + " is stopping the car.");
    }

    public void switchSpeed(Car car, int newSpeed) {
        System.out.println(name + " is changing the car speed to " + newSpeed);
        int currentSpeed = car.getSpeed();
        if (currentSpeed >= newSpeed) {
            while (currentSpeed > newSpeed) {
                car.slowDown();
            }
        } else  {
            while (currentSpeed < newSpeed) {
                car.accelerate();
            }
        }
    }
}
