package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtEstatusRiesgoAcademico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7840704775541616197L;

	@Id
	@Column(name = "ID")
	private Integer intId;
	
	@Column(name = "TUTOR")
	private String strTutor;
	
	@Column(name = "TUTORADO")
	private String strTutorado;

	@Column(name = "SEMESTRE")
	private Integer intSemestre;

	@Column(name = "NMMATERIAS")
	private Integer intNmMaterias;

	@Column(name = "RECURSE")
	private String strRecurse;
	
	@Column(name = "BAJOPROMEDIO")
	private String strBajoPromedio;
	
	@Column(name = "ALTAREPROBACION")
	private String strAltaReprobacion;
	
	@Column(name = "REZAGO")
	private String strRezago;
	
	@Column(name = "CONDICIONADO")
	private String strCondicionado;
	
	@Column(name = "SITUACIONRIESGO")
	private String strSituacionRiesgo;
	
	@Column(name = "PROMEDIOANTERIOR")
	private Float intPromedioAnterior;
	
	@Column(name = "PROMEDIO")
	private Float intPromedio;
	
	@Column(name = "NMMATERIASANTERIOR")
	private Integer intNmMateriasAnterior;
	
	@Column(name = "MATERIASBAJA")
	private Integer intMateriasBaja;
	
	@Column(name = "COLOR")
	private String strColor;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrTutor() {
		return strTutor;
	}

	public void setStrTutor(String strTutor) {
		this.strTutor = strTutor;
	}

	public String getStrTutorado() {
		return strTutorado;
	}

	public void setStrTutorado(String strTutorado) {
		this.strTutorado = strTutorado;
	}

	public Integer getIntSemestre() {
		return intSemestre;
	}

	public void setIntSemestre(Integer intSemestre) {
		this.intSemestre = intSemestre;
	}

	public Integer getIntNmMaterias() {
		return intNmMaterias;
	}

	public void setIntNmMaterias(Integer intNmMaterias) {
		this.intNmMaterias = intNmMaterias;
	}

	public String getStrRecurse() {
		return strRecurse;
	}

	public void setStrRecurse(String strRecurse) {
		this.strRecurse = strRecurse;
	}

	public String getStrBajoPromedio() {
		return strBajoPromedio;
	}

	public void setStrBajoPromedio(String strBajoPromedio) {
		this.strBajoPromedio = strBajoPromedio;
	}

	public String getStrAltaReprobacion() {
		return strAltaReprobacion;
	}

	public void setStrAltaReprobacion(String strAltaReprobacion) {
		this.strAltaReprobacion = strAltaReprobacion;
	}

	public String getStrRezago() {
		return strRezago;
	}

	public void setStrRezago(String strRezago) {
		this.strRezago = strRezago;
	}

	public String getStrCondicionado() {
		return strCondicionado;
	}

	public void setStrCondicionado(String strCondicionado) {
		this.strCondicionado = strCondicionado;
	}

	public String getStrSituacionRiesgo() {
		return strSituacionRiesgo;
	}

	public void setStrSituacionRiesgo(String strSituacionRiesgo) {
		this.strSituacionRiesgo = strSituacionRiesgo;
	}




	public Float getIntPromedioAnterior() {
		return intPromedioAnterior;
	}

	public void setIntPromedioAnterior(Float intPromedioAnterior) {
		this.intPromedioAnterior = intPromedioAnterior;
	}

	public Float getIntPromedio() {
		return intPromedio;
	}

	public void setIntPromedio(Float intPromedio) {
		this.intPromedio = intPromedio;
	}

	public Integer getIntNmMateriasAnterior() {
		return intNmMateriasAnterior;
	}

	public void setIntNmMateriasAnterior(Integer intNmMateriasAnterior) {
		this.intNmMateriasAnterior = intNmMateriasAnterior;
	}

	public Integer getIntMateriasBaja() {
		return intMateriasBaja;
	}

	public void setIntMateriasBaja(Integer intMateriasBaja) {
		this.intMateriasBaja = intMateriasBaja;
	}

	public String getStrColor() {
		return strColor;
	}

	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}

	
	
	
}
