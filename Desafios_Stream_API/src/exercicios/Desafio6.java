package exercicios;

import java.util.*;

public class Desafio6 {

    public static void main(String[] args) {

        List<Integer> numeros = Desafio1.numeros;

        // Verificando se há números maiores que 10 na lista
        List<Integer> numMaioresQue10 = numeros.stream()
                .filter(n -> n > 10)
                .toList();

        if(!numMaioresQue10.isEmpty()) {
            System.out.println("Números maiores que 10 na lista: " + numMaioresQue10);
        }
        else {
            System.out.println("Não há numeros maiores que 10 na lista.");
        }
    }

}