package exercicios;

import java.util.*;

public class Desafio13 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio1.numeros;

        // Imprimindo números num intervalo específico
        List<Integer> filtroDeNumeros = numeros.stream()
                .filter(n -> n >=5 && n <= 10)
                .toList();

        System.out.println("Filtro aplicado: Os números são " + filtroDeNumeros);
    }

}