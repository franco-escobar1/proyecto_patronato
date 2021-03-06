package entities;

// Generated Aug 14, 2015 11:45:44 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TelefonoClienteId generated by hbm2java
 */
@Embeddable
public class TelefonoClienteId implements java.io.Serializable {

	private int idcliente;
	private String telhabit;
	private String telmovil;
	private String teltrab;
	private String otrostel;

	public TelefonoClienteId() {
	}

	public TelefonoClienteId(int idcliente) {
		this.idcliente = idcliente;
	}

	public TelefonoClienteId(int idcliente, String telhabit, String telmovil,
			String teltrab, String otrostel) {
		this.idcliente = idcliente;
		this.telhabit = telhabit;
		this.telmovil = telmovil;
		this.teltrab = teltrab;
		this.otrostel = otrostel;
	}

	@Column(name = "idcliente", nullable = false)
	public int getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	@Column(name = "telhabit", length = 1000)
	public String getTelhabit() {
		return this.telhabit;
	}

	public void setTelhabit(String telhabit) {
		this.telhabit = telhabit;
	}

	@Column(name = "telmovil", length = 1000)
	public String getTelmovil() {
		return this.telmovil;
	}

	public void setTelmovil(String telmovil) {
		this.telmovil = telmovil;
	}

	@Column(name = "teltrab", length = 1000)
	public String getTeltrab() {
		return this.teltrab;
	}

	public void setTeltrab(String teltrab) {
		this.teltrab = teltrab;
	}

	@Column(name = "otrostel", length = 1000)
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
		if (!(other instanceof TelefonoClienteId))
			return false;
		TelefonoClienteId castOther = (TelefonoClienteId) other;

		return (this.getIdcliente() == castOther.getIdcliente())
				&& ((this.getTelhabit() == castOther.getTelhabit()) || (this
						.getTelhabit() != null
						&& castOther.getTelhabit() != null && this
						.getTelhabit().equals(castOther.getTelhabit())))
				&& ((this.getTelmovil() == castOther.getTelmovil()) || (this
						.getTelmovil() != null
						&& castOther.getTelmovil() != null && this
						.getTelmovil().equals(castOther.getTelmovil())))
				&& ((this.getTeltrab() == castOther.getTeltrab()) || (this
						.getTeltrab() != null && castOther.getTeltrab() != null && this
						.getTeltrab().equals(castOther.getTeltrab())))
				&& ((this.getOtrostel() == castOther.getOtrostel()) || (this
						.getOtrostel() != null
						&& castOther.getOtrostel() != null && this
						.getOtrostel().equals(castOther.getOtrostel())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdcliente();
		result = 37 * result
				+ (getTelhabit() == null ? 0 : this.getTelhabit().hashCode());
		result = 37 * result
				+ (getTelmovil() == null ? 0 : this.getTelmovil().hashCode());
		result = 37 * result
				+ (getTeltrab() == null ? 0 : this.getTeltrab().hashCode());
		result = 37 * result
				+ (getOtrostel() == null ? 0 : this.getOtrostel().hashCode());
		return result;
	}

}
