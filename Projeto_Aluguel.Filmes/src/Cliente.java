public class Cliente extends Pessoa implements IPessoa {
    private String nome;
    private int idade;
    private String CPF;
    private String sexo;
    private String email;

    public Cliente(String nome, int idade, String CPF, String sexo, String email) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.sexo = sexo;
        this.email = email;
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + CPF);
        System.out.println("Sexo: " + sexo);
        System.out.println("E-mail: " + email);
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
