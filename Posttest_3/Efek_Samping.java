package Posttest_3;

public class Efek_Samping extends Imunisasi{
    protected String efek;

    public Efek_Samping(String jenis_imunisasi, int dosis, String efek) {
        super(jenis_imunisasi, dosis);
        this.efek = efek;
    }

    public String getEfek() {
        return efek;
    }

    public void setEfek(String efek) {
        this.efek = efek;
    }
    
    public void tambah(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">> Efek Samping Imunisasi " + this.jenis_imunisasi);
        System.out.println("   Berhasil Ditambahkan!            ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                ~~~~                 ");
    }
    
    public void ubah(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">> Efek Samping Imunisasi " + this.jenis_imunisasi);
        System.out.println("   Berhasil Diubah!            ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                ~~~~                 ");
    }
    
    public void hapus(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">> Efek Samping Imunisasi " + this.jenis_imunisasi);
        System.out.println("   Berhasil Dihapus!            ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                ~~~~                 ");
    }
    
}
