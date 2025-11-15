public class Poo {
    public static void main (String[] args) {
        Car gtr = new Gtr();
        Car hb20 = new Hb20();

        gtr.drive();
        hb20.drive();

        hb20.brake();
        hb20.brake();

        gtr.showCarInfo();
        hb20.showCarInfo();

        Human human = new Human();
        human.breathe();
        human.sleep();

        Car brokenCar = null;

        try {
            brokenCar.drive();
        } catch (NullPointerException exception) {
            System.out.println("Vende esse Carro ai");
        }
    }
}

// Modificador Public: É acessível de qualquer pacote/classe
// Modificador Private: É acessível apenas dentro da própria classe
// Modificador Protected: Permite o acesso de todas as classes que estão no mesmo pacote
// Modificador Default: Quando não especificamos o modificador da classe (package-private: é acessível apenas por outras classes dentro do mesmo pacote)

// NullPointerException: Quando tentamos manipular um objeto nulo, acessar ou etc
// IOException: Quando tentamos ler um arquivo da máquina e o caminho não for encontrado/corrompido/formato errado (entrada e saída)
// ArrayIndexOutOfBounds: Quando tentamos acessar um índice inexistente de um Array
// RuntimeException: Exceção geral, não há descrição específica

// Usamos Try/Catch para tratar exceções

