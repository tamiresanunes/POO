package ExercicioFintech;

public abstract class Conta {
    private int id;
    private double saldo;
    private String numeroCartao;

    public Conta(int id, double saldo, String cartao) {
        this.id = id;
        this.saldo = saldo;
        numeroCartao = cartao;
    }
    public boolean fazerTransferencia(Conta outra, double valor){
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
