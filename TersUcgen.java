public class Main {
    public static void main(String[] args) {
       
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
       
        System.out.print("Basamak Sayısı : ");
        int basamak = scanner.nextInt();
        
        
        for (int i = basamak; i >= 1; i--) {
           
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}