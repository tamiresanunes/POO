/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jfpch
 */
public class Personagem {
    protected boolean vivo;
    protected int posicaoX;
    protected int posicaoY;
    
    public Personagem(int posicaoX, int posicaoY){
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.vivo = true;// Não é necessário o "this" pq não há ambiguidade
    }
    
    protected void morrer(){
        this.vivo = false;// Não é necessário o "this" pq não há ambiguidade
    }
    
    //precisei mudar para público para renascer o fantasma Clyde na classe Principal
    public void renascer(){
        this.vivo = true;
    }
    
    public int getPosicaoX(){
        return this.posicaoX;
    }
    
    public int getPosicaoY(){
        return this.posicaoY;
    }
    
    public boolean isVivo(){// é convenção colocar is e es quando for boolean, coisa de inglês
        return this.vivo;
    }
    
    @Override
    public String toString(){
        return "[ X="+posicaoX+
                " | Y="+posicaoY+" | "+
                (vivo?"vivo]":"morto]");
    }
    
    @Override
    public int hashCode(){
        int hash = 17;
        hash = hash + posicaoX * 23;
        hash = hash + posicaoY * 29;
        hash = hash + (vivo ? 7 : 11);
        return hash;
    }
    
    @Override
    public boolean equals(Object outro){
        if(outro == null){
            return false;
        }
        if(this == outro){
            return true;
        }
        if( this.getClass() != outro.getClass() ){
            return false;
        }
        Personagem outroPacMan = (Personagem) outro;
        if(this.posicaoX == outroPacMan.posicaoX &&
                this.posicaoY == outroPacMan.posicaoY &&
                this.vivo == outroPacMan.vivo){
            return true;
        }
        return false;
    }
}
