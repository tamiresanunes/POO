package Exercicioherança;

import java.util.Objects;

public class Terceirizado extends Pessoa{
    public long CLT;

    public Terceirizado(String nome, String cPF, long CLT) {
        super(nome, cPF);
        this.CLT = CLT;
       
    }
    // Este método verifica se o objeto é o mesmo, se é nulo ou se pertence a uma
    // classe diferente. Usa a classe `Objects` para evitar o problema de NPE
    // (NullPointerException) caso algum atributo seja nulo.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {// verifica se o objeto é o mesmo
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {// verifica se pertence a uma classe diferente
            return false;
        } // Faz a comparação dos atributos
        Terceirizado terceirizado = (Terceirizado) obj;
        return CLT == terceirizado.CLT && Objects.equals(nome, terceirizado.nome) && Objects.equals(CPF, terceirizado.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CLT, nome, CPF);
    }

    @Override
    public String toString() {
        return super.toString() + ", CLT: " + CLT;
    }

    
}
