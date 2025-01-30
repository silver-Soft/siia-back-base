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

@Entity
@Table(schema = "SERESC", name = "SEAXOFERTASDOCENTES")
public class SeAxOfertasDocentes implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1687885205031763834L;

	private static final String GENIDOFERTADOCENTE = "GENIDOFERTADOCENTE";

	@Id
	@Basic(optional = false)
	@Column(name = "IDOFERTADOCENTE")
	@SequenceGenerator(name = GENIDOFERTADOCENTE, sequenceName = "SERESC.IDOFERTADOCENTE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENIDOFERTADOCENTE)
	private Integer intIdOfertaDocente;

	@Column(name = "CLTIPODOCENCIA")
	private String strClTipoDocencia;

	@Column(name = "IDOFERTA")
	private Long lngIdOferta;

	@Column(name = "IDPLANTILLAEMPLEADO")
	private Long lngIdPlantillaEmpleado;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioLog;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();
	
	

	public Integer getIntIdOfertaDocente() {
		return intIdOfertaDocente;
	}

	public void setIntIdOfertaDocente(Integer intIdOfertaDocente) {
		this.intIdOfertaDocente = intIdOfertaDocente;
	}

	public String getStrClTipoDocencia() {
		return strClTipoDocencia;
	}

	public void setStrClTipoDocencia(String strClTipoDocencia) {
		this.strClTipoDocencia = strClTipoDocencia;
	}

	public Long getLngIdOferta() {
		return lngIdOferta;
	}

	public void setLngIdOferta(Long lngIdOferta) {
		this.lngIdOferta = lngIdOferta;
	}

	public Long getLngIdPlantillaEmpleado() {
		return lngIdPlantillaEmpleado;
	}

	public void setLngIdPlantillaEmpleado(Long lngIdPlantillaEmpleado) {
		this.lngIdPlantillaEmpleado = lngIdPlantillaEmpleado;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioLog() {
		return strUsuarioLog;
	}

	public void setStrUsuarioLog(String strUsuarioLog) {
		this.strUsuarioLog = strUsuarioLog;
	}

	public static String getGenidofertadocente() {
		return GENIDOFERTADOCENTE;
	}
	
	

}
