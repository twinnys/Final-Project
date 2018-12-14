/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmobil;

/**
 *
 * @author ASUS
 */
class Truk extends Mobil implements Proses_Sewa{

    public int harga;//atrivut harga untuk menyimpan harga
    public int kuota;//atribut kuota untuk menyimpan kuota
    public Truk mini[];//atribut Truk mini untuk menyimpan Truk

    //konstruktor pada class Truk
    public Truk() {
    }

    public Truk(String no_pol, String merk, int tahun_pembuatan, int harga, int kuota) {
        this.no_pol = no_pol;
        this.merk = merk;
        this.tahun_pembuatan = tahun_pembuatan;
        this.status = status;
        this.harga = harga;
        this.kuota = kuota;
    }
    
    
    
}
