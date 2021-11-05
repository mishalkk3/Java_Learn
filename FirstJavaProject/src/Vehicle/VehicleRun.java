package Vehicle;

public class VehicleRun {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(80);

        ducati.start();
        honda.start();


        ducati.increaseSpeed(30);
        honda.increaseSpeed(40);

        ducati.decreaseSpeed(130);
        honda.decreaseSpeed(40);

        System.out.println(ducati.getSpeed()+"\n"+honda.getSpeed());

    }
}
