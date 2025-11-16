package dataStructures;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        // List: Lista que permite duplicatas

        // List<String> fruits = List.of("Apple", "Banana", "Orange");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");

        System.out.println("List: " + fruits);

        // Set: Lista que não permite duplicata
        Set<String> fruitsSet = new HashSet<>(); // HashSet -> implementa o nosso Set (baseado em HashTable)
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Orange");
        fruitsSet.add("Apple");

        System.out.println(fruitsSet.contains("Lime")); // Verifica se o valor existe no Set

        System.out.println("Set: " + fruitsSet);

        // Map: Objetos de Chave-Valor
        Map<String, String> map = new HashMap<>(); // implementa o Map (baseado em HashTable)
        map.put("name", "Mateus Moura");
        map.put("phone", "11945679199");
        map.put("age", "19");
        map.put("favoriteSong", "Sometimes");

        System.out.println(map.get("name")); // Obtem o nome

        // Queue: Filas
        Queue<String> queue = new LinkedList<>(); // implementa a Queue usando o conceito de lista linkada (duplamente linkadas)
        queue.add("Mateus");
        queue.add("Fernanda");
        queue.add("Java");
        queue.add("SQL");

        String first = queue.peek(); // Acessa o primeiro valor, mas sem remover da fila
        queue.poll(); // Remove e retorna o primeiro valor da fila
        queue.remove(); // Remove o primeiro valor, mas lança uma exceção quando não houver ninguém na fila
        queue.remove(); // Remove o primeiro valor, mas lança uma exceção quando não houver ninguém na fila
        queue.remove(); // Remove o primeiro valor, mas lança uma exceção quando não houver ninguém na fila
        queue.poll(); // Remove e retorna o primeiro valor da fila, não lança exceção

        System.out.println("Primeiro: " + first);
        System.out.println("Queue: " + queue);
    }
}

