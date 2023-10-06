package ExercicioFintech;

public class ContaDePagamento extends Conta implements OperavelParaPagamento{

    public ContaDePagamento(int id, double saldo, String cartao) {
        super(id, saldo, cartao);
        
    }

    @Override
    public boolean pagar(Pagavel pagamentinho) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pagar'");
    }
    
}
