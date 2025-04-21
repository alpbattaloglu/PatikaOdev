
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        System.out.printf("Hello and welcome!");

        List<Film> filmler = new ArrayList<>();
        filmler.add(new Film("Başlangıç", 2010, "Bilim Kurgu", 8.8));
        filmler.add(new Film("Baba", 1972, "Dram", 9.2));
        filmler.add(new Film("Yıldızlararası", 2014, "Bilim Kurgu", 8.6));
        filmler.add(new Film("Ucuz Roman", 1994, "Suç", 8.9));
        filmler.add(new Film("Kara Şövalye", 2008, "Aksiyon", 9.0));

        
        System.out.println("IMDB Sıralaması:");
        filmler.stream()
                .sorted(Comparator.comparingDouble(Film::getImdbPuani).reversed())
                .forEach(System.out::println);

      
        System.out.println("\nYıl Sıralaması:");
        filmler.stream()
                .sorted(Comparator.comparingInt(Film::getYayinYili))
                .forEach(System.out::println);

       
        filmTuruneGoreFiltrele(filmler, "Bilim Kurgu");

        for (int i = 1; i <= 5; i++) {
           
            System.out.println("i = " + i);
        }
    }

    public static void filmTuruneGoreFiltrele(List<Film> filmler, String filmTuru) {
        System.out.println("\n" + filmTuru + " Filmleri:");
        filmler.stream()
                .filter(film -> film.getFilmTuru().equals(filmTuru))
                .forEach(System.out::println);
    }
}