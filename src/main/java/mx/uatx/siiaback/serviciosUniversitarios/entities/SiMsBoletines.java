package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SIIUAT", name = "SIMSBOLETINES")
public class SiMsBoletines {
	
	@Id
	@Column(name = "IDBOLETIN")
	@SequenceGenerator(name = "IDBOLETIN", sequenceName = "SIIUAT.IDBOLETIN", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDBOLETIN")
	private Long idBoletin;
	
	@Column(name = "DSTITULO")
	private String dsTitulo;

	@Column(name = "DSSUBTITULO")
	private String dsSubtitulo;
	
	@Column(name = "DSCONTENIDO")
	private String dsContenido;

	@Column(name = "FCPUBLICACION")
	private Date fcPublicacion;

	@Column(name = "DSCLAVEBOLETIN")
	private String dsClaveBoletin;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String usuarioAudit;

	@Column(name = "IDAREACAMPUS")
	private Long idAreaCampus;
	
	public Long getIdBoletin() {
		return idBoletin;
	}
	public void setIdBoletin(Long idBoletin) {
		this.idBoletin = idBoletin;
	}
	public String getDsTitulo() {
		return dsTitulo;
	}
	public void setDsTitulo(String dsTitulo) {
		this.dsTitulo = dsTitulo;
	}
	public String getDsSubtitulo() {
		return dsSubtitulo;
	}
	public void setDsSubtitulo(String dsSubtitulo) {
		this.dsSubtitulo = dsSubtitulo;
	}
	public Date getFcPublicacion() {
		return fcPublicacion;
	}
	public void setFcPublicacion(Date fcPublicacion) {
		this.fcPublicacion = fcPublicacion;
	}
	public String getDsClaveBoletin() {
		return dsClaveBoletin;
	}
	public void setDsClaveBoletin(String dsClaveBoletin) {
		this.dsClaveBoletin = dsClaveBoletin;
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
	public Long getIdAreaCampus() {
		return idAreaCampus;
	}
	public void setIdAreaCampus(Long idAreaCampus) {
		this.idAreaCampus = idAreaCampus;
	}
	public String getDsContenido() {
		return dsContenido;
	}
	public void setDsContenido(String dsContenido) {
		this.dsContenido = dsContenido;
	}

}
