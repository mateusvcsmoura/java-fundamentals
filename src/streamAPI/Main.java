package streamAPI;

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
        fruits.add("Avocado");

        // Set: Lista que não permite duplicata
        Set<String> fruitsSet = new HashSet<>(); // HashSet -> implementa o nosso Set (baseado em HashTable)
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Orange");
        fruitsSet.add("Apple");

        // Map: Objetos de Chave-Valor
        Map<String, String> map = new HashMap<>(); // implementa o Map (baseado em HashTable)
        map.put("name", "Mateus Moura");
        map.put("phone", "11945679199");
        map.put("age", "19");
        map.put("favoriteSong", "Sometimes");

        // Queue: Filas
        Queue<String> queue = new LinkedList<>(); // implementa a Queue usando o conceito de lista linkada (duplamente linkadas)
        queue.add("Mateus");
        queue.add("Fernanda");
        queue.add("Java");
        queue.add("SQL");

        // Stream API

        List<String> aFruits = fruits.stream() // transformamos em uma stream
                .filter(fruit -> fruit.startsWith("A"))
                .map(String::toUpperCase) // mapeia o tipo que o Map vai receber
                .toList(); // retransformamos em uma lista

        long aFruitsCounter = fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .count();

        System.out.println(aFruits);
        System.out.println("Contador: " + aFruitsCounter);
    }
}
