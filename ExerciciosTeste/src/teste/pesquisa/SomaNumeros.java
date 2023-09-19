package teste.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(8);
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.exibirNumeros());

    }

    private List<Integer> integerList;

    public SomaNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        integerList.add(numero);
    }

    public int calcularSoma() {
        int aux = 0;
        if(!integerList.isEmpty()) {
            for(Integer e: integerList) {
                aux = aux + e;
            }
        }
        return aux;
    }

    public int encontrarMaiorNumero() {
        int valorMax = Integer.MIN_VALUE;
        if(!integerList.isEmpty()) {
            for(Integer e: integerList) {
                if(e >= valorMax) {
                    valorMax = e;
                }

            }
        }
        return valorMax;
    }

    public int encontrarMenorNumero() {
        int valorMin = Integer.MAX_VALUE;
        if(!integerList.isEmpty()) {
            for(Integer e: integerList) {
                if(e <= valorMin) {
                    valorMin = e;
                }

            }
        }
        return valorMin;
    }

    public List<Integer> exibirNumeros() {
        return integerList;
    }

}
