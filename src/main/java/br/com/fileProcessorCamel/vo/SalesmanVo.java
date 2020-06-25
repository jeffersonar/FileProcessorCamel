package br.com.fileProcessor.vo;

/**
 *
 * @author jefferson
 */
public class SalesmanVo {
    
    private String code;
    
    private String cpf;
    
    private String name;
    
    private String salario;

    public SalesmanVo() {
    }

    
    public SalesmanVo(String[] linha) {
        this.code = linha[0];
        this.cpf = linha[1];
        this.name = linha[2];
        this.salario = linha[3];
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
