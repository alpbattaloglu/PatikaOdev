import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {



        Scanner veriokuyucu = new Scanner(System.in);


        

    //Ürünler

    double domates = 35;
    double patates = 19.99;
    double soğan = 27;
    double maydanoz = 15;
    double havuç = 35;
    double Armut = 60;
    double mantar = 80;


    System.out.println("Domates kaç kilo ? : ");
    double domatesKilo = veriokuyucu.nextDouble();

    System.out.println("Patates kaç kilo ? : ");
    double patatesKilo = veriokuyucu.nextDouble();

    System.out.println("Soğan kaç kilo ? : ");
    double soğanKilo = veriokuyucu.nextDouble();

    System.out.println("Maydanoz kaç Demet ? : ");
    double maydanozKilo = veriokuyucu.nextDouble();

    System.out.println("Havuç kaç kilo ? : ");
    double havuçKilo = veriokuyucu.nextDouble();

    System.out.println("Armut kaç kilo ? : ");
    double ArmutKilo = veriokuyucu.nextDouble();

    System.out.println("Mantar kaç kilo ? : ");
    double mantarKilo = veriokuyucu.nextDouble();

    double ToplamUcret = (domates * domatesKilo) + (patates * patatesKilo) + (soğan * soğanKilo) + 
    ( maydanoz * maydanozKilo) + (havuç * havuçKilo ) + (Armut * ArmutKilo ) +  (mantar * mantarKilo);

    System.out.println(ToplamUcret);




    }
}
