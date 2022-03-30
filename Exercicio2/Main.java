import java.util.Scanner;

public class Main { 

    private static Banco banco = null;

    public static void main(String[] args) {

     Scanner ler = new Scanner(System.in);
     Boolean exit = false;
     banco = new Banco("ESPM Bank");   
     

        while (!exit){
            System.out.print("ESPM---> ");
            String input = ler.nextLine().trim().toLowerCase();

            if("".equals(input)){               
            }else if ("exit".equals(input)){
                exit = true;
            }else if ("help".equals(input)){
                help();
            }else if ("list".equals(input)){
                listCustomers(banco);
            }else if ("add".equals(input)){
                addCustomer(banco);
            }else if ("find".equals(input)){
                findCustomer(banco);
            }
            
            
            else{
                System.err.println("Comando inválido");
            }
        }
        System.out.println("BYE BYE!!!");   
        
        
    ler.close();   
    }

        private static void help(){
            System.out.println();
            System.out.println("ESPM Sistema de Clientes");
            System.out.println("------------------------");
            System.out.println("add-->Cadastro Cliente");
            System.out.println("list-->Lista Cliente");
            System.out.println("del-->Apaga Cliente");
            System.out.println("find-->Localiza Cliente");
            System.out.println();
            System.out.println("exit-->Sair do Sistema");
            System.out.println();
        
        }

        private static void listCustomers(Banco banco){
            // for (Cliente c : System.out.print(c))
            banco.getClientes().forEach(cliente -> System.out.println(cliente));        
        }

        private static void addCustomer(Banco banco){

            Scanner ler = new Scanner(System.in);
            System.out.print("Nome: ");
            String nome = ler.nextLine();
            System.out.print("CPF: ");
            String cpf = ler.nextLine();

            Cliente c =  new Cliente();
            c.setNome(nome);
            c.setCpf(cpf);

           banco.addCliente(c);
                       
        }

        private static void findCustomer(Banco banco){
            Cliente teste = new Cliente();

            Scanner ler = new Scanner(System.in);

            System.out.print("Qual cliente desaja procurar, pelo cpf: ");
             String acha = ler.nextLine();
             teste.setCpf(acha);

        }
        
}
