
public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Satır sayısını girin: ");
        int satir = scanner.nextInt();
        System.out.print("Sütun sayısını girin: ");
        int sutun = scanner.nextInt();
        
        int[][] matris = new int[satir][sutun];
        int[][] transpoz = new int[sutun][satir];
        
      
        System.out.println("Matris elemanlarını girin:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matris[" + i + "][" + j + "] : ");
                matris[i][j] = scanner.nextInt();
            }
        }
        
 
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }
        
        System.out.println("Orijinal Matris:");
        printMatrix(matris);
        
    
        System.out.println("Transpoz Matris:");
        printMatrix(transpoz);
    }
    

    
    public static void printMatrix(int[][] matris) {
        for (int[] satir : matris) {
            for (int eleman : satir) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }
    }
}
