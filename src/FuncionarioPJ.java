public class FuncionarioPJ extends Funcionario {

    double taxaContrato;

    public FuncionarioPJ(String nome, double salario, double taxaContrato) {
        super(nome,salario);
        this.taxaContrato = taxaContrato;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Taxa de Contrato: " + this.taxaContrato);

    }
}