package CarroEstacionamento;

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
    //método que adiciona um carro dentro do vetor
    //carro é passado como parametro para ser colocado dentro do vetor, temos um for para percorrer o vetor, verificando se o elemento atual(i) é null, se sim, então tem espaço dentro do vetor para adicionar um novo carro e o parametro é adicionado. pós adicionar com sucesso ele retorna true, se o for se encerrar sem encontrar espaços vazios no vetor ele retorna false para indicar que não conseguiu adicionar o parametro carro dentro do vetor.
    public boolean adicionarCarro(Carro carro) {
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] == null) {
                carros[i] = carro;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Estacionamento [endereco=" + endereco + ", cep=" + cep + ", carros=" + Arrays.toString(carros) + "]";
    }
}
