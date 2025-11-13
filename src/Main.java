public class Main {

    public static void main (String[] args) {
        // Variáveis

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Mateus";
        boolean bool = true;

        // Condicionais

        if (!str.equals("Vitor Roque")) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        // Vetores

        int[] intArr = {1, 2, 3, 4, 5}; // Inicia com valores padrões (tem tamanho fixo)
        int[] intArr2 = new int[5]; // Inicia mas sem valores definidos (porém ainda tem tamanho fixo)

        System.out.println("Minha Lista de Inteiros tem " + intArr.length + " valores");
        System.out.println(intArr[0]);
        System.out.println(intArr2[1]);

        // Prox aula: ArrayList | https://www.youtube.com/watch?v=nODe5lFcGpg&list=PLNCSWIsR6ADI_wMAx9F-Iu8Hs9HHxj4sb
    }
}

