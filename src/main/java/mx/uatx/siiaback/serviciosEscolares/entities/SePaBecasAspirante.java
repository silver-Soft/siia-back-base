package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaBecasAspirante implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4806255093523125956L;

	@Id
	@Column(name = "IDBECAASPIRANTE")
	private Long lngIdBecaAspirante;

	@Column(name = "CLESTATUSESCONACYT")
	private Integer intClEstatusConacyt;

	@Column(name = "DSBOOLEANOESCONACYT")
	private String strEstatusConacyt;

	@Column(name = "CLNIVELEDUCATIVO")
	private Integer intClNivelEducativo;

	@Column(name = "DSNIVELEDUCATIVO")
	private String strNivelEducativo;

	@Column(name = "FCINICIOVIGENCIA")
	private Date fcInicioVigencia;

	@Column(name = "FCFINVIGENCIA")
	private Date fcFinVigencia;

	@Column(name = "CVU")
	private String strCvu;

	@Column(name = "NMBECARIO")
	private String strNumeroBecario;

	@Column(name = "CLESTATUSCARTALIB")
	private Integer intClEstatusCartaLiberacion;

	@Column(name = "DSBOOLEANOCARTALIB")
	private String strEstatusCartaLib;

	@Column(name = "ARCHIVO")
	@Lob
	private byte[] archivo;

	@Column(name = "INSTITUCION")
	private String strInstitucion;

	public Long getLngIdBecaAspirante() {
		return lngIdBecaAspirante;
	}

	public void setLngIdBecaAspirante(Long lngIdBecaAspirante) {
		this.lngIdBecaAspirante = lngIdBecaAspirante;
	}

	public Integer getIntClEstatusConacyt() {
		return intClEstatusConacyt;
	}

	public void setIntClEstatusConacyt(Integer intClEstatusConacyt) {
		this.intClEstatusConacyt = intClEstatusConacyt;
	}

	public String getStrEstatusConacyt() {
		return strEstatusConacyt;
	}

	public void setStrEstatusConacyt(String strEstatusConacyt) {
		this.strEstatusConacyt = strEstatusConacyt;
	}

	public Integer getIntClNivelEducativo() {
		return intClNivelEducativo;
	}

	public void setIntClNivelEducativo(Integer intClNivelEducativo) {
		this.intClNivelEducativo = intClNivelEducativo;
	}

	public String getStrNivelEducativo() {
		return strNivelEducativo;
	}

	public void setStrNivelEducativo(String strNivelEducativo) {
		this.strNivelEducativo = strNivelEducativo;
	}

	public Date getFcInicioVigencia() {
		return fcInicioVigencia;
	}

	public void setFcInicioVigencia(Date fcInicioVigencia) {
		this.fcInicioVigencia = fcInicioVigencia;
	}

	public Date getFcFinVigencia() {
		return fcFinVigencia;
	}

	public void setFcFinVigencia(Date fcFinVigencia) {
		this.fcFinVigencia = fcFinVigencia;
	}

	public String getStrCvu() {
		return strCvu;
	}

	public void setStrCvu(String strCvu) {
		this.strCvu = strCvu;
	}

	public String getStrNumeroBecario() {
		return strNumeroBecario;
	}

	public void setStrNumeroBecario(String strNumeroBecario) {
		this.strNumeroBecario = strNumeroBecario;
	}

	public Integer getIntClEstatusCartaLiberacion() {
		return intClEstatusCartaLiberacion;
	}

	public void setIntClEstatusCartaLiberacion(Integer intClEstatusCartaLiberacion) {
		this.intClEstatusCartaLiberacion = intClEstatusCartaLiberacion;
	}

	public String getStrEstatusCartaLib() {
		return strEstatusCartaLib;
	}

	public void setStrEstatusCartaLib(String strEstatusCartaLib) {
		this.strEstatusCartaLib = strEstatusCartaLib;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public String getStrInstitucion() {
		return strInstitucion;
	}

	public void setStrInstitucion(String strInstitucion) {
		this.strInstitucion = strInstitucion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
