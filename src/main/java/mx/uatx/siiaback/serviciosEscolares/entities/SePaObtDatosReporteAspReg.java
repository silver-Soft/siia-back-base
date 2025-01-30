package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosReporteAspReg implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3172437410748206640L;
	@Id
	@Column(name = "FOLIOUATX")
	private Long lngFolioUatx;

	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "FICHA")
	private Long lngFicha;
	
	@Column(name = "PROMEDIOGENERAL")
	private BigDecimal promedioGeneral;
	
	@Column(name = "ESCUELAPROCEDENCIA")
	private String strEscuelaProcedencia;
	
	@Column(name = "SEXO")
	private String strSexo;
	
	@Column(name = "ENTIDAD")
	private String strEntidad;
	
	@Column(name = "MUNICIPIO")
	private String strMunicipio;
	
	public SePaObtDatosReporteAspReg() {
		super();
	}

	public Long getLngFolioUatx() {
		return lngFolioUatx;
	}

	public void setLngFolioUatx(Long lngFolioUatx) {
		this.lngFolioUatx = lngFolioUatx;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public Long getLngFicha() {
		return lngFicha;
	}

	public void setLngFicha(Long lngFicha) {
		this.lngFicha = lngFicha;
	}

	

	public BigDecimal getPromedioGeneral() {
		return promedioGeneral;
	}

	public void setPromedioGeneral(BigDecimal promedioGeneral) {
		this.promedioGeneral = promedioGeneral;
	}

	public String getStrEscuelaProcedencia() {
		return strEscuelaProcedencia;
	}

	public void setStrEscuelaProcedencia(String strEscuelaProcedencia) {
		this.strEscuelaProcedencia = strEscuelaProcedencia;
	}

	public String getStrSexo() {
		return strSexo;
	}

	public void setStrSexo(String strSexo) {
		this.strSexo = strSexo;
	}

	public String getStrEntidad() {
		return strEntidad;
	}

	public void setStrEntidad(String strEntidad) {
		this.strEntidad = strEntidad;
	}

	public String getStrMunicipio() {
		return strMunicipio;
	}

	public void setStrMunicipio(String strMunicipio) {
		this.strMunicipio = strMunicipio;
	}
	
	

}
