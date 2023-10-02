package exercicios;

import java.util.*;

public class Desafio10 {

    public static List<Integer> numeros = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105);

    public static void main(String[] args) {

        // Desenvolvendo lógica para imprimir os números impares que são múltiplos de 3 e 5
        List<Integer> multiplosDe3e5 = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .toList();

        List<Integer> imparesMultiplosDe3e5 = multiplosDe3e5.stream()
                .filter(n -> n % 2 == 1)
                .toList();

        System.out.println("Os números ímpares e multiplos de 3 e 5 são: " + imparesMultiplosDe3e5);
    }

}