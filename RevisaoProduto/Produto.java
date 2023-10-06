package RevisaoProduto;

public class Produto {
    String nome;
    int quant;
    double preco;
    
    public Produto(String nome, int quant, double preco) {
        this.nome = nome;
        this.quant = quant;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    

    @Override
    public String toString() {
        return "Produto: nome: " + nome + ", quant: " + quant + ", preco: " + preco;
    }

    

}
