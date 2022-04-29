import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAut {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        Cliente nereu = new Cliente("Nereu");

        Funcionário func1 = new Diretor(12);
        Diretor dir = new Diretor(12);

        Usuario usu1 = new Cliente("Rodrigo");

        List<Usuario> l = new ArrayList<>();
        l.add(nereu);
        l.add(dir);
        l.add((Usuario)func1);
        l.add(usu1);

        for (Usuario u : l){
            System.out.println(u.getUsername() + ": ");
            String pass = ler.nextLine().trim().toLowerCase();
            System.out.println(u.autenticar(pass));

        }
    }
}
