package exercicios;

import java.util.*;
import java.util.stream.Collectors;

public class Desafio9 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio1.numeros;

        // Desenvolve lógica para buscar e imprimir os números distintos da lista
        Map<Integer, Long> lista1 = numeros.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        List<Integer> lista2 = lista1.entrySet().stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        if (!lista2.isEmpty()) {
            System.out.println("Os elementos não distintos dessa lista é: " + lista2);
        }
        else {
            System.out.println("Não há elementos repetidos na lista.");
        }

    }
}