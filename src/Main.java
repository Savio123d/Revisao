import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Tech Soluções");
        Funcionario funcionario1 = new FuncionarioPJ("MISTER M",2900,23);
        Funcionario funcionario2 = new FuncionarioCLT("Henrique",3299.99,20);
        Funcionario funcionario3 = new FuncionarioCLT("Gabriel",3200,233);
        Funcionario funcionario4 = new FuncionarioPJ("Maria",3000,42);
        Funcionario funcionario5 = new FuncionarioCLT("Luisa",3299,23);

        empresa.addFuncionario(funcionario1);
        empresa.addFuncionario(funcionario2);
        empresa.addFuncionario(funcionario3);
        empresa.addFuncionario(funcionario4);
        empresa.addFuncionario(funcionario5);
        empresa.exibirFuncionarios();

    }
}