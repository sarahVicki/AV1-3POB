import java.util.Scanner;
import java.util.ArrayList;

public class Carrinho {
  ArrayList<ItensCarrinho> itensCarrinho = new ArrayList<ItensCarrinho>();
  double valorTotal = 0.0;

  public void adicionarAoCarrinho (int idProduto, int quantidade, ArrayList<Produto> produto) {
    for (Produto i : produto) {
      if (i.getId() == idProduto) {
        double valorItem = i.getValor() * quantidade;
        itensCarrinho.add(new ItensCarrinho(idProduto, quantidade, 0));
        valorTotal += valorItem;
      }
    }
  }

  public void listarCarrinho(ArrayList<Produto> produto) {
    System.out.println("Carrinho de Compras:");
    for (ItensCarrinho it : itensCarrinho) {
      int idProduto = it.getIdProduto();
      int quantidade = it.getQuantidade();
      for (Produto i : produto) {
        if (i.getId() == idProduto) {
          System.out.println(i.getNome() + " - Quantidade: " + quantidade + " - Valor Unitário: $" + i.getValor());
        }
      }
    }
    System.out.println("Valor Total do Carrinho: $" + valorTotal);
  }

}
