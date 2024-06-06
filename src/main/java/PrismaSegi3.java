/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Lenovo
 */
public class PrismaSegi3 extends Bentuk implements BangunRuang{
    private int alas;
    private int tinggi;
    private int tinggi_prisma;

    public PrismaSegi3(int alas, int tinggi, int tinggi_prisma, String nama) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
        this.tinggi_prisma = tinggi_prisma;
    }

    @Override
    public void info() {
        System.out.println("Nama Prisma Segitiga    : "+super.getNama());
        System.out.println("Alas Segitiga           : "+this.alas);
        System.out.println("Tinggi Segitiga         : "+this.tinggi);
        System.out.println("Tinggi Prisma           : "+this.tinggi_prisma);
    }

    @Override
    public double hitungLuasPermukaan() {
        return (0.5*this.alas*this.tinggi) + 2 * (0.5 * this.alas *this.tinggi_prisma);
    }

    @Override
    public double hitungVolume() {
        return 0.5*this.alas*this.tinggi*this.tinggi_prisma;
    }
}
