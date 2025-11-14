public class Poo {
    public static void main (String[] args) {
        System.out.println("Hello, World!");

        Car gtr = new Car("GTR");
        Car hb20 = new Car("HB20");

        gtr.drive();
        hb20.drive();
    }
}

class Car {
    String model;

    public Car (String model) {
        this.model = model;

        System.out.println("Carro criado.");
    }

    public void drive () { // pode ou não retornar um valor
        System.out.println("Acelerando o Carro " + this.getCarModel());
    }

    private String getCarModel () {
        return this.model;
    }
}

