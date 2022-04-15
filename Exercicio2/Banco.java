import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Cliente> clientes;
    private List<Conta> contas;
   
    public Banco (String nome){
        this.nome=nome;
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
        this.contas.add(cliente.getContas());
    }

    public void findCustomer(Cliente cliente){     
         this.clientes.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes(){
        return clientes;
    }
    
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }


    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }


}
