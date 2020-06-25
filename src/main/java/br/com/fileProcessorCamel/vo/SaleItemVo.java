package br.com.fileProcessor.vo;

/**
 *
 * @author jefferson
 */
public class SaleItemVo {
    
    private String itemId;
    
    private String itemQuantidade;
    
    private String preco;

    public SaleItemVo(String[] vendaItemVo) {
        this.itemId=vendaItemVo[0];
        this.itemQuantidade = vendaItemVo[1];
        this.preco = vendaItemVo[2].replace("[", "").replace("]", "");
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemQuantidade() {
        return itemQuantidade;
    }

    public void setItemQuantidade(String itemQuantidade) {
        this.itemQuantidade = itemQuantidade;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
    
}
