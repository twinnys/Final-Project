/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental_mobil;

import java.sql.Date;


/**
 *
 * @author ASUS
 */
public interface Proses_Sewa {
    public void Sewa_Minibus(String nama_p, String alamat_p, String no_telp, Date tgl_sewa, int id_mobil, int lama_sewa, int total, String supir);
    public void Sewa_Truk(String nama_p, String alamat_p, String no_telp, Date tgl_sewa, int id_mobil, int lama_sewa, int total, String supir);
    public void Sewa_Sedan(String nama_p, String alamat_p, String no_telp, Date tgl_sewa, int id_mobil, int lama_sewa, int total, String supir);
    public void Sewa_Pickup(String nama_p, String alamat_p, String no_telp, Date tgl_sewa, int id_mobil, int lama_sewa, int total, String supir);
    public void Sewa_Jeep(String nama_p, String alamat_p, String no_telp, Date tgl_sewa, int id_mobil, int lama_sewa, int total, String supir);
}
