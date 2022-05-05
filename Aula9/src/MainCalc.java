import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class MainCalc {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while(true){
            try{
                System.out.println();
                System.out.print("N1:");
                double a = ler.nextDouble();
                System.out.print("N2:");
                double b = ler.nextDouble();

                String op = null;
                while (op == null){
                    try{
                        op = input("Operação { +  -  /  *  ^ ! }: ", "-" , "/", "+", "*" , "!");
                    }catch (ESPMException r){
                        System.err.println("Entrada inválida: " +r.getMessage());
                        throw new RuntimeException(r.getMessage(), r);
                        // throw r --> continua propagando a exceção 
                    } 
                }   

                if(op.equals("!")){
                    break;
                }
                double x =  op.equals("-") ? sub(a, b):
                            op.equals("+") ? add(a, b):
                            op.equals("*") ? mul(a, b):
                            op.equals("/") ? div ((int)a,(int) b):
                            op.equals("^") ? expo(a, b):
                            0;
            }catch (ArithmeticException e ){
                e.printStackTrace();
                System.err.println("Erro na operação: " +e.getMessage());
            }catch(InputMismatchException p){
                p.printStackTrace();
                System.err.println("Erro na operação: " +p.getMessage() );
                ler.nextLine();
            }catch(Exception j){
                j.printStackTrace();
                System.err.println("Erro: " +j.getMessage() );
            } finally{
                System.out.println("Operação ok ou excessão tratada! ");
            }
        }
    }

    private static String input(String msg, String... possi) throws ESPMException{
        final Scanner scan = new Scanner(System.in); 
        System.out.println(msg);
        String line = scan.nextLine().trim();
            for (String item : Arrays.asList(possi)){
                if(item.equals(line)){
                    return item ;
                }
            }   
        //nossa propria exceção 
        throw new ESPMException(line);
    }

    private static double sub (Double a, Double b){
        return a-b;
    }
    private static double add(Double a, Double b){
        return a+b;
    }
    private static double mul(Double a, Double b){
        return a*b;
    }
    private static double div (int a, int b){
            return a/b;        
    }
    private static double expo (Double a, Double b){
        return Math.pow(a, b);
    }
    
}
