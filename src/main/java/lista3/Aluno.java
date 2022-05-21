package lista3;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private int idade;
    private String turma;
    private List<Double> notas;

    public Aluno(String nome, String cpf, String rg, int idade, String turma) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setRg(rg);
        this.idade = idade;
        this.turma = turma;
        notas = new ArrayList<>();
    }

    public void inserirNota(double... nota){
        for(int i=0; i<nota.length; i++) {
            notas.add(nota[i]);
        }
    }

    public double calculaMedia(){
        double soma = 0;
        if(notas.size() == 0){
            return 0;
        }
        for(double nota: notas){
            soma += nota;
        }
        return soma/notas.size();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public String toString(){
        return super.toString() +
                "\nIdade: " + idade +
                "\nTurma: " + turma +
                "\nNotas: " + notas.toString() +
                "\nMedia das notas: " + this.calculaMedia();
    }
}
