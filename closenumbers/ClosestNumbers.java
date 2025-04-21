import java.util.ArrayList;
import java.util.Collections;

public class ClosestNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(3);
        sayilar.add(8);
        sayilar.add(15);
        sayilar.add(7);
        sayilar.add(20);
        sayilar.add(1);
        sayilar.add(9);
        sayilar.add(11);

        Collections.sort(sayilar);

        int minFark = Integer.MAX_VALUE;
        int sayi1 = 0;
        int sayi2 = 0;

        for (int i = 0; i < sayilar.size() - 1; i++) {
            int fark = sayilar.get(i + 1) - sayilar.get(i);
            if (fark < minFark) {
                minFark = fark;
                sayi1 = sayilar.get(i);
                sayi2 = sayilar.get(i + 1);
            }
        }

        System.out.println("Listedeki sayılar: " + sayilar);
        System.out.println("Birbirine en yakın iki sayı: " + sayi1 + " ve " + sayi2);
        System.out.println("Aralarındaki fark: " + minFark);
    }
} 