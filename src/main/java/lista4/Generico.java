package lista4;

public class Generico extends Inimigo{
    @Override
    public void atacar() {
        System.out.println("Causou 10 de dano");
    }

    @Override
    public void apanhar(Ataque ataque) {
        System.out.println("Recebeu " + ataque.getDano() + " de dano");
    }

    @Override
    public void interagir() {
        System.out.println("Porque eu responderia meu inimigo???");
    }
}
