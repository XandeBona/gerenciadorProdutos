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


            System.out.print("Escolha uma opção: ");
            escolha = sc.nextInt();
        }

        sc.close();
    }
}