package exercicios;

import java.util.*;

public class Desafio8 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio1.numeros;

        // Desenvolvendo lógica para somar todos os dígitos de todos os números de uma lista
        int somaDigitosNumeroLista = numeros.stream()
                .map(Desafio8::somaDigitosNumero)
                .reduce(0, Integer::sum);

        System.out.println("A soma de todos os dígitos dos números da lista é de " + somaDigitosNumeroLista);

    }

    public static int somaDigitosNumero(int numero) {

        // Desenvolvendo lógica para somar todos os dígitos de um número
        return Integer.toString(numero)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }
}