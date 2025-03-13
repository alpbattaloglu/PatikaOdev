public class Main {
    public static void main(String[] args) {
        // Scanner sınıfını kullanarak kullanıcıdan veri alıyoruz
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // Kullanıcıdan bir sayı alıyoruz
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        
    
        int[] bolunebilenSayilar = new int[sayi / 12 + 1]; // 12'nin katları olacağı için
        int index = 0;
        
     
        for (int i = 0; i <= sayi; i++) {
   
            if (i % 3 == 0 && i % 4 == 0) {
                bolunebilenSayilar[index] = i;
                index++;
                System.out.println(i + " sayısı 3 ve 4'e tam bölünür.");
            }
        }
        
        // Ortalama hesaplama
        if (index > 0) {
            double toplam = 0;
            for (int i = 0; i < index; i++) {
                toplam += bolunebilenSayilar[i];
            }
            double ortalama = toplam / index;
            
           
            System.out.println("Bu sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }
        
        scanner.close();
    }
}