package entities;

// Generated Aug 14, 2015 11:45:44 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TelefonoUsuario generated by hbm2java
 */
@Entity
@Table(name = "telefono_usuario", catalog = "panaci")
public class TelefonoUsuario implements java.io.Serializable {

	private TelefonoUsuarioId id;

	public TelefonoUsuario() {
	}

	public TelefonoUsuario(TelefonoUsuarioId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idusuario", column = @Column(name = "idusuario", nullable = false)),
			@AttributeOverride(name = "telhabit", column = @Column(name = "telhabit", nullable = false, length = 1000)),
			@AttributeOverride(name = "telmovil", column = @Column(name = "telmovil", nullable = false, length = 1000)),
			@AttributeOverride(name = "otrostel", column = @Column(name = "otrostel", nullable = false, length = 1000)) })
	public TelefonoUsuarioId getId() {
		return this.id;
	}

	public void setId(TelefonoUsuarioId id) {
		this.id = id;
	}

}
