package lista4;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Cobra extends Inimigo{
    @Override
    public void atacar() {
        System.out.println("Casou 10 de dado");
    }

    @Override
    public void apanhar(Ataque ataque) {
        if(ataque.name().equals(Ataque.PANCADA.name())){
            System.out.println("Recebeu " + ataque.getDano()*2 + " de dano");
        } else{
            System.out.println("Recebeu " + ataque.getDano() + " de dano");
        }
    }

    @Override
    public void interagir() {
        System.out.println("Se você acender a chama a maldição acaba");
    }
}
