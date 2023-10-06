package ExercicioRevisao.entidades;

public class Fantasma extends Personagem{

    String nome;

    public Fantasma(int posicaoX, int posicaoY, String nome){
        super(posicaoX, posicaoY);
        this.nome = nome;
    }

    @Override
    protected void morrer(){
        vivo = false;
        posicaoX = 400;
        posicaoY = 300;
    }
    
}
