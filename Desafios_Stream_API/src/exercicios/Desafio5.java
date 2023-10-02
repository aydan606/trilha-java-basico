package exercicios;

import java.util.*;

public class Desafio5 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio1.numeros;

        // Calculando a média dos números maiores que 5
        List<Integer> numMaioresQue5 = numeros.stream()
                .filter(n -> n > 5)
                .toList();

        int somaNumeros = numMaioresQue5.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double mediaNumeros = (double) somaNumeros / numMaioresQue5.size();
        System.out.println(mediaNumeros);
    }

}