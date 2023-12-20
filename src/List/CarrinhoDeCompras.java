package List;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {


    private List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome,preco, quantidade);
        this.carrinhoList.add(item);
    };

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if(!carrinhoList.isEmpty()){
            for (Item i:carrinhoList) {
                if (i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            carrinhoList.removeAll(itensParaRemover);
        }
        else {
            System.out.println("A lista está vazia!");
        }
    }

    public void calcularValorTotal(){
        double valorTotal = 0;
        for (Item i:carrinhoList) {
            valorTotal = (i.getPreco() * i.getQuantidade()) + valorTotal;

        }
        System.out.println(valorTotal);
    }

    public void exibirItens(){
        System.out.println(carrinhoList);
    }
}


