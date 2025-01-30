package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaPreguntasOV implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5072585049046621789L;

	@Column(name = "IDBLOQUESECCIONOV")
	private Integer intIdBloqueSeccion;

	@Column(name = "DSBLOQUESECCIONOV")
	private String  strDsBloque;
	
	@Column(name = "IDSECCIONOV")
	private Integer intIdSeccionOv;
	
	@Column(name = "NMORDEN")
	private Integer intNmOrdenBloque;
	
	@Id
	@Column(name = "IDBLOQUEPREGUNTAOV")
	private Integer intIdBloquePreguntaOv;
	
	@Column(name = "DSPREGUNTA")
	private String dsPregunta;
	
	@Column(name = "NMORDENPREG")
	private Integer intNmOrdenPregunta;
	
	@Column(name = "IDBLOQUESECCIONOVPREG")
	private Integer intIdBloqueSeccionPreg;
	
	@Column(name = "RESPUESTAMAS", nullable = true)
	private Integer respuestaMas;
	
	@Column(name = "RESPUESTAMENOS", nullable = true)
	private Integer respuestaMenos;

	public Integer getIntIdBloqueSeccion() {
		return intIdBloqueSeccion;
	}

	public void setIntIdBloqueSeccion(Integer intIdBloqueSeccion) {
		this.intIdBloqueSeccion = intIdBloqueSeccion;
	}

	public String getStrDsBloque() {
		return strDsBloque;
	}

	public void setStrDsBloque(String strDsBloque) {
		this.strDsBloque = strDsBloque;
	}

	public Integer getIntIdSeccionOv() {
		return intIdSeccionOv;
	}

	public void setIntIdSeccionOv(Integer intIdSeccionOv) {
		this.intIdSeccionOv = intIdSeccionOv;
	}

	public Integer getIntNmOrdenBloque() {
		return intNmOrdenBloque;
	}

	public void setIntNmOrdenBloque(Integer intNmOrdenBloque) {
		this.intNmOrdenBloque = intNmOrdenBloque;
	}

	public Integer getIntIdBloquePreguntaOv() {
		return intIdBloquePreguntaOv;
	}

	public void setIntIdBloquePreguntaOv(Integer intIdBloquePreguntaOv) {
		this.intIdBloquePreguntaOv = intIdBloquePreguntaOv;
	}

	public String getDsPregunta() {
		return dsPregunta;
	}

	public void setDsPregunta(String dsPregunta) {
		this.dsPregunta = dsPregunta;
	}

	public Integer getIntNmOrdenPregunta() {
		return intNmOrdenPregunta;
	}

	public void setIntNmOrdenPregunta(Integer intNmOrdenPregunta) {
		this.intNmOrdenPregunta = intNmOrdenPregunta;
	}

	public Integer getIntIdBloqueSeccionPreg() {
		return intIdBloqueSeccionPreg;
	}

	public void setIntIdBloqueSeccionPreg(Integer intIdBloqueSeccionPreg) {
		this.intIdBloqueSeccionPreg = intIdBloqueSeccionPreg;
	}

	public Integer getRespuestaMas() {
		return respuestaMas;
	}

	public void setRespuestaMas(Integer respuestaMas) {
		this.respuestaMas = respuestaMas;
	}

	public Integer getRespuestaMenos() {
		return respuestaMenos;
	}

	public void setRespuestaMenos(Integer respuestaMenos) {
		this.respuestaMenos = respuestaMenos;
	}



}
