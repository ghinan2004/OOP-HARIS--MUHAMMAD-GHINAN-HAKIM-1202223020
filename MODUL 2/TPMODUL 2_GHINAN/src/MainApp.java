public class MainApp {
    public static void main(String[] args) throws Exception {
        Mobil mobil1 = new Mobil("Mobil 1",120 , 5, 4 );
        Bus bus1 = new Bus("Bus 1", 80,40,30);
        double jarak = 600;

        System.out.println("informasi mobil:\n"+ mobil1.toString());
        System.out.println("waktu tempuh dengan mobil: "+mobil1.hitungWaktuTempuh(jarak)+"\n");
        System.out.println("informasi bus:\n"+ bus1.toString());
        System.out.println("waktu tempuh dengan bus: "+bus1.hitungWaktuTempuh(jarak)+"\n");
    }
}
