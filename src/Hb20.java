public class Hb20 implements Car{
    private final int speedLimit = 220;
    private int currentSpeed;

    public Hb20 () {
        this.currentSpeed = 0;
    }

    @Override
    public void drive() {
        System.out.println("Acelerando o HB20 em 50km/h..");
        this.increaseSpeed();
    }

    @Override
    public void brake() {
        System.out.println("Freando o HB20..");
        this.decreaseSpeed();
    }

    @Override
    public void stop() {
        System.out.println("Parando o HB20..");
    }

    private void increaseSpeed () {
        if (this.currentSpeed >= this.speedLimit) {
            System.out.println("Speed Limit Excedeed");
            return;
        }

        this.currentSpeed += 50;
    }

    private void decreaseSpeed () {
        if (this.currentSpeed <= 0) {
            System.out.println("The Car is already at 0km/h");
            return;
        }

        this.currentSpeed -= 50;
    }

    public void showCarInfo () {
        System.out.println("===================");
        System.out.println("Car Model: HB20");
        System.out.println("Current Speed: " + this.currentSpeed + " km");
        System.out.println("Speed Limit: " + this.speedLimit + " km");
        System.out.println("===================");
    }
}
