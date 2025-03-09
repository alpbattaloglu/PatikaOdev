import java.util.Scanner;

public class KitleEndeksi {
    public static void main(String[] args) {
        Scanner veriOkuyucu = new Scanner(System.in);

        System.out.print("Kilonuzu (kg) giriniz: ");
        double kilodegeri = veriOkuyucu.nextDouble();

        System.out.print("Boyunuzu (cm cinsinden) giriniz: ");
        double boydegeri = veriOkuyucu.nextDouble() / 100;

        double kitleEndeksi = kilodegeri / (boydegeri * boydegeri);

        

        
        if (kitleEndeksi < 18.5) {
            System.out.println("Zayıf");
        } else if (kitleEndeksi < 25) {
            System.out.println("Normal");
        } else if (kitleEndeksi < 30) {
            System.out.println("Kilolu");
        } else {
            System.out.println("Obez");
        }
    }
}
