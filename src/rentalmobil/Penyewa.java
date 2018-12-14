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
public class Penyewa {
    public String nama_penyewa;
    public String alamat;
    public String no_telp;
    public String tgl_sewa;
    public int lama_sewa;
    public int bayar;

    public Penyewa(String nama_penyewa, String alamat, String no_telp, String tgl_sewa, int lama_sewa, int bayar) {
        this.nama_penyewa = nama_penyewa;
        this.alamat = alamat;
        this.no_telp = no_telp;
        this.tgl_sewa = tgl_sewa;
        this.lama_sewa = lama_sewa;
        this.bayar = bayar;
    }
}
