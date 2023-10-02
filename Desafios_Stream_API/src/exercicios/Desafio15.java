package exercicios;

import java.util.*;

public class Desafio15 {

    public static List<Integer> numeros = Arrays.asList(-1, 2, 3, -4, 5, -6, -7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {

        // Imprimindo os números negativos da lista
        List<Integer> numerosNegativos = numeros.stream()
                .filter(n -> n < 0)
                .toList();

        if(!numerosNegativos.isEmpty()) {
            System.out.println("Esses são os números negativos presentes na lista: " + numerosNegativos);
        }
        else {
            System.out.println("Não há números negativos na lista.");
        }
    }

}