import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();

        int toplam = 0;

        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                toplam += i;
            }
        }

        if(n == toplam) {
            System.out.println(n + " mükemmel sayıdır");
        } else {
            System.out.println(n + " mükemmel sayı değildir");
        }

        input.close();
    }
}