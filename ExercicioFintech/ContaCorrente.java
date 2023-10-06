package ExercicioFintech;

public class ContaCorrente extends ContaDeposito{
    private Investimento [] investimentos;
    private double limite;
    private double taxaDeManutencao;

    public ContaCorrente(int id, double saldo, String cartao, Emprestimo[] emprestimos, Investimento[] investimentos, double limite, double taxaDeManutencao) {
        super(id, saldo, cartao, emprestimos);
        this.investimentos = investimentos;
        this.limite = limite;
        this.taxaDeManutencao = taxaDeManutencao;
        
    }

    public Investimento[] getInvestimentos() {
        return investimentos;
    }

    public void setInvestimentos(Investimento[] investimentos) {
        this.investimentos = investimentos;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTaxaDeManutencao() {
        return taxaDeManutencao;
    }

    public void setTaxaDeManutencao(double taxaDeManutencao) {
        this.taxaDeManutencao = taxaDeManutencao;
    }
    public void aplicarInvestimento(double valor){
        //
    }

    @Override
    public boolean depositar(double valor) {
        return true;
        
    }
    @Override
    public boolean pagar(Pagavel pagamentinho){
        return true;

    }
    
    
}
