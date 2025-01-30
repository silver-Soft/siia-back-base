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
@Table(schema = "SERESC", name = "SEAXCONTROLPROG")
public class SeAxControlProg implements Serializable {

    
    private static final String GENID_SEAXCONTROLPROG = "GENID_SEAXCONTROLPROG";
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = GENID_SEAXCONTROLPROG, sequenceName = "SERESC.ID_CTRL_PROG", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_SEAXCONTROLPROG)
    @Column(name = "ID_CTRL_PROG")
    private Long idCtrlProg;
    
    @Column(name = "JUSTIFICACION")
    private String justificacion;
    
    @Column(name = "OBJ_GENERALES")
    private String objGenerales;
    
    @Column(name = "OBJ_ESPECIFICOS")
    private String objEspecificos;
    
    @Column(name = "PER_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date perInicio;
    
    @Column(name = "PER_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date perFin;
    
    @JoinColumn(name = "SOL_SS_ID_SEAXSOLSERSOC", referencedColumnName = "ID_SEAXSOLICITUDESSERSOC")
    @ManyToOne(cascade = CascadeType.ALL)
    private SeAxSolicitudesSerSoc idSeAxSolicitudesSerSoc;
    
    @Column(name = "FCAUDIT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcAudit;
    
    @Column(name = "USUARIOAUDIT")
    private String usuarioAudit;

    public SeAxControlProg() {
    }

    public SeAxControlProg(Long idCtrlProg) {
        this.idCtrlProg = idCtrlProg;
    }

    public Date getFcAudit() {
        return fcAudit;
    }

    public void setFcAudit(Date fcAudit) {
        this.fcAudit = fcAudit;
    }

    public String getUsuarioAudit() {
        return usuarioAudit;
    }

    public void setUsuarioAudit(String usuarioAudit) {
        this.usuarioAudit = usuarioAudit;
    }
    
    public Long getIdCtrlProg() {
        return idCtrlProg;
    }

    public void setIdCtrlProg(Long idCtrlProg) {
        this.idCtrlProg = idCtrlProg;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public String getObjGenerales() {
        return objGenerales;
    }

    public void setObjGenerales(String objGenerales) {
        this.objGenerales = objGenerales;
    }

    public String getObjEspecificos() {
        return objEspecificos;
    }

    public void setObjEspecificos(String objEspecificos) {
        this.objEspecificos = objEspecificos;
    }

    public Date getPerInicio() {
        return perInicio;
    }

    public void setPerInicio(Date perInicio) {
        this.perInicio = perInicio;
    }

    public Date getPerFin() {
        return perFin;
    }

    public void setPerFin(Date perFin) {
        this.perFin = perFin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCtrlProg != null ? idCtrlProg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeAxControlProg)) {
            return false;
        }
        SeAxControlProg other = (SeAxControlProg) object;
        if ((this.idCtrlProg == null && other.idCtrlProg != null) || (this.idCtrlProg != null && !this.idCtrlProg.equals(other.idCtrlProg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.uatx.siia.serviciosEscolares.modelo.SeAxControlProg[ idCtrlProg=" + idCtrlProg + " ]";
    }

    /**
     * @return the idSeAxSolicitudesSerSoc
     */
    public SeAxSolicitudesSerSoc getIdSeAxSolicitudesSerSoc() {
        return idSeAxSolicitudesSerSoc;
    }

    /**
     * @param idSeAxSolicitudesSerSoc the idSeAxSolicitudesSerSoc to set
     */
    public void setIdSeAxSolicitudesSerSoc(SeAxSolicitudesSerSoc idSeAxSolicitudesSerSoc) {
        this.idSeAxSolicitudesSerSoc = idSeAxSolicitudesSerSoc;
    }
    
}
