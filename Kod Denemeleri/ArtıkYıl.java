import java.util.Scanner;

public class ArtıkYıl {
    public static void main(String[] args) {
        Scanner veriOkuyucu = new Scanner(System.in);

        System.out.println("Yılı Giriniz:");
        int yil = veriOkuyucu.nextInt();

        boolean artikYil = false;

if (yil % 400 == 0) {
    artikYil = true;
} else if (yil % 100 == 0) {
    artikYil = false;
} else if (yil % 4 == 0) {
    artikYil = true;
}

if (artikYil) {
    System.out.println(yil + " bir artık yıldır.");
} else {
    System.out.println(yil + " bir artık yıl değildir.");
}

            
        
    }
}
