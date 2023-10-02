package teste.set.pesquisa;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas(Set<Tarefa> tarefaSet) {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if(!tarefaSet.isEmpty()) {
            for(Tarefa e: tarefaSet) {
                if(descricao.equalsIgnoreCase(e.getDescricao())) {
                    tarefaSet.remove(e);
                }
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println("Existe um total de " + tarefaSet.size() + " tarefas.");
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefas = new HashSet<>();
        for (Tarefa e: tarefaSet) {
            if(e.isFoiConcluido()) {
                tarefas.add(e);
            }
        }
        return tarefas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefas = new HashSet<>();
        for(Tarefa e: tarefaSet) {
            if(!e.isFoiConcluido()) {
                tarefas.add(e);
            }
        }
        return tarefas;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa e: tarefaSet) {
           if(Objects.equals(e.getDescricao(), descricao)) {
               e.setFoiConcluido(true);
           }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for(Tarefa e: tarefaSet) {
            if(Objects.equals(e.getDescricao(), descricao)) {
                e.setFoiConcluido(false);
            }
        }
    }

    public void limparListaTarefas() {
        if(!tarefaSet.isEmpty()) {
            tarefaSet.clear();
        }
    }

}