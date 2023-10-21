import java.util.ArrayList;
import java.util.Scanner;

class ItensCarrinho {
  private int idProduto;
  private int quantidade;
  private double valorTotal;

  public ItensCarrinho (int idProduto, int quantidade, double valorTotal) {
    this.idProduto = idProduto;
    this.quantidade = quantidade;
    this.valorTotal = valorTotal;
  }

  public int getIdProduto() {
    return idProduto;
  }

  public void setIdProduto(int idProduto) {
    this.idProduto = idProduto;
  }

  public double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
  }

public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
}
