package lista3;

import java.util.List;

public class Professor extends Funcionario{
    private List<String> turmas;
    private List<String> disciplinas;

    public Professor(String nome, String cpf, String rg, double salario,
                     List<String> disciplinas, List<String> turmas) {
        super(nome, cpf, rg, "Professor", salario);
        this.disciplinas = disciplinas;
        this.turmas = turmas;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nDisciplinas: " + disciplinas.toString() +
                "\nTurmas: " + turmas.toString();
    }
}
