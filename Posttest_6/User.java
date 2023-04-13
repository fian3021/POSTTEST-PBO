package Posttest_6;

public abstract class User {
    protected String nama,jenis_kelamin ;
    protected int usia;

    public User(String nama, int usia, String jenis_kelamin) {
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
        
    public abstract void addData();
    public abstract void editData();
    public abstract void deleteData();
    public abstract void viewData();

}
final class Notice{
    public final String posyandu = "POSYANDU KITA";
    public final void pembuka(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("  PROGRAM PENDATAAN IMUNISASI ANAK  ");
        System.out.println("         DI "+posyandu);
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
    
    //Fungsi Overloading
    public final void pemberitahuan(String kode){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Kode User " + kode);
    }
    public final void pemberitahuan(int action){
        switch (action){
            case 1:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(" Berhasil Ditambahkan!            ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                ~~~~                 ");
                break;
            case 2:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(" Berhasil Diubah!                  ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                ~~~~                 ");
                break;
            case 3:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(" Berhasil Dihapus!                 ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                ~~~~                 ");
                break;
            default:
                break;
        }
    }
}    