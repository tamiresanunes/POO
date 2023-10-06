package ExercicioFintech;

public class Emprestimo implements Pagavel{
    private double valor;

    public Emprestimo(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean pagar(Conta conta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pagar'");
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
