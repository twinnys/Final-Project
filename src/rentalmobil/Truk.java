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
    
    //menambahkan getter dan setter class Truk
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
    
    //method Info guna mencetak
    public void Info()
    {
        System.out.println(" ");
        System.out.println(" Jenis Mobil : Truk");
        System.out.println("********************************");
        System.out.println(" Nomor Polisi : " + this.no_pol);
        System.out.println(" Merk : " + this.merk);
        System.out.println(" Tahun Pembuatan : " + this.tahun_pembuatan);
        System.out.println(" Harga Sewa : " + this.harga);
        System.out.println(" Status :" + this.status );
        System.out.println("********************************");
    }
}
