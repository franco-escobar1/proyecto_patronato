package entities;

// Generated Aug 14, 2015 11:45:44 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TelefonoUsuarioId generated by hbm2java
 */
@Embeddable
public class TelefonoUsuarioId implements java.io.Serializable {

	private int idusuario;
	private String telhabit;
	private String telmovil;
	private String otrostel;

	public TelefonoUsuarioId() {
	}

	public TelefonoUsuarioId(int idusuario, String telhabit, String telmovil,
			String otrostel) {
		this.idusuario = idusuario;
		this.telhabit = telhabit;
		this.telmovil = telmovil;
		this.otrostel = otrostel;
	}

	@Column(name = "idusuario", nullable = false)
	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	@Column(name = "telhabit", nullable = false, length = 1000)
	public String getTelhabit() {
		return this.telhabit;
	}

	public void setTelhabit(String telhabit) {
		this.telhabit = telhabit;
	}

	@Column(name = "telmovil", nullable = false, length = 1000)
	public String getTelmovil() {
		return this.telmovil;
	}

	public void setTelmovil(String telmovil) {
		this.telmovil = telmovil;
	}

	@Column(name = "otrostel", nullable = false, length = 1000)
	public String getOtrostel() {
		return this.otrostel;
	}

	public void setOtrostel(String otrostel) {
		this.otrostel = otrostel;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TelefonoUsuarioId))
			return false;
		TelefonoUsuarioId castOther = (TelefonoUsuarioId) other;

		return (this.getIdusuario() == castOther.getIdusuario())
				&& ((this.getTelhabit() == castOther.getTelhabit()) || (this
						.getTelhabit() != null
						&& castOther.getTelhabit() != null && this
						.getTelhabit().equals(castOther.getTelhabit())))
				&& ((this.getTelmovil() == castOther.getTelmovil()) || (this
						.getTelmovil() != null
						&& castOther.getTelmovil() != null && this
						.getTelmovil().equals(castOther.getTelmovil())))
				&& ((this.getOtrostel() == castOther.getOtrostel()) || (this
						.getOtrostel() != null
						&& castOther.getOtrostel() != null && this
						.getOtrostel().equals(castOther.getOtrostel())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdusuario();
		result = 37 * result
				+ (getTelhabit() == null ? 0 : this.getTelhabit().hashCode());
		result = 37 * result
				+ (getTelmovil() == null ? 0 : this.getTelmovil().hashCode());
		result = 37 * result
				+ (getOtrostel() == null ? 0 : this.getOtrostel().hashCode());
		return result;
	}

}
