package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtElementosMedios {
	
	@Id
	@Column(name="IDELEMENTOMEDIO")
	private Long idElementoMedio;
	
	@Column(name="DSELEMENTOMEDIO")
	private String dsElementoMedio;

	@Column(name="IDBOLETIN")
	private Long idBoletin;

	@Column(name="CLTIPOELEMENTOMEDIO")
	private Integer clTipoElementoMedio;

	@Column(name="IMAGEN")
	private byte[] imagen;

	@Column(name="IMAGEN_MINIATURA")
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
