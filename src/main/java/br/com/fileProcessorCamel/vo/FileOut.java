package br.com.fileProcessor.vo;

/**
 *
 * @author jefferson
 */
public class FileOut {

    private Integer qtdclient;

    private Integer qtdVendedor;

    private Integer idVendaCara;

    private String piorVendedor;

    @Override
    public String toString() {
        return "Quantidade de clientes no arquivo de entrada:".concat(qtdclient.toString()).concat("\n")
                .concat("Quantidade de vendedor no arquivo de entrada:").concat(qtdVendedor.toString()).concat("\n")
                .concat("ID da venda mais cara:").concat(idVendaCara.toString()).concat("\n")
                .concat("O pior vendedor:").concat(piorVendedor).concat("\n");
    }

    public Integer getQtdclient() {
        return qtdclient;
    }

    public void setQtdclient(Integer qtdclient) {
        this.qtdclient = qtdclient;
    }

    public Integer getQtdVendedor() {
        return qtdVendedor;
    }

    public void setQtdVendedor(Integer qtdVendedor) {
        this.qtdVendedor = qtdVendedor;
    }

    public Integer getIdVendaCara() {
        return idVendaCara;
    }

    public void setIdVendaCara(Integer idVendaCara) {
        this.idVendaCara = idVendaCara;
    }

    public String getPiorVendedor() {
        return piorVendedor;
    }

    public void setPiorVendedor(String piorVendedor) {
        this.piorVendedor = piorVendedor;
    }

}
