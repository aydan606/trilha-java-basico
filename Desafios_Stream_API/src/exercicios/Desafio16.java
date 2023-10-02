package exercicios;

import java.util.*;

public class Desafio16 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio1.numeros;

        // Imprimindo números pares e ímpares em listas distintas
        List<Integer> numerosPares = numeros.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .toList();

        List<Integer> numerosImpares = numeros.stream()
                .distinct()
                .filter(n -> n % 2 == 1)
                .toList();

        System.out.println("Esses são os números pares da lista: " + numerosPares);
        System.out.println("E esses são os números ímpares: " + numerosImpares);
    }

}