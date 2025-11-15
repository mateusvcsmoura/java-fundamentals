public class Gtr implements Car {
    private final int speedLimit = 270;
    private int currentSpeed;

    @Override // Sobscreve o que veio da Interface
    public void drive() {
        System.out.println("Acelerando o GTR em 50km/h..");
        this.increaseSpeed();
    }

    @Override
    public void brake() {
        System.out.println("Freando o GTR..");
        this.decreaseSpeed();
    }

    @Override
    public void stop() {
        System.out.println("Parando o GTR..");
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
        System.out.println("Car Model: GTR");
        System.out.println("Current Speed: " + this.currentSpeed + " km");
        System.out.println("Speed Limit: " + this.speedLimit + " km");
        System.out.println("===================");
    }
}

