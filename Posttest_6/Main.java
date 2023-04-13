package Posttest_6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Notice Pmberitahuan = new Notice();
    
    public static void main(String[] args) throws IOException {
        Petugas petugas = new Petugas("fian3021", "123petugas", "001 - Petugas", "Fian", 20, "Perempuan");
        Orang_Tua ortu = new Orang_Tua("Nur", 30, "Laki-laki", "Jl. Mawar");
        
        Pmberitahuan.pembuka();
        while(true){
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("          M E N U   U S E R          ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("  1. Login Petugas");
            System.out.println("  2. Orang Tua");
            System.out.println("  3. LogOut");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print(" Masukkan Pilihan : ");
            int pilih = Integer.parseInt(br.readLine());
            
            switch (pilih){
                case 1:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.print(" Masukan Username :");
                    String username = br.readLine();
                    System.out.print(" Masukan Password :");
                    String password = br.readLine();
                    if(username.equals(petugas.getUsername()) && password.equals(petugas.getPassword())){
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(" Selamat Datang Petugas " + petugas.getNama());
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("                ~~~~                 ");
                        petugas.menu_petugas();
                        continue;
                    }
                    break;
                case 2:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(" Selamat Datang Ibu/Bapak " + ortu.getNama());
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("                ~~~~                 ");
                    ortu.menu_ortu();
                    continue;                    
                case 3:
                    Pmberitahuan.penutup();
                    System.exit(0);
                    break; 
                default:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("!!! Pilihan Tidak Tersedia!          ");
                    System.out.println();
                    break;
            }
        }
    }
}
