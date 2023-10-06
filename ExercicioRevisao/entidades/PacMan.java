package ExercicioRevisao.entidades;

public class PacMan extends Personagem {
    boolean invencivel;
    int contadorPontinhos;
    int vidasRestantes;

    public PacMan(boolean invencivel, int contadorPontinhos, int vidasRestantes) {
        super(700, 300); // super tem que sempre vir em primeiro lugar.
        this.invencivel = invencivel;
        this.contadorPontinhos = contadorPontinhos;
        this.vidasRestantes = vidasRestantes;
    }

    public boolean isInvencivel() {// get não precisa colocar this, é opcional.
        return invencivel;
    }

    public int getContadorPontinhos() {
        return contadorPontinhos;
    }

    public int getVidasRestantes() {
        return vidasRestantes;
    }

    /**
     * @param object
     */
    public void colidir(Object object) {
        // if(object.getClass() == Fantasma.class && ! isInvencivel()){// a classe do object é igual a fantasma
        if (object instanceof Fantasma && invencivel) {// instanceof está perguntando se object é do tipo fantasma.
            morrer();
            // this.morrer();
            // super.morrer();
        }
        if (object instanceof Fantasma && invencivel) {
            Fantasma gasparzinho = (Fantasma) object; // está pegando o object e mudando o tipo dele, de object para fantasma.
            gasparzinho.morrer();
        }

        // Falta o resto dos teste de pastilha e pontinho
        public final int hashCode(){
            int hash = 13;
            hash = hash + contadorPontinhos * 17;
            hash = hash + vidaRestante * 19;
            hash = hash + posicaoX * 23;
            hash = hash + posicaoY * 29;
            // mais alguma parte
        }

        public boolean equals(Object outro){
            if (outro == null){
                return false;
            }

            if(this == outro){
                return true;
            }

            if(!(outro instanceof PacMan)){
                return false;
            }

            PacMan outroPacMan = (PacMan) outro;
            if(this.posicaoX == outroPacMan.posicaoX && // varios testes
        }

    }
}
