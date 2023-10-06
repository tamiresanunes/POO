package Exercicioherança;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Inicializa novos servidores para testar o hashcode e o equals
        Servidor servidor2 = new Servidor("Mariana", "03880578079", 789456);
        Servidor servidor1 = new Servidor("Mateus", "03880784596", 123456);

        int hashCodeservidor2 = servidor2.hashCode();
        int hashCodeservidor1 = servidor1.hashCode();

        System.out.println("HashCode do servidor2: " + hashCodeservidor2);
        System.out.println("HashCode do servidor1: " + hashCodeservidor1);

        if (servidor1.equals(servidor2)) {
            System.out.println("Os servidores são iguais");

        } else {
            System.out.println("Os servidores não são iguais");

            // Inicializa novos terceirizados para testar o hashcode e o equals
            Terceirizado terceirizado1 = new Terceirizado("Mariana", "03880578079", 789456);
            Terceirizado terceirizado2 = new Terceirizado("Mateus", "03880784596", 123456);

            int hashCodeterceirizado1 = servidor1.hashCode();
            int hashCodeterceirizado2 = servidor2.hashCode();

            System.out.println("HashCode do terceirizado1: " + hashCodeterceirizado1);
            System.out.println("HashCode do terceirizado2: " + hashCodeterceirizado2);

            if (terceirizado1.equals(terceirizado2)) {
                System.out.println("Os servidores são iguais");

            } else {
                System.out.println("Os servidores não são iguais");

                // abre um vetor de pessoas
                Pessoa[] pessoas = new Pessoa[10];
                int posicaoLivre = 0;

                // começa o menu de opções
                while (true) {
                    System.out.println("1 - Cadastrar o servidor");
                    System.out.println("2 - Cadastrar o terceirizado");
                    System.out.println("3 - Mostrar todas as pessoas");
                    System.out.println("4 - Encerrar o programa");
                    int opcao = entrada.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o nome do servidor:");
                            String nome = entrada.next();
                            System.out.println("Digite o CPF do servidor:");
                            String CPF = entrada.next();
                            System.out.println("Digite o SIAPE do servidor:");
                            int SIAPE = entrada.nextInt();
                            Servidor servidor = new Servidor(nome, CPF, SIAPE);
                            if (posicaoLivre < pessoas.length) {
                                pessoas[posicaoLivre] = servidor;
                                posicaoLivre++;
                                System.out.println(servidor);
                            } else {
                                System.out.println("Não existe mais posições livres no vetor.");
                            }
                            break;
                        case 2:
                            System.out.println("Digite o nome do terceirizado:");
                            nome = entrada.next();
                            System.out.println("Digite o CPF do terceirizado:");
                            CPF = entrada.next();
                            System.out.println("Digite o CLT do terceirizado:");
                            long CLT = entrada.nextLong();
                            Terceirizado terceirizado = new Terceirizado(nome, CPF, CLT);
                            if (posicaoLivre < pessoas.length) {
                                pessoas[posicaoLivre] = terceirizado;
                                posicaoLivre++;
                                System.out.println(terceirizado);
                            } else {
                                System.out.println("Não existe mais posições livres no vetor.");
                            }
                            break;
                        case 3:
                            for (Pessoa pessoa : pessoas) {
                                if (pessoa != null) {
                                    System.out.println(pessoa);
                                }
                            }
                            break;
                        case 4:
                            System.out.println("O programa foi encerrado.");
                            System.exit(0);
                        default:
                            System.out.println("Opção inválida.");
                    }
                }

            }

        }
    }
}
