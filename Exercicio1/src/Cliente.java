public class Cliente {
    
    String CPF, nome;
    
    public String RetornarDados(){
        return "{Nome:" + this.nome + "| CPF: " + this.CPF + "}";
    }
}
