public class PessoaJuridica extends Cliente{
    
    private String cnpj;

    public String getcnpj() {
        return cnpj;
    }

    public void setcnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "{nome:" + getNome() + ", cnpj:" + getcnpj() + "}";
    }
}
