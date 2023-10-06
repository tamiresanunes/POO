/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jfpch
 */
public class Fantasma extends Personagem{
    
    String nome;
    
    public Fantasma(int posicaoX, int posicaoY, String nome){
        super(posicaoX, posicaoY);
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    @Override
    protected void morrer(){
        vivo = false;
        posicaoX = 400;
        posicaoY = 300;
    }
    
    @Override
    public String toString(){
        return "["+super.toString()+" | "+nome+"]";
    }
    
    @Override
    public int hashCode(){
        int hash = 13;
        hash = hash + posicaoX * 23;
        hash = hash + posicaoY * 29;
        hash = hash + (vivo ? 17 : 31);
        hash = hash + nome.hashCode();
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
        if( !(outro instanceof PacMan) ){
            return false;
        }
        Fantasma outroPacMan = (Fantasma) outro;
        if(this.posicaoX == outroPacMan.posicaoX &&
                this.posicaoY == outroPacMan.posicaoY &&
                this.vivo == outroPacMan.vivo &&
                this.nome.equals(outroPacMan.nome)){
            return true;
        }else{
            return false;
        }
    }
    
}
