package ExercicioFintech;

public class Boleto implements Pagavel {
    private double valor;
    private String codBarras;
    private boolean quitado;

    public Boleto(double valor, String codBarras) {
        this.valor = valor;
        this.codBarras = codBarras;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public boolean isQuitado() {
        return quitado;
    }

    @Override
    public boolean pagar(Conta conta) {
        return false;
    }

}
