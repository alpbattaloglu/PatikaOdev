public class Film {
    private String filmAdi;
    private int yayinYili;
    private String filmTuru;
    private double imdbPuani;

    public Film(String filmAdi, int yayinYili, String filmTuru, double imdbPuani) {
        this.filmAdi = filmAdi;
        this.yayinYili = yayinYili;
        this.filmTuru = filmTuru;
        this.imdbPuani = imdbPuani;
    }

    public String getFilmAdi() {
        return filmAdi;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public String getFilmTuru() {
        return filmTuru;
    }

    public double getImdbPuani() {
        return imdbPuani;
    }

    @Override
    public String toString() {
        return "Film: " + filmAdi + 
               ", Yıl: " + yayinYili + 
               ", Tür: " + filmTuru + 
               ", IMDB: " + imdbPuani;
    }
} 