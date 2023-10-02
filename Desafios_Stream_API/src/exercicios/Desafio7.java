package exercicios;

import java.util.*;

public class Desafio7 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio1.numeros;

        Set<Integer> numerosUnicos = new HashSet<>(numeros);

        // Encontrando o segundo número maior da lista
        Optional<Integer> segundoMaiorElemento = numerosUnicos.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        if(segundoMaiorElemento.isPresent()) {
            System.out.println("O segundo maior elemento é: " + segundoMaiorElemento.get());
        }
        else {
            System.out.println("Não há segundo maior elemento na lista.");
        }
    }
}