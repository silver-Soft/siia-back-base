package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosAspiranteProrroga {
	
	@Id
	@Column(name = "IDSOLICITUDINGRESO")
	private Long lngIdSolicitudIngreso;
	
	@Column(name = "NBASPIRANTE")
	private String strNombreAspirante;
	
	@Column(name = "APPATERNO")
	private String strApPaterno;
	
	@Column(name = "APMATERNO")
	private String strApMaterno;
	
	@Column(name = "PROGRAMA")
	private String strDsProgramaEducativo;
	
	@Column(name = "FACULTAD")
	private String strDsFacultad;
	
	public Long getLngIdSolicitudIngreso() {
		return lngIdSolicitudIngreso;
	}
	public void setLngIdSolicitudIngreso(Long lngIdSolicitudIngreso) {
		this.lngIdSolicitudIngreso = lngIdSolicitudIngreso;
	}
	public String getStrNombreAspirante() {
		return strNombreAspirante;
	}
	public void setStrNombreAspirante(String strNombreAspirante) {
		this.strNombreAspirante = strNombreAspirante;
	}
	public String getStrDsProgramaEducativo() {
		return strDsProgramaEducativo;
	}
	public void setStrDsProgramaEducativo(String strDsProgramaEducativo) {
		this.strDsProgramaEducativo = strDsProgramaEducativo;
	}
	public String getStrDsFacultad() {
		return strDsFacultad;
	}
	public void setStrDsFacultad(String strDsFacultad) {
		this.strDsFacultad = strDsFacultad;
	}
	public String getStrApPaterno() {
		return strApPaterno;
	}
	public void setStrApPaterno(String strApPaterno) {
		this.strApPaterno = strApPaterno;
	}
	public String getStrApMaterno() {
		return strApMaterno;
	}
	public void setStrApMaterno(String strApMaterno) {
		this.strApMaterno = strApMaterno;
	}
	
	

}
