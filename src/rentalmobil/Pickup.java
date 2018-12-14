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
public class Pickup extends Mobil implements Proses_Sewa{
    //atribut untuk class Pickup
    public int harga;
    public int kuota;
    public Pickup pick[];
    
    //konstruktor berparameter
    public Pickup(String no_pol, String merk, int tahun_pembuatan, int harga, int kuota)
    {
        this.no_pol = no_pol;
        this.merk = merk;
        this.tahun_pembuatan = tahun_pembuatan;
        this.status = status;
        this.harga = harga;
        this.kuota = kuota;
    }

    //konstruktor default
    public Pickup() {
    }
    
    //setter kuota
    public void setKuota(int kuota) {
        this.kuota = kuota;
    }
    
    //getter harga
    public int getHarga() {
        return harga;
    }

    //getter kuota
    public int getKuota() {
        return kuota;
    }

    //getter no_pol
    public String getNo_pol() {
        return no_pol;
    }

    //getter merk
    public String getMerk() {
        return merk;
    }

    //getter tahun_pembuatan
    public int getTahun_pembuatan() {
        return tahun_pembuatan;
    }

    //getter status
    public String getStatus() {
        return status;
    }
    
    //menampilkan info tentang Pickup
    public void Info()
    {
        System.out.println(" ");
        System.out.println(" Jenis Mobil : Pickup");
        System.out.println("********************************");
        System.out.println(" Nomor Polisi : " + this.no_pol);
        System.out.println(" Merk : " + this.merk);
        System.out.println(" Tahun Pembuatan : " + this.tahun_pembuatan);
        System.out.println(" Harga Sewa : " + this.harga);
        System.out.println(" Status :" + this.status );
        System.out.println("********************************");
    }
    
    @Override
    public void Sewa_Pickup(Penyewa p, Pickup pk) {
        
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
    public void Sewa_Jeep(Penyewa p, Jeep jp) {
        
    }
    
}
