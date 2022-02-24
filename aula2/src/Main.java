public class Main {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Humberto";
        p1.idade = 15;
        p1.salario = 8000;

        Pessoa p2 = new Pessoa();
        p2.nome = "Sandrinha";
        p2.idade = 22;
        p2.salario = 10500;

        Pessoa p3 = p1;
        System.out.println(p3.nome);
        p3.nome = "Selmini";
        System.out.println(p1.nome);

        p1.imprimir();
        p2.imprimir();
        p3.imprimir();
    }

}
