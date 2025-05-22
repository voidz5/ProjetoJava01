public class Funcionario extends Pessoa implements IPessoa{
    private String nome;
    private int idade;
    private int cod;
    private double salario;
    private String CPF;
    private int guiche;

    public Funcionario(String nome, int idade, int cod, double salario, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.cod = cod;
        this.salario = salario;
        this.CPF = CPF;
    }

    @Override
    public void exibir() {
        System.out.println("Nome:" + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Código: " + cod);
        System.out.println("Salário: " + salario);
        System.out.println("CPF: " + CPF);
        System.out.println("Guichê: " + guiche);
    }
}
