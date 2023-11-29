public class Ekspedisi {
    
   private JumlahCabang int;

   public Ekspedisi (JumlahCabang int, string pusat, float tarif ){

         super (JumlahCabang, pusat, tarif);
         this.informasi = informasi;

}

public string  toString(){
    return super.toString()+ "\n JumlahCabang: " + JumlahCabang;
    }
}
