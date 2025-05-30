public class Funcionario extends Pessoa implements IPessoa {
    private String nome;
    private int idade;
    private int cod;
    private double salario;
    private String CPF;
    private int guiche;

    public Funcionario(String nome, int idade, int cod, double salario, String CPF, int guiche) {
        this.nome = nome;
        this.idade = idade;
        this.cod = cod;
        this.salario = salario;
        this.CPF = CPF;
        this.guiche = guiche;
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Código: " + cod);
        System.out.println("Salário: " + salario);
        System.out.println("CPF: " + CPF);
        System.out.println("Guichê: " + guiche);
    }

    @Override
    public String getNome() {
        return nome;  // Implementando o método getNome()
    }

    // Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    // ... Outros getters e setters
}
