package Posttest_2;


public class Imunisasi {
    private String nama_anak, j_kelamin, nama_ibu, alamat, j_imunisasi;
    private int usia;
    private double berat, tinggi;
    
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

    public String getNama_anak() {
        return nama_anak;
    }

    public void setNama_anak(String nama_anak) {
        this.nama_anak = nama_anak;
    }

    public String getJ_kelamin() {
        return j_kelamin;
    }

    public void setJ_kelamin(String j_kelamin) {
        this.j_kelamin = j_kelamin;
    }

    public String getNama_ibu() {
        return nama_ibu;
    }

    public void setNama_ibu(String nama_ibu) {
        this.nama_ibu = nama_ibu;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJ_imunisasi() {
        return j_imunisasi;
    }

    public void setJ_imunisasi(String j_imunisasi) {
        this.j_imunisasi = j_imunisasi;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
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
