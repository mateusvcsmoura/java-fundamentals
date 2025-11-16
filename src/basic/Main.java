package basic;

import java.util.ArrayList;

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

        // ArrayList

        ArrayList<String> hobbies = new ArrayList<>();

        hobbies.add("Ouvir música"); // Adiciona o valor na lista
        hobbies.add("Dormir");
        hobbies.add("Aprender Java");

        hobbies.remove(0); // Remove o valor da lista

        System.out.println(hobbies.get(0));

        // Loops

        // For

        for (int index = 0; index < hobbies.size(); index++) { // com ArrayList usa .size(), .get()
            System.out.println("Hobbie " + (index + 1) + ": " + hobbies.get(index));
        }

        for (String hobbie : hobbies) { // funciona para ArrayList e Array normal
            System.out.println("Hobbie do Mateus" + ": " + hobbie);
        }

        // While

        int counter = 0;

        while (counter < 5) {
            System.out.println("Condição ainda não atendida");
            counter++;
        }

        // Casting: transformação de tipos do VALOR
        double result = 10.0;
        int resultInt = (int) result; // double -> int

        String age = "19";
        int ageInt = Integer.parseInt(age);

        String backToStr = String.valueOf(ageInt);
    }
}

