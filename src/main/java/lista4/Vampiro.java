package lista4;

public class Vampiro extends Inimigo{
    @Override
    public void atacar() {
        System.out.println("Causou 20 de dano");
        System.out.println("Seu personagem esta sangrando");
    }

    @Override
    public void apanhar(Ataque ataque) {
        if(ataque.name().equals(Ataque.PERFURANTE.name())){
            System.out.println("Recebeu " + ataque.getDano()*2 + " de dano");
        } else{
            System.out.println("Recebeu " + ataque.getDano() + " de dano");
        }
    }

    @Override
    public void interagir() {
        System.out.println("O que é um homem?");
    }
}
