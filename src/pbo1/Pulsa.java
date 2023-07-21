package pbo1;

public class Pulsa {
    //    atribut dan enkapsulasi
    private String nomor;
    private String beli;
    
//    construktor
    public Pulsa(String nomor, String beli) {
        this.nomor = nomor;
        this.beli = beli;
    }
    
//    mutator (seter)
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public void setBeli(String beli) {
        this.beli = beli;
    }
    
//    accesor (getter)
    public String getNomor() {
        return nomor;
    }

    public String getBeli() {
        return beli;
    }
    
    public String displayInfo(){
       return "Nomor : "+getNomor()+
              "\nNominal : "+getBeli(); 
    }
    
//    polymorphism (overloading)
    public String displayInfo(String harga){
        return displayInfo() + "\nHarga: "+harga;
    }
}