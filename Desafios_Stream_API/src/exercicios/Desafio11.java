package exercicios;

import java.util.*;

public class Desafio11 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio1.numeros;

        // Imprimindo a soma dos quadrados de todos os números da lista
        int soma = numeros.stream()
                .mapToInt(n -> n * n)
                .sum();

        System.out.println("O resultado é de " + soma);
    }

}