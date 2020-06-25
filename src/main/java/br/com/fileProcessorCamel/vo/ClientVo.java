package br.com.fileProcessor.vo;

/**
 *
 * @author jefferson
 */
public class ClientVo {
    
    private String code;
    
    private String cnpj;
    
    private String name;
    
    private String businessArea;

    public ClientVo(String[] linha) {
        this.code  = linha[0];
        this.cnpj = linha[1];
        this.name = linha[2];
        this.businessArea  = linha[3];
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea;
    }
}
