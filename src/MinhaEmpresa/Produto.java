package MinhaEmpresa;

public class Produto {

    private String designacao;
    private float precoVendaPublico;
    private int stock;
    private int produtoID;

    public Produto(String designacao, float precoVendaPublico, int stock, int produtoID) {
        this.designacao = designacao;
        this.precoVendaPublico = precoVendaPublico;
        this.stock = stock;
        this.produtoID = produtoID;
    }

    public Produto() {
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public float getPrecoVendaPublico() {
        return precoVendaPublico;
    }

    public void setPrecoVendaPublico(float precoVendaPublico) {
        this.precoVendaPublico = precoVendaPublico;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void mostrar() {
        System.out.println("----- PRODUTO CADASTRADO -----");
        System.out.println("Produto: " + getDesignacao() + " - ID: " + getProdutoID());
        System.out.println("Quantidade em estoque: " + getStock() + " unidades");
        System.out.println("Preço de venda: R$ " + getPrecoVendaPublico());
    }

    public int getProdutoID() {
        return this.produtoID;
    }

    public void setProdutoID(int produtoID) {
        this.produtoID = produtoID;
    }

}
