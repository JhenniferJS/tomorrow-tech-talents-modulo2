package lista1;

import java.util.Random;

public class Jogador {

    private int id;
    private String nome;
    private String apelido;
    private String dataNascimento;
    private int numero;
    private String posicao;
    private double qualidade;
    private int cartoesAmarelo;
    private int cartaoVermelho;
    private boolean suspenso;
    private boolean treinamentoAntesDaPartida;
    private static int cont;
    Random random = new Random();

    public Jogador() {
        this.id = cont;
        cont++;
    }

    public Jogador(String nome, String apelido, String dataNascimento, int numero, String posicao, double qualidade, int cartoesAmarelo, int cartaoVermelho, boolean treinamentoAntesDaPartida) {
        this.id = cont;
        cont++;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelo = cartoesAmarelo;
        this.cartaoVermelho = cartaoVermelho;
        verificarCondicaoDeJogo();
        this.treinamentoAntesDaPartida = treinamentoAntesDaPartida;
    }

    public void verificarCondicaoDeJogo(){
        if(cartoesAmarelo >= 3 || cartaoVermelho >= 1 ){
            this.suspenso = true;
        } else{
            this.suspenso = false;
        }
    }

    public void aplicarCartaoAmarelo(int quantidade){
        cartoesAmarelo = quantidade;
        this.verificarCondicaoDeJogo();
    }

    public void aplicarCartaoVermelho(){
        cartaoVermelho = 1;
        this.verificarCondicaoDeJogo();
    }

    public void cumprirSuspensao(){
        cartoesAmarelo = 0;
        cartaoVermelho = 0;
        this.verificarCondicaoDeJogo();
    }

    public void sofrerLesao(){
        int gravidadeLesao = (random.nextInt(100));
        if (gravidadeLesao <= 5){
            this.qualidade = this.qualidade * 0.85;
        } else if(gravidadeLesao <= 10){
            this.qualidade = this.qualidade * 0.90;
        } else if (gravidadeLesao <= 15){
            this.qualidade = this.qualidade * 0.95;
        } else if (gravidadeLesao <= 30){
            this.qualidade -= 2;
        } else if (gravidadeLesao <= 40){
            this.qualidade -= 1;
        }

        if(this.qualidade < 0) this.qualidade = 0;
    }

    public void executarTreinamento(){
        if(!treinamentoAntesDaPartida){
            this.qualidade += random.nextInt(3);
            treinamentoAntesDaPartida = true;
        }
    }

    @Override
    public String toString() {
        return this.posicao + ": "
                + this.numero + " - "
                + this.nome + " ("
                + this.apelido + ") - "
                + this.dataNascimento + " CONDIÇÃO: "
                + (suspenso==false?"PODE JOGAR":"NAO PODE JOGAR");
    }
}
