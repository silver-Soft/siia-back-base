package mx.uatx.siiaback.serviciosUniversitarios.entities;

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
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "SIIUAT", name = "SIAXGRUPOSPROGRAMASEDUCATIVOS")
public class SiAxGruposProgramasEducativos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6891994073864288047L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDGRUPOPROGRAMAED", sequenceName = "SIIUAT.IDGRUPOPROGRAMAED", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDGRUPOPROGRAMAED")
	@NotNull
	@Column(name = "IDGRUPOPROGRAMAEDUCATIVO")
	private Integer intIdGrupoProgramaEducativo;
	
	@Column(name = "IDGRUPOPROGRAMA")
	private Integer intFolio;
	
	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Integer getIntIdGrupoProgramaEducativo() {
		return intIdGrupoProgramaEducativo;
	}

	public void setIntIdGrupoProgramaEducativo(Integer intIdGrupoProgramaEducativo) {
		this.intIdGrupoProgramaEducativo = intIdGrupoProgramaEducativo;
	}



	public Integer getIntFolio() {
		return intFolio;
	}

	public void setIntFolio(Integer intFolio) {
		this.intFolio = intFolio;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
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

	
}
