# Sistema de Gestão de Funcionários em Java

## 📝 Descrição
Este projeto é uma simples aplicação de console em Java que demonstra conceitos fundamentais de Programação Orientada a Objetos (POO), como Herança e Polimorfismo. O sistema simula o cadastro de funcionários de uma empresa, diferenciando dois tipos de contratação: CLT e Pessoa Jurídica (PJ).

## ⚙️ Principais Funcionalidades
- **Cadastro de Funcionários**: Permite a criação de objetos que representam funcionários.
- **Diferenciação por Contrato**: Utiliza herança para criar especializações de funcionários:
    - `FuncionarioCLT`: Representa um funcionário contratado sob o regime da Consolidação das Leis do Trabalho, possuindo um campo para benefícios.
    - `FuncionarioPJ`: Representa um prestador de serviço como Pessoa Jurídica, com um campo para a taxa de contrato.
- **Polimorfismo**: O método `exibirDados()` é sobrescrito nas subclasses para mostrar as informações específicas de cada tipo de funcionário, demonstrando o polimorfismo.
- **Listagem de Dados**: A classe `Empresa` gerencia uma lista de funcionários e exibe os dados de todos eles de forma centralizada.

## 💻 Tecnologias e Linguagens Utilizadas
- **Java**: Linguagem principal do projeto.

## 📁 Estrutura de Pastas e Arquivos
O núcleo do projeto está na pasta `src/` e é composto pelos seguintes arquivos:

```
src/
│
├── Main.java               # Classe principal que executa o programa
├── Empresa.java            # Gerencia a lista de funcionários
├── Funcionario.java        # Classe base para todos os funcionários
├── FuncionarioCLT.java     # Subclasse para funcionários CLT
└── FuncionarioPJ.java      # Subclasse para funcionários PJ
```

## ▶️ Passo a Passo de Execução
Para compilar e executar o projeto via linha de comando, siga os passos abaixo:

1.  **Navegue até a pasta `src`**:
    ```bash
    cd src
    ```

2.  **Compile os arquivos `.java`**:
    ```bash
    javac *.java
    ```

3.  **Execute a classe `Main`**:
    ```bash
    java Main
    ```

## 💡 Exemplo de Saída Esperada
Ao executar o projeto, a seguinte saída será exibida no console, mostrando os dados da empresa e a lista de todos os funcionários cadastrados:

```
Empresa: Tech Soluções
---------------
Funcionario: MISTER M
Salario: 2900.0
Taxa de Contrato: 23.0
---------------
Funcionario: Henrique
Salario: 3299.99
Seu benefio: 20.0
---------------
Funcionario: Gabriel
Salario: 3200.0
Seu benefio: 233.0
---------------
Funcionario: Maria
Salario: 3000.0
Taxa de Contrato: 42.0
---------------
Funcionario: Luisa
Salario: 3299.0
Seu benefio: 23.0
```
