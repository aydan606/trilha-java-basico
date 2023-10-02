package teste.set.pesquisa;

public class Tarefa {

    private String descricao;
    private boolean foiConcluido;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFoiConcluido() {
        return foiConcluido;
    }

    public void setFoiConcluido(boolean foiConcluido) {
        this.foiConcluido = foiConcluido;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
