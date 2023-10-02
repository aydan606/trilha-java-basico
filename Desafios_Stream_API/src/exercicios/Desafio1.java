package exercicios;

import java.util.*;

public class Desafio1 {

    public static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main (String[] args) {

        // Imprimindo os números da lista em ordem crescente
        List<Integer> ordemCrescente = numeros.stream().
                sorted()
                .toList();

        System.out.println("Ordem crescente: " + ordemCrescente);
    }
}