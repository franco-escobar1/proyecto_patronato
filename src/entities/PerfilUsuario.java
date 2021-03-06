package entities;

// Generated Aug 14, 2015 11:45:44 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PerfilUsuario generated by hbm2java
 */
@Entity
@Table(name = "perfil_usuario", catalog = "panaci")
public class PerfilUsuario implements java.io.Serializable {

	private PerfilUsuarioId id;

	public PerfilUsuario() {
	}

	public PerfilUsuario(PerfilUsuarioId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idusuario", column = @Column(name = "idusuario", nullable = false)),
			@AttributeOverride(name = "idperfil", column = @Column(name = "idperfil", nullable = false)),
			@AttributeOverride(name = "usuario", column = @Column(name = "usuario", nullable = false, length = 1000)),
			@AttributeOverride(name = "pass", column = @Column(name = "pass", nullable = false, length = 1000)),
			@AttributeOverride(name = "permisos", column = @Column(name = "permisos", nullable = false, length = 1000)),
			@AttributeOverride(name = "imaperf", column = @Column(name = "imaperf")) })
	public PerfilUsuarioId getId() {
		return this.id;
	}

	public void setId(PerfilUsuarioId id) {
		this.id = id;
	}

}
