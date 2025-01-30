package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtProgramasCampusAdmin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8124354383632891981L;
	
	 @Id
	  @Column(name = "IDPROGRAMACAMPUS")
	  private Integer intIdProgramaCampus;
	  
	  @Column(name = "AREA")
	  private String strArea;
	  
	  @Column(name = "CAMPUS")
	  private String strCampus;
	  
	  @Column(name = "DSNIVELEDUCATIVO")
	  private String strNivelEducativo;
	  
	  @Column(name = "DSPROGRAMAEDUCATIVO")
	  private String strPrograma;
	  
	  @Column(name = "DSESTATUS")
	  private String strEstatus;
	  
	  @Column(name = "PERMITEMODIFICAR")
	  private Boolean blnPermiteModificar;
	  
	  @Column(name = "PERMITEELIMINAR")
	  private Boolean blnPermiteEliminar;
	  
	  @Column(name = "PERMITEACREDITACION")
	  private Boolean blnPermiteAcreditacion;

	  public Integer getIntIdProgramaCampus() {
	    return intIdProgramaCampus;
	  }

	  public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
	    this.intIdProgramaCampus = intIdProgramaCampus;
	  }

	  public String getStrArea() {
	    return strArea;
	  }

	  public void setStrArea(String strArea) {
	    this.strArea = strArea;
	  }

	  public String getStrCampus() {
	    return strCampus;
	  }

	  public void setStrCampus(String strCampus) {
	    this.strCampus = strCampus;
	  }

	  public String getStrNivelEducativo() {
	    return strNivelEducativo;
	  }

	  public void setStrNivelEducativo(String strNivelEducativo) {
	    this.strNivelEducativo = strNivelEducativo;
	  }

	  public String getStrPrograma() {
	    return strPrograma;
	  }

	  public void setStrPrograma(String strPrograma) {
	    this.strPrograma = strPrograma;
	  }

	  public String getStrEstatus() {
	    return strEstatus;
	  }

	  public void setStrEstatus(String strEstatus) {
	    this.strEstatus = strEstatus;
	  }

	  public Boolean getBlnPermiteModificar() {
	    return blnPermiteModificar;
	  }

	  public void setBlnPermiteModificar(Boolean blnPermiteModificar) {
	    this.blnPermiteModificar = blnPermiteModificar;
	  }

	  public Boolean getBlnPermiteEliminar() {
	    return blnPermiteEliminar;
	  }

	  public void setBlnPermiteEliminar(Boolean blnPermiteEliminar) {
	    this.blnPermiteEliminar = blnPermiteEliminar;
	  }

	public Boolean getBlnPermiteAcreditacion() {
		return blnPermiteAcreditacion;
	}

	public void setBlnPermiteAcreditacion(Boolean blnPermiteAcreditacion) {
		this.blnPermiteAcreditacion = blnPermiteAcreditacion;
	}

}
