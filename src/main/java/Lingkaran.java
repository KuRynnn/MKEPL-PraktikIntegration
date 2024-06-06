/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Lenovo
 */
public class Lingkaran extends Bentuk implements BangunDatar{
    private int jari_jari;

    public Lingkaran(int jari_jari, String nama) {
        super(nama);
        this.jari_jari = jari_jari;
    }
    
    
    @Override
    public void info() {
        System.out.println("Nama Lingkaran      : "+super.getNama());
        System.out.println("Panjang jari-jari   : "+this.jari_jari);
    }

    @Override
    public double hitungKeliling() {
        return 3.14*2*this.jari_jari;
    }

    @Override
    public double hitungLuas() {
        return 3.14*this.jari_jari*this.jari_jari;
    }
}
