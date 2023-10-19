import java.util.ArrayList;
import java.util.Scanner;

class ItensCarrinho {
  private int id;
  private float valor;
  private int quantidade;

  public ItensCarrinho (int id, float valor, int quantidade) {
    this.id = id;
    this.valor = valor;
    this.quantidade = quantidade;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public float getValor() {
    return valor;
  }

  public void setValor(float valor) {
    this.valor = valor;
  }

public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
}
