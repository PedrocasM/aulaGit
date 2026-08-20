package java_git;

public class Produto {

    private String cdProduto;
    private String nmProduto;
    private Double vlProduto;
    private String dsDetalhes;
    private Character flAtivo;
    private Integer qtProduto;

    public Produto(String cdProduto, String nmProduto,
                   Double vlProduto, String dsDetalhes, Character flAtivo){
        this.cdProduto = cdProduto;
        this.nmProduto = nmProduto;
        this.dsDetalhes = dsDetalhes;
        this.vlProduto = vlProduto;
        this.flAtivo = flAtivo;
    };
    public void adicionarEstoque(int quantidade) {
        this.qtProduto += quantidade;
    }
    public void removerEstoque(int quantidade) {
        if (quantidade > this.qtProduto) {
            System.out.println("Estoque insuficiente!");
            return;
        }
        this.qtProduto -= quantidade;
    }

    public String getCdProduto() {
        return cdProduto;
    }

    public void setCdProduto(String cdProduto) {
        this.cdProduto = cdProduto;
    }

    public String getNmProduto() {
        return nmProduto;
    }

    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    public Double getVlProduto() {
        return vlProduto;
    }

    public void setVlProduto(Double vlProduto) {
        this.vlProduto = vlProduto;
    }

    public String getDsDetalhes() {
        return dsDetalhes;
    }

    public void setDsDetalhes(String dsDetalhes) {
        this.dsDetalhes = dsDetalhes;
    }

    public Character getFlAtivo() {
        return flAtivo;
    }

    public void setFlAtivo(Character flAtivo) {
        this.flAtivo = flAtivo;
    }
}
