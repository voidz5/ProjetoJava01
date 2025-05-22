public class Produto {
    private String descricao;
    private double preco;
    private String nome;
    private boolean emCartaz;
    private String genero;
    private boolean disponibilidade;

    public Produto(String descricao, double preco, String nome, boolean disponibilidade, boolean emCartaz, String genero) {
        this.descricao = descricao;
        this.preco = preco;
        this.nome = nome;
        this.disponibilidade = disponibilidade;
        this.emCartaz = emCartaz;
        this.genero = genero;
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
