public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
z
    public void setSalario(double salario) {
        this.salario = salario;
    }

   public void exibirDados(){
       System.out.println("Funcionario: " + this.getNome());
       System.out.println("Salario: " + this.getSalario());
   }

}
