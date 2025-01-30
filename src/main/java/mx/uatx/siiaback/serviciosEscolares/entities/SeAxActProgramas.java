/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sistemas10
 */
@Entity
@Table(schema = "SERESC", name = "SEAXACTPROGRAMAS")
public class SeAxActProgramas implements Serializable {

    
    private static final String GENID_SEAXACTPROGRAMAS = "GENID_SEAXACTPROGRAMAS";
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = GENID_SEAXACTPROGRAMAS, sequenceName = "SERESC.ID_ACT_PROG", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_SEAXACTPROGRAMAS)
    @Column(name = "ID_ACT_PROG")
    private Integer idActProg;
    
    @Column(name = "ACTIVIDAD", length = 100)
    private String actividad;
    
    @Column(name = "MES_ACTIVIDAD", length = 10)
    private String mesActividad;
    
    @JoinColumn(name = "CTRL_PROG_ID_CTRL_PROG", referencedColumnName = "ID_CTRL_PROG")
    @ManyToOne
    private SeAxControlProg idCtrlProg;
    
    @Column(name = "FCAUDIT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcaudit;
    
    @Column(name = "USUARIOAUDIT", length = 30)
    private String usuarioaudit;

    public SeAxActProgramas() {
    }

    public SeAxActProgramas(Integer idActProg) {
        this.idActProg = idActProg;
    }

    public Integer getIdActProg() {
        return idActProg;
    }

    public void setIdActProg(Integer idActProg) {
        this.idActProg = idActProg;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getMesActividad() {
        return mesActividad;
    }

    public void setMesActividad(String mesActividad) {
        this.mesActividad = mesActividad;
    }

    public SeAxControlProg getIdCtrlProg() {
        return idCtrlProg;
    }

    public void setIdCtrlProg(SeAxControlProg idCtrlProg) {
        this.idCtrlProg = idCtrlProg;
    }

    public Date getFcaudit() {
        return fcaudit;
    }

    public void setFcaudit(Date fcaudit) {
        this.fcaudit = fcaudit;
    }

    public String getUsuarioaudit() {
        return usuarioaudit;
    }

    public void setUsuarioaudit(String usuarioaudit) {
        this.usuarioaudit = usuarioaudit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActProg != null ? idActProg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeAxActProgramas)) {
            return false;
        }
        SeAxActProgramas other = (SeAxActProgramas) object;
        if ((this.idActProg == null && other.idActProg != null) || (this.idActProg != null && !this.idActProg.equals(other.idActProg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.uatx.siia.serviciosEscolares.modelo.Seaxactprogramas[ idActProg=" + idActProg + " ]";
    }
    
}
