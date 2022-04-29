import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        PagamentoCartao pag1 = new PagamentoCartao(400, 20);
        PagamentoDolar pag2 = new PagamentoDolar(400, 5.8, 20);
    
        pagamentos.add(pag1);
        pagamentos.add(pag2);

        pagamentos.forEach(p->{
            System.out.println(p.efetivar());
        });
        


    }
}