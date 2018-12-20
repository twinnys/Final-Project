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
@Table(name = "pengembalian", catalog = "rentalmobil", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pengembalian.findAll", query = "SELECT p FROM Pengembalian p"),
    @NamedQuery(name = "Pengembalian.findByIdPengembalian", query = "SELECT p FROM Pengembalian p WHERE p.idPengembalian = :idPengembalian"),
    @NamedQuery(name = "Pengembalian.findByIdPenyewaan", query = "SELECT p FROM Pengembalian p WHERE p.idPenyewaan = :idPenyewaan"),
    @NamedQuery(name = "Pengembalian.findByTglKembali", query = "SELECT p FROM Pengembalian p WHERE p.tglKembali = :tglKembali"),
    @NamedQuery(name = "Pengembalian.findByDenda", query = "SELECT p FROM Pengembalian p WHERE p.denda = :denda")})
public class Pengembalian implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pengembalian")
    private Integer idPengembalian;
    @Basic(optional = false)
    @Column(name = "id_penyewaan")
    private int idPenyewaan;
    @Basic(optional = false)
    @Column(name = "tgl_kembali")
    @Temporal(TemporalType.DATE)
    private Date tglKembali;
    @Basic(optional = false)
    @Column(name = "denda")
    private int denda;

    public Pengembalian() {
    }

    public Pengembalian(Integer idPengembalian) {
        this.idPengembalian = idPengembalian;
    }

    public Pengembalian(Integer idPengembalian, int idPenyewaan, Date tglKembali, int denda) {
        this.idPengembalian = idPengembalian;
        this.idPenyewaan = idPenyewaan;
        this.tglKembali = tglKembali;
        this.denda = denda;
    }

    public Integer getIdPengembalian() {
        return idPengembalian;
    }

    public void setIdPengembalian(Integer idPengembalian) {
        Integer oldIdPengembalian = this.idPengembalian;
        this.idPengembalian = idPengembalian;
        changeSupport.firePropertyChange("idPengembalian", oldIdPengembalian, idPengembalian);
    }

    public int getIdPenyewaan() {
        return idPenyewaan;
    }

    public void setIdPenyewaan(int idPenyewaan) {
        int oldIdPenyewaan = this.idPenyewaan;
        this.idPenyewaan = idPenyewaan;
        changeSupport.firePropertyChange("idPenyewaan", oldIdPenyewaan, idPenyewaan);
    }

    public Date getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali) {
        Date oldTglKembali = this.tglKembali;
        this.tglKembali = tglKembali;
        changeSupport.firePropertyChange("tglKembali", oldTglKembali, tglKembali);
    }

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        int oldDenda = this.denda;
        this.denda = denda;
        changeSupport.firePropertyChange("denda", oldDenda, denda);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPengembalian != null ? idPengembalian.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pengembalian)) {
            return false;
        }
        Pengembalian other = (Pengembalian) object;
        if ((this.idPengembalian == null && other.idPengembalian != null) || (this.idPengembalian != null && !this.idPengembalian.equals(other.idPengembalian))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rental_mobil.Pengembalian[ idPengembalian=" + idPengembalian + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
