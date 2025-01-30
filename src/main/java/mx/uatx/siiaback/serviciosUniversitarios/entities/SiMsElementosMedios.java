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
@Table(schema = "SIIUAT", name = "SIMSELEMENTOSMEDIOS")
public class SiMsElementosMedios {
	
	@Id
	@Column(name = "IDELEMENTOMEDIO")
	@SequenceGenerator(name = "IDELEMENTOMEDIO", sequenceName = "SIIUAT.IDELEMENTOMEDIO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDELEMENTOMEDIO")
	private Long idElementoMedio;
	
	@Column(name = "DSELEMENTOMEDIO")
	private String dsElementoMedio;

	@Column(name = "IDBOLETIN")
	private Long idBoletin;

	@Column(name = "CLTIPOELEMENTOMEDIO")
	private Integer clTipoElementoMedio;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String usuarioAudit;

	@Column(name = "IMAGEN")
	private byte[] imagen;

	@Column(name = "IMAGEN_MINIATURA")
	private byte[] imagenMiniatura;
	
	public Long getIdElementoMedio() {
		return idElementoMedio;
	}
	public void setIdElementoMedio(Long idElementoMedio) {
		this.idElementoMedio = idElementoMedio;
	}
	public String getDsElementoMedio() {
		return dsElementoMedio;
	}
	public void setDsElementoMedio(String dsElementoMedio) {
		this.dsElementoMedio = dsElementoMedio;
	}
	public Long getIdBoletin() {
		return idBoletin;
	}
	public void setIdBoletin(Long idBoletin) {
		this.idBoletin = idBoletin;
	}
	public Integer getClTipoElementoMedio() {
		return clTipoElementoMedio;
	}
	public void setClTipoElementoMedio(Integer clTipoElementoMedio) {
		this.clTipoElementoMedio = clTipoElementoMedio;
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
	public byte[] getImagen() {
		return imagen;
	}
	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
	public byte[] getImagenMiniatura() {
		return imagenMiniatura;
	}
	public void setImagenMiniatura(byte[] imagenMiniatura) {
		this.imagenMiniatura = imagenMiniatura;
	}

}
