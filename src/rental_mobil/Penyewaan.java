/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental_mobil;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "penyewaan", catalog = "rentalmobil", schema = "")
@NamedQueries({
    @NamedQuery(name = "Penyewaan.findAll", query = "SELECT p FROM Penyewaan p"),
    @NamedQuery(name = "Penyewaan.findByIdPenyewaan", query = "SELECT p FROM Penyewaan p WHERE p.idPenyewaan = :idPenyewaan"),
    @NamedQuery(name = "Penyewaan.findByNamaPenyewa", query = "SELECT p FROM Penyewaan p WHERE p.namaPenyewa = :namaPenyewa"),
    @NamedQuery(name = "Penyewaan.findByNoTelepon", query = "SELECT p FROM Penyewaan p WHERE p.noTelepon = :noTelepon"),
    @NamedQuery(name = "Penyewaan.findByTglSewa", query = "SELECT p FROM Penyewaan p WHERE p.tglSewa = :tglSewa"),
    @NamedQuery(name = "Penyewaan.findByIdMobil", query = "SELECT p FROM Penyewaan p WHERE p.idMobil = :idMobil"),
    @NamedQuery(name = "Penyewaan.findByLamaSewa", query = "SELECT p FROM Penyewaan p WHERE p.lamaSewa = :lamaSewa"),
    @NamedQuery(name = "Penyewaan.findByTotalBiaya", query = "SELECT p FROM Penyewaan p WHERE p.totalBiaya = :totalBiaya"),
    @NamedQuery(name = "Penyewaan.findByNamaSupir", query = "SELECT p FROM Penyewaan p WHERE p.namaSupir = :namaSupir")})
public class Penyewaan implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_penyewaan")
    private Integer idPenyewaan;
    @Basic(optional = false)
    @Column(name = "nama_penyewa")
    private String namaPenyewa;
    @Basic(optional = false)
    @Lob
    @Column(name = "alamat_penyewa")
    private String alamatPenyewa;
    @Basic(optional = false)
    @Column(name = "no_telepon")
    private String noTelepon;
    @Basic(optional = false)
    @Column(name = "tgl_sewa")
    @Temporal(TemporalType.DATE)
    private Date tglSewa;
    @Basic(optional = false)
    @Column(name = "id_mobil")
    private int idMobil;
    @Basic(optional = false)
    @Column(name = "lama_sewa")
    private int lamaSewa;
    @Basic(optional = false)
    @Column(name = "total_biaya")
    private int totalBiaya;
    @Basic(optional = false)
    @Column(name = "nama_supir")
    private String namaSupir;

    public Penyewaan() {
    }

    public Penyewaan(Integer idPenyewaan) {
        this.idPenyewaan = idPenyewaan;
    }

    public Penyewaan(Integer idPenyewaan, String namaPenyewa, String alamatPenyewa, String noTelepon, Date tglSewa, int idMobil, int lamaSewa, int totalBiaya, String namaSupir) {
        this.idPenyewaan = idPenyewaan;
        this.namaPenyewa = namaPenyewa;
        this.alamatPenyewa = alamatPenyewa;
        this.noTelepon = noTelepon;
        this.tglSewa = tglSewa;
        this.idMobil = idMobil;
        this.lamaSewa = lamaSewa;
        this.totalBiaya = totalBiaya;
        this.namaSupir = namaSupir;
    }

    public Integer getIdPenyewaan() {
        return idPenyewaan;
    }

    public void setIdPenyewaan(Integer idPenyewaan) {
        Integer oldIdPenyewaan = this.idPenyewaan;
        this.idPenyewaan = idPenyewaan;
        changeSupport.firePropertyChange("idPenyewaan", oldIdPenyewaan, idPenyewaan);
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        String oldNamaPenyewa = this.namaPenyewa;
        this.namaPenyewa = namaPenyewa;
        changeSupport.firePropertyChange("namaPenyewa", oldNamaPenyewa, namaPenyewa);
    }

    public String getAlamatPenyewa() {
        return alamatPenyewa;
    }

    public void setAlamatPenyewa(String alamatPenyewa) {
        String oldAlamatPenyewa = this.alamatPenyewa;
        this.alamatPenyewa = alamatPenyewa;
        changeSupport.firePropertyChange("alamatPenyewa", oldAlamatPenyewa, alamatPenyewa);
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        String oldNoTelepon = this.noTelepon;
        this.noTelepon = noTelepon;
        changeSupport.firePropertyChange("noTelepon", oldNoTelepon, noTelepon);
    }

    public Date getTglSewa() {
        return tglSewa;
    }

    public void setTglSewa(Date tglSewa) {
        Date oldTglSewa = this.tglSewa;
        this.tglSewa = tglSewa;
        changeSupport.firePropertyChange("tglSewa", oldTglSewa, tglSewa);
    }

    public int getIdMobil() {
        return idMobil;
    }

    public void setIdMobil(int idMobil) {
        int oldIdMobil = this.idMobil;
        this.idMobil = idMobil;
        changeSupport.firePropertyChange("idMobil", oldIdMobil, idMobil);
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        int oldLamaSewa = this.lamaSewa;
        this.lamaSewa = lamaSewa;
        changeSupport.firePropertyChange("lamaSewa", oldLamaSewa, lamaSewa);
    }

    public int getTotalBiaya() {
        return totalBiaya;
    }

    public void setTotalBiaya(int totalBiaya) {
        int oldTotalBiaya = this.totalBiaya;
        this.totalBiaya = totalBiaya;
        changeSupport.firePropertyChange("totalBiaya", oldTotalBiaya, totalBiaya);
    }

    public String getNamaSupir() {
        return namaSupir;
    }

    public void setNamaSupir(String namaSupir) {
        String oldNamaSupir = this.namaSupir;
        this.namaSupir = namaSupir;
        changeSupport.firePropertyChange("namaSupir", oldNamaSupir, namaSupir);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPenyewaan != null ? idPenyewaan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Penyewaan)) {
            return false;
        }
        Penyewaan other = (Penyewaan) object;
        if ((this.idPenyewaan == null && other.idPenyewaan != null) || (this.idPenyewaan != null && !this.idPenyewaan.equals(other.idPenyewaan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rental_mobil.Penyewaan[ idPenyewaan=" + idPenyewaan + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
