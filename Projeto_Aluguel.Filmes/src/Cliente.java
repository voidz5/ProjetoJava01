public class Cliente extends Pessoa implements IPessoa{
    private String nome;
    private int idade;
    private String CPF;
    private char sexo;
    private int num;
    private String email;

    public Cliente(String nome, int idade, String CPF, char sexo, String email) {
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
        System.out.println("CPF: " +CPF);
        System.out.println("Sexo: " + sexo);
        System.out.println("E-mail: " + email);
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
