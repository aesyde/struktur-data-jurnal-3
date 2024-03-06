public class Buku {
    String judul;
    String penulis;
    int tahun;

    public Buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }

    @Override
    public String toString() {
        return "Buku [judul=" + judul + ", penulis=" + penulis + ", tahun=" + tahun + "]";
    }   
    
}
