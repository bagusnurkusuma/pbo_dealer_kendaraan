package dealer_kendaraan;

public class Main {
    public static void main(String[] args) {
        MobilBaru mobilBaru = new MobilBaru("Toyota", "Yaris", "3 tahun");
        MobilBekas mobilBekas = new MobilBekas("Honda", "Jazz RS GK5", 2018, 200000000);
        Dealer dealer = new Dealer("Auto2000", mobilBaru, mobilBekas);
        dealer.info();
    }
}