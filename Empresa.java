package Atividades;

public class Empresa {
    private String razaoSocial;
    private String cnpj;
    private String fone;

    public Empresa(){

    }

    public Empresa(String cnpj, String fone, String razaoSocial) {
        this.cnpj = cnpj;
        this.fone = fone;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
