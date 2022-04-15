
public abstract class Cliente {

  private String nome;
  private String sobrenome;
  private Conta conta;

    public void setNome(String nome) {
        String[] nomes = nome.split(" ");
        this.nome = nomes[0];
        this.sobrenome = nomes[nomes.length - 1];
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public Cliente( ){
       this.conta = new Conta(this);
    }

    public Conta getContas() {
        return conta;
    }

    ///// ALTERAR O RETORNO DA STRING;/////////////
    @Override
    public String toString(){
        return "{ Nome: " + nome +
                ", Conta "+ conta  +"}";
    }


   /* @Override
    public boolean equals(Object obj) {
        Cliente acha = (Cliente) obj; // Aqui eu defino o tipo do objeto, no caso classe Aluno
        if (acha.cpf == cpf){
            return true;
        }else {
            return false;
        }
    }*/

}
