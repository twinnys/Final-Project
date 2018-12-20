/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental_mobil;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "mobil", catalog = "rentalmobil", schema = "")
@NamedQueries({
    @NamedQuery(name = "Mobil.findAll", query = "SELECT m FROM Mobil m"),
    @NamedQuery(name = "Mobil.findByIdMobil", query = "SELECT m FROM Mobil m WHERE m.idMobil = :idMobil"),
    @NamedQuery(name = "Mobil.findByNoPolisi", query = "SELECT m FROM Mobil m WHERE m.noPolisi = :noPolisi"),
    @NamedQuery(name = "Mobil.findByMerkMobil", query = "SELECT m FROM Mobil m WHERE m.merkMobil = :merkMobil"),
    @NamedQuery(name = "Mobil.findByTahunPembuatan", query = "SELECT m FROM Mobil m WHERE m.tahunPembuatan = :tahunPembuatan"),
    @NamedQuery(name = "Mobil.findByHargaSewa", query = "SELECT m FROM Mobil m WHERE m.hargaSewa = :hargaSewa"),
    @NamedQuery(name = "Mobil.findByKuotaMobil", query = "SELECT m FROM Mobil m WHERE m.kuotaMobil = :kuotaMobil"),
    @NamedQuery(name = "Mobil.findByJenis", query = "SELECT m FROM Mobil m WHERE m.jenis = :jenis")})
public class Mobil implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_mobil")
    private Integer idMobil;
    @Column(name = "no_polisi")
    private String noPolisi;
    @Column(name = "merk_mobil")
    private String merkMobil;
    @Column(name = "tahun_pembuatan")
    private Integer tahunPembuatan;
    @Column(name = "harga_sewa")
    private Integer hargaSewa;
    @Column(name = "kuota_mobil")
    private Integer kuotaMobil;
    @Column(name = "jenis")
    private String jenis;

    public Mobil() {
    }

    public Mobil(Integer idMobil) {
        this.idMobil = idMobil;
    }

    Mobil(int aInt, String string, String string0, int aInt0, int aInt1, int aInt2, String string1) {
        this.idMobil = aInt;
        this.noPolisi = string;
        this.merkMobil = string0;
        this.tahunPembuatan = aInt0;
        this.hargaSewa = aInt1;
        this.kuotaMobil = aInt2;
        this.jenis = string1;
    }

    public Integer getIdMobil() {
        return idMobil;
    }

    public void setIdMobil(Integer idMobil) {
        Integer oldIdMobil = this.idMobil;
        this.idMobil = idMobil;
        changeSupport.firePropertyChange("idMobil", oldIdMobil, idMobil);
    }

    public String getNoPolisi() {
        return noPolisi;
    }

    public void setNoPolisi(String noPolisi) {
        String oldNoPolisi = this.noPolisi;
        this.noPolisi = noPolisi;
        changeSupport.firePropertyChange("noPolisi", oldNoPolisi, noPolisi);
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public void setMerkMobil(String merkMobil) {
        String oldMerkMobil = this.merkMobil;
        this.merkMobil = merkMobil;
        changeSupport.firePropertyChange("merkMobil", oldMerkMobil, merkMobil);
    }

    public Integer getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(Integer tahunPembuatan) {
        Integer oldTahunPembuatan = this.tahunPembuatan;
        this.tahunPembuatan = tahunPembuatan;
        changeSupport.firePropertyChange("tahunPembuatan", oldTahunPembuatan, tahunPembuatan);
    }

    public Integer getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(Integer hargaSewa) {
        Integer oldHargaSewa = this.hargaSewa;
        this.hargaSewa = hargaSewa;
        changeSupport.firePropertyChange("hargaSewa", oldHargaSewa, hargaSewa);
    }

    public Integer getKuotaMobil() {
        return kuotaMobil;
    }

    public void setKuotaMobil(Integer kuotaMobil) {
        Integer oldKuotaMobil = this.kuotaMobil;
        this.kuotaMobil = kuotaMobil;
        changeSupport.firePropertyChange("kuotaMobil", oldKuotaMobil, kuotaMobil);
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        String oldJenis = this.jenis;
        this.jenis = jenis;
        changeSupport.firePropertyChange("jenis", oldJenis, jenis);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMobil != null ? idMobil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mobil)) {
            return false;
        }
        Mobil other = (Mobil) object;
        if ((this.idMobil == null && other.idMobil != null) || (this.idMobil != null && !this.idMobil.equals(other.idMobil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rental_mobil.Mobil[ idMobil=" + idMobil + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
