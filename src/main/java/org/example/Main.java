package org.example;
import dao.ProdutoDAO;
import java.util.List;
import java.util.Scanner;
import model.Produto;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoDAO dao = new ProdutoDAO();

        int opcao = 0;

        do {
            System.out.println("Bem-vindo user");
            System.out.println("1 - Inserir produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

          switch (opcao) {
              case 1:
                  System.out.println("Cadastrando o produto");

                  System.out.println("Digite o nome do produto: ");
                  String nome = sc.nextLine();

                  System.out.println("Preco: ");
                  double preco = sc.nextDouble();

                  System.out.println("Quantidade: ");
                  int quantidade = sc.nextInt();

                  dao.inserirProduto(nome, preco, quantidade);
                  break;

              case 2:
                  System.out.println("Lista de produtos");
                  List<Produto> meusProdutos = dao.listarProdutos();

                  if (meusProdutos.isEmpty()) {
                      System.out.println("Nenhum produto cadastrado no estoque ainda.");
                  } else {
                      for (Produto p : meusProdutos) {
                          System.out.println(p.toString());
                      }
                  }
                 break;

              case 3:
                  System.out.println("Fechando o sistema...");
                  break;
              default:
                  System.out.println("Opcao invalida!!");
           }
            } while (opcao != 3);

        sc.close();


    }
}
