package ExercicioInterfaceMR;

public class Principal {
    public static void main(String [] args){
        Gato gato = new Gato("O Destruidor de Mundos", "frajola");
        Tigre tigre = new Tigre("Jujuba");

        System.out.println("O gato chamado " + gato.nome + ", cuja pelagem é " + gato.pelagem + ", mia assim " + gato.miador());
        System.out.println("O gato chamado " + gato.nome + ", cuja pelagem é " + gato.pelagem + ", ronrona assim " + gato.ronronar());
        System.out.println("O tigre chamado " + tigre.nome + ", ronrona assim " + tigre.ronronar());
    }
}
