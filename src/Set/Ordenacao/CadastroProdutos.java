package Set.Ordenacao;

import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    public Set<Produto> produtoSet;

    public void adicionarProduto(int cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>();
        return produtosPorNome;
    }
    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        if (!produtoSet.isEmpty()) {
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
}
