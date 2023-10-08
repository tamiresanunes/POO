package ExercicioInterfaceMR;

public class Tigre implements Ronronador{
    public String nome;

    public Tigre(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String ronronar() {
        return "RRRRRRRR";
    }

    @Override
    public String toString() {
        return "Tigre nome: " + nome;
    }





}
