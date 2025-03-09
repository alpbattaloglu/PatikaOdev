import java.util.Scanner;

public class ProjectDeneme {
    public static void main(String[] args) {
        Scanner veriOkuyucu = new Scanner(System.in);

        System.out.print("Birinci sayıyı (a) giriniz: ");
        int a = veriOkuyucu.nextInt();

        System.out.print("İkinci sayıyı (b) giriniz: ");
        int b = veriOkuyucu.nextInt();
        System.out.print("Üçüncü sayıyı (c) giriniz: ");
        int c = veriOkuyucu.nextInt();

        int sonuc = a + b * c - b;

        System.out.println("İşlemin sonucu: " + sonuc);
    }
}
