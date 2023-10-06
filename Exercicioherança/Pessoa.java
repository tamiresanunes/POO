package Exercicioherança;

public class Pessoa {
    public String nome;
    public String CPF;
    public Pessoa(String nome, String cPF) {
        this.nome = nome;
        this.CPF = cPF;
    }
    @Override
    public String toString() {
        return "Pessoa: " + nome + ", CPF: " + CPF;
    }

    
    
}
