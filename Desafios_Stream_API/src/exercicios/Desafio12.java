package exercicios;

import java.util.*;

public class Desafio12 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio1.numeros;

        // Imprimindo o produto de todos os números da lista
        long produto = numeros.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("O valor do produto é de " + produto);
    }

}