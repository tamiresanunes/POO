package ExercicioFintech;

public class ContaPoupanca extends ContaDeposito implements Rentavel{

    public ContaPoupanca(int id, double saldo, String cartao, Emprestimo[] emprestimos) {
        super(id, saldo, cartao, emprestimos);
        
    }

    @Override
    public double render() {
       return 0.0;
    }

    @Override
    public boolean depositar(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositar'");
    }
    
}
