public class Human extends LivingBeing {
    String name;

    public Human () {
        super(19);
        this.name = "Mateus";
    }

    @Override
    public void breathe() {
        System.out.println("Human name: " + this.name);
        System.out.println("This Human is " + this.age + " years old.");
        System.out.println("Human is breathing..");
    }
}
