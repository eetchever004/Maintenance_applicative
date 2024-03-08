public class Car {
    public static final int STEP = 10;
    public static final int STOP_SPEED = 0;
    public static final int MAX_SPEED = 120;
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (speed + STEP <= MAX_SPEED) {
            speed += STEP;
            // show details
            showDetails();
        } else {
            System.out.println("Max speed reached.");
        }
    }

    public void slowDown() {
        if (speed - STEP >= STOP_SPEED) {
            speed -= STEP;
            // show details
            showDetails();
        } else {
            System.out.println("The car is already stopped.");
        }
    }

    private void showDetails() {
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Current speed : " + speed);
    }

    public void startCar(Driver driver) {
        if (driver.isAdult()) {
            System.out.println(driver.getName() + " is starting the car.");
        } else {
            System.out.println("The driver isn't old enough to drive.");
        }
    }

    public void stopCar(Driver driver) {
        System.out.println(driver.getName() + " is stopping the car.");
    }

    public void switchSpeed(int newSpeed, Driver driver) {
        System.out.println(driver.getName() + " is changing the car speed to " + newSpeed);
        int currentSpeed = getSpeed();
        if (currentSpeed >= newSpeed) {
            while (currentSpeed > newSpeed) {
                slowDown();
            }
        } else  {
            while (currentSpeed < newSpeed) {
                accelerate();
            }
        }
    }
}

