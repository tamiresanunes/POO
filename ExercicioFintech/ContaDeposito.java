package ExercicioFintech;

public abstract class ContaDeposito extends Conta implements OperavelParaDepositos, OperavelParaPagamento{
    private Emprestimo[] emprestimos;

    public ContaDeposito(int id, double saldo, String cartao, Emprestimo[] emprestimos) {
        super(id, saldo, cartao);
        this.emprestimos = emprestimos;
        
    }

    public Emprestimo[] getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(Emprestimo[] emprestimos) {
        this.emprestimos = emprestimos;
    }
    public void contratarEmprestimo(double valor){

    }

    @Override
    public boolean pagar(Pagavel pagamentinho) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pagar'");
    }
    

    
}
