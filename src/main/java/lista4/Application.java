package lista4;
public class Application {
    public static void main(String[] args) {
        Inimigo dracula = new Vampiro();
        Inimigo freeza = new Generico();
        Inimigo serpente = new Cobra();
        Inimigo golias = new Gigante();

        System.out.println("Vampiro");
        dracula.atacar();
        dracula.apanhar(Ataque.PERFURANTE);
        dracula.interagir();

        System.out.println("Generico");
        freeza.atacar();
        freeza.apanhar(Ataque.PANCADA);
        freeza.interagir();

        System.out.println("Cobra");
        serpente.atacar();
        serpente.apanhar(Ataque.FOGO);
        serpente.interagir();

        System.out.println("Gigante");
        golias.atacar();
        golias.apanhar(Ataque.FOGO);
        golias.interagir();
    }
}
