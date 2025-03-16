import java.util.Scanner;

public class Passwordtest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Şifre giriniz: ");
        String password = input.nextLine();

        if (password.lenght() < 8) {
            System.out.println("Şifre en az 8 karakter olmalıdır.");

       if password.contains(" ") {
            System.out.println("Şifre boşluk içeremez.");
        }
         if !password.isUpperCase([0]) {
            System.out.println("Şifre büyük ile başlamalıdır.");
        }
         if password.lastChar() != "?"
       System.out.println("Şifre soru işareti ile bitmelidir.");
            
        else System.out.println("Şifre geçerli");
        
        }
    }
}