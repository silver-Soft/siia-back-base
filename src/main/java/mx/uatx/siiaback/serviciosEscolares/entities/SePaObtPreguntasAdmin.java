package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtPreguntasAdmin {

	@Id
	@Column(name = "FOLIO")
	private Integer intFolio;

	@Column(name = "DESCRIPCION")
	private String strDescripcion;

	@Column(name = "TIPO")
	private String strTipo;
	
	@Column(name = "CLTIPOPREGUNTA")
	private String strClTipoPregunta;
	
	@Column(name = "IDGRUPORESPUESTA")
	private Integer intIdGrupoRespuesta;

	@Column(name = "PERMITEMODIFICAR")
	private Boolean blnPermiteModificar;

	@Column(name = "PERMITEELIMINAR")
	private Boolean blnPermiteEliminar;

	public Integer getIntFolio() {
		return intFolio;
	}

	public void setIntFolio(Integer intFolio) {
		this.intFolio = intFolio;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public String getStrTipo() {
		return strTipo;
	}

	public void setStrTipo(String strTipo) {
		this.strTipo = strTipo;
	}

	public Boolean getBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(Boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public Boolean getBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(Boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}

	public String getStrClTipoPregunta() {
		return strClTipoPregunta;
	}

	public void setStrClTipoPregunta(String strClTipoPregunta) {
		this.strClTipoPregunta = strClTipoPregunta;
	}

	public Integer getIntIdGrupoRespuesta() {
		return intIdGrupoRespuesta;
	}

	public void setIntIdGrupoRespuesta(Integer intIdGrupoRespuesta) {
		this.intIdGrupoRespuesta = intIdGrupoRespuesta;
	}

}