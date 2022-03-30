
public class Cliente {

  private String nome;
  private String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getcpf() {
        return cpf;
    }

    ///// ALTERAR O RETORNO DA STRING;/////////////
    @Override
    public String toString(){
        return "{ Nome: " + nome +
                ", CPF: "  + cpf +" }";
    }

    @Override
    public boolean equals(Object obj) {
        Cliente acha = (Cliente) obj; // Aqui eu defino o tipo do objeto, no caso classe Aluno
        if (acha.cpf == cpf){
            return true;
        }else {
            return false;
        }
    }

}
