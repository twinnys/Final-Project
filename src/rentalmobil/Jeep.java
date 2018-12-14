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
public class Jeep extends Mobil implements Proses_Sewa{
    //atribut untuk class Jeep
    public int harga;
    public int kuota;
    public Jeep jip[];

    //konstruktor berparameter
    public Jeep(String no_pol, String merk, int tahun_pembuatan, String status, int harga, int kuota) {
        this.no_pol = no_pol;
        this.merk = merk;
        this.tahun_pembuatan = tahun_pembuatan;
        this.status = status;
        this.harga = harga;
        this.kuota = kuota;
    }

    //konstruktor default
    public Jeep() {
    }
    
    

    @Override
    public void Sewa_Jeep(Penyewa p, Jeep jp) {
        
    }
    
    @Override
    public void Sewa_Minibus(Penyewa p, Mini_Bus mb) {
        
    }

    @Override
    public void Sewa_Truk(Penyewa p, Truk tr) {
        
    }

    @Override
    public void Sewa_Sedan(Penyewa p, Sedan sd) {
        
    }

    @Override
    public void Sewa_Pickup(Penyewa p, Pickup pk) {
        
    }
}
