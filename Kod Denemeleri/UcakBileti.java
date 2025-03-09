import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner veriOkuyucu = new Scanner(System.in);

        System.out.print("Yolculuk Kaç Kilometre: ");
        int mesafe = veriOkuyucu.nextInt();

        System.out.print("Yolcunun yaşı kaç?: ");
        int yas = veriOkuyucu.nextInt();

        System.out.print("Yolculuk tipi? (1:Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = veriOkuyucu.nextInt();

        if (yolculukTipi == 1 || yolculukTipi == 2) {
            // Değişkenleri tanımlayalım
            double normalTutar = mesafe * 0.10;
            double yasIndirimi;
            double indirimliTutar;
            double gidisDonusIndirimi;
            double toplamTutar;

            // Yaş indirimi hesaplama
            if (yas < 12) {
                yasIndirimi = normalTutar * 0.50;
            } else if (yas <= 24) {
                yasIndirimi = normalTutar * 0.10;
            } else if (yas >= 65) {
                yasIndirimi = normalTutar * 0.30;
            } else {
                yasIndirimi = 0;
            }

            indirimliTutar = normalTutar - yasIndirimi;

            // Gidiş-dönüş indirimi hesaplama
            if (yolculukTipi == 2) {
                gidisDonusIndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
            } else {
                toplamTutar = indirimliTutar;
            }

            System.out.printf("Toplam Tutar = %.2f TL", toplamTutar);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
} 