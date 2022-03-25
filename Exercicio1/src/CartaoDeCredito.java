public class CartaoDeCredito {
    int numero; 
    double totalfatura;

    public double consultarFatura(){

      return this.totalfatura;
    }
    public String retornarDados(){

        return "{Número: " + this.numero + "| Valor fatura: " + this.totalfatura + "}";
    }
}
