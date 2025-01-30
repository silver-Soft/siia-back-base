package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtAlumnosActasOferta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8031579506508247534L;
	@Id
	@Column(name = "IDALUMNOACTA")
	private Long lngIdAlumnoActa;

	@Column(name = "MATRICULA")
	private String strMatricula;
	
	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "CLCALIFICACIONFINAL")
	private Integer intClCalificacionFinal;
	
	@Column(name = "DSESTATUS")
	private String strDsEstatus;
	
	@Column(name = "PERMITEACTIVAR")
	private boolean blnPermiteActivar;
	
	@Column(name = "PERMITEINACTIVAR")
	private boolean blnPermiteInActivar;
	
	public SePaObtAlumnosActasOferta() {
		super();
	}

	public Long getLngIdAlumnoActa() {
		return lngIdAlumnoActa;
	}

	public void setLngIdAlumnoActa(Long lngIdAlumnoActa) {
		this.lngIdAlumnoActa = lngIdAlumnoActa;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public Integer getIntClCalificacionFinal() {
		return intClCalificacionFinal;
	}

	public void setIntClCalificacionFinal(Integer intClCalificacionFinal) {
		this.intClCalificacionFinal = intClCalificacionFinal;
	}

	public String getStrDsEstatus() {
		return strDsEstatus;
	}

	public void setStrDsEstatus(String strDsEstatus) {
		this.strDsEstatus = strDsEstatus;
	}

	public boolean isBlnPermiteActivar() {
		return blnPermiteActivar;
	}

	public void setBlnPermiteActivar(boolean blnPermiteActivar) {
		this.blnPermiteActivar = blnPermiteActivar;
	}

	public boolean isBlnPermiteInActivar() {
		return blnPermiteInActivar;
	}

	public void setBlnPermiteInActivar(boolean blnPermiteInActivar) {
		this.blnPermiteInActivar = blnPermiteInActivar;
	}
	
}

