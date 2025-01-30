package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
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
@Table(schema = "SERESC", name = "SEAXBECASASPIRANTE")
public class SeAxBecasAspirante implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8323708279986319430L;

	private static final String GENID_BECAS_ASPIRANTES = "GENIDBECAASPIRANTE";
	
	@Id
	@Basic(optional = false)
	@Column(name = "IDBECAASPIRANTE")
	@SequenceGenerator(name = GENID_BECAS_ASPIRANTES, sequenceName = "SERESC.IDBECAASPIRANTE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_BECAS_ASPIRANTES)
	private Long lngIdBecaAspirante;

	@Column(name = "CLESTATUSESCONACYT")
	private Integer intClEstatusConacyt;

	@Column(name = "CLNIVELEDUCATIVO")
	private Integer intClNivelEducativo;

	@Column(name = "FCINICIOVIGENCIA")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fcInicioVigencia;
	
	@Column(name = "FCFINVIGENCIA")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fcFinVigencia;
	
	@Column(name = "CVU")
	private String strCvu;
	
	@Column(name = "NMBECARIO")
	private String strNumeroBecario;
	
	@Column(name = "CLESTATUSCARTALIB")
	private Integer intClEstatusCartaLiberacion;
	
	@Column(name = "ARCHIVO")
	@Lob
	private byte[] archivo;
	
	@Column(name = "INSTITUCION")
	private String strInstitucion;
	
	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "IDASPIRANTE")
	private Long lngIdAspirante;

	public Long getLngIdBecaAspirante() {
		return lngIdBecaAspirante;
	}

	public void setLngIdBecaAspirante(Long lngIdBecaAspirante) {
		this.lngIdBecaAspirante = lngIdBecaAspirante;
	}

	public Integer getIntClEstatusConacyt() {
		return intClEstatusConacyt;
	}

	public void setIntClEstatusConacyt(Integer intClEstatusConacyt) {
		this.intClEstatusConacyt = intClEstatusConacyt;
	}

	public Integer getIntClNivelEducativo() {
		return intClNivelEducativo;
	}

	public void setIntClNivelEducativo(Integer intClNivelEducativo) {
		this.intClNivelEducativo = intClNivelEducativo;
	}

	public Date getFcInicioVigencia() {
		return fcInicioVigencia;
	}

	public void setFcInicioVigencia(Date fcInicioVigencia) {
		this.fcInicioVigencia = fcInicioVigencia;
	}

	public Date getFcFinVigencia() {
		return fcFinVigencia;
	}

	public void setFcFinVigencia(Date fcFinVigencia) {
		this.fcFinVigencia = fcFinVigencia;
	}

	public String getStrCvu() {
		return strCvu;
	}

	public void setStrCvu(String strCvu) {
		this.strCvu = strCvu;
	}

	public String getStrNumeroBecario() {
		return strNumeroBecario;
	}

	public void setStrNumeroBecario(String strNumeroBecario) {
		this.strNumeroBecario = strNumeroBecario;
	}

	public Integer getIntClEstatusCartaLiberacion() {
		return intClEstatusCartaLiberacion;
	}

	public void setIntClEstatusCartaLiberacion(Integer intClEstatusCartaLiberacion) {
		this.intClEstatusCartaLiberacion = intClEstatusCartaLiberacion;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public String getStrInstitucion() {
		return strInstitucion;
	}

	public void setStrInstitucion(String strInstitucion) {
		this.strInstitucion = strInstitucion;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public Long getLngIdAspirante() {
		return lngIdAspirante;
	}

	public void setLngIdAspirante(Long lngIdAspirante) {
		this.lngIdAspirante = lngIdAspirante;
	}
}
