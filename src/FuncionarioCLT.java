public class FuncionarioCLT extends Funcionario {

    double beneficio;

    public FuncionarioCLT(String nome, double salario, double beneficio) {
        super(nome,salario);
        this.beneficio = beneficio;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Seu benefio: "+ this.beneficio);
    }
}
