import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
  public void processamento() {
    
    ArrayList<Produto> produto = new ArrayList<>();
    
    produto.add(new Produto(52001, "Café", 15.80));
    produto.add(new Produto(70002, "Macarrão", 4.99));    
    produto.add(new Produto(45003, "Arroz", 5.50));    
    produto.add(new Produto(92004, "Chá", 7.50));    
    produto.add(new Produto(12005, "Biscoito", 3.50));

    System.out.println("Lista de Produtos Disponíveis:");
    for (Produto i : produto) {
        System.out.println(i.getId() + ". " + i.getNome() + " - Valor: $" + i.getValor());
    }
    
    Carrinho carrinho = new Carrinho();
    Scanner sc = new Scanner(System.in);

    while (true){

      System.out.println("Digite o Id do produto: ");
      int idProduto = sc.nextInt();

      System.out.println("Digite a quantidade: ");    
      int quantidade = sc.nextInt();
            
      carrinho.adicionarAoCarrinho(idProduto, quantidade, produto);
            
      System.out.print("Deseja adicionar outro produto ao carrinho? (1 para Sim, 0 para Não): ");
      int resposta = sc.nextInt();
        
      if (resposta == 0) {
        carrinho.listarCarrinho(produto);
        System.exit(0);
      }
    }
  }
}
