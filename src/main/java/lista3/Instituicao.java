package lista3;

import java.util.ArrayList;
import java.util.List;

public class Instituicao {
    private String nome;
    private List<Aluno> alunos;
    private List<Funcionario> funcionarios;
    private List<Professor> professores;

    public Instituicao(String nome, List<Aluno> alunos, List<Funcionario> funcionarios, List<Professor> professores) {
        this.nome = nome;
        this.alunos = alunos;
        this.funcionarios = funcionarios;
        this.professores = professores;
    }

    public Instituicao(String nome) {
        this.nome = nome;
        funcionarios = new ArrayList<>();
        professores = new ArrayList<>();
        alunos = new ArrayList<>();
    }

    public void adicionar(Pessoa pessoa){
        if(pessoa instanceof Funcionario){
            funcionarios.add((Funcionario) pessoa);
        }
        if(pessoa instanceof Professor){
            professores.add((Professor) pessoa);
        }
        if(pessoa instanceof Aluno){
            alunos.add((Aluno) pessoa);
        }
    }
    public void modificar(String cpf, Pessoa pessoa){
        boolean existPessoa = false;
        if(pessoa instanceof Funcionario){
            for(Funcionario funcionario: funcionarios){
                if(funcionario.getCpf().equals(cpf)){
                    funcionarios.remove(funcionario);
                    funcionarios.add((Funcionario) pessoa);
                    existPessoa = true;
                    break;
                }
            }
            System.out.println(existPessoa? "Funcionario modificado" : "Funcionario nao encontrado" );
        }
        if(pessoa instanceof Professor){
            for(Professor professor: professores){
                if(professor.getCpf().equals(cpf)){
                    professores.remove(professor);
                    professores.add((Professor) pessoa);
                    existPessoa = true;
                    break;
                }
            }
            System.out.println(existPessoa? "Professor modificado" : "Professor nao encontrado" );
        }
        if(pessoa instanceof Aluno){
            for(Aluno aluno: alunos){
                if(aluno.getCpf().equals(cpf)){
                    alunos.remove(aluno);
                    alunos.add((Aluno) pessoa);
                    existPessoa = true;
                    break;
                }
            }
            System.out.println(existPessoa? "\nAluno modificado" : "\nAluno nao encontrado" );
        }
    }
    public void listarFuncionarios(){
        System.out.println("\nFuncionarios: ");
        funcionarios.forEach(System.out::println);
    }

    public void listarProfessores(){
        System.out.println("\nProfessores: ");
        professores.forEach(System.out::println);
    }

    public void listarAlunos(){
        System.out.println("\nAlunos");
        alunos.forEach(System.out::println);
    }

    public void deletar(String cpf){
        System.out.println(funcionarios.removeIf(funcionario -> funcionario.getCpf().equals(cpf))?
                "\nFuncionario deletado":"");
        System.out.println(professores.removeIf(professor -> professor.getCpf().equals(cpf))?
                "\nProfessor deletado":"");
        System.out.println(alunos.removeIf(aluno -> aluno.getCpf().equals(cpf))?"\nAluno deletado":"");
    }
}
