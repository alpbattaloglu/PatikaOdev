import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Taban Degerini Giriniz: ");
        double taban = input.nextDouble();

        System.out.println("Us Degerini Giriniz: ");
        double us = input.nextDouble();
    
    System.out.println("Sonuc: " + Math.pow(taban, us));
    input.close();
 
}   
}
