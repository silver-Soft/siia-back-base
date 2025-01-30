/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sistemas10
 */
@Entity
@Table(schema = "SERESC", name = "SEAXCOMPLEMENTARIOIMSS")
public class SeAxComplementarioImss implements Serializable {

    private static final String GENIDCOMPLEMENTARIOIMSS = "GENIDCOMPLEMENTARIOIMSS";
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = GENIDCOMPLEMENTARIOIMSS, sequenceName = "SERESC.IDCOMPLEMENTARIOIMSS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENIDCOMPLEMENTARIOIMSS)
    @Column(name = "IDCOMPLEMENTARIOIMSS")
    private Integer idcomplementarioimss;
    
    @Basic(optional = false)
    
    @Column(name = "IDHISTORIALACADEMICO")
    private long idhistorialacademico;
    
    @Column(name = "NMFILIACION")
    private String nmfiliacion;
    
    @Basic(optional = false)
    @Column(name = "CLESTATUS", nullable = false)
    private Integer clestatus;
    
    @Basic(optional = false)
    @Column(name = "CLESTATUSACEPTADO", nullable = false)
    private Integer clestatusaceptado;
    
    @Basic(optional = false)
    @Column(name = "NMCLINICA", nullable = false)
    private Long nmclinica;
    
    @Basic(optional = false)
    @Column(name = "IDPERIODOINICIO", nullable = false)
    private String idperiodoinicio;
    
    @Column(name = "IDPERIODOFIN")
    private String idperiodofin;
    
    @Basic(optional = false)
    @Column(name = "FCSOLICITUD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcsolicitud;
    
    @Column(name = "FCACEPTADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcaceptado;
    
    @Column(name = "FCAUDIT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcaudit;
    
    @Column(name = "USUARIOAUDIT")
    private String usuarioaudit;
    
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    
    @Column(name = "FCBAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcbaja;
    
    @Column(name = "NSS")
    private String nss;
    
    @Column(name = "DSREGISTROIMSS")
    private String dsregistroimss;

    public SeAxComplementarioImss() {
    }

    public SeAxComplementarioImss(Integer idcomplementarioimss) {
        this.idcomplementarioimss = idcomplementarioimss;
    }

    public Integer getIdcomplementarioimss() {
        return idcomplementarioimss;
    }

    public void setIdcomplementarioimss(Integer idcomplementarioimss) {
        this.idcomplementarioimss = idcomplementarioimss;
    }

    public long getIdhistorialacademico() {
        return idhistorialacademico;
    }

    public void setIdhistorialacademico(long idhistorialacademico) {
        this.idhistorialacademico = idhistorialacademico;
    }

    public String getNmfiliacion() {
        return nmfiliacion;
    }

    public void setNmfiliacion(String nmfiliacion) {
        this.nmfiliacion = nmfiliacion;
    }

    public Integer getClestatus() {
        return clestatus;
    }

    public void setClestatus(Integer clestatus) {
        this.clestatus = clestatus;
    }

    public Integer getClestatusaceptado() {
        return clestatusaceptado;
    }

    public void setClestatusaceptado(Integer clestatusaceptado) {
        this.clestatusaceptado = clestatusaceptado;
    }

    public Long getNmclinica() {
        return nmclinica;
    }

    public void setNmclinica(Long nmclinica) {
        this.nmclinica = nmclinica;
    }

    public String getIdperiodoinicio() {
        return idperiodoinicio;
    }

    public void setIdperiodoinicio(String idperiodoinicio) {
        this.idperiodoinicio = idperiodoinicio;
    }

    public String getIdperiodofin() {
        return idperiodofin;
    }

    public void setIdperiodofin(String idperiodofin) {
        this.idperiodofin = idperiodofin;
    }

    public Date getFcsolicitud() {
        return fcsolicitud;
    }

    public void setFcsolicitud(Date fcsolicitud) {
        this.fcsolicitud = fcsolicitud;
    }

    public Date getFcaceptado() {
        return fcaceptado;
    }

    public void setFcaceptado(Date fcaceptado) {
        this.fcaceptado = fcaceptado;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFcbaja() {
        return fcbaja;
    }

    public void setFcbaja(Date fcbaja) {
        this.fcbaja = fcbaja;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getDsregistroimss() {
        return dsregistroimss;
    }

    public void setDsregistroimss(String dsregistroimss) {
        this.dsregistroimss = dsregistroimss;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcomplementarioimss != null ? idcomplementarioimss.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeAxComplementarioImss)) {
            return false;
        }
        SeAxComplementarioImss other = (SeAxComplementarioImss) object;
        if ((this.idcomplementarioimss == null && other.idcomplementarioimss != null) || (this.idcomplementarioimss != null && !this.idcomplementarioimss.equals(other.idcomplementarioimss))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.uatx.siia.serviciosEscolares.modelo.Seaxcomplementarioimss[ idcomplementarioimss=" + idcomplementarioimss + " ]";
    }
    
}
