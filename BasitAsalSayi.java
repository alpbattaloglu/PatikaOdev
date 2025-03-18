import java.util.Scanner;

public class BasitAsalSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scan.nextInt();
        
        if (asalMi(sayi, 2))
            System.out.println(sayi + " asaldır");
        else
            System.out.println(sayi + " asal değildir");
    }
    
    static boolean asalMi(int sayi, int bolen) {
        // 2'den küçük sayılar asal değildir
        if (sayi < 2) return false;
        
        // Sayının kendisine ulaştıysak asaldır
        if (bolen == sayi) return true;
        
        // Eğer tam bölünüyorsa asal değildir
        if (sayi % bolen == 0) return false;
        
        // Bir sonraki böleni kontrol et
        return asalMi(sayi, bolen + 1);
    }
}