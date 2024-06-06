public class Driver {
    public static void main(String[] args) {
        Kubus K = new Kubus(5, "Kubus");
        Lingkaran L = new Lingkaran(14, "Lingkaran");
        PersegiPanjang PP = new PersegiPanjang(8, 9, "PersegiPanjang");
        PrismaSegi3 PS3 = new PrismaSegi3(6,7,10, "PrismaSegi3");
        L.info();
        System.out.println("Luas                : " + L.hitungLuas());
        System.out.println("Keliling            : " + L.hitungKeliling());
        PP.info();
        System.out.println("Luas                    : " + PP.hitungLuas());
        System.out.println("Keliling                : " + PP.hitungKeliling());
        K.info();
        System.out.println("Luas Permukaan          : " + K.hitungLuasPermukaan());
        System.out.println("Volume                  : " + K.hitungVolume());
        PS3.info();
        System.out.println("Luas Permukaan          : " + PS3.hitungLuasPermukaan());
        System.out.println("Volume                  : " + PS3.hitungVolume());
    }
}
