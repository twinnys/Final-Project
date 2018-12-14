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

    public void setKuota(int kuota) {
        this.kuota = kuota;
    }

    public int getHarga() {
        return harga;
    }

    public int getKuota() {
        return kuota;
    }

    public String getNo_pol() {
        return no_pol;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahun_pembuatan() {
        return tahun_pembuatan;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void Sewa_Minibus(Penyewa p, Mini_Bus mb) {
    }

    @Override
    public void Sewa_Truk(Penyewa p, Truk tr) {
    }

    @Override
    public void Sewa_Pickup(Penyewa p, Pickup pk) {
    }

    @Override
    public void Sewa_Jeep(Penyewa p, Jeep jp) {
    }
    
    @Override
    public void Sewa_Sedan(Penyewa p, Sedan sd) {
        
        int kembali,tot;
        tot = sd.harga * p.lama_sewa;
        kembali = p.bayar - tot;
        
        System.out.println(" ");
        System.out.println(" Nama Penyewa : " + p.nama_penyewa);
        System.out.println(" Alamat Penyewa : " + p.alamat);
        System.out.println(" Nomor Telepon : " + p.no_telp);
        System.out.println(" Tanggal Sewa : " + p.tgl_sewa);
        System.out.println(" Lama Sewa : " + p.lama_sewa);
        System.out.println("********************************");
        System.out.println(" Jenis Mobil : Sedan");
        System.out.println(" Nomor Polisi : " + sd.no_pol);
        System.out.println(" Merk : " + sd.merk);
        System.out.println(" Tahun Pembuatan : " + sd.tahun_pembuatan);
        System.out.println(" Harga Sewa : " + sd.harga);
        System.out.println("********************************");
        System.out.println(" Bayar            :Rp" + p.bayar);
        System.out.println(" Kembali          :Rp" + kembali);
        System.out.println("********************************");
        
    }
}
