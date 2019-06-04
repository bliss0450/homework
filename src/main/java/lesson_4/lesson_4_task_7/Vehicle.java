package lesson_4.lesson_4_task_7;

public class Vehicle {

    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;
    private int currentGears;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees.");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void changeGearsUp() {
        if (currentGears <= 6) {
            currentGears++;
            currentVelocity += 100;
            System.out.println("Current speed is " + currentVelocity);
        } else {
            System.out.println("Max gears are 6");
        }
    }

    public void changeGearsDown() {
        if (currentGears > 0) {
            currentGears--;
            currentVelocity -= 100;
            System.out.println("Current speed is " + currentVelocity);
        } else {
            System.out.println("Gears are at 0; Vehicle is moving at base speed");
        }
    }

    public void stop() {
        this.currentVelocity = 0;
        this.currentGears = 0;

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
