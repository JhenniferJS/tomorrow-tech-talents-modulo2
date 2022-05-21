package lista4;

public class Gigante extends Inimigo{
    @Override
    public void atacar() {
        System.out.println("Causou 25 de dano");
    }

    @Override
    public void apanhar(Ataque ataque) {
        if(ataque.name().equals(Ataque.FOGO.name())){
            System.out.println("Recebeu " + ataque.getDano()*2 + " de dano");
        } else{
            System.out.println("Recebeu " + ataque.getDano() + " de dano");
        }
    }

    @Override
    public void interagir() {
        System.out.println("Me desculpe");
    }
}
