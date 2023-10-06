package ExercicioFintech;

public class ContaSalario extends Conta{
    private String[] cnpjs;

    public ContaSalario(int id, double saldo, String cartao, String[] cnpjs) {
        super(id, saldo, cartao);
        this.cnpjs = cnpjs;
        
    }
    
}
