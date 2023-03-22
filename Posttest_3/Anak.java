package Posttest_3;

public class Anak extends Imunisasi{
    protected String nama_anak, j_kelamin, alamat, nama_ibu;
    protected int usia;
    protected double berat, tinggi;

    public Anak(String nama_anak, int usia, String j_kelamin, double berat, double tinggi, String nama_ibu, String alamat, String jenis_imunisasi, int dosis) {
        super(jenis_imunisasi, dosis);
        this.nama_anak = nama_anak;
        this.usia = usia;
        this.j_kelamin = j_kelamin;
        this.berat = berat;
        this.tinggi = tinggi;
        this.nama_ibu = nama_ibu;
        this.alamat = alamat;
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

    
    public void tambah(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">> Data Anak Bernama " + this.nama_anak);
        System.out.println("   Berhasil Ditambahkan!            ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                ~~~~                 ");
    }
    
    public void ubah(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">> Data Anak Bernama " + this.nama_anak);
        System.out.println("   Berhasil Diubah!          ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                ~~~~                 ");
    }
    
    public void hapus(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">> Data Anak Bernama " + this.nama_anak);
        System.out.println("   Berhasil Dihapus!         ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                ~~~~                 ");
    }
}
