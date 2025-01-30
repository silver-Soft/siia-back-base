package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtPuntajeEvaluacion {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "IDSECCION")
	private Integer idSeccion;
	
	@Column(name = "DESCRIPCION")
	private String seccion;
	
	@Column(name = "DSCUESTIONARIO")
	private String dsCuestionario;
	
	@Column(name = "PUNTAJEMAXIMO")
	private Double puntajeMaximo;
	
	@Column(name = "PUNTAJEOBTENIDO")
	private Double puntajeObtenido;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdSeccion() {
		return idSeccion;
	}

	public void setIdSeccion(Integer idSeccion) {
		this.idSeccion = idSeccion;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getDsCuestionario() {
		return dsCuestionario;
	}

	public void setDsCuestionario(String dsCuestionario) {
		this.dsCuestionario = dsCuestionario;
	}

	public Double getPuntajeMaximo() {
		return puntajeMaximo;
	}

	public void setPuntajeMaximo(Double puntajeMaximo) {
		this.puntajeMaximo = puntajeMaximo;
	}

	public Double getPuntajeObtenido() {
		return puntajeObtenido;
	}

	public void setPuntajeObtenido(Double puntajeObtenido) {
		this.puntajeObtenido = puntajeObtenido;
	}


	
}
