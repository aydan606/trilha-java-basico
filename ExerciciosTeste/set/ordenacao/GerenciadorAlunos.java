package teste.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        if(!alunoSet.isEmpty()) {
            for(Aluno e: alunoSet) {
                if(e.getMatricula() == matricula) {
                    alunoSet.remove(e);
                }
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorNota());
        if(!alunoSet.isEmpty()) {
            System.out.println(alunoSet);
        }
        return alunoPorNota;
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        if(!alunoSet.isEmpty()) {
            System.out.println(alunoSet);
        }
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunos() {
        return alunoSet;
    }

}
