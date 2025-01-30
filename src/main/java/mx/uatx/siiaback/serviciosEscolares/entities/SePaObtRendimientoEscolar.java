package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtRendimientoEscolar implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4922839725887962218L;
	@Id
	@Column(name="IDHISTORIALACADEMICO")
	private Integer intIdHistorialAcademico;
	
	@Column(name="MATRICULA")
	private String strMatricula;
	
	@Column(name="NOMBRE")
	private String strNombre;
	
	@Column(name="CALIFICACION1")
	private Double dblCalificacion1;
	
	@Column(name="CALIFICACION2")
	private Double dblCalificacion2;
	
	@Column(name="CALIFICACION3")
	private Double dblCalificacion3;
	
	@Column(name="CALIFICACION4")
	private Double dblCalificacion4;
	
	@Column(name="CALIFICACION5")
	private Double dblCalificacion5;
	
	@Column(name="CALIFICACION6")
	private Double dblCalificacion6;
	
	@Column(name="CALIFICACION7")
	private Double dblCalificacion7;
	
	@Column(name="CALIFICACION8")
	private Double dblCalificacion8;
	
	@Column(name="CALIFICACION9")
	private Double dblCalificacion9;
	
	@Column(name="CALIFICACION10")
	private Double dblCalificacion10;
	
	@Column(name="CALIFICACION11")
	private Double dblCalificacion11;
	
	@Column(name="CALIFICACION12")
	private Double dblCalificacion12;
	
	@Column(name="FINAL")
	private Double dblFinal;

	public Integer getIntIdHistorialAcademico() {
		return intIdHistorialAcademico;
	}

	public void setIntIdHistorialAcademico(Integer intIdHistorialAcademico) {
		this.intIdHistorialAcademico = intIdHistorialAcademico;
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

	public Double getDblCalificacion1() {
		return dblCalificacion1;
	}

	public void setDblCalificacion1(Double dblCalificacion1) {
		this.dblCalificacion1 = dblCalificacion1;
	}

	public Double getDblCalificacion2() {
		return dblCalificacion2;
	}

	public void setDblCalificacion2(Double dblCalificacion2) {
		this.dblCalificacion2 = dblCalificacion2;
	}

	public Double getDblCalificacion3() {
		return dblCalificacion3;
	}

	public void setDblCalificacion3(Double dblCalificacion3) {
		this.dblCalificacion3 = dblCalificacion3;
	}

	public Double getDblCalificacion4() {
		return dblCalificacion4;
	}

	public void setDblCalificacion4(Double dblCalificacion4) {
		this.dblCalificacion4 = dblCalificacion4;
	}

	public Double getDblCalificacion5() {
		return dblCalificacion5;
	}

	public void setDblCalificacion5(Double dblCalificacion5) {
		this.dblCalificacion5 = dblCalificacion5;
	}

	public Double getDblCalificacion6() {
		return dblCalificacion6;
	}

	public void setDblCalificacion6(Double dblCalificacion6) {
		this.dblCalificacion6 = dblCalificacion6;
	}

	public Double getDblCalificacion7() {
		return dblCalificacion7;
	}

	public void setDblCalificacion7(Double dblCalificacion7) {
		this.dblCalificacion7 = dblCalificacion7;
	}

	public Double getDblCalificacion8() {
		return dblCalificacion8;
	}

	public void setDblCalificacion8(Double dblCalificacion8) {
		this.dblCalificacion8 = dblCalificacion8;
	}

	public Double getDblCalificacion9() {
		return dblCalificacion9;
	}

	public void setDblCalificacion9(Double dblCalificacion9) {
		this.dblCalificacion9 = dblCalificacion9;
	}

	public Double getDblCalificacion10() {
		return dblCalificacion10;
	}

	public void setDblCalificacion10(Double dblCalificacion10) {
		this.dblCalificacion10 = dblCalificacion10;
	}

	public Double getDblCalificacion11() {
		return dblCalificacion11;
	}

	public void setDblCalificacion11(Double dblCalificacion11) {
		this.dblCalificacion11 = dblCalificacion11;
	}

	public Double getDblCalificacion12() {
		return dblCalificacion12;
	}

	public void setDblCalificacion12(Double dblCalificacion12) {
		this.dblCalificacion12 = dblCalificacion12;
	}

	public Double getDblFinal() {
		return dblFinal;
	}

	public void setDblFinal(Double dblFinal) {
		this.dblFinal = dblFinal;
	}
	
	
}
