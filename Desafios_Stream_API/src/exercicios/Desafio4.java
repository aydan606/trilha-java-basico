package exercicios;

import java.util.*;

public class Desafio4 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio1.numeros;

        // Removendo todos os números ímpares da lista
        List<Integer> removerNumerosImpares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(removerNumerosImpares);
    }

}