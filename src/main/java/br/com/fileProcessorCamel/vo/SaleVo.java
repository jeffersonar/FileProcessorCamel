package br.com.fileProcessor.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jefferson
 */
public class SaleVo {

    private String code;

    private String vendaId;

    private String nomeVendedor;

    private List<SaleItemVo> listaVendaItem = new ArrayList<SaleItemVo>();

    private BigDecimal valorVenda = BigDecimal.ZERO;

    public SaleVo(String[] linha) {
        this.code = linha[0];
        this.vendaId = linha[1];
        this.listaVendaItem.addAll(vendaItem(Arrays.asList(linha[2].split(","))));
        this.nomeVendedor = linha[3];
    }

    private List<SaleItemVo> vendaItem(List<String> saleItemLine) {
        List<SaleItemVo> salesItemReturn = new ArrayList<SaleItemVo>();
        for (String saleItemVo : saleItemLine) {
            String[] sale = saleItemVo.split("-");
            salesItemReturn.add(new SaleItemVo(sale));
            valorVenda = valorVenda.add(new BigDecimal(sale[2].replace("[", "").replace("]", ""))
                    .multiply(new BigDecimal(sale[1])));
        }
        return salesItemReturn;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVendaId() {
        return vendaId;
    }

    public void setVendaId(String vendaId) {
        this.vendaId = vendaId;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public List<SaleItemVo> getListaVendaItem() {
        return listaVendaItem;
    }

    public void setListaVendaItem(List<SaleItemVo> listaVendaItem) {
        this.listaVendaItem = listaVendaItem;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

}
