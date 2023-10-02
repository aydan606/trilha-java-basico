package exercicios;

import java.util.*;

public class Desafio14 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio1.numeros;

        // Desenvolvendo lógica para imprimir o maior número primo da lista
        Optional<Integer> numeroPrimo = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .filter(Desafio14::ehPrimo)
                .findFirst();

        numeroPrimo.ifPresent(n -> System.out.println("O maior número primo da lista é o " + n));
    }

    public static boolean ehPrimo(int num) {
        if(num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}