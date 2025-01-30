package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosEncabezadoCifrasExamen {
	
	
	@Id
    @Column(name = "ID")
    private Integer id;
	
	@Column(name = "CICLO")
	private String strCiclo;
	
	@Column(name = "CONVOCATORIA")
	private String strConvocatoria;
	
	@Column(name = "ASPCONFICHA")
	private Integer intAspConFicha;
	
	@Column(name = "INICIARONPROCESO")
	private Integer intAspInciaronProceso;
	
	@Column(name = "NOINICIARONPROCESO")
	private Integer intAspNoInciaronProceso;

	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStrCiclo() {
		return strCiclo;
	}

	public void setStrCiclo(String strCiclo) {
		this.strCiclo = strCiclo;
	}

	public String getStrConvocatoria() {
		return strConvocatoria;
	}

	public void setStrConvocatoria(String strConvocatoria) {
		this.strConvocatoria = strConvocatoria;
	}

	public Integer getIntAspConFicha() {
		return intAspConFicha;
	}

	public void setIntAspConFicha(Integer intAspConFicha) {
		this.intAspConFicha = intAspConFicha;
	}

	public Integer getIntAspInciaronProceso() {
		return intAspInciaronProceso;
	}

	public void setIntAspInciaronProceso(Integer intAspInciaronProceso) {
		this.intAspInciaronProceso = intAspInciaronProceso;
	}

	public Integer getIntAspNoInciaronProceso() {
		return intAspNoInciaronProceso;
	}

	public void setIntAspNoInciaronProceso(Integer intAspNoInciaronProceso) {
		this.intAspNoInciaronProceso = intAspNoInciaronProceso;
	}
	
	
	
	
	
	
	

}
