package records;

public class Main {
    public static void main (String[] args) {
        Car bmw = new Car("BMW", "Black", 2025, "JW999");

        System.out.println(bmw.year()); // É um Getter
        System.out.println(bmw.model()); // É um Getter
    }
}
