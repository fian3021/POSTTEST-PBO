package Posttest_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Petugas extends User implements Aksi_Petugas {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static ArrayList<Efek_Samping> efek_samping = new ArrayList<Efek_Samping>(); 
    static ArrayList<Imunisasi> imun = new ArrayList<Imunisasi>();
    static ArrayList<Anak> anak = new ArrayList<Anak>();
    static ArrayList<Orang_Tua> ortu = new ArrayList<Orang_Tua>();
    static Notice Pmberitahuan = new Notice();
    
    private String username;
    private String password;
    
    //keyword final
    final String kode_user = "001 - Petugas";
    
    public Petugas(String username, String password, String kode_user, String nama, int usia, String jenis_kelamin) {
        super(nama, usia, jenis_kelamin);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public void addData(){ 
       System.out.println(kode_user);        
    }
    
    @Override
    public void editData(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Nama Petugas " + this.nama);
    }  
    
    @Override    
    public void deleteData(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Nama Petugas " + this.nama);
    }
    
    @Override    
    public void viewData(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Nama Petugas " + this.nama);
    }
    
    @Override
    public void menu_petugas() throws IOException{
        while (true){
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("          Menu Utama Petugas         ");
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
        System.out.println("    Tambah Efek Samping Imunisasi    ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print(" Masukkan Jenis Imunisasi : ");
        String addji = br.readLine();
        System.out.print(" Masukkan Dosis Imunisasi : ");
        int adddosis = Integer.parseInt(br.readLine());
        System.out.print(" Masukkan Efek Samping    : ");
        String addefek = br.readLine();

        Efek_Samping efek = new Efek_Samping(addji, adddosis, addefek);

        efek_samping.add(efek);
        Pmberitahuan.pemberitahuan(kode_user);
        efek.addData();
        Pmberitahuan.pemberitahuan(1);
    }
    @Override
    public void read() throws IOException{
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("     Data Efek Samping Imunisasi     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Percabangan jika Arraylist masih kosong 
        if (efek_samping.size()<=0){
            System.out.println(" !!! Data Tidak Ada!");
        } else{
            for (int i = 0; i<efek_samping.size();i++){
                System.out.println("~~~~~~~~~~~~~");
                System.out.println(" Data Ke-" + (i+1));
                efek_samping.get(i).viewData();
                System.out.println();
            }
        }    
    }
    @Override
    public void update() throws IOException{
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("     Ubah Efek Samping Imunisasi     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Percabangan jika Arraylist masih kosong 
        if (efek_samping.size()<=0){
            System.out.println(" !!! Data Tidak Ada!");
        } else{
            System.out.print(" Ubah Data Ke-    : ");
            int ubah = Integer.parseInt(br.readLine());

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print(" Masukkan Jenis Imunisasi : ");
            String upji = br.readLine();
            System.out.print(" Masukkan Dosis Imunisasi : ");
            int updosis = Integer.parseInt(br.readLine());
            System.out.print(" Masukkan Efek Samping    : ");
            String upefek = br.readLine();

            efek_samping.get(ubah-1).setJenis_imunisasi(upji);
            efek_samping.get(ubah-1).setDosis(updosis);
            efek_samping.get(ubah-1).setEfek(upefek);


            Pmberitahuan.pemberitahuan(kode_user);
            efek_samping.get(ubah-1).editData();
            Pmberitahuan.pemberitahuan(2);
        }
    }
    @Override
    public void delete() throws IOException{
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("     Hapus Efek Samping Imunisasi    ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Percabangan jika Arraylist masih kosong 
        if (efek_samping.size()<=0){
            System.out.println(" !!! Data Tidak Ada!");
        } else{
            System.out.print(" Hapus Data Ke-    : ");
            int hapus = Integer.parseInt(br.readLine());

            efek_samping.remove(hapus-1).deleteData();
            Pmberitahuan.pemberitahuan(3);
        }
    }
}
