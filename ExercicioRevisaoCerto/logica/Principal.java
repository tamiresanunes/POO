/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import entidades.Fantasma;
import entidades.PacMan;
import entidades.Pastilha;
import entidades.Pontinho;

/**
 *
 * @author jfpch
 */
public class Principal {
    
    public static void main(String[] args) {
        PacMan pacman = new PacMan(false, 0, 3);
        
        Fantasma[] fantasmas = new Fantasma[4];
        fantasmas[0] = new Fantasma(10, 10, "Pinky");
        fantasmas[1] = new Fantasma(790, 590, "Blinky");
        fantasmas[2] = new Fantasma(10, 590, "Inky");
        fantasmas[3] = new Fantasma(790, 10, "Clyde");
        
        Pontinho[] pontinhos = new Pontinho[100];
        for(int i = 0; i < pontinhos.length; i++){
            pontinhos[i] = new Pontinho(200+i, 200-i);
        }
        
        Pastilha[] pastilhas = new Pastilha[4];
        pastilhas[0] = new Pastilha(10, 10);
        pastilhas[1] = new Pastilha(790, 590);
        pastilhas[2] = new Pastilha(10, 590);
        pastilhas[3] = new Pastilha(790, 10);
        
        System.out.println("\n-- mostrando dados do pacman e dos fantasmas --");
        System.out.println(pacman);
        for(int i = 0; i < fantasmas.length; i++){
            System.out.println(fantasmas[i]);
        }
        
        System.out.println("\n-- pacman comendo 13 pontinhos de posicoes pares --");
        for(int i = 0; i < 26; i=i+2){
            pacman.colidir(pontinhos[i]);
        }
        System.out.println(pacman);
        
        System.out.println("\n-- pacman morrendo para fantasma Inky --");
        for(int i = 0; i < fantasmas.length; i++){
            if(fantasmas[i].getNome().equals("Inky")){
                pacman.colidir(fantasmas[i]);
            }
        }
        System.out.println(pacman);
        for(int i = 0; i < fantasmas.length; i++){
            System.out.println(fantasmas[i]);
        }
        
        System.out.println("\n-- renascendo o pacman --");
        pacman.renascer();
        System.out.println(pacman);
        
        System.out.println("\n-- pacman matando o fantasma Clyde depois de comer pastilha --");
        pacman.colidir(pastilhas[0]);
        for(int i = 0; i < fantasmas.length; i++){
            if(fantasmas[i].getNome().equals("Clyde")){
                pacman.colidir(fantasmas[i]);
            }
        }
        System.out.println(pacman);
        for(int i = 0; i < fantasmas.length; i++){
            System.out.println(fantasmas[i]);
        }
        
        System.out.println("\n-- renascendo o Clyde --");
        for(int i = 0; i < fantasmas.length; i++){
            if(fantasmas[i].getNome().equals("Clyde")){
                fantasmas[i].renascer();
            }
        }
        for(int i = 0; i < fantasmas.length; i++){
            System.out.println(fantasmas[i]);
        }
    }
    
}
