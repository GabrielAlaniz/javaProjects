package hackerrank;

public class HackerRank {
    
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int contador = 0;
        int[] diagPpal = new int[5];
        int[] diagSec = new int[5];
                
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = contador++;
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i==j) diagPpal[i] = matriz[i][j];
                if(i+j == matriz.length-1) diagSec[i] = matriz[i][j];
            }
        }    
        System.out.println("\nDiag ppal");
        for (int i = 0; i < diagSec.length; i++) {
            System.out.print(diagPpal[i]+"  ");
        }
        System.out.println("\nDiag sec");
        for (int i = 0; i < diagSec.length; i++) {
            System.out.print(diagSec[i]+"  ");
        }
    }
    
}
