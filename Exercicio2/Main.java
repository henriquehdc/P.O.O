import java.util.Scanner;


public class Main { 

    private static Banco banco = null;

    public static void main(String[] args) {
    
     Scanner ler = new Scanner(System.in);
     Boolean exit = false;
     banco = new Banco("ESPM Bank");   
     
        while (!exit){

            try{
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
                }else if("delete".equals(input)){
                    throw new UnsupportedOperationException();
                }
                             
                else{
                    System.err.println("Comando inválido");
                }
            }catch (UnsupportedOperationException e) {
                        e.printStackTrace();
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
            banco.getClientes().forEach(c -> {
                if (c instanceof PessoaFisica) {
                    PessoaFisica pf = (PessoaFisica) (c);
                    System.out.println(pf);   
                } else if (c instanceof PessoaJuridica) {
                    PessoaJuridica pj = (PessoaJuridica) (c);
                    System.out.println(pj);   
                }
            });
        }

        private static void addCustomer(Banco banco){
            Scanner ler = new Scanner(System.in);

            System.out.print("Nome: ");
            String nome = ler.nextLine();
    
            TipoPessoa tipoPessoa = inputTipoCliente(); 
    
            Cliente c = null;
            switch(tipoPessoa){
                case Fisica:
                    System.out.print("CPF: ");
                    String cpf = ler.nextLine();
    
                    PessoaFisica pf = new PessoaFisica();
                    pf.setCpf(cpf);
                    c = pf;
                    break;
                case Juridica:
                    System.out.print("CNPJ: ");
                    String cnpj = ler.nextLine();
    
                    PessoaJuridica pj = new PessoaJuridica();
                    pj.setcnpj(cnpj);
                    c = pj;
            }
            c.setNome(nome);  
            banco.addCliente(c);                  
        }

        private static TipoPessoa inputTipoCliente(){

            Scanner ler = new Scanner(System.in);
            String tp="";
    
            while(!tp.equals("f") && !tp.equals("j")){
                System.out.print("Tipo do Cliente? [F|J] ");
                tp = ler.nextLine().toLowerCase();
                if(tp != "j" && tp != "f"){
                    System.err.println("F: Física | J: Jurídica");
                }
            }
    
            return tp.equals("f") ? TipoPessoa.Fisica : TipoPessoa.Juridica;
        }

        private static void findCustomer(Banco banco){
            PessoaFisica teste = new PessoaFisica();

            Scanner ler = new Scanner(System.in);

            System.out.print("Qual cliente desaja procurar, pelo cpf: ");
            String acha = ler.nextLine();  
             teste.setCpf(acha);

            if (banco.getClientes().equals(teste.getCpf())){
                System.out.println("teste");
            }
        }
       
}
