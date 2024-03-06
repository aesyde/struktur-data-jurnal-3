import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        SinglyLinkedList<Buku> listbuku = new SinglyLinkedList<>();
        Scanner x = new Scanner(System.in);
        int pilihan;
        String yesORno;

        do {
            System.out.println("MENU");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cetak Daftar Buku");
            System.out.println("4. keluar");

            System.out.println("Masukkan Pilihan : ");
            pilihan = x.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Judul Buku : ");
                    String judulBuku = x.next();
                    System.out.println("Masukkan Penulis Buku : ");
                    String penulisBuku = x.next();
                    System.out.println("Masukkan Tahun Buku : ");
                    int tahunBuku = x.nextInt();

                    System.out.println("Tambahkan data di awal list? (y/n)");
                    yesORno = x.next();

                    if (yesORno.equals("y")) {
                        listbuku.inputDiAwal(new Buku(judulBuku, penulisBuku, tahunBuku));
                    } else {
                        listbuku.inputDiAkhir(new Buku(judulBuku, penulisBuku, tahunBuku));
                    }
                    break;
                case 2:
                    System.out.println("Hapus data di awal list? (y/n)");
                    yesORno = x.next();

                    if (yesORno.equals("y")) {
                        listbuku.hapusDiAwal();
                        System.out.println("Data pengawal di awal list berhasil dihapus");
                    } else {
                        listbuku.hapusDiAkhir();
                        System.out.println("Data pengawal di akhir list berhasil dihapus");
                    }
                    break;
                case 3:
                    System.out.println("List buku adalah");
                    listbuku.print();
                    break;
            }
        } while (pilihan != 4);
    }
}