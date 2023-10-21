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

        System.out.println();
        System.out.println("1- Adicionar Produto Ao Carrinho");
        System.out.println("2- Listar Produtos");
        System.out.println("3- Sair ");
        System.out.println();
        System.out.println(" Digite a opção: ");

        int opcao = sc.nextInt();
        sc.nextLine();

        switch(opcao)
        {
          case 1:
            System.out.println("Digite o Id do produto: ");
            int idProduto = sc.nextInt();

            System.out.println("Digite a quantidade: ");    
            int quantidade = sc.nextInt();
            
            carrinho.adicionarAoCarrinho(idProduto, quantidade, produto);
            break;

          case 2:
            carrinho.listarCarrinho(produto);
          break;

          case 3:
            System.exit(0);
          break;

          default:
            System.out.println("Opção inválida. Tente novamente!");
          }      
    }
  }
}
