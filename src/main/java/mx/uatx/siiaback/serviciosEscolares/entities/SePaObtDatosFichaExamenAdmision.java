package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
@Entity
public class SePaObtDatosFichaExamenAdmision implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -739333018937895296L;

	@Id
	@Column(name = "FOLIO")
	private Long lngFolio;
	
	@Column(name = "PERIODO")
	private String strPeriodo;
	
	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "FACULTAD")
	private String strFacultad;
	
	@Column(name = "PROGRAMA")
	private String strPrograma;
	
	@Column(name = "FECHAEXAMEN")
	private String strFechaExamen;
	
	@Column(name = "GRUPO")
	private String strGrupo;
	
	@Lob
    @Column(name = "FOTO")
    private byte[] foto;
	
	@Column(name = "CODIGOQR")
	private String strCodigoQR;

	public SePaObtDatosFichaExamenAdmision() {
		super();
	}



	public Long getLngFolio() {
		return lngFolio;
	}



	public void setLngFolio(Long lngFolio) {
		this.lngFolio = lngFolio;
	}



	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrFacultad() {
		return strFacultad;
	}

	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
	}

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public String getStrFechaExamen() {
		return strFechaExamen;
	}

	public void setStrFechaExamen(String strFechaExamen) {
		this.strFechaExamen = strFechaExamen;
	}

	public String getStrGrupo() {
		return strGrupo;
	}

	public void setStrGrupo(String strGrupo) {
		this.strGrupo = strGrupo;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getStrCodigoQR() {
		return strCodigoQR;
	}

	public void setStrCodigoQR(String strCodigoQR) {
		this.strCodigoQR = strCodigoQR;
	}

}
