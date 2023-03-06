/* 
Nama    : Al Fiana Nur Priyanti
NIM     : 2109106022
Kelas   : Informatika A 2021
*/

package Posttest_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Imunisasi> Imunisasi = new ArrayList<Imunisasi>();
    
    public static void main(String[] args) throws IOException{
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("  Program Pendataan Imunisasi Anak  ");
        System.out.println("            Di Posyandu             ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                ~~~~                 ");
        while (true){
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("             Menu Utama              ");
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
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("            Terima Kasih             ");
                    System.out.println("    Telah Menggunakan Program Ini    ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("                ~~~~                 ");
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
    public static void create() throws IOException{
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("      Tambah Data Imunisasi Anak     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print(" Masukkan Nama Anak       : ");
        String anak = br.readLine();
        System.out.print(" Masukkan Usia Anak       : ");
        int umur = Integer.parseInt(br.readLine());
        System.out.print(" Masukkan Jenis Kelamin   : ");
        String jk = br.readLine();
        System.out.print(" Masukkan Berat Badan     : ");
        double bb = Double.parseDouble(br.readLine());
        System.out.print(" Masukkan Tinggi Badan    : ");
        double tb = Double.parseDouble(br.readLine());
        System.out.print(" Masukkan Nama Ibu        : ");
        String ibu = br.readLine();
        System.out.print(" Masukkan Alamat          : ");
        String alamat = br.readLine();
        System.out.print(" Masukkan Jenis Imunisasi : ");
        String ji = br.readLine();
        
        Imunisasi imun = new Imunisasi(anak, umur, jk, bb, tb, ibu, alamat, ji);
        
        Imunisasi.add(imun);
        imun.tambah();
    }
    
    public static void read() throws IOException{
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("         Data Imunisasi Anak         ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Percabangan jika Arraylist masih kosong 
        if (Imunisasi.size()<=0){
            System.out.println("!!! Data Tidak Ada!");
        } else{
            for (int i = 0; i<Imunisasi.size();i++){
                System.out.println(" Data Ke-" + (i+1));
                System.out.println("~~~~~~~~~~~~~");
                System.out.println(" Nama Anak      : " + Imunisasi.get(i).nama_anak);
                System.out.println(" Usia Anak      : " + Imunisasi.get(i).usia);
                System.out.println(" Jenis Kelamin  : " + Imunisasi.get(i).j_kelamin);
                System.out.println(" Berat Badan    : " + Imunisasi.get(i).berat);
                System.out.println(" Tinggi Badan   : " + Imunisasi.get(i).tinggi);
                System.out.println(" Nama Ibu       : " + Imunisasi.get(i).nama_ibu);
                System.out.println(" Alamat         : " + Imunisasi.get(i).alamat);
                System.out.println(" Imunisasi      : " + Imunisasi.get(i).j_imunisasi);

                System.out.println();
            }
        }        
    }
    
    public static void update() throws IOException{
        read();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("       Ubah Data Imunisasi Anak      ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Percabangan jika Arraylist masih kosong 
        if (Imunisasi.size()<=0){
            System.out.println("!!! Data Tidak Ada!");
        } else{
            System.out.print(" Ubah Data Ke-    : ");
            int ubah = Integer.parseInt(br.readLine());
            
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 1. Ubah Semua Data    ");
            System.out.println(" 2. Ubah Data Tertentu ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print(" Pilih    : ");
            int ubh = Integer.parseInt(br.readLine());
            if (ubh == 1){
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print(" Masukkan Nama Anak       : ");
                String anak = br.readLine();
                System.out.print(" Masukkan Usia Anak       : ");
                int umur = Integer.parseInt(br.readLine());
                System.out.print(" Masukkan Jenis Kelamin   : ");
                String jk = br.readLine();
                System.out.print(" Masukkan Berat Badan     : ");
                double bb = Double.parseDouble(br.readLine());
                System.out.print(" Masukkan Tinggi Badan    : ");
                double tb = Double.parseDouble(br.readLine());
                System.out.print(" Masukkan Nama Ibu        : ");
                String ibu = br.readLine();
                System.out.print(" Masukkan Alamat          : ");
                String alamat = br.readLine();
                System.out.print(" Masukkan Jenis Imunisasi : ");
                String ji = br.readLine();

                Imunisasi.get(ubah-1).nama_anak = anak;
                Imunisasi.get(ubah-1).usia = umur;
                Imunisasi.get(ubah-1).j_kelamin = jk;
                Imunisasi.get(ubah-1).berat = bb;
                Imunisasi.get(ubah-1).tinggi = tb;
                Imunisasi.get(ubah-1).nama_ibu = ibu;
                Imunisasi.get(ubah-1).alamat = alamat;
                Imunisasi.get(ubah-1).j_imunisasi = ji;
            } 
            else if (ubh == 2){
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(" Pilih data yang ingin diubah");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(" 1. Nama Anak");
                System.out.println(" 2. Usia");
                System.out.println(" 3. Jenis Kelamin");
                System.out.println(" 4. Berat Badan");
                System.out.println(" 5. Tinggi Badan");
                System.out.println(" 6. Nama Ibu");
                System.out.println(" 7. Alamat");
                System.out.println(" 8. Jenis Imunisasi");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print(" Masukkan Pilihan : ");
                int pilih = Integer.parseInt(br.readLine());

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                switch(pilih){
                    case 1:
                        System.out.print(" Masukkan Nama Anak       : ");
                        String anak = br.readLine();
                        Imunisasi.get(ubah-1).nama_anak = anak;
                        break;
                    case 2:
                        System.out.print(" Masukkan Usia Anak       : ");
                        int umur = Integer.parseInt(br.readLine());
                        Imunisasi.get(ubah-1).usia = umur;
                        break;                    
                    case 3:
                        System.out.print(" Masukkan Jenis Kelamin   : ");
                        String jk = br.readLine();
                        Imunisasi.get(ubah-1).j_kelamin = jk;
                        break; 
                    case 4:
                        System.out.print(" Masukkan Berat Badan     : ");
                        double bb = Double.parseDouble(br.readLine());
                        Imunisasi.get(ubah-1).berat = bb;
                        break; 
                    case 5:
                        System.out.print(" Masukkan Tinggi Badan    : ");
                        double tb = Double.parseDouble(br.readLine());
                        Imunisasi.get(ubah-1).tinggi = tb;
                        break; 
                    case 6:
                        System.out.print(" Masukkan Nama Ibu        : ");
                        String ibu = br.readLine();
                        Imunisasi.get(ubah-1).nama_ibu = ibu;
                        break; 
                    case 7:
                        System.out.print(" Masukkan Alamat          : ");
                        String alamat = br.readLine();
                        Imunisasi.get(ubah-1).alamat = alamat;
                        break; 
                    case 8:
                        System.out.print(" Masukkan Jenis Imunisasi : ");
                        String ji = br.readLine();
                        Imunisasi.get(ubah-1).j_imunisasi = ji;
                        break; 
                    default:
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("!!! Pilihan Tidak Tersedia!          ");
                        System.out.println();
                        break;
                }                
                Imunisasi.get(ubah-1).ubah();
            } 
            else {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("!!! Pilihan Tidak Tersedia!          ");
                System.out.println();
            }   
        }
    }
    
    public static void delete() throws IOException{
        read();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("       Hapus Data Imunisasi Anak     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Percabangan jika Arraylist masih kosong 
        if (Imunisasi.size()<=0){
            System.out.println("!!! Data Tidak Ada!");
        } else{
            System.out.print(" Hapus Data Ke-    : ");
            int hapus = Integer.parseInt(br.readLine());
            
            Imunisasi.remove(hapus-1).hapus();
        }
    }
    
}
