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
    public Jeep(String no_pol, String merk, int tahun_pembuatan, int harga, int kuota) {
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
    
    //menampilkan info tentang Jeep
    public void Info(){
        System.out.println(" ");
        System.out.println(" Jenis Mobil : Jeep");
        System.out.println("********************************");
        System.out.println(" Nomor Polisi : " + this.no_pol);
        System.out.println(" Merk : " + this.merk);
        System.out.println(" Tahun Pembuatan : " + this.tahun_pembuatan);
        System.out.println(" Harga Sewa : " + this.harga);
        System.out.println(" Status :" + this.status );
        System.out.println("********************************");
    }

    //untuk informasi sewa jeep
    @Override
    public void Sewa_Jeep(Penyewa p, Jeep jp) {
        int kembali,tot;
        tot = jp.harga * p.lama_sewa;
        kembali = p.bayar - tot;
        
        System.out.println(" ");
        System.out.println(" Nama Penyewa : " + p.nama_penyewa);
        System.out.println(" Alamat Penyewa : " + p.alamat);
        System.out.println(" Nomor Telepon : " + p.no_telp);
        System.out.println(" Tanggal Sewa : " + p.tgl_sewa);
        System.out.println(" Lama Sewa : " + p.lama_sewa);
        System.out.println("********************************");
        System.out.println(" Jenis Mobil : Jeep");
        System.out.println(" Nomor Polisi : " + jp.no_pol);
        System.out.println(" Merk : " + jp.merk);
        System.out.println(" Tahun Pembuatan : " + jp.tahun_pembuatan);
        System.out.println(" Harga Sewa : " + jp.harga);
        System.out.println("********************************");
        System.out.println(" Bayar            :Rp" + p.bayar);
        System.out.println(" Kembali          :Rp" + kembali);
        System.out.println("********************************");
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
