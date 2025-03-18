import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ondalıklı bir sayı giriniz: (Nokta yerine virgül kullanınız) ");
        double sayi = scanner.nextDouble();
        
        // Aşağı yuvarlama
        int asagiYuvarlama = (int) Math.floor(sayi);
        
        
        int yukariYuvarlama = (int) Math.ceil(sayi);
        
        
        int enYakinTamSayi = (int) Math.round(sayi);
        
        System.out.println("\nAşağı Yuvarlama: " + asagiYuvarlama);
        System.out.println("Yukarı Yuvarlama: " + yukariYuvarlama);
        System.out.println("En Yakın Tam Sayı: " + enYakinTamSayi);
        
        scanner.close();
    }
}