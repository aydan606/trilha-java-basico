package teste.list.opbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();

    }

    public void adicionarItem(String nome, float preco, int quantidade) {
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaRemocao = new ArrayList<>();
        for(Item e: carrinhoCompras) {
            if(e.getNome().equalsIgnoreCase(nome))
                listaRemocao.add(e);
        carrinhoCompras.removeAll(listaRemocao);
        }
    }

    public double calcularValorTotal() {
        double valorTotalGeral = 0;
        double valorTotalProduto;
        for (Item e: carrinhoCompras) {
            valorTotalProduto = e.getPreco() * e.getQtd();
            valorTotalGeral += valorTotalProduto;
        }
        return valorTotalGeral;
    }

    public void exibirItens() {
        System.out.println(carrinhoCompras);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Detergente", 1.50f, 1);
        carrinhoDeCompras.adicionarItem("Sabão em Pó", 3.50f, 3);
        carrinhoDeCompras.exibirItens();
    }

}