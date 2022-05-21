package lista3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Application {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fulano", "111.111.111-11",
                "MG-11.111.111", 22, "Terceiro B");
        Aluno aluno2 = new Aluno("Cicrano", "222.222.222-22",
                "MG-11.111.111", 31, "Terceiro A");
        Professor professor1 = new Professor("Joao", "333.333.333-33",
                "MG-33.333.333", 2200.00,
                new ArrayList<>(Arrays.asList("Eletronica", "Programação")),
                new ArrayList<>(Arrays.asList("Terceiro A", "Terceiro B")));
        Professor professor2 = new Professor("Jose", "444.444.444-44",
                "MG-44.444.444", 1200.00,
                new ArrayList<>(Arrays.asList("Matematica", "Portugues")),
                new ArrayList<>(Collections.singletonList("Terceiro A")));
        Funcionario funcionario1 = new Funcionario("Maria", "555.555.555-55",
                "MG-55.555.555", "Secretaria", 3000.00);
        Funcionario funcionario2 = new Funcionario("Ana", "666.666.666-66",
                "MG-66.666.666", "Diretor(a)", 5000.00);

        Instituicao escola = new Instituicao("Lets Code");
        aluno1.inserirNota(10, 9, 7, 5);
        aluno1.inserirNota(5);
        escola.adicionar(aluno1);
        escola.adicionar(funcionario1);
        escola.adicionar(funcionario2);
        escola.adicionar(professor1);
        escola.adicionar(professor2);

        escola.listarFuncionarios();
        escola.listarProfessores();
        escola.listarAlunos();

        escola.modificar("111.111.111-11", aluno2);
        escola.listarAlunos();

        escola.deletar("555.555.555-55");
        escola.listarFuncionarios();
    }
}
