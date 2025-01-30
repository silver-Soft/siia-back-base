package mx.uatx.siiaback.serviciosEscolares.comun.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaProgramaCampusLic;
import mx.uatx.siiaback.serviciosEscolares.entities.SePaProgramaEducativo;

public class ProgramaEducativoTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1090027498281534457L;

	private Integer intIdPrograma;
	private String strPrograma;
	private String strEstatus;
	private Integer intIdEstatus;

	private Integer intIdProgramaCampus;
	private String  strIdProgramaCampus;
	private Integer intIdProgramaEducativo;
	private Integer intIdAreaCampus;
	private Integer intCveNivelEducativo;
	private String strDsRegistroImss;
	private String strDsProgramaEducativo;
	private String strDsCampus;
	private String strDsProgramaCampus;

	private Boolean blnSeleccionar;
	/**
	 * Default constructor
	 */
	public ProgramaEducativoTO() {
		super();
	}

	public ProgramaEducativoTO(Integer intIdPrograma) {
		super();
		this.intIdPrograma = intIdPrograma;
	}

	public ProgramaEducativoTO(final Integer intIdPrograma, final String strPrograma) {
		super();
		this.intIdPrograma = intIdPrograma;
		this.strPrograma = strPrograma;
	}

	public ProgramaEducativoTO(final SePaProgramaEducativo programa) {
		super();
		intIdPrograma = programa.getId().getIntIdPrograma();
		strPrograma = programa.getId().getStrPrograma();
	}

	public ProgramaEducativoTO(final SePaProgramaCampusLic programa) {
		super();
		BeanUtils.copyProperties(programa, this);
		intIdPrograma = programa.getIntIdProgramaCampus();
		strPrograma = programa.getStrDsProgramaEducativo();
		strDsProgramaCampus = programa.getStrDsProgramaCampus();
	}

	public Integer getIntIdPrograma() {
		return intIdPrograma;
	}

	public void setIntIdPrograma(Integer intIdPrograma) {
		this.intIdPrograma = intIdPrograma;
	}

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public Integer getIntIdEstatus() {
		return intIdEstatus;
	}

	public void setIntIdEstatus(Integer intIdEstatus) {
		this.intIdEstatus = intIdEstatus;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public Integer getIntIdProgramaEducativo() {
		return intIdProgramaEducativo;
	}

	public void setIntIdProgramaEducativo(Integer intIdProgramaEducativo) {
		this.intIdProgramaEducativo = intIdProgramaEducativo;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public Integer getIntCveNivelEducativo() {
		return intCveNivelEducativo;
	}

	public void setIntCveNivelEducativo(Integer intCveNivelEducativo) {
		this.intCveNivelEducativo = intCveNivelEducativo;
	}

	public String getStrDsRegistroImss() {
		return strDsRegistroImss;
	}

	public void setStrDsRegistroImss(String strDsRegistroImss) {
		this.strDsRegistroImss = strDsRegistroImss;
	}

	public String getStrDsProgramaEducativo() {
		return strDsProgramaEducativo;
	}

	public void setStrDsProgramaEducativo(String strDsProgramaEducativo) {
		this.strDsProgramaEducativo = strDsProgramaEducativo;
	}

	public String getStrDsCampus() {
		return strDsCampus;
	}

	public void setStrDsCampus(String strDsCampus) {
		this.strDsCampus = strDsCampus;
	}

	public String getStrDsProgramaCampus() {
		return strDsProgramaCampus;
	}

	public void setStrDsProgramaCampus(String strDsProgramaCampus) {
		this.strDsProgramaCampus = strDsProgramaCampus;
	}
	
	public String getStrIdProgramaCampus() {
		return intIdProgramaCampus+"";
	}

	public void setStrIdProgramaCampus(String strIdProgramaCampus) {
		this.strIdProgramaCampus = strIdProgramaCampus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((intCveNivelEducativo == null) ? 0 : intCveNivelEducativo.hashCode());
		result = prime * result + ((intIdAreaCampus == null) ? 0 : intIdAreaCampus.hashCode());
		result = prime * result + ((intIdEstatus == null) ? 0 : intIdEstatus.hashCode());
		result = prime * result + ((intIdPrograma == null) ? 0 : intIdPrograma.hashCode());
		result = prime * result + ((intIdProgramaCampus == null) ? 0 : intIdProgramaCampus.hashCode());
		result = prime * result + ((intIdProgramaEducativo == null) ? 0 : intIdProgramaEducativo.hashCode());
		result = prime * result + ((strDsCampus == null) ? 0 : strDsCampus.hashCode());
		result = prime * result + ((strDsProgramaEducativo == null) ? 0 : strDsProgramaEducativo.hashCode());
		result = prime * result + ((strDsRegistroImss == null) ? 0 : strDsRegistroImss.hashCode());
		result = prime * result + ((strEstatus == null) ? 0 : strEstatus.hashCode());
		result = prime * result + ((strPrograma == null) ? 0 : strPrograma.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ProgramaEducativoTO))
			return false;
		ProgramaEducativoTO other = (ProgramaEducativoTO) obj;
		if (intCveNivelEducativo == null) {
			if (other.intCveNivelEducativo != null)
				return false;
		} else if (!intCveNivelEducativo.equals(other.intCveNivelEducativo))
			return false;
		if (intIdAreaCampus == null) {
			if (other.intIdAreaCampus != null)
				return false;
		} else if (!intIdAreaCampus.equals(other.intIdAreaCampus))
			return false;
		if (intIdEstatus == null) {
			if (other.intIdEstatus != null)
				return false;
		} else if (!intIdEstatus.equals(other.intIdEstatus))
			return false;
		if (intIdPrograma == null) {
			if (other.intIdPrograma != null)
				return false;
		} else if (!intIdPrograma.equals(other.intIdPrograma))
			return false;
		if (intIdProgramaCampus == null) {
			if (other.intIdProgramaCampus != null)
				return false;
		} else if (!intIdProgramaCampus.equals(other.intIdProgramaCampus))
			return false;
		if (intIdProgramaEducativo == null) {
			if (other.intIdProgramaEducativo != null)
				return false;
		} else if (!intIdProgramaEducativo.equals(other.intIdProgramaEducativo))
			return false;
		if (strDsCampus == null) {
			if (other.strDsCampus != null)
				return false;
		} else if (!strDsCampus.equals(other.strDsCampus))
			return false;
		if (strDsProgramaEducativo == null) {
			if (other.strDsProgramaEducativo != null)
				return false;
		} else if (!strDsProgramaEducativo.equals(other.strDsProgramaEducativo))
			return false;
		if (strDsRegistroImss == null) {
			if (other.strDsRegistroImss != null)
				return false;
		} else if (!strDsRegistroImss.equals(other.strDsRegistroImss))
			return false;
		if (strEstatus == null) {
			if (other.strEstatus != null)
				return false;
		} else if (!strEstatus.equals(other.strEstatus))
			return false;
		if (strPrograma == null) {
			if (other.strPrograma != null)
				return false;
		} else if (!strPrograma.equals(other.strPrograma))
			return false;
		return true;
	}

	public Boolean getBlnSeleccionar() {
		return blnSeleccionar;
	}

	public void setBlnSeleccionar(Boolean blnSeleccionar) {
		this.blnSeleccionar = blnSeleccionar;
	}

	
	
	

}