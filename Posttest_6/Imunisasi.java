package Posttest_6;

public abstract class Imunisasi {
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
    
    public abstract void addData();
    public abstract void edit();
    public abstract void del();
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
    
    public final void pemberitahuan(String Jns_Imunisasi){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Dengan Jenis Imunisasi " + Jns_Imunisasi);
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