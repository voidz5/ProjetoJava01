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
        System.out.println("legal: " + guiche);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getGuiche() {
        return guiche;
    }

    public void setGuiche(int guiche) {
        this.guiche = guiche;
    }
}
