package ExercicioRevisao.entidades;

public class Personagem {
    protected Boolean vivo;
    protected int posicaoX;
    protected int posicaoY;
    
    public Personagem(int posicaoX, int posicaoY) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.vivo = true; // Não é necessário o "this" pq não há ambiguidade
    }

    protected void morrer(){
        this.vivo= false;  // Não é necessário o "this" pq não há ambiguidade
    }

    private void renascer(){
        this.vivo = true;
    }

    public Boolean isVivo() {// é convenção colocar is e es quando for boolean, coisa de inglês
        return this.vivo;
    }

    public int getPosicaoX() {
        return this.posicaoX;
    }

    public int getPosicaoY() {
        return this.posicaoY;
    }

    

    

    

    
}
