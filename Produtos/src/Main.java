import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listaProdutos = new ArrayList<>();

        System.out.println("======== CADASTRO DE PRODUTOS ========");
        System.out.println("1 - Cadastrar um Produto");
        System.out.println("2 - Listar Produtos");
        System.out.println("3 - Remover Produto");
        System.out.println("4 - Alterar Produto");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        int escolha = sc.nextInt();

        while (escolha != 0) {
            //Cadastrar novo produto
            if (escolha == 1) {
                System.out.print("Digite o nome do Produto: ");
                sc.nextLine();
                String produto = sc.nextLine();
                listaProdutos.add(produto);
            }

            //Listar produtos da lista
            if (escolha == 2) {
                System.out.println();
                System.out.println("===== PRODUTOS =====");
                System.out.println(listaProdutos);
                System.out.println();
            }

            //Remove produto da lista
            if (escolha == 3) {
                System.out.print("Qual produto você deseja remover? ");
                sc.nextLine();
                String nomeProduto = sc.nextLine();
                listaProdutos.remove(nomeProduto);
                System.out.println("O produto foi removido com sucesso!");
            }

            //Altera o produto
            if (escolha == 4) {
                System.out.println("Qual produto você deseja alterar? ");
                sc.nextLine();
                String nomeProduto = sc.nextLine();
                listaProdutos.remove(nomeProduto);
                System.out.println("Informe o novo nome para este produto: ");
                String novoNomeProduto = sc.nextLine();
                listaProdutos.add(novoNomeProduto);
            }

            //Para obrigar o usuário a escolher uma opção válida
            if (escolha > 4) {
                System.out.println("Faça uma escolha válida!");
            }

            System.out.print("Escolha uma opção: ");
            escolha = sc.nextInt();
        }

        //Finaliza o programa
        System.out.println("Programa encerrado!");

        sc.close();
    }
}