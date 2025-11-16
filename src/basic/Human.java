package basic;

public class Human extends LivingBeing {
    String name;

    public Human () {
        super(19);
        this.name = "Mateus";
    }

    @Override
    public void breathe() {
        System.out.println("basic.Human name: " + this.name);
        System.out.println("This basic.Human is " + this.age + " years old.");
        System.out.println("basic.Human is breathing..");
    }
}
