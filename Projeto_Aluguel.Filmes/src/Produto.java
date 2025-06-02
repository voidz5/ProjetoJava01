public class Produto implements IProduto{
    private String descricao;
    private double preco;
    private String nome;
    private boolean emCartaz;
    private int cod;
    private String genero;
    private boolean disponibilidade;

    public Produto(String nome, String descricao, double preco, String genero, boolean disponibilidade, boolean emCartaz, int cod) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.genero = genero;
        this.disponibilidade = disponibilidade;
        this.emCartaz = emCartaz;
        this.cod = cod;
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: " + preco);
        System.out.println("Gênero: " + genero);
        System.out.println("Está disponível: " + disponibilidade);
        System.out.println("Está em Cartaz: " + emCartaz);
        System.out.println("Código: " + cod);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean isEmCartaz() {
        return emCartaz;
    }

    public void setEmCartaz(boolean emCartaz) {
        this.emCartaz = emCartaz;
    }


}
