/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental_mobil;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Sedan extends Mobil implements Proses_Sewa {
    
    public int harga;
    public int kuota;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    Sedan() {
        
    }
    
    @Override
    public void Sewa_Sedan(String nama_p, String alamat_p, String no_telp, Date tgl_sewa, int id_mobil, int lama_sewa, int total, String supir) {
        //Insert data penyewaan ke database
        try{
            String sql = "INSERT INTO penyewaan (nama_penyewa, alamat_penyewa, no_telepon, tgl_sewa, id_mobil, lama_sewa, total_biaya, nama_supir)"
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/rentalmobil","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1,nama_p);
            pst.setString(2,alamat_p);
            pst.setString(3,no_telp);
            pst.setDate(4, tgl_sewa);
            pst.setInt(5,id_mobil);
            pst.setInt(6,lama_sewa);
            pst.setInt(7,total);
            pst.setString(8,supir);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan");
        }
        catch(SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @Override
    public void Sewa_Minibus(String nama_p, String alamat_p, String no_telp, Date tgl_sewa, int id_mobil, int lama_sewa, int total, String supir) {
        
    }

    @Override
    public void Sewa_Truk(String nama_p, String alamat_p, String no_telp, Date tgl_sewa, int id_mobil, int lama_sewa, int total, String supir) {
        
    }

    @Override
    public void Sewa_Pickup(String nama_p, String alamat_p, String no_telp, Date tgl_sewa, int id_mobil, int lama_sewa, int total, String supir) {
        
    }

    @Override
    public void Sewa_Jeep(String nama_p, String alamat_p, String no_telp, Date tgl_sewa, int id_mobil, int lama_sewa, int total, String supir) {
        
    }
    
}
