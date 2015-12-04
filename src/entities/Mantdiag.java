package entities;

// Generated Aug 14, 2015 11:45:44 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Mantdiag generated by hbm2java
 */
@Entity
@Table(name = "mantdiag", catalog = "panaci")
public class Mantdiag implements java.io.Serializable {

	private Integer idmantediag;
	private String nombre;
	private String descripcion;

	public Mantdiag() {
	}

	public Mantdiag(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idmantediag", unique = true, nullable = false)
	public Integer getIdmantediag() {
		return this.idmantediag;
	}

	public void setIdmantediag(Integer idmantediag) {
		this.idmantediag = idmantediag;
	}

	@Column(name = "nombre", nullable = false, length = 1000)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion", nullable = false, length = 1000)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
