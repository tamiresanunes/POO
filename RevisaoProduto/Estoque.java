package RevisaoProduto;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe quantos produtos deseja cadastrar:");
        int quantidadeDeProdutos = entrada.nextInt();

        Produto[] produtos = new Produto[quantidadeDeProdutos];

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Informe o nome do produto:");
            String nome = entrada.next();
            System.out.println("Informe a quantidade do produto:");
            int quantidade = entrada.nextInt();
            System.out.println("Informe o preço do produto:");
            double preco = entrada.nextDouble();
            produtos[i] = new Produto(nome, quantidade, preco);
        }

        /*for (Produto produto : produtos) {
            System.out.println("Produtos em estoque:");
            System.out.println(produtos.length);
        }*/
        System.out.println("Lista de produtos cadastrados:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println(
                    produtos[i].getNome() + " - " + produtos[i].getQuant() + " - " + produtos[i].getPreco());
        }

    }

}
