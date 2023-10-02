package exercicios;

import java.util.*;

public class Desafio19 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio10.numeros;

        // Lógica implementada para somar os números múltiplos de 3 e 5
        List<Integer> multiplosDe3e5 = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .toList();

        int somaMultiplos = multiplosDe3e5.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("A soma dos múltiplos de 3 e 5 é de " + somaMultiplos);
    }

}
