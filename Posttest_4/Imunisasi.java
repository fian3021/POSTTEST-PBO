package Posttest_4;

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
}
class Pemberitahuan{
    public void pemberitahuan(String Jns_Imunisasi){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Dengan Jenis Imunisasi " + Jns_Imunisasi);
    }
    public void pemberitahuan(int action){
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

