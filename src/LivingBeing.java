public class LivingBeing { // Não pode implementar (usa extend). Podemos colocar métodos
    protected int age;

    public LivingBeing (int age) {
        this.age = age;
    }

    public void breathe () {
        System.out.println("Living Being is breathing..");
    };

    public void sleep() {
        System.out.println("Living Being is sleeping..");
    }
}
