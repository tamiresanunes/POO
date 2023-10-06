package ClassesObjetos;

public class Main {
    public static void main(String args[]){
        Estacionamento novEstacionamento = new Estacionamento("Rua Avestruz", 90001007);
        Carro carro = new Carro("Hyundai", "HB20", "PRETO", "BEE4F00");
        novEstacionamento.adicionarCarro(carro);
        System.out.println(novEstacionamento);

        Carro carro2 = new Carro("Chevrolet", "Onix", "Cinza", "FUN2M33");
        novEstacionamento.adicionarCarro(carro2);
        System.out.println(novEstacionamento);

       
        Carro carro3 = new Carro("Ford", "Ka", "Vermelho", "GEZ0W35");
        novEstacionamento.adicionarCarro(carro3);
        System.out.println(novEstacionamento);

   

    }
    
}
