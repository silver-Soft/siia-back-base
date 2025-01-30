package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtResumenSemestre implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2922557739699236286L;
	@Id
	@Column(name="ID")
	private Integer intId;
	
	@Column(name="PROGRAMAEDUCATIVO")
	private String strProgramaEducativo;
	
	@Column(name="PRIMERO")
	private Integer intPrimero;
	
	@Column(name="SEGUNDO")
	private Integer intSegundo;
	
	@Column(name="TERCERO")
	private Integer intTercero;
	
	@Column(name="CUARTO")
	private Integer intCuarto;
	
	@Column(name="QUINTO")
	private Integer intQuinto;
	
	@Column(name="SEXTO")
	private Integer intSexto;
	
	@Column(name="SEPTIMO")
	private Integer intSeptimo;
	
	@Column(name="OCTAVO")
	private Integer intOctavo;
	
	@Column(name="NOVENO")
	private Integer intNoveno;
	
	@Column(name="DECIMO")
	private Integer intDecimo;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}

	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}

	public Integer getIntPrimero() {
		return intPrimero;
	}

	public void setIntPrimero(Integer intPrimero) {
		this.intPrimero = intPrimero;
	}

	public Integer getIntSegundo() {
		return intSegundo;
	}

	public void setIntSegundo(Integer intSegundo) {
		this.intSegundo = intSegundo;
	}

	public Integer getIntTercero() {
		return intTercero;
	}

	public void setIntTercero(Integer intTercero) {
		this.intTercero = intTercero;
	}

	public Integer getIntCuarto() {
		return intCuarto;
	}

	public void setIntCuarto(Integer intCuarto) {
		this.intCuarto = intCuarto;
	}

	public Integer getIntQuinto() {
		return intQuinto;
	}

	public void setIntQuinto(Integer intQuinto) {
		this.intQuinto = intQuinto;
	}

	public Integer getIntSexto() {
		return intSexto;
	}

	public void setIntSexto(Integer intSexto) {
		this.intSexto = intSexto;
	}

	public Integer getIntSeptimo() {
		return intSeptimo;
	}

	public void setIntSeptimo(Integer intSeptimo) {
		this.intSeptimo = intSeptimo;
	}

	public Integer getIntOctavo() {
		return intOctavo;
	}

	public void setIntOctavo(Integer intOctavo) {
		this.intOctavo = intOctavo;
	}

	public Integer getIntNoveno() {
		return intNoveno;
	}

	public void setIntNoveno(Integer intNoveno) {
		this.intNoveno = intNoveno;
	}

	public Integer getIntDecimo() {
		return intDecimo;
	}

	public void setIntDecimo(Integer intDecimo) {
		this.intDecimo = intDecimo;
	}
	
	
}
