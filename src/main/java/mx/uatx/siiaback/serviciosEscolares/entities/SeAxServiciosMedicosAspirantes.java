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
@Table(schema = "SERESC", name = "SEAXSERVICIOSMEDICOSASPIRANTE")
public class SeAxServiciosMedicosAspirantes implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4022869410587505161L;

	private static final String GENID_SERVICIOS_MEDICOS_ASPIRANTES = "GENIDSERVICIOMEDICOASPIRANTE";

	@Id
	@Basic(optional = false)
	@Column(name = "IDSERVICIOMEDICOASPIRANTE")
	@SequenceGenerator(name = GENID_SERVICIOS_MEDICOS_ASPIRANTES, sequenceName = "SERESC.IDSERVICIOMEDICOASPIRANTE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_SERVICIOS_MEDICOS_ASPIRANTES)
	private Long lngIdServicioMedicoAspirante;

	@Column(name = "TIPOSEGURO")
	private String strTipoSeguro;

	@Column(name = "ASEGURADORA")
	private String strAseguradora;

	@Column(name = "NMPOLIZA")
	private String strNumeroPoliza;

	@Column(name = "DSCLINICA")
	private String strNombreClinica;

	@Column(name = "FCINICIOVIGENCIA")
	@Temporal(TemporalType.DATE)
	private Date fcInicioVigencia;

	@Column(name = "FCFINVIGENCIA")
	@Temporal(TemporalType.DATE)
	private Date fcFinVigencia;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "IDASPIRANTE")
	private Long lngIdAspirante;

	public Long getLngIdServicioMedicoAspirante() {
		return lngIdServicioMedicoAspirante;
	}

	public void setLngIdServicioMedicoAspirante(Long lngIdServicioMedicoAspirante) {
		this.lngIdServicioMedicoAspirante = lngIdServicioMedicoAspirante;
	}

	public String getStrTipoSeguro() {
		return strTipoSeguro;
	}

	public void setStrTipoSeguro(String strTipoSeguro) {
		this.strTipoSeguro = strTipoSeguro;
	}

	public String getStrAseguradora() {
		return strAseguradora;
	}

	public void setStrAseguradora(String strAseguradora) {
		this.strAseguradora = strAseguradora;
	}

	public String getStrNumeroPoliza() {
		return strNumeroPoliza;
	}

	public void setStrNumeroPoliza(String strNumeroPoliza) {
		this.strNumeroPoliza = strNumeroPoliza;
	}

	public String getStrNombreClinica() {
		return strNombreClinica;
	}

	public void setStrNombreClinica(String strNombreClinica) {
		this.strNombreClinica = strNombreClinica;
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
