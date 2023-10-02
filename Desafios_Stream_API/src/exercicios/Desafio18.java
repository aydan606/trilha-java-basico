package exercicios;

import java.util.*;

public class Desafio18 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio1.numeros;
        List<Integer> numerosCopia = new ArrayList<>(numeros);

        // Desenvolvendo lógica para identificar se as duas listas fornecidas são iguais.

        // Método mais simples para o propósito final
        // boolean saoIguais = numeros.equals(numerosCopia);

        boolean saoIguais = numeros.stream()
                .equals(numerosCopia.stream());

        if(saoIguais)
            System.out.println("As listas são iguais.");
        else
            System.out.println("As listas são diferentes.");
    }

}