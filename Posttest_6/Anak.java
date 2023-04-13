package Posttest_6;

public class Anak extends User {
    protected double berat, tinggi;

    public Anak(String nama, int usia, String jenis_kelamin, double berat, double tinggi) {
        super(nama, usia, jenis_kelamin);
        this.berat = berat;
        this.tinggi = tinggi;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public void addData(){ 
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Data Anak Bernama " + this.nama);
    }
    
    @Override
    public void editData(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Data Anak Bernama " + this.nama);
    }  
    
    @Override    
    public void deleteData(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Data Anak Bernama " + this.nama);
    }
    
    @Override    
    public void viewData(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Nama Anak          : " + this.nama);
        System.out.println(" Usia               : " + this.usia);
        System.out.println(" Jenis Kelamin      : " + this.jenis_kelamin);
        System.out.println(" Berat Badan        : " + this.berat);
        System.out.println(" Tinggi Badan       : " + this.tinggi);
    }
    
}