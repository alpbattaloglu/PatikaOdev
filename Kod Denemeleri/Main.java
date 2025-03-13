import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir (int) değer giriniz:");
        int intDeneme = scanner.nextInt();

        System.out.println("Bir (double) değer giriniz - Örnek: 23.4");
        double doubleDeneme = scanner.nextDouble();

        // int -> double dönüşümü
        double degisenInt = intDeneme;
        System.out.println("Degisen int (double olarak): " + degisenInt);

        // double -> int dönüşümü (Ondalık kısmı kaybolur)
        int degisenDouble = (int) doubleDeneme;
        System.out.println("Degisen double (int olarak): " + degisenDouble);

        scanner.close(); // Scanner'ı kapatma (isteğe bağlı)
    }
}