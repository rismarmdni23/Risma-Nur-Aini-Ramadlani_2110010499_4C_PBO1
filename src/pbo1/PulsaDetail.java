package pbo1;

public class PulsaDetail extends Pulsa {
    //    overriding
    public PulsaDetail(String nomor, String beli) {
        super(nomor, beli);
    }
    
    public int getNominal() {
        return Integer.parseInt(getBeli().substring(0, 1) +2000);
    }
    
    public String getOperator(){
        String kodeOperator = getNomor().substring(0, 3);
//        seleksi switch
        switch (kodeOperator){
            case "082":
                return "Telkomsel";
            case "085":
                return "Indosat";
            case "087":
                return "XL";
            case "083":
                return "AXIS";
            default:
                return "Operator Lain";
        }
    }
    
//    polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo() +
                "\nNama Operator : "+getOperator()+
                "\njumlah Harga : "+getNominal();
    }
}