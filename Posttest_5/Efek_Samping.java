package Posttest_5;

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
    
    public void tambah(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">> Efek Samping Imunisasi " + this.efek);
    }
    
    @Override
    public void addData(){
        tambah();
        System.out.println(">> Dan Dosis " + this.dosis);        
    }
    
    public void ubah(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">> Efek Samping Imunisasi " + this.efek);
    }
    
    @Override
    public void edit(){
        ubah();
        System.out.println(">> Dan Dosis " + this.dosis);  
    }    
    
    public void hapus(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">> Efek Samping Imunisasi " + this.efek);
    }
    
    @Override
    public void del(){
        hapus();
    }
}
