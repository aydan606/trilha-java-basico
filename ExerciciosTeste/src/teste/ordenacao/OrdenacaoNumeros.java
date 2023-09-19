package teste.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> integerList;

    public OrdenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        integerList.add(numero);
    }

    public List<Integer> ordenarCrescente() {
        List<Integer> numerosCrescentes = new ArrayList<>(integerList);
        if(!integerList.isEmpty()) {
            Collections.sort(numerosCrescentes);
        }
        return numerosCrescentes;
    }

    public List<Integer> ordenarDecrescente() {
        List<Integer> numerosDecrescentes = new ArrayList<>(integerList);
        if(!integerList.isEmpty()) {
            numerosDecrescentes.sort(Collections.reverseOrder());
        }
        return numerosDecrescentes;
    }

    public void exibirNumeros() {
        if(!integerList.isEmpty()) {
            System.out.println(integerList);
        }
        else
        {
            System.out.println("A lista está vazia!");
        }
    }

}
