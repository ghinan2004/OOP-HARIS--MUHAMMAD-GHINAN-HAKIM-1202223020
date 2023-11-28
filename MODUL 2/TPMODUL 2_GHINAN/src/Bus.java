public class Bus extends Kendaraan {
    
    private int jumlahKursi;

    public Bus (String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahKursi)
    {
        super( nomorIdentifikasi, kecepatanMaksimum, jumlahKursi);
        this.jumlahKursi=jumlahKursi;
        

    }
    public String toString(){
        return super.toString()+ "\n jumlahKursi: " + jumlahKursi;
    }
}
