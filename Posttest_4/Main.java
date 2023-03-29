package Posttest_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Anak> anak = new ArrayList<Anak>();
    static ArrayList<Efek_Samping> efek_samping = new ArrayList<Efek_Samping>();
    static Pemberitahuan Pmberitahuan = new Pemberitahuan();
    static Edit edt = new Edit();
    
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
        System.out.println("             TAMBAH DATA             ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("        1. Data Imunisasi Anak       ");
        System.out.println("       2. Efek Samping Imunisasi     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print(" Masukkan Pilihan : ");
        int pilih = Integer.parseInt(br.readLine());
        switch(pilih){
            case 1:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("      Tambah Data Imunisasi Anak     ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print(" Masukkan Nama Anak       : ");
                String nama = br.readLine();
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
                System.out.print(" Masukkan Dosis Imunisasi : ");
                int dosis = Integer.parseInt(br.readLine());

                Anak data_anak = new Anak(nama, umur, jk, bb, tb,ibu, alamat, ji, dosis);

                anak.add(data_anak);
                Pmberitahuan.pemberitahuan(ji);
                data_anak.addData();
                Pmberitahuan.pemberitahuan(1);
                break;
            case 2:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("    Tambah Efek Samping Imunisasi    ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print(" Masukkan Jenis Imunisasi : ");
                String Ji = br.readLine();
                System.out.print(" Masukkan Dosis Imunisasi : ");
                int Dosis = Integer.parseInt(br.readLine());
                System.out.print(" Masukkan Efek Samping    : ");
                String Efek = br.readLine();

                Efek_Samping efek = new Efek_Samping(Ji, Dosis, Efek);

                efek_samping.add(efek);
                Pmberitahuan.pemberitahuan(Ji);
                efek.addData();
                Pmberitahuan.pemberitahuan(1);
                break;
            default:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("!!! Pilihan Tidak Tersedia!          ");
                System.out.println();
                break;
        }
    }
    
    public static void read() throws IOException{
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("              LIHAT DATA             ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("        1. Data Imunisasi Anak       ");
        System.out.println("       2. Efek Samping Imunisasi     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print(" Masukkan Pilihan : ");
        int pilih = Integer.parseInt(br.readLine());
        switch(pilih){
            case 1:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("         Data Imunisasi Anak         ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                //Percabangan jika Arraylist masih kosong 
                if (anak.size()<=0){
                    System.out.println("!!! Data Tidak Ada!");
                } else{
                    for (int i = 0; i<anak.size();i++){
                        System.out.println(" Data Ke-" + (i+1));
                        System.out.println("~~~~~~~~~~~~~");
                        System.out.println(" Nama Anak      : " + anak.get(i).getNama_anak().toUpperCase());
                        System.out.println(" Usia Anak      : " + anak.get(i).getUsia());
                        System.out.println(" Jenis Kelamin  : " + anak.get(i).getJ_kelamin());
                        System.out.println(" Berat Badan    : " + anak.get(i).getBerat());
                        System.out.println(" Tinggi Badan   : " + anak.get(i).getTinggi());
                        System.out.println(" Nama Ibu       : " + anak.get(i).getNama_ibu().toUpperCase());
                        System.out.println(" Alamat         : " + anak.get(i).getAlamat());
                        System.out.println(" Imunisasi      : " + anak.get(i).getJenis_imunisasi().toUpperCase());
                        System.out.println(" Dosis          : " + anak.get(i).getDosis());

                        System.out.println();
                    }
                }              
                break;
            case 2:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("     Data Efek Samping Imunisasi     ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                //Percabangan jika Arraylist masih kosong 
                if (efek_samping.size()<=0){
                    System.out.println("!!! Data Tidak Ada!");
                } else{
                    for (int i = 0; i<efek_samping.size();i++){
                        System.out.println(" Data Ke-" + (i+1));
                        System.out.println("~~~~~~~~~~~~~");
                        System.out.println(" Jenis Imunisasi    : " + efek_samping.get(i).getJenis_imunisasi().toUpperCase());
                        System.out.println(" Dosis              : " + efek_samping.get(i).getDosis());
                        System.out.println(" Efek Samping       : " + efek_samping.get(i).getEfek());

                        System.out.println();
                    }
                }      
                break;
            default:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("!!! Pilihan Tidak Tersedia!          ");
                System.out.println();
                break;
        
        }
          
    }
    
    public static void update() throws IOException{
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("              UBAH DATA              ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("        1. Data Imunisasi Anak       ");
        System.out.println("       2. Efek Samping Imunisasi     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print(" Masukkan Pilihan : ");
        int pilih = Integer.parseInt(br.readLine());
        switch(pilih){
            case 1:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("       Ubah Data Imunisasi Anak      ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                //Percabangan jika Arraylist masih kosong 
                if (anak.size()<=0){
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
                        String nama = br.readLine();
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
                        System.out.print(" Masukkan Dosis Imunisasi : ");
                        int dosis = Integer.parseInt(br.readLine());

                        anak.get(ubah-1).setNama_anak(nama);
                        anak.get(ubah-1).setUsia(umur);
                        anak.get(ubah-1).setJ_kelamin(jk);
                        anak.get(ubah-1).setBerat(bb);
                        anak.get(ubah-1).setTinggi(tb);
                        anak.get(ubah-1).setNama_ibu(ibu);
                        anak.get(ubah-1).setAlamat(alamat);
                        anak.get(ubah-1).setJenis_imunisasi(ji);
                        anak.get(ubah-1).setDosis(dosis);
                        
                        Pmberitahuan.pemberitahuan(ji);
                        anak.get(ubah-1).edit();
                        Pmberitahuan.pemberitahuan(2);
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
                        int pilihan = Integer.parseInt(br.readLine());

                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        switch(pilihan){
                            case 1:
                                System.out.print(" Masukkan Nama Anak       : ");
                                String nama = br.readLine();
                                anak.get(ubah-1).setNama_anak(nama);
                                edt.editData();
                                edt.editData(" Nama Anak ", nama);
                                break;
                            case 2:
                                System.out.print(" Masukkan Usia Anak       : ");
                                int umur = Integer.parseInt(br.readLine());
                                anak.get(ubah-1).setUsia(umur);
                                edt.editData();
                                edt.editData(" Usia Anak ", umur);
                                break;                    
                            case 3:
                                System.out.print(" Masukkan Jenis Kelamin   : ");
                                String jk = br.readLine();
                                anak.get(ubah-1).setJ_kelamin(jk);
                                edt.editData();
                                edt.editData(" Jenis Kelamin ", jk);
                                break; 
                            case 4:
                                System.out.print(" Masukkan Berat Badan     : ");
                                double bb = Double.parseDouble(br.readLine());
                                anak.get(ubah-1).setBerat(bb);
                                edt.editData();
                                edt.editData(" Berat Badan ", bb);
                                break; 
                            case 5:
                                System.out.print(" Masukkan Tinggi Badan    : ");
                                double tb = Double.parseDouble(br.readLine());
                                anak.get(ubah-1).setTinggi(tb);
                                edt.editData();
                                edt.editData(" Tinggi Badan ", tb);
                                break; 
                            case 6:
                                System.out.print(" Masukkan Nama Ibu        : ");
                                String ibu = br.readLine();
                                anak.get(ubah-1).setNama_ibu(ibu);
                                edt.editData();
                                edt.editData(" Nama Ibu ", ibu);
                                break; 
                            case 7:
                                System.out.print(" Masukkan Alamat          : ");
                                String alamat = br.readLine();
                                anak.get(ubah-1).setAlamat(alamat);
                                edt.editData();
                                edt.editData(" Alamat ", alamat);
                                break; 
                            case 8:
                                System.out.print(" Masukkan Jenis Imunisasi : ");
                                String ji = br.readLine();
                                anak.get(ubah-1).setJenis_imunisasi(ji);
                                edt.editData();
                                edt.editData(" Jenis Imunisasi ", ji);
                                break; 
                            case 9:
                                System.out.print(" Masukkan Dosis Imunisasi : ");
                                int dosis = Integer.parseInt(br.readLine());
                                anak.get(ubah-1).setDosis(dosis);
                                edt.editData();
                                edt.editData(" Dosis ", dosis);
                                break; 
                            default:
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("!!! Pilihan Tidak Tersedia!          ");
                                System.out.println();
                                break;
                        }    
                    } 
                    else {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("!!! Pilihan Tidak Tersedia!          ");
                        System.out.println();
                    }   
                }
                break;
            case 2:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("     Ubah Efek Samping Imunisasi     ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                //Percabangan jika Arraylist masih kosong 
                if (efek_samping.size()<=0){
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
                        System.out.print(" Masukkan Jenis Imunisasi : ");
                        String Ji = br.readLine();
                        System.out.print(" Masukkan Dosis Imunisasi : ");
                        int Dosis = Integer.parseInt(br.readLine());
                        System.out.print(" Masukkan Efek Samping    : ");
                        String Efek = br.readLine();

                        efek_samping.get(ubah-1).setJenis_imunisasi(Ji);
                        efek_samping.get(ubah-1).setDosis(Dosis);
                        efek_samping.get(ubah-1).setEfek(Efek);
                        
                        
                        Pmberitahuan.pemberitahuan(Ji);
                        efek_samping.get(ubah-1).edit();
                        Pmberitahuan.pemberitahuan(1);
                    }
                    else if (ubh == 2){
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(" Pilih data yang ingin diubah");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(" 1. Jenis Imunisasi");
                        System.out.println(" 2. Dosis Imunisasi");
                        System.out.println(" 3. Efek Samping");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.print(" Masukkan Pilihan : ");
                        int pilihan = Integer.parseInt(br.readLine());

                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        switch(pilihan){
                            case 1:
                                System.out.print(" Masukkan Jenis Imunisasi : ");
                                String Ji = br.readLine();
                                efek_samping.get(ubah-1).setJenis_imunisasi(Ji);
                                edt.editData();
                                edt.editData(" Jenis Imunisasi ", Ji);
                                break;
                            case 2:
                                System.out.print(" Masukkan Dosis Imunisasi : ");
                                int Dosis = Integer.parseInt(br.readLine());
                                efek_samping.get(ubah-1).setDosis(Dosis);
                                edt.editData();
                                edt.editData(" Dosis ", Dosis);
                                break;                    
                            case 3:
                                System.out.print(" Masukkan Efek Samping    : ");
                                String Efek = br.readLine();
                                efek_samping.get(ubah-1).setEfek(Efek);
                                edt.editData();
                                edt.editData(" Efek Samping ", Efek);
                                break; 
                            default:
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("!!! Pilihan Tidak Tersedia!          ");
                                System.out.println();
                                break;
                        }                
                    } 
                    else {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("!!! Pilihan Tidak Tersedia!          ");
                        System.out.println();
                    }   
                }
                break;
            default:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("!!! Pilihan Tidak Tersedia!          ");
                System.out.println();
                break;
        }
    }
    public static void delete() throws IOException{
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("              HAPUS DATA             ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("        1. Data Imunisasi Anak       ");
        System.out.println("       2. Efek Samping Imunisasi     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print(" Masukkan Pilihan : ");
        int pilih = Integer.parseInt(br.readLine());
        switch(pilih){
            case 1:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("       Hapus Data Imunisasi Anak     ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                //Percabangan jika Arraylist masih kosong 
                if (anak.size()<=0){
                    System.out.println("!!! Data Tidak Ada!");
                } else{
                    System.out.print(" Hapus Data Ke-    : ");
                    int hapus = Integer.parseInt(br.readLine());
                    
                    anak.remove(hapus-1).del();
                    Pmberitahuan.pemberitahuan(3);
                }
                break;
            case 2:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("     Hapus Efek Samping Imunisasi    ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                //Percabangan jika Arraylist masih kosong 
                if (efek_samping.size()<=0){
                    System.out.println("!!! Data Tidak Ada!");
                } else{
                    System.out.print(" Hapus Data Ke-    : ");
                    int hapus = Integer.parseInt(br.readLine());

                    efek_samping.remove(hapus-1).del();
                    Pmberitahuan.pemberitahuan(3);
                }
                break;
            default:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("!!! Pilihan Tidak Tersedia!          ");
                System.out.println();
                break;
        }
    }    
}
