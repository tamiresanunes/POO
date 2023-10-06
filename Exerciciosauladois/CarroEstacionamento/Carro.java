package CarroEstacionamento;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    public Carro(String marca, String modelo, String cor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    //O método começa com uma verificação de referência para verificar se o objeto atual this é o mesmo que obj, se forem o mesmo objeto na memória ele terorna true;
    //Na linha seguinte a uma comparação para garantir que obj não seja nulo, se ele for nulo, ele não pode ser igual ao objeto atual e terá um retorno false;
    //Temos uma comparação para garantir que os objetos tenham a mesma classe, se elas forem diferentes os objetos não podem ser iguais e temos um retorno false;
    //Convertemos o bjt para o tipo carro;
    //Se o campo marca for nulo e o campo carro de other não for nulo, os objetos não são iguais, e temos o retorno false. Se o campo marca do objeto atual não for nulo ele compara os campos marca usando equals, se eles forem diferentes o método retorna false.
    //O mesmo se repete nas linhas seguintes.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Carro other = (Carro) obj;
        if (marca == null) {
            if (other.marca != null) {
                return false;
            }
        } else if (!marca.equals(other.marca)) {
            return false;
        }
        if (modelo == null) {
            if (other.modelo != null) {
                return false;
            }
        } else if (!modelo.equals(other.modelo)) {
            return false;
        }
        if (placa != other.placa) {
            return false;
        }

        return true;
    }
    //Primeiro declaramos uma variavel prime com o valor de 29, depois inicializamos a variavel result com o valor de 1, ela acumula o valor de hash a medida das operações;
    //Depois é calculado os valores de hash para os campos de marca, modelo e placa, o prime * result multiplica o valor de 29, isso distribui os valores de hash;
    //O resto calcula o valor hash do campo atual, se ele for nulo contribuirá com 0 para o valor hash, caso contrário, usará o valor retornado pelo método hashCode() do campo;
    //Os valores hash calculados para os campos são acumulados em result;
    //No fim o método retorna o valor final de result, que é o valor hash calculado para o objeto completo.
    @Override
    public int hashCode() {
        final int prime = 29;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((placa == null) ? 0 : placa.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", placa=" + placa + "]";
    }

    
    
}
