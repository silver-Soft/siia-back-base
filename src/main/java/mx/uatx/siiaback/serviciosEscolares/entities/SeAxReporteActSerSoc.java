package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SERESC", name = "SEAXREPORTEACTSERSOC")
public class SeAxReporteActSerSoc implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -8041992730729847375L;

    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "GENID_REP_ACT", sequenceName = "SERESC.ID_REP_ACT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENID_REP_ACT")
    @Column(name = "ID_REP_ACT")
    private Long lngIdReporteActividad;

    @Column(name = "HORAS_CUB")
    private Integer intHorasCubiertas;

    @Column(name = "OBJETIVOS")
    private String strObjetivos;

    @Column(name = "COMENT_PREST")
    private String strComentarioPrestador;

    @Column(name = "COMENT_JEFE")
    private String strComentarioJefe;

    @Column(name = "ESTATUS")
    private String strEstatus;

    @Lob
    @Column(name = "DOCUMENTO", nullable = true)
    private byte[] archivoDocumento;

    @Column(name = "SOL_SS_ID_SEAXSOLSERSOC")
    private Long lngIdSolicitudSerSoc;

    @Column(name = "NUM_REPORTE")
    private Integer intNumReporte;

    @Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;

    @Column(name = "FC_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcInicio;

    @Column(name = "FC_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcFin;

    @Column(name = "FCAUDIT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcAudit;

    @Column(name = "MOTIVORECHAZO")
    private String strMotivoRechazo;

    public Long getLngIdReporteActividad() {
        return lngIdReporteActividad;
    }

    public void setLngIdReporteActividad(Long lngIdReporteActividad) {
        this.lngIdReporteActividad = lngIdReporteActividad;
    }

    public Integer getIntHorasCubiertas() {
        return intHorasCubiertas;
    }

    public void setIntHorasCubiertas(Integer intHorasCubiertas) {
        this.intHorasCubiertas = intHorasCubiertas;
    }

    public String getStrObjetivos() {
        return strObjetivos;
    }

    public void setStrObjetivos(String strObjetivos) {
        this.strObjetivos = strObjetivos;
    }

    public String getStrComentarioPrestador() {
        return strComentarioPrestador;
    }

    public void setStrComentarioPrestador(String strComentarioPrestador) {
        this.strComentarioPrestador = strComentarioPrestador;
    }

    public String getStrComentarioJefe() {
        return strComentarioJefe;
    }

    public void setStrComentarioJefe(String strComentarioJefe) {
        this.strComentarioJefe = strComentarioJefe;
    }

    public String getStrEstatus() {
        return strEstatus;
    }

    public void setStrEstatus(String strEstatus) {
        this.strEstatus = strEstatus;
    }

    public byte[] getArchivoDocumento() {
        return archivoDocumento;
    }

    public void setArchivoDocumento(byte[] archivoDocumento) {
        this.archivoDocumento = archivoDocumento;
    }

    public Long getLngIdSolicitudSerSoc() {
        return lngIdSolicitudSerSoc;
    }

    public void setLngIdSolicitudSerSoc(Long lngIdSolicitudSerSoc) {
        this.lngIdSolicitudSerSoc = lngIdSolicitudSerSoc;
    }

    public Integer getIntNumReporte() {
        return intNumReporte;
    }

    public void setIntNumReporte(Integer intNumReporte) {
        this.intNumReporte = intNumReporte;
    }

    public Date getFcInicio() {
        return fcInicio;
    }

    public void setFcInicio(Date fcInicio) {
        this.fcInicio = fcInicio;
    }

    public Date getFcFin() {
        return fcFin;
    }

    public void setFcFin(Date fcFin) {
        this.fcFin = fcFin;
    }

    public Date getFcAudit() {
        return fcAudit;
    }

    public void setFcAudit(Date fcAudit) {
        this.fcAudit = fcAudit;
    }

    public String getStrUsuarioAudit() {
        return strUsuarioAudit;
    }

    public void setStrUsuarioAudit(String strUsuarioAudit) {
        this.strUsuarioAudit = strUsuarioAudit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(archivoDocumento);
        result = prime * result + ((fcAudit == null) ? 0 : fcAudit.hashCode());
        result = prime * result + ((fcFin == null) ? 0 : fcFin.hashCode());
        result = prime * result + ((fcInicio == null) ? 0 : fcInicio.hashCode());
        result = prime * result + ((intHorasCubiertas == null) ? 0 : intHorasCubiertas.hashCode());
        result = prime * result + ((intNumReporte == null) ? 0 : intNumReporte.hashCode());
        result = prime * result + ((lngIdReporteActividad == null) ? 0 : lngIdReporteActividad.hashCode());
        result = prime * result + ((lngIdSolicitudSerSoc == null) ? 0 : lngIdSolicitudSerSoc.hashCode());
        result = prime * result + ((strComentarioJefe == null) ? 0 : strComentarioJefe.hashCode());
        result = prime * result + ((strComentarioPrestador == null) ? 0 : strComentarioPrestador.hashCode());
        result = prime * result + ((strEstatus == null) ? 0 : strEstatus.hashCode());
        result = prime * result + ((strObjetivos == null) ? 0 : strObjetivos.hashCode());
        result = prime * result + ((strUsuarioAudit == null) ? 0 : strUsuarioAudit.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof SeAxReporteActSerSoc)) {
            return false;
        }
        SeAxReporteActSerSoc other = (SeAxReporteActSerSoc) obj;
        if (!Arrays.equals(archivoDocumento, other.archivoDocumento)) {
            return false;
        }
        if (fcAudit == null) {
            if (other.fcAudit != null) {
                return false;
            }
        } else if (!fcAudit.equals(other.fcAudit)) {
            return false;
        }
        if (fcFin == null) {
            if (other.fcFin != null) {
                return false;
            }
        } else if (!fcFin.equals(other.fcFin)) {
            return false;
        }
        if (fcInicio == null) {
            if (other.fcInicio != null) {
                return false;
            }
        } else if (!fcInicio.equals(other.fcInicio)) {
            return false;
        }
        if (intHorasCubiertas == null) {
            if (other.intHorasCubiertas != null) {
                return false;
            }
        } else if (!intHorasCubiertas.equals(other.intHorasCubiertas)) {
            return false;
        }
        if (intNumReporte == null) {
            if (other.intNumReporte != null) {
                return false;
            }
        } else if (!intNumReporte.equals(other.intNumReporte)) {
            return false;
        }
        if (lngIdReporteActividad == null) {
            if (other.lngIdReporteActividad != null) {
                return false;
            }
        } else if (!lngIdReporteActividad.equals(other.lngIdReporteActividad)) {
            return false;
        }
        if (lngIdSolicitudSerSoc == null) {
            if (other.lngIdSolicitudSerSoc != null) {
                return false;
            }
        } else if (!lngIdSolicitudSerSoc.equals(other.lngIdSolicitudSerSoc)) {
            return false;
        }
        if (strComentarioJefe == null) {
            if (other.strComentarioJefe != null) {
                return false;
            }
        } else if (!strComentarioJefe.equals(other.strComentarioJefe)) {
            return false;
        }
        if (strComentarioPrestador == null) {
            if (other.strComentarioPrestador != null) {
                return false;
            }
        } else if (!strComentarioPrestador.equals(other.strComentarioPrestador)) {
            return false;
        }
        if (strEstatus == null) {
            if (other.strEstatus != null) {
                return false;
            }
        } else if (!strEstatus.equals(other.strEstatus)) {
            return false;
        }
        if (strObjetivos == null) {
            if (other.strObjetivos != null) {
                return false;
            }
        } else if (!strObjetivos.equals(other.strObjetivos)) {
            return false;
        }
        if (strUsuarioAudit == null) {
            if (other.strUsuarioAudit != null) {
                return false;
            }
        } else if (!strUsuarioAudit.equals(other.strUsuarioAudit)) {
            return false;
        }
        return true;
    }

    public String getStrMotivoRechazo() {
        return strMotivoRechazo;
    }

    public void setStrMotivoRechazo(String strMotivoRechazo) {
        this.strMotivoRechazo = strMotivoRechazo;
    }

}
