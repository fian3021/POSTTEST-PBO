package Posttest_6;
public class Efek_Samping extends Imunisasi{
    protected String efek;

    public Efek_Samping(String jenis_imunisasi, int dosis, String efek) {
        super(jenis_imunisasi, dosis);
        this.efek = efek;
    }

    public String getEfek() {
        return efek;
    }

    public void setEfek(String efek) {
        this.efek = efek;
    }
    
    public void addData(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Jenis Imunisasi " + this.jenis_imunisasi);
        System.out.println(" Dengan Dosis " + this.dosis);  
        System.out.println(" Dengan Efek Samping " + this.efek);
    }

    public void editData(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Jenis Imunisasi " + this.jenis_imunisasi);
        System.out.println(" Dengan Dosis " + this.dosis);  
        System.out.println(" Dengan Efek Samping " + this.efek);
    }    
    
    public void deleteData(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Jenis Imunisasi " + this.jenis_imunisasi);
        System.out.println(" Dengan Dosis " + this.dosis);  
        System.out.println(" Dengan Efek Samping " + this.efek);
    }
     
    public void viewData(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Jenis Imunisasi    : " + this.jenis_imunisasi);
        System.out.println(" Dosis              : " + this.dosis);  
        System.out.println(" Efek Samping       : " + this.efek);
    }
}