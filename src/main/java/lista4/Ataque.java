package lista4;

public enum Ataque {
    PERFURANTE("perfurante", 20),
    PANCADA("pancada", 25),
    FOGO("fogo", 10);
    private String ataque;
    private int dano;
    Ataque(String ataque, int dano){
        this.ataque = ataque;
        this.dano = dano;
    }
    public String getAtaque() {
        return this.ataque;
    }
    public int getDano(){ return this.dano; }
}
