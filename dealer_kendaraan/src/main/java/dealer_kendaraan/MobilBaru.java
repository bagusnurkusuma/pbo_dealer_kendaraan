package dealer_kendaraan;

public class MobilBaru extends Mobil implements Kendaraan {
    private String garansi;
    public MobilBaru(String merek, String model, String garansi) {
        super(merek, model);
        this.garansi = garansi;
    }
    public String getGaransi() {
        return garansi;
    }
    public void info() {
        System.out.println("Mobil Baru: " + getMerek() + " " + getModel() + "(Garansi: " + garansi + ")");
    }
}