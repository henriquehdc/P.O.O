public class MainError {

    public static void main(String[] args) {
        
        int n=10, m=15;
        double[][] matriz = new double[n][m];
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        } 
        System.out.println("Chegou ao final");
    }
    
}