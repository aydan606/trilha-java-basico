package exercicios;

import java.util.*;

public class Desafio2 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio1.numeros;

        // Imprimindo a soma de números pares da lista
        int soma = numeros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("A soma dos números pares da lista é de " + soma);
    }
}