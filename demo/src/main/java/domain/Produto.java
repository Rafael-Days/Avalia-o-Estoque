package domain;

public class Produto {

    private Long id;
    private String nomeProduto;
    private Float preco;
    private Integer qtdeEstoque;

    public Produto(Long id, String nomeProduto, Float preco, Integer qtdeEstoque) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.qtdeEstoque = qtdeEstoque;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Integer getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(Integer qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }
}
