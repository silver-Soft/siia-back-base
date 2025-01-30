package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaObtEstatusRiesgoAcademico;

public class EstatusRiesgoAcademicoTO {
	
	private Integer intId;
	private String strTutor;
	private String strTutorado;
	private Integer intSemestre;
	private Integer intNmMaterias;
	private String strRecurse;
	private String strBajoPromedio;
	private String strAltaReprobacion;
	private String strRezago;
	private String strCondicionado;
	private String strSituacionRiesgo;
	private Float intPromedioAnterior;
	private Float intPromedio;
	private Integer intNmMateriasAnterior;
	private Integer intMateriasBaja;
	private String strColor;
	
	public EstatusRiesgoAcademicoTO() {
		super();
	}
	
	public EstatusRiesgoAcademicoTO(final SePaObtEstatusRiesgoAcademico entidad) {
		super();
		BeanUtils.copyProperties(entidad, this);
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


	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
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
