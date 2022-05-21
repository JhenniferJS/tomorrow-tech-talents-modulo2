package lista3;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cpf, String rg, String cargo, double salario){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setRg(rg);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nCargo: " + cargo +
                "\nSalario: " + salario;
    }
}
