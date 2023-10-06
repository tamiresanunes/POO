/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jfpch
 */
public class Objeto {
    
    protected int posicaoX;
    protected int posicaoY;
    
    public Objeto(int posicaoX, int posicaoY){
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }
    
    public int getPosicaoX(){
        return posicaoX;
    }
    
    public int getPosicaoY(){
        return posicaoY;
    }
}
