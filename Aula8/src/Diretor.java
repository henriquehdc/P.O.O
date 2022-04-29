public class Diretor extends Funcionário implements Usuario {
    
    public Diretor (int id){
        super(id);
    }

    @Override
    public String getUsername() {
      
        return "Diretor: " +super.getId();
    }

    @Override
    public boolean autenticar(String password) {

       int  num = getId();
       String p ="";

       while (num>0){
        int s = num % 10;
        num = (num-s) / 10;
        p += s;
       }

        return p.equals(password);
    }
}
