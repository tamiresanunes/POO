/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jfpch
 */
public class PacMan extends Personagem {
    
    boolean invencivel;
    int contadorDePontinhos;
    int vidasRestantes;
    
    public PacMan(boolean invencivel, int contadorDePontinhos, 
            int vidasRestantes){
        super(700,300);// super tem que sempre vir em primeiro lugar.
        this.invencivel = invencivel;
        this.vidasRestantes = vidasRestantes;
        this.contadorDePontinhos = contadorDePontinhos;
    }
    
    public boolean isInvencivel(){// get não precisa colocar this, é opcional.
        return invencivel;
    }
    
    public int getContadorDePOntinhos(){
        return contadorDePontinhos;
    }
    
    public int getVidasRestantes(){
        return vidasRestantes;
    }
    
    //sobrecarregar esse método não está no exercício, mas é interessante
    @Override
    public void renascer(){ 
        if(vidasRestantes > 0){
            vidasRestantes--;
            vivo = true;
        }
    }
    
    public void colidir(Object coisa){
        //if(coisa.getClass() == Fantasma.class && !isInvencivel()){
        if(coisa instanceof Fantasma && !invencivel){
            morrer();
            //this.morrer();
            //super.morrer();
        }
        if(coisa instanceof Fantasma && invencivel){
            Fantasma gasparzinho = (Fantasma) coisa;// está pegando o object e mudando o tipo dele, de object para fantasma.
            gasparzinho.morrer();
            gasparzinho.morrer();
        }
        if(coisa instanceof Pontinho){
            contadorDePontinhos++;
        }
        if(coisa instanceof Pastilha){
            invencivel = true;
        }
    }
    
    @Override
    public String toString(){
        return "["+super.toString()+" | "+
                (invencivel?"invencivel":"nao invencivel")+
                " | pontos "+contadorDePontinhos+
                " | "+vidasRestantes+" vidas]";
    }
    
    @Override
    public int hashCode(){
        int hash = 13;
        hash = hash + contadorDePontinhos * 17;
        hash = hash + vidasRestantes * 19;
        hash = hash + posicaoX * 23;
        hash = hash + posicaoY * 29;
        hash = hash + (vivo ? 3 : 5);
        hash = hash + (invencivel ? 7 : 11);
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
        PacMan outroPacMan = (PacMan) outro;
        if(this.posicaoX == outroPacMan.posicaoX &&
                this.posicaoY == outroPacMan.posicaoY &&
                this.invencivel == outroPacMan.invencivel &&
                this.vivo == outroPacMan.vivo &&
                this.contadorDePontinhos == outroPacMan.contadorDePontinhos &&
                this.vidasRestantes == outroPacMan.vidasRestantes){
            return true;
        }else{
            return false;
        }
    }
}
