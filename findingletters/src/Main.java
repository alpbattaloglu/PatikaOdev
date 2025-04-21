
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        System.out.printf("Hello and welcome!");

        ArrayList<String> harfler = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            harfler.add(String.valueOf((char)(random.nextInt(26) + 'A')));
        }
        
        for (int i = 1; i <= 4; i++) {
            System.out.println("Liste: " + harfler);
            System.out.print("Harf girin: ");
            String girilenHarf = scanner.nextLine().toUpperCase();
            
            if (harfler.contains(girilenHarf)) {
                harfler.remove(girilenHarf);
                System.out.println("FOUND!");
            } else {
                harfler.add(girilenHarf);
            }
        }
        
        System.out.println("Son liste: " + harfler);
        scanner.close();
    }
}