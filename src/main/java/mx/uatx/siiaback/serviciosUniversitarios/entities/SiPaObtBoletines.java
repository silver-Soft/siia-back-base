package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtBoletines {
	
	@Id
	@Column(name = "IDBOLETIN")
	private Long idBoletin;
	
	@Column(name = "DSTITULO")
	private String dsTitulo;

	@Column(name = "DSSUBTITULO")
	private String dsSubTitulo;

	@Column(name = "DSCONTENIDO")
	private String dsContenido;

	@Column(name = "FCPUBLICACION")
	private Date fcPublicacion;

	@Column(name = "DSCLAVEBOLETIN")
	private String dsClaveBoletin;

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

	public String getDsSubTitulo() {
		return dsSubTitulo;
	}

	public void setDsSubTitulo(String dsSubTitulo) {
		this.dsSubTitulo = dsSubTitulo;
	}

	public String getDsContenido() {
		return dsContenido;
	}

	public void setDsContenido(String dsContenido) {
		this.dsContenido = dsContenido;
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

	public Long getIdAreaCampus() {
		return idAreaCampus;
	}

	public void setIdAreaCampus(Long idAreaCampus) {
		this.idAreaCampus = idAreaCampus;
	}

		
}
