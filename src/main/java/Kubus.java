/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Lenovo
 */
public class Kubus extends Bentuk implements BangunRuang{
    private int sisi;

    public Kubus(int sisi, String nama) {
        super(nama);
        this.sisi = sisi;
    }

    @Override
    public void info() {
        System.out.println("Nama Kubus              : "+super.getNama());
        System.out.println("Panjang Sisi            : "+this.sisi);
    }

    @Override
    public double hitungLuasPermukaan() {
        return 6*this.sisi*this.sisi;
    }

    @Override
    public double hitungVolume() {
       return this.sisi*this.sisi*this.sisi;
    }
}
