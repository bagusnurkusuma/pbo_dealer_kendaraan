package dealer_kendaraan;

public class MobilBekas extends Mobil implements Kendaraan{
    private int tahun;
    private double harga;
    public MobilBekas(String merek, String model, int tahun, double harga) {
        super(merek, model);
        this.tahun = tahun;
        this.harga = harga;
    }
    public int getTahun() {
        return tahun;
    }
    public double getHarga() {
        return harga;
    }
//ini adalah Notation yang menunjujjkan implementasi
// dari metode info() yang dideklarasikan di interface
    @Override
    public void info() {
        System.out.println("Mobil Bekas: " + getMerek() + " " + getModel() + " ("
    + tahun + ")");
    }
}