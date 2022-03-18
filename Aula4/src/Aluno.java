//import java.util.UUID;
//UUID - Gera numero gigante para identificar, sempre diferente;
//metodo statico pertence a classe, os outros ao objeto;
//Shift + Alt + seta == copia linha;
import java.lang.Override;
public class Aluno {     

    Integer ra = null;
    String nome = null;
      
    public Aluno (Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public String toString(){
        return "{nome: "+nome +"}";
    }
    
    @Override
    public int hashCode(){
        return ra.hashCode();
    }
    
};
