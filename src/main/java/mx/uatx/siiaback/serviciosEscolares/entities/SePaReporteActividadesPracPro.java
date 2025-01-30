package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SePaReporteActividadesPracPro implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5419869563691462509L;

	@Id
	@Column(name = "IDREPACTPRACPRO")
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

	@Column(name = "NUM_REPORTE")
	private Integer intNumReporte;

	@Column(name = "FC_INICIO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcInicio;

	@Column(name = "FC_FIN")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcFin;
        
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

    public String getStrMotivoRechazo() {
        return strMotivoRechazo;
    }

    public void setStrMotivoRechazo(String strMotivoRechazo) {
        this.strMotivoRechazo = strMotivoRechazo;
    }
        
}
