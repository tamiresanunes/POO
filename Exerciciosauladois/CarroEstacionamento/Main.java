package CarroEstacionamento;

public class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento("Rua Avestruz", 90001007);
        estacionamento.adicionarCarro(new Carro("Hyundai", "HB20", "preto", "BEE4F00"));
        estacionamento.adicionarCarro(new Carro("Chevrolet", "Onix", "cinza", "FUN2M33"));
        estacionamento.adicionarCarro(new Carro("Ford", "Ka", "vermelho", "GEZ0W35"));
        System.out.println(estacionamento);

        
        Carro C1 = new Carro("Hyundai", "HB20", "preto", "BEE4F00");
        Carro C2 = new Carro("Ford", "Ka", "vermelho", "GEZ0W35");

        int hashCodeC1 = C1.hashCode();
        int hashCodeC2 = C2.hashCode();

        System.out.println("HashCode do C1: " + hashCodeC1);
        System.out.println("HashCode do C2: " + hashCodeC2);

        
        if (C1.equals(C2)) {
            System.out.println("Os carros são iguais");
            
        }else{
            System.out.println("Os carros não são iguais");
        
    }

}
}

