package Posttest_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Orang_Tua extends User implements Aksi_OrangTua {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static ArrayList<Imunisasi> imun = new ArrayList<Imunisasi>();
    static ArrayList<Anak> anak = new ArrayList<Anak>();
    static ArrayList<Orang_Tua> ortu = new ArrayList<Orang_Tua>();
    static ArrayList<Efek_Samping> efek_samping = new ArrayList<Efek_Samping>(); 
    static Notice Pmberitahuan = new Notice();
    
    protected String alamat;

    //keyword final
    final String kode_user = "002 - Orang Tua";

    public Orang_Tua(String nama, int usia, String jenis_kelamin, String alamat) {
        super(nama, usia, jenis_kelamin);
        this.alamat = alamat;
    }
       
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    @Override
    public void addData(){ 
        System.out.println(" Anak dari " + this.nama);        
    }
    
    @Override
    public void editData(){
        System.out.println(" Anak dari " + this.nama);        
    }  
    
    @Override    
    public void deleteData(){
        System.out.println(" Anak dari " + this.nama);        
    }
    
    @Override    
    public void viewData(){
        System.out.println(" Nama Orang Tua     : " + this.nama);
        System.out.println(" Alamat             : " + this.alamat);
    }
    
    @Override
    public void menu_ortu() throws IOException{
        while (true){
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("        Menu Utama Orang Tua         ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("  1. Tambah Data           - CREATE  ");
            System.out.println("  2. Lihat Data            -   READ  ");
            System.out.println("  3. Ubah Data             - UPDATE  ");
            System.out.println("  4. Hapus Data            - DELETE  ");
            System.out.println("  5. Keluar Program        -   EXIT  ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print(" Masukkan Pilihan : ");
            int pilih = Integer.parseInt(br.readLine());
            
            switch (pilih){
                case 1:
                    create();
                    break;
                case 2:
                    read();
                    break;                    
                case 3:
                    update();
                    break; 
                case 4:
                    delete();
                    break; 
                case 5:
                    System.exit(0);
                    break; 
                default:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(" !!! Pilihan Tidak Tersedia!          ");
                    System.out.println();
                    break;
            }
        }
    }
    @Override
    public void create() throws IOException{
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("        Tambah Data Imunisasi        ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("              Data Anak      ");
        System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print(" Masukkan Nama Anak       : ");
        String addnama = br.readLine();
        System.out.print(" Masukkan Usia Anak       : ");
        int addusia = Integer.parseInt(br.readLine());
        System.out.print(" Masukkan Jenis Kelamin   : ");
        String addjk = br.readLine();
        System.out.print(" Masukkan Berat Badan     : ");
        double addbb = Double.parseDouble(br.readLine());
        System.out.print(" Masukkan Tinggi Badan    : ");
        double addtb = Double.parseDouble(br.readLine());
        System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("           Data Orang Tua      ");
        System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print(" Masukkan Nama Orang Tua  : ");
        String addortu = br.readLine();
        System.out.print(" Masukkan Usia Orang Tua  : ");
        int addusiaortu = Integer.parseInt(br.readLine());
        System.out.print(" Masukkan Jenis Kelamin   : ");
        String addjkortu = br.readLine();
        System.out.print(" Masukkan Alamat          : ");
        String addalamat = br.readLine();
        System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("        Data Jenis Imunisasi      ");
        System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print(" Masukkan Jenis Imunisasi : ");
        String addji = br.readLine();
        System.out.print(" Masukkan Dosis Imunisasi : ");
        int adddosis = Integer.parseInt(br.readLine());

        Anak data_anak = new Anak (addnama, addusia, addjk, addbb, addtb);
        Orang_Tua data_ortu = new Orang_Tua(addortu, addusiaortu, addjkortu, addalamat);
        Imunisasi imunisasi = new Imunisasi(addji, adddosis);
        
        anak.add(data_anak);
        ortu.add(data_ortu);
        imun.add(imunisasi);
        
        Pmberitahuan.pemberitahuan(kode_user);
        data_anak.addData();
        data_ortu.addData();
        Pmberitahuan.pemberitahuan(1);
    }
    
    @Override
    public void read() throws IOException{
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("         Data Imunisasi Anak         ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Percabangan jika Arraylist masih kosong 
        if (anak.size()<=0){
            System.out.println(" !!! Data Tidak Ada!");
        } else{
            for (int i = 0; i<anak.size();i++){
                System.out.println("~~~~~~~~~~~~~");
                System.out.println(" Data Ke-" + (i+1));
                anak.get(i).viewData();
                ortu.get(i).viewData();
                imun.get(i).viewData();
                System.out.println();
            }
        }   
    }
    
    @Override
    public void update() throws IOException{
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("       Ubah Data Imunisasi Anak      ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Percabangan jika Arraylist masih kosong 
        if (anak.size()<=0){
            System.out.println(" !!! Data Tidak Ada!");
        } else{
            System.out.print(" Ubah Data Ke-    : ");
            int ubah = Integer.parseInt(br.readLine());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("              Data Anak      ");
            System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print(" Masukkan Nama Anak       : ");
            String upnama = br.readLine();
            System.out.print(" Masukkan Usia Anak       : ");
            int upusia = Integer.parseInt(br.readLine());
            System.out.print(" Masukkan Jenis Kelamin   : ");
            String upjk = br.readLine();
            System.out.print(" Masukkan Berat Badan     : ");
            double upbb = Double.parseDouble(br.readLine());
            System.out.print(" Masukkan Tinggi Badan    : ");
            double uptb = Double.parseDouble(br.readLine());
            System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("           Data Orang Tua      ");
            System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print(" Masukkan Nama Orang Tua  : ");
            String uportu = br.readLine();
            System.out.print(" Masukkan Usia Orang Tua  : ");
            int upusiaortu = Integer.parseInt(br.readLine());
            System.out.print(" Masukkan Jenis Kelamin   : ");
            String upjkortu = br.readLine();
            System.out.print(" Masukkan Alamat          : ");
            String upalamat = br.readLine();
            System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("        Data Jenis Imunisasi      ");
            System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print(" Masukkan Jenis Imunisasi : ");
            String upji = br.readLine();
            System.out.print(" Masukkan Dosis Imunisasi : ");
            int updosis = Integer.parseInt(br.readLine());

            anak.get(ubah-1).setNama(upnama);
            anak.get(ubah-1).setUsia(upusia);
            anak.get(ubah-1).setJenis_kelamin(upjk);
            anak.get(ubah-1).setBerat(upbb);
            anak.get(ubah-1).setTinggi(uptb);
            ortu.get(ubah-1).setNama(uportu);
            ortu.get(ubah-1).setUsia(upusiaortu);
            ortu.get(ubah-1).setJenis_kelamin(upjkortu);
            ortu.get(ubah-1).setAlamat(upalamat);
            imun.get(ubah-1).setJenis_imunisasi(upji);
            imun.get(ubah-1).setDosis(updosis);

            Pmberitahuan.pemberitahuan(kode_user);
            anak.get(ubah-1).editData();
            ortu.get(ubah-1).editData();
            imun.get(ubah-1);
            Pmberitahuan.pemberitahuan(2);
        }
    }
    @Override
    public void delete() throws IOException{
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("       Hapus Data Imunisasi Anak     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Percabangan jika Arraylist masih kosong 
        if (anak.size()<=0){
            System.out.println(" !!! Data Tidak Ada!");
        } else{
            System.out.print(" Hapus Data Ke-    : ");
            int hapus = Integer.parseInt(br.readLine());

            Pmberitahuan.pemberitahuan(kode_user);
            anak.remove(hapus-1).deleteData();
            ortu.remove(hapus-1).deleteData();
            imun.remove(hapus-1);
            Pmberitahuan.pemberitahuan(3);
        }
    }
}
