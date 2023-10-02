package exercicios;

import java.util.*;

public class Desafio17 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio1.numeros;

        // Imprimindo todos os números primos de uma lista
        List<Integer> numerosPrimos = numeros.stream()
                .distinct()
                // Dentro do Desafio 14 há uma função que identifica números primos.
                .filter(Desafio14::ehPrimo)
                .toList();

        System.out.println("Os números primos da lista são: " + numerosPrimos);
    }

}