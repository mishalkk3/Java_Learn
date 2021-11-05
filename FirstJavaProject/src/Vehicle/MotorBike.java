package Vehicle;

public class MotorBike {
    private int speed;

    public MotorBike() {
        this(5);
    }

    public MotorBike(int speed) {
        this.speed = speed;
    }

    void start() {
        System.out.println("Bike Started");
    }

    void stop() {
        System.out.println("Bike Stopped");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed>0)
            this.speed = speed;
    }

    void increaseSpeed(int speed){
        this.speed += speed;
    }

    void decreaseSpeed(int speed){
        setSpeed(this.speed - speed);
    }
}
