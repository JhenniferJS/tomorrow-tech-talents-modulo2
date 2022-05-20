package lista2;

public class Produto {
    private String nome;
    private String sessao;
    private String tipo;
    private int qtdEstoque;
    private String marca;
    private int id;
    private static int cont = 0;

    public Produto(String nome, String sessao, String tipo, int qtdEstoque, String marca) {
        this.nome = nome;
        this.sessao = sessao;
        this.tipo = tipo;
        this.qtdEstoque = qtdEstoque;
        this.marca = marca;
        this.id = cont;
        cont++;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Id do produto: " + id +
                "\nNome: " + nome +
                "\nSessao: " + sessao +
                "\nTipo: " + tipo +
                "\nQuantidade em estoque: " + qtdEstoque +
                "\nMarca: " + marca +
                "\n";
    }
}
