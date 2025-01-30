package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtListadoEquivalencias implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6449503297768996339L;

	@Id
	@Column(name="IDEQUIVALENCIA")
	private Long lngIdEquivalencia;
	
	@Column(name="NBPLANESTUDIO")
	private String strNbPlanEstudio;
	
	@Column(name="DSPROGRAMA")
	private String strDsPrograma;
	
	@Column(name="DSMATERIA")
	private String strDsMateria;
	
	@Column(name="IDEQUIVALENCIAREFERENCIA")
	private Long lngIdEquivalenciaReferencia;
	
	@Column(name="PERMITEELIMINAR")
	private boolean blnPermiteEliminar;

	public Long getLngIdEquivalencia() {
		return lngIdEquivalencia;
	}

	public void setLngIdEquivalencia(Long lngIdEquivalencia) {
		this.lngIdEquivalencia = lngIdEquivalencia;
	}

	public String getStrNbPlanEstudio() {
		return strNbPlanEstudio;
	}

	public void setStrNbPlanEstudio(String strNbPlanEstudio) {
		this.strNbPlanEstudio = strNbPlanEstudio;
	}

	public String getStrDsPrograma() {
		return strDsPrograma;
	}

	public void setStrDsPrograma(String strDsPrograma) {
		this.strDsPrograma = strDsPrograma;
	}

	public String getStrDsMateria() {
		return strDsMateria;
	}

	public void setStrDsMateria(String strDsMateria) {
		this.strDsMateria = strDsMateria;
	}

	public boolean isBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}

	public Long getLngIdEquivalenciaReferencia() {
		return lngIdEquivalenciaReferencia;
	}

	public void setLngIdEquivalenciaReferencia(Long lngIdEquivalenciaReferencia) {
		this.lngIdEquivalenciaReferencia = lngIdEquivalenciaReferencia;
	}	

	
	
}
