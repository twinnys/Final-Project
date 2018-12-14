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
public class Sedan extends Mobil implements Proses_Sewa{
    
    public int harga;//atribut harga untuk menyimpan nilai harga
    public int kuota;//atribut kuota untuk menyimpan nilai kuota
    public Sedan sed[];//atribut untuk menyimpan jenis-jenis mobil sedan

    //membuat konstruktor untuk class sedan
    public Sedan() {
    }

    public Sedan(String no_pol, String merk, int tahun_pembuatan, int harga, int kuota) {
        this.no_pol = no_pol;
        this.merk = merk;
        this.tahun_pembuatan = tahun_pembuatan;
        this.status = status;
        this.harga = harga;
        this.kuota = kuota;
    }
    
    
}
