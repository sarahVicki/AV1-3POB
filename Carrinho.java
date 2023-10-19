import java.util.Scanner;
import java.util.ArrayList;

public class Carrinho {
  ArrayList<ItensCarrinho> itensCarrinho = new ArrayList<ItensCarrinho>();

  public void Processamento() {
    Scanner sc = new Scanner(System.in);
    
    while (true){

      System.out.println("Digite a opção:");
      System.out.println("1- Adicionar Produto: ");
      System.out.println("2- Alterar Produto: ");
      System.out.println("3- Excluir Produto: ");
      System.out.println("4- Listar Produtos: ");
      System.out.println("5- Buscar Produtos: ");
      System.out.println("6- Sair ");

      int opcao = sc.nextInt();
      sc.nextLine();

      System.out.println("opção é: " + opcao);

        switch(opcao)
        {
          case 1:
            System.out.println("Digite o Id do produto: ");
            int id = sc.nextInt();
            System.out.println("Digite o valor do produto: ");
            int valor = sc.nextInt();
            System.out.println("Digite a quantidade: ");
            int quantidade = sc.nextInt();
            adicionarAoCarrinho(id,valor,quantidade);
          break;
            
          case 2:
            System.out.print("Digite o id do produto a ser modificado: ");
            int Id = sc.nextInt();
            System.out.println("Digite o valor do produto: ");
            int Valor = sc.nextInt();
            System.out.print("Digite a nova quantidade do produto: ");
            int novaQuantidade = sc.nextInt();
            alterarQuant(Id, Valor, novaQuantidade);
          break;
            
          case 3:
            System.out.print("Digite o ID do produto a ser removido: ");
            int idRemover = sc.nextInt();
            RemoverProduto(idRemover);
          break;

          case 4:
            listarCarrinho();
          break;

        //case 5:
          //BuscarProduto();
          //break;

        case 6:
          System.exit(0);
          break;

        default:
          System.out.println("Opção inválida. Tente novamente!");
        }
    }
  }

  public void adicionarAoCarrinho (int id, float valor, int quantidade) {
    ItensCarrinho itens = new ItensCarrinho(id, valor, quantidade);
    itensCarrinho.add(itens);
  }

  public void listarCarrinho() {
    for (ItensCarrinho itensCarrinho : itensCarrinho) {
      System.out.println("ID: " + itensCarrinho.getId());
      System.out.println("Valor: " + itensCarrinho.getValor());
      System.out.println("Quantidade: " + itensCarrinho.getQuantidade());
    }
  }

  public void RemoverProduto(int id) {
    for (int i = 0; i < itensCarrinho.size(); i++) {
      if (itensCarrinho.get(i).getId() == id) {
        itensCarrinho.remove(i);
        System.out.println("Produto removido com sucesso.");
        return;
      }
    }
    System.out.println("Produto não encontrado.");
  }

  public void alterarQuant (int id, float valor, int quantidade) {
      for (ItensCarrinho itensCarrinho: itensCarrinho) {
        if (itensCarrinho.getId() == id) {
          ItensCarrinho itens = new ItensCarrinho(id, valor, quantidade);
          itensCarrinho.set(itensCarrinho.indexOf(itensCarrinho),(itens));
          System.out.println("Quantidade atualizada com sucesso.");
          return;
        }
      }
      System.out.println("Produto não encontrado.");
    }
}
