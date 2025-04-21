
public class Main {
    
    public static <T> void printArray(T[] dizi) {
        for (T eleman : dizi) {
            System.out.print(eleman + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
       
        
        
        Integer[] sayiDizisi = {1, 2, 3, 4, 5};
        
       
        String[] metinDizisi = {"Java", "Generics", "Ödev"};

        System.out.println("Sayı dizisi:");
        printArray(sayiDizisi);

        System.out.println("Metin dizisi:");
        printArray(metinDizisi);
    }
}