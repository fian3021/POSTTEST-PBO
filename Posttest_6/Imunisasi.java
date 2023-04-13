package Posttest_6;

public class Imunisasi {
    protected String jenis_imunisasi;
    protected int dosis;
    
    public Imunisasi(String jenis_imunisasi, int dosis) {
        this.jenis_imunisasi = jenis_imunisasi;
        this.dosis = dosis;
    }

    public String getJenis_imunisasi() {
        return jenis_imunisasi;
    }

    public void setJenis_imunisasi(String jenis_imunisasi) {
        this.jenis_imunisasi = jenis_imunisasi;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }
       
    public void viewData(){
        System.out.println(" Jenis Imunisasi    : " + this.jenis_imunisasi);
        System.out.println(" Dosis              : " + this.dosis);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
final class Pemberitahuan{
    public final String posyandu = "Posyandu Kita";
    public final void pembuka(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("  Program Pendataan Imunisasi Anak  ");
        System.out.println("         Di "+posyandu);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                ~~~~                 ");
    }
    public final void penutup(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("            Terima Kasih             ");
        System.out.println("    Telah Menggunakan Program Ini    ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                ~~~~                 ");
    }
    
    public final void pemberitahuan(String kode){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Dengan Jenis Imunisasi " + kode);
    }
    public final void pemberitahuan(int action){
        switch (action){
            case 1:
                System.out.println("   Berhasil Ditambahkan!            ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                ~~~~                 ");
                break;
            case 2:
                System.out.println("   Berhasil Diubah!                  ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                ~~~~                 ");
                break;
            case 3:
                System.out.println("   Berhasil Dihapus!                 ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                ~~~~                 ");
                break;
            default:
                break;
        }
    }
}    
