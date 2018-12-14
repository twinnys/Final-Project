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
public interface Proses_Sewa {
    public void Sewa_Minibus(Penyewa p, Mini_Bus mb);
    public void Sewa_Truk(Penyewa p, Truk tr);
    public void Sewa_Sedan(Penyewa p, Sedan sd);
    public void Sewa_Pickup(Penyewa p, Pickup pk);
    public void Sewa_Jeep(Penyewa p, Jeep jp);
}
