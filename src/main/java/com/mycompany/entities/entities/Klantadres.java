/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author wendy
 */
@Entity
@Table(name = "klantadres")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Klantadres.findAll", query = "SELECT k FROM Klantadres k")
    , @NamedQuery(name = "Klantadres.findByKlantadresId", query = "SELECT k FROM Klantadres k WHERE k.klantadresId = :klantadresId")
    , @NamedQuery(name = "Klantadres.findByCreatedBy", query = "SELECT k FROM Klantadres k WHERE k.createdBy = :createdBy")
    , @NamedQuery(name = "Klantadres.findByCreatedDate", query = "SELECT k FROM Klantadres k WHERE k.createdDate = :createdDate")})
public class Klantadres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "KLANTADRES_ID")
    private Long klantadresId;
    @Size(max = 255)
    @Column(name = "createdBy")
    private String createdBy;
    @Column(name = "createdDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @JoinColumn(name = "ADRES_ID", referencedColumnName = "ADRES_ID")
    @ManyToOne
    private Adres adresId;
    @JoinColumn(name = "KLANT_ID", referencedColumnName = "KLANT_ID")
    @ManyToOne
    private Klant klantId;

    public Klantadres() {
    }

    public Klantadres(Long klantadresId) {
        this.klantadresId = klantadresId;
    }

    public Long getKlantadresId() {
        return klantadresId;
    }

    public void setKlantadresId(Long klantadresId) {
        this.klantadresId = klantadresId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Adres getAdresId() {
        return adresId;
    }

    public void setAdresId(Adres adresId) {
        this.adresId = adresId;
    }

    public Klant getKlantId() {
        return klantId;
    }

    public void setKlantId(Klant klantId) {
        this.klantId = klantId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (klantadresId != null ? klantadresId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Klantadres)) {
            return false;
        }
        Klantadres other = (Klantadres) object;
        if ((this.klantadresId == null && other.klantadresId != null) || (this.klantadresId != null && !this.klantadresId.equals(other.klantadresId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.proberen.Klantadres[ klantadresId=" + klantadresId + " ]";
    }
    
}
