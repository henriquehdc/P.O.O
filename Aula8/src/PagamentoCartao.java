public class PagamentoCartao extends Pagamento {

    final private double comissao;

    public PagamentoCartao(double valor,double comissao) {
        super(valor);
        this.comissao = comissao;
    }

    @Override
    protected double calculaTotal() {
    
        return super.getValor() + comissao;
    }
    
    

    
}
