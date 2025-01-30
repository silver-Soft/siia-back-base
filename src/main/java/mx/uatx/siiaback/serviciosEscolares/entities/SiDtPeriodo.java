package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SIIUAT.SIDTPERIODOS")
public class SiDtPeriodo {
	
	@Id
	@Column(name = "IDDTPERIODO")
	@SequenceGenerator(name = "generadorIdentificador", sequenceName = "SIIUAT.IDDTPERIODO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generadorIdentificador")
	private Long idDtPeriodo;
	
	@Column(name = "IDPERIODO")
	private String idPeriodo;
	
	@Column(name = "IDPERIODOHIJO")
	private String idPeriodoHijo;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
	private String usuarioAudit;
	
	public SiDtPeriodo() {
		
	}

	public Long getIdDtPeriodo() {
		return idDtPeriodo;
	}

	public void setIdDtPeriodo(Long idDtPeriodo) {
		this.idDtPeriodo = idDtPeriodo;
	}

	public String getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public String getIdPeriodoHijo() {
		return idPeriodoHijo;
	}

	public void setIdPeriodoHijo(String idPeriodoHijo) {
		this.idPeriodoHijo = idPeriodoHijo;
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
	
	

}
