package Borboleta;
import java.util.Scanner;

public class Borboleta {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número referente à altura das asas da borboleta que deseja:");
        int altura = scanner.nextInt();
        int contador = 1;
       
        //verifica se o número informado é ímpar e menor ou igual a 20
        while (altura % 2 == 0 || altura > 20) {
            System.out.println("O número deve ser ímpar e menor ou igual a 20.");
            altura = scanner.nextInt();
        }
            // contador de cima
            while(contador<= altura/2){
                for(int i=1; i<= contador; i++){
                    System.out.print("X");
                }
                for(int i=1; i<= altura-contador-contador; i++){
                    System.out.print(".");
                }
                for(int i=1; i<= contador; i++){
                    System.out.print("X");
                }
                System.out.println("");
                contador++;
            }
            
            //contador do meio
                while(contador<= altura){
                for(int i=1; i<= altura; i++){
                    System.out.print("X");
                    
                System.out.print("");
                contador++;
                }
            }
            contador=altura/2;
            System.out.println("");
            //Contador de baixo
            while(contador>=1){
                for(int i=1; i<= contador; i++){
                    System.out.print("X");
                }
                for(int i=1; i<= altura-contador-contador; i++){
                    System.out.print(".");
                }
                for(int i=1; i<= contador; i++){
                    System.out.print("X");
                }
                System.out.println("");
                contador--;
            }
            
        
        }
    }