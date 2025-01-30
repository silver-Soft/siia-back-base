package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtProgramasEstudioExternos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5889941539060231263L;
	@Id
	@Column(name = "IDPROGRAMAESTUDIOEXTERNO")
	private Long lngIdProgramaEstudioExterno;

	@Column(name = "NBPROGRAMAESTUDIOEXTERNO")
	private String strNbProgramaEstudioExterno;

	@Column(name = "CLAVEPROGRAMAESTUDIO")
	private String strClaveProgramaEstudio;
	
	@Column(name = "FIRMA")
	private byte[] firma;
	
	@Column(name = "CLAREAFIRMA")
	private Integer intClAreaFirma;
	
	@Column(name = "DSPROGRAMAESTUDIOEXTERNO")
	private String strDsProgramaEstudioExterno;
		
	@Column(name = "PERMITEMODIFICAR")
	private boolean blnPermiteModificar;
	
	@Column(name = "PERMITEELIMINAR")
	private boolean blnPermiteEliminar;
	
	@Column(name = "PERMITEACTUALIZAR")
	private boolean blnPermiteActualizar;
		
	public SePaObtProgramasEstudioExternos() {
		super();
	}

	public Long getLngIdProgramaEstudioExterno() {
		return lngIdProgramaEstudioExterno;
	}

	public void setLngIdProgramaEstudioExterno(Long lngIdProgramaEstudioExterno) {
		this.lngIdProgramaEstudioExterno = lngIdProgramaEstudioExterno;
	}

	public String getStrNbProgramaEstudioExterno() {
		return strNbProgramaEstudioExterno;
	}

	public void setStrNbProgramaEstudioExterno(String strNbProgramaEstudioExterno) {
		this.strNbProgramaEstudioExterno = strNbProgramaEstudioExterno;
	}	

	public String getStrClaveProgramaEstudio() {
		return strClaveProgramaEstudio;
	}

	public void setStrClaveProgramaEstudio(String strClaveProgramaEstudio) {
		this.strClaveProgramaEstudio = strClaveProgramaEstudio;
	}

	public byte[] getFirma() {
		return firma;
	}

	public void setFirma(byte[] firma) {
		this.firma = firma;
	}

	public Integer getIntClAreaFirma() {
		return intClAreaFirma;
	}

	public void setIntClAreaFirma(Integer intClAreaFirma) {
		this.intClAreaFirma = intClAreaFirma;
	}

	public boolean isBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public boolean isBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}

	public boolean isBlnPermiteActualizar() {
		return blnPermiteActualizar;
	}

	public void setBlnPermiteActualizar(boolean blnPermiteActualizar) {
		this.blnPermiteActualizar = blnPermiteActualizar;
	}

	public String getStrDsProgramaEstudioExterno() {
		return strDsProgramaEstudioExterno;
	}

	public void setStrDsProgramaEstudioExterno(String strDsProgramaEstudioExterno) {
		this.strDsProgramaEstudioExterno = strDsProgramaEstudioExterno;
	}
	
	
	
}
