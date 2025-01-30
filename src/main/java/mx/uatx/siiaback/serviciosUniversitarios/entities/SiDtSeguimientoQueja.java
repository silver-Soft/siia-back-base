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
@Table(schema = "SIIUAT", name = "SIDTSEGUIMIENTOSQUEJA")
public class SiDtSeguimientoQueja implements Serializable {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDSEGUIMIENTOQUEJA", sequenceName = "SIIUAT.IDSEGUIMIENTOQUEJA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDSEGUIMIENTOQUEJA")
	@NotNull

	@Column(name = "IDSEGUIMIENTOQUEJA")
	private Long longIdSeguimientoQueja;
	
	@Column(name = "IDQUEJADENUNCIA")
	private Long lngIdQuejaDenuncia;
	
	@Column(name = "FCREGISTRO")
	private Date fcRegistro;
	
	@Column(name = "DSSEGUIMIENTO")
	private String strDsSeguimiento;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Long getLongIdSeguimientoQueja() {
		return longIdSeguimientoQueja;
	}

	public void setLongIdSeguimientoQueja(Long longIdSeguimientoQueja) {
		this.longIdSeguimientoQueja = longIdSeguimientoQueja;
	}

	public Long getLngIdQuejaDenuncia() {
		return lngIdQuejaDenuncia;
	}

	public void setLngIdQuejaDenuncia(Long lngIdQuejaDenuncia) {
		this.lngIdQuejaDenuncia = lngIdQuejaDenuncia;
	}

	public Date getFcRegistro() {
		return fcRegistro;
	}

	public void setFcRegistro(Date fcRegistro) {
		this.fcRegistro = fcRegistro;
	}

	public String getStrDsSeguimiento() {
		return strDsSeguimiento;
	}

	public void setStrDsSeguimiento(String strDsSeguimiento) {
		this.strDsSeguimiento = strDsSeguimiento;
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
