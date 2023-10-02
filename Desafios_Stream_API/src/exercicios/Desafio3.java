package exercicios;

import java.util.*;

public class Desafio3 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio1.numeros;

        // Imprimindo todos os números positivos da lista
        List<Integer> numerosPositivos = numeros.stream()
                .filter(n -> n > 0)
                .toList();

        System.out.println("Os números positivos da lista são: " + numerosPositivos);
    }

}
