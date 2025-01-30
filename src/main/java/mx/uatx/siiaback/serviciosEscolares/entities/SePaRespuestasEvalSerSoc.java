package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaRespuestasEvalSerSoc {
	
	@Id
	@Column(name = "IDPREGUNTA")
	private Long idPregunta;
	
	@Column(name = "DSPREGUNTA")
	private String dsPregunta;

	@Column(name = "EXCELENTE")
	private String dsRespuesta1;

	@Column(name = "MUYBIEN")
	private String dsRespuesta2;

	@Column(name = "BIEN")
	private String dsRespuesta3;

	@Column(name = "SUFICIENTE")
	private String dsRespuesta4;

	@Column(name = "DEFICIENTE")
	private String dsRespuesta5;
	
	
	public Long getIdPregunta() {
		return idPregunta;
	}
	public void setIdPregunta(Long idPregunta) {
		this.idPregunta = idPregunta;
	}
	public String getDsPregunta() {
		return dsPregunta;
	}
	public void setDsPregunta(String dsPregunta) {
		this.dsPregunta = dsPregunta;
	}
	public String getDsRespuesta1() {
		return dsRespuesta1;
	}
	public void setDsRespuesta1(String dsRespuesta1) {
		this.dsRespuesta1 = dsRespuesta1;
	}
	public String getDsRespuesta2() {
		return dsRespuesta2;
	}
	public void setDsRespuesta2(String dsRespuesta2) {
		this.dsRespuesta2 = dsRespuesta2;
	}
	public String getDsRespuesta3() {
		return dsRespuesta3;
	}
	public void setDsRespuesta3(String dsRespuesta3) {
		this.dsRespuesta3 = dsRespuesta3;
	}
	public String getDsRespuesta4() {
		return dsRespuesta4;
	}
	public void setDsRespuesta4(String dsRespuesta4) {
		this.dsRespuesta4 = dsRespuesta4;
	}
	public String getDsRespuesta5() {
		return dsRespuesta5;
	}
	public void setDsRespuesta5(String dsRespuesta5) {
		this.dsRespuesta5 = dsRespuesta5;
	}
	
	

}
