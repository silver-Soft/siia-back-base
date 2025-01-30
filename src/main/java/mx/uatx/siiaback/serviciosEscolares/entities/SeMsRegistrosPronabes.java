

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

@Entity
@Table(schema = "SERESC", name = "SEMSREGISTROSPRONABES")
public class SeMsRegistrosPronabes implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @SequenceGenerator(name = "generadorRegistroPronabes", sequenceName = "SERESC.IDREGISTROPRONABES", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generadorRegistroPronabes")
    @Column(name = "IDREGISTROPRONABES")
    private Integer idregistropronabes;
    
    @Column(name = "IDHISTORIALACADEMICO")
    private Long idhistorialacademico;
    
    @Column(name = "TIENEFAMILIAROPORTUNIDADES")
    private Short tienefamiliaroportunidades;
    
    @Column(name = "FOLIOFAMILIAROPORTUNIDADES", length = 30)
    private String foliofamiliaroportunidades;
    
    @Basic(optional = false)
    @Column(name = "CLTIPOSOLICITUDBECA", nullable = false)
    private String cltiposolicitudbeca;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MNINGRESOFAMILIAR")
    private Long mningresofamiliar;
    
    @Column(name = "NMINTEGRANTES")
    private Short nmintegrantes;
    
    @Basic(optional = false)
    @Column(name = "FCSOLICITUD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcsolicitud;
    
    @Basic(optional = false)
    @Column(name = "CLSTSOLICITUD", nullable = false)
    private Integer clstsolicitud;
    
    @Basic(optional = false)
    @Column(name = "IDPERIODO", nullable = false)
    private String idperiodo;
    
    @Column(name = "FCAUDIT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcaudit;
    
    @Basic(optional = false)
    @Column(name = "USUARIOAUDIT", nullable = false)
    private String usuarioaudit;
    
    @Column(name = "CLTIPOBECAPRONABES")
    private Short cltipobecapronabes;
    
    @Column(name = "NBPROYECTOTITULACION", length = 500)
    private String nbproyectotitulacion;
    
    @Column(name = "NBPOLIZASEGUROGASTOSMEDICOS", length = 100)
    private String nbpolizasegurogastosmedicos;
    
    @Column(name = "NMPOLIZASEGUROGASTOSMEDICOS", length = 20)
    private String nmpolizasegurogastosmedicos;
    
    @Column(name = "NBUNIVERSIDADDESTINO", length = 300)
    private String nbuniversidaddestino;
    
    @Column(name = "FCINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcinicio;
    
    @Column(name = "FCTERMINO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fctermino;
    
    @Column(name = "NMPASAPORTE", length = 30)
    private String nmpasaporte;
    
    @Column(name = "NMMESEGRESO")
    private Short nmmesegreso;
    
    @Column(name = "NMANIOEGRESO")
    private Short nmanioegreso;
    
    @Column(name = "NBDEPENDENCIASERVICIOSOCIAL", length = 300)
    private String nbdependenciaserviciosocial;
    
    @Column(name = "DSNIVELINGLES", length = 100)
    private String dsnivelingles;
    
    @Column(name = "IDHISTORIALLABORAL")
    private Long idhistoriallaboral;
    
    @Column(name = "CLSTOTORGADA")
    private Short clstotorgada;
    
    @Column(name = "NBPROGRAMASERVICIOSOCIAL", length = 300)
    private String nbprogramaserviciosocial;
    
    @Column(name = "NMHORASSERVICIOSOCIAL")
    private Short nmhorasserviciosocial;
    
    @Column(name = "NBASIGNATURATITULACION", length = 150)
    private String nbasignaturatitulacion;
    
    @Column(name = "METODOTITULACION")
    private Short metodotitulacion;
    
    @Column(name = "CLSTTITPOSPUESTAEMBARAZO")
    private Short clsttitpospuestaembarazo;
    
    @Column(name = "FCAUTORIZACIONTITULACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcautorizaciontitulacion;
    
    @Column(name = "FCOBTENCIONTITULACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcobtenciontitulacion;
    
    @Column(name = "MONTOTRANSPORTE")
    private Integer montotransporte;
    
    @Column(name = "TIPOTRANSPORTE", length = 50)
    private String tipotransporte;
    
    @Column(name = "FOLIOSUBES")
    private String strFolioSubes;

    public SeMsRegistrosPronabes() {
    }

    public SeMsRegistrosPronabes(Integer idregistropronabes) {
        this.idregistropronabes = idregistropronabes;
    }

    public SeMsRegistrosPronabes(Integer idregistropronabes, String cltiposolicitudbeca, Date fcsolicitud, Integer clstsolicitud, String idperiodo, String usuarioaudit) {
        this.idregistropronabes = idregistropronabes;
        this.cltiposolicitudbeca = cltiposolicitudbeca;
        this.fcsolicitud = fcsolicitud;
        this.clstsolicitud = clstsolicitud;
        this.idperiodo = idperiodo;
        this.usuarioaudit = usuarioaudit;
    }

    public Integer getIdregistropronabes() {
        return idregistropronabes;
    }

    public void setIdregistropronabes(Integer idregistropronabes) {
        this.idregistropronabes = idregistropronabes;
    }

    public Long getIdhistorialacademico() {
        return idhistorialacademico;
    }

    public void setIdhistorialacademico(Long idhistorialacademico) {
        this.idhistorialacademico = idhistorialacademico;
    }

    public Short getTienefamiliaroportunidades() {
        return tienefamiliaroportunidades;
    }

    public void setTienefamiliaroportunidades(Short tienefamiliaroportunidades) {
        this.tienefamiliaroportunidades = tienefamiliaroportunidades;
    }

    public String getFoliofamiliaroportunidades() {
        return foliofamiliaroportunidades;
    }

    public void setFoliofamiliaroportunidades(String foliofamiliaroportunidades) {
        this.foliofamiliaroportunidades = foliofamiliaroportunidades;
    }

    public String getCltiposolicitudbeca() {
        return cltiposolicitudbeca;
    }

    public void setCltiposolicitudbeca(String cltiposolicitudbeca) {
        this.cltiposolicitudbeca = cltiposolicitudbeca;
    }

    public Long getMningresofamiliar() {
        return mningresofamiliar;
    }

    public void setMningresofamiliar(Long mningresofamiliar) {
        this.mningresofamiliar = mningresofamiliar;
    }

    public Short getNmintegrantes() {
        return nmintegrantes;
    }

    public void setNmintegrantes(Short nmintegrantes) {
        this.nmintegrantes = nmintegrantes;
    }

    public Date getFcsolicitud() {
        return fcsolicitud;
    }

    public void setFcsolicitud(Date fcsolicitud) {
        this.fcsolicitud = fcsolicitud;
    }

      
	public Integer getClstsolicitud() {
		return clstsolicitud;
	}

	public void setClstsolicitud(Integer clstsolicitud) {
		this.clstsolicitud = clstsolicitud;
	}

	public String getIdperiodo() {
        return idperiodo;
    }

    public void setIdperiodo(String idperiodo) {
        this.idperiodo = idperiodo;
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

    public Short getCltipobecapronabes() {
        return cltipobecapronabes;
    }

    public void setCltipobecapronabes(Short cltipobecapronabes) {
        this.cltipobecapronabes = cltipobecapronabes;
    }

    public String getNbproyectotitulacion() {
        return nbproyectotitulacion;
    }

    public void setNbproyectotitulacion(String nbproyectotitulacion) {
        this.nbproyectotitulacion = nbproyectotitulacion;
    }

    public String getNbpolizasegurogastosmedicos() {
        return nbpolizasegurogastosmedicos;
    }

    public void setNbpolizasegurogastosmedicos(String nbpolizasegurogastosmedicos) {
        this.nbpolizasegurogastosmedicos = nbpolizasegurogastosmedicos;
    }

    public String getNmpolizasegurogastosmedicos() {
        return nmpolizasegurogastosmedicos;
    }

    public void setNmpolizasegurogastosmedicos(String nmpolizasegurogastosmedicos) {
        this.nmpolizasegurogastosmedicos = nmpolizasegurogastosmedicos;
    }

    public String getNbuniversidaddestino() {
        return nbuniversidaddestino;
    }

    public void setNbuniversidaddestino(String nbuniversidaddestino) {
        this.nbuniversidaddestino = nbuniversidaddestino;
    }

    public Date getFcinicio() {
        return fcinicio;
    }

    public void setFcinicio(Date fcinicio) {
        this.fcinicio = fcinicio;
    }

    public Date getFctermino() {
        return fctermino;
    }

    public void setFctermino(Date fctermino) {
        this.fctermino = fctermino;
    }

    public String getNmpasaporte() {
        return nmpasaporte;
    }

    public void setNmpasaporte(String nmpasaporte) {
        this.nmpasaporte = nmpasaporte;
    }

    public Short getNmmesegreso() {
        return nmmesegreso;
    }

    public void setNmmesegreso(Short nmmesegreso) {
        this.nmmesegreso = nmmesegreso;
    }

    public Short getNmanioegreso() {
        return nmanioegreso;
    }

    public void setNmanioegreso(Short nmanioegreso) {
        this.nmanioegreso = nmanioegreso;
    }

    public String getNbdependenciaserviciosocial() {
        return nbdependenciaserviciosocial;
    }

    public void setNbdependenciaserviciosocial(String nbdependenciaserviciosocial) {
        this.nbdependenciaserviciosocial = nbdependenciaserviciosocial;
    }

    public String getDsnivelingles() {
        return dsnivelingles;
    }

    public void setDsnivelingles(String dsnivelingles) {
        this.dsnivelingles = dsnivelingles;
    }

    public Long getIdhistoriallaboral() {
        return idhistoriallaboral;
    }

    public void setIdhistoriallaboral(Long idhistoriallaboral) {
        this.idhistoriallaboral = idhistoriallaboral;
    }

    public Short getClstotorgada() {
        return clstotorgada;
    }

    public void setClstotorgada(Short clstotorgada) {
        this.clstotorgada = clstotorgada;
    }

    public String getNbprogramaserviciosocial() {
        return nbprogramaserviciosocial;
    }

    public void setNbprogramaserviciosocial(String nbprogramaserviciosocial) {
        this.nbprogramaserviciosocial = nbprogramaserviciosocial;
    }

    public Short getNmhorasserviciosocial() {
        return nmhorasserviciosocial;
    }

    public void setNmhorasserviciosocial(Short nmhorasserviciosocial) {
        this.nmhorasserviciosocial = nmhorasserviciosocial;
    }

    public String getNbasignaturatitulacion() {
        return nbasignaturatitulacion;
    }

    public void setNbasignaturatitulacion(String nbasignaturatitulacion) {
        this.nbasignaturatitulacion = nbasignaturatitulacion;
    }

    public Short getMetodotitulacion() {
        return metodotitulacion;
    }

    public void setMetodotitulacion(Short metodotitulacion) {
        this.metodotitulacion = metodotitulacion;
    }

    public Short getClsttitpospuestaembarazo() {
        return clsttitpospuestaembarazo;
    }

    public void setClsttitpospuestaembarazo(Short clsttitpospuestaembarazo) {
        this.clsttitpospuestaembarazo = clsttitpospuestaembarazo;
    }

    public Date getFcautorizaciontitulacion() {
        return fcautorizaciontitulacion;
    }

    public void setFcautorizaciontitulacion(Date fcautorizaciontitulacion) {
        this.fcautorizaciontitulacion = fcautorizaciontitulacion;
    }

    public Date getFcobtenciontitulacion() {
        return fcobtenciontitulacion;
    }

    public void setFcobtenciontitulacion(Date fcobtenciontitulacion) {
        this.fcobtenciontitulacion = fcobtenciontitulacion;
    }

    public Integer getMontotransporte() {
        return montotransporte;
    }

    public void setMontotransporte(Integer montotransporte) {
        this.montotransporte = montotransporte;
    }

    public String getTipotransporte() {
        return tipotransporte;
    }

    public void setTipotransporte(String tipotransporte) {
        this.tipotransporte = tipotransporte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idregistropronabes != null ? idregistropronabes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeMsRegistrosPronabes)) {
            return false;
        }
        SeMsRegistrosPronabes other = (SeMsRegistrosPronabes) object;
        if ((this.idregistropronabes == null && other.idregistropronabes != null) || (this.idregistropronabes != null && !this.idregistropronabes.equals(other.idregistropronabes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.uatx.siia.serviciosEscolares.modelo.Semsregistrospronabes[ idregistropronabes=" + idregistropronabes + " ]";
    }

	public String getStrFolioSubes() {
		return strFolioSubes;
	}

	public void setStrFolioSubes(String strFolioSubes) {
		this.strFolioSubes = strFolioSubes;
	}

    
}
