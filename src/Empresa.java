import java.util.ArrayList;

public class Empresa {
    private String nome;
    private ArrayList <Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public Funcionario[] listarFuncionarios() {
        return funcionarios.toArray(Funcionario[]::new);
    }

    public void exibirFuncionarios(){
        System.out.println("Empresa: " +this.nome);
        for (Funcionario func :  funcionarios ){
            System.out.println("---------------");
            func.exibirDados();
        }
    }
}
