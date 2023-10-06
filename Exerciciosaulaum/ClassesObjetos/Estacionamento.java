package ClassesObjetos;

import java.util.Arrays;

public class Estacionamento {
    private String endereco;
    private int cep;
    private Carro carros[];
    //Construtor
    public Estacionamento(String endereco, int cep) {
        this.endereco = endereco;
        this.cep = cep;
        this.carros = new Carro[50];
    }
    //getters e setters
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public Carro[] getCarros() {
        return carros;
    }
    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }
    //métodos
    public void adicionarCarro(Carro carro) {
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] == null) {
                carros[i] = carro;
                break;
            }
        }
    }
    @Override
    public String toString() {
        return "Estacionamento [endereco=" + endereco + ", cep=" + cep + ", carros=" + Arrays.toString(carros) + "]";
    }
    

        
}
