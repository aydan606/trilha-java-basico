package teste.set.opbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> stringSet;

    public ConjuntoPalavrasUnicas() {
        this.stringSet = new HashSet<>() {
        };
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "stringSet=" + stringSet +
                '}';
    }

    public void adicionarPalavra(String palavra) {
        stringSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(!stringSet.isEmpty()) {
            for(String e: stringSet) {
                if(palavra.equalsIgnoreCase(e)) {
                    stringSet.remove(palavra);
                }
            }
        }
    }

    public boolean verificarPalavra(String palavra) {
        return stringSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if(!stringSet.isEmpty()) {
            System.out.println(stringSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

}
