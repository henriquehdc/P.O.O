public abstract class Pagamento {
    
    final private double valor;
    
    public Pagamento (double valor){
        this.valor = valor;
    }

    public double efetivar(){
         double valorTotal = this.calculaTotal();
         return valorTotal;
    }

    protected abstract double calculaTotal();

    public double getValor(){
        return valor;
    }

}
