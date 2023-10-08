package ExercicioInterfaceMR;

public class Gato implements Miador, Ronronador{
    public String nome;
    public String pelagem;
    public Gato(String nome, String pelagem) {
        this.nome = nome;
        this.pelagem = pelagem;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    @Override
    public String ronronar() {
        return "Rrrrrrr";
    }
    @Override
    public String miador() {
       return "Miau!";
    }

    @Override
    public String toString() {
        return "Gato nome: " + nome + ", pelagem: " + pelagem;
    }


    
    
}
