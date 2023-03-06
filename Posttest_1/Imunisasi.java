/* 
Nama    : Al Fiana Nur Priyanti
NIM     : 2109106022
Kelas   : Informatika A 2021
*/

package Posttest_1;


public class Imunisasi {
    String nama_anak, j_kelamin, nama_ibu, alamat, j_imunisasi;
    int usia;
    double berat, tinggi;
    
    public Imunisasi(String nama_anak, int usia, String j_kelamin, double berat, double tinggi, String nama_ibu, String alamat, String j_imunisasi){
        this.nama_anak = nama_anak;
        this.usia = usia;
        this.j_kelamin = j_kelamin;
        this.berat = berat;
        this.tinggi = tinggi;
        this.nama_ibu = nama_ibu;
        this.alamat = alamat;
        this.j_imunisasi = j_imunisasi;
    }
    
    public Imunisasi(){}
    
    public void tambah(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">>> Data Anak Bernama " + this.nama_anak);
        System.out.println("    Berhasil Ditambahkan!            ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                ~~~~                 ");
    }
    
    public void ubah(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">>> Data Anak Bernama " + this.nama_anak);
        System.out.println("    Berhasil Diubah!          ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                ~~~~                 ");
    }
    
    public void hapus(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">>> Data Anak Bernama " + this.nama_anak);
        System.out.println("    Berhasil Dihapus!         ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                ~~~~                 ");
    }
}
