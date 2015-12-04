package controller;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.ClienteModel;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.*;

import entities.Cliente;

/**
 * 
 * @author Franco Escobar
 *
 */
public class ClienteAction extends ActionSupport implements ServletRequestAware {

	private static final long serialVersionUID = 1L;

	private HttpServletRequest request;

	private ClienteModel clienteModel = new ClienteModel();

	private List<Cliente> lstClientes;

	private Cliente cliente = new Cliente();

	private String fechanaci;
	private int clienteID;
	private String nombre;
	private String primerape;
	private String segunape;
	private String cedula;
	private String nacionalidad;
	private String sexo;
	private String estadoCivil;
	private byte[] imagen;
	private String ingrepor;
	private String coment;
	private String fechaingre;
	private String fuenteInf;
	private String estado;
	
	

	public List<Cliente> getLstClientes() {
		return lstClientes;
	}

	public void setLstClientes(List<Cliente> lstClientes) {
		this.lstClientes = lstClientes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getFechanaci() {
		return fechanaci;
	}

	public void setFechanaci(String fechanaci) {
		this.fechanaci = fechanaci;
	}

	public int getClienteID() {
		return clienteID;
	}

	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerape() {
		return primerape;
	}

	public void setPrimerape(String primerape) {
		this.primerape = primerape;
	}

	public String getSegunape() {
		return segunape;
	}

	public void setSegunape(String segunape) {
		this.segunape = segunape;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public String getIngrepor() {
		return ingrepor;
	}

	public void setIngrepor(String ingrepor) {
		this.ingrepor = ingrepor;
	}

	public String getComent() {
		return coment;
	}

	public void setComent(String coment) {
		this.coment = coment;
	}

	public String getFechaingre() {
		return fechaingre;
	}

	public void setFechaingre(String fechaingre) {
		this.fechaingre = fechaingre;
	}

	public String getFuenteInf() {
		return fuenteInf;
	}

	public void setFuenteInf(String fuenteInf) {
		this.fuenteInf = fuenteInf;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public String execute() throws Exception {
		this.lstClientes = clienteModel.getClientes();
		return SUCCESS;
	}

	public String addNew() throws Exception {
		return SUCCESS;
	}

	public String processAddNew() throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date fechanaci = format.parse(this.fechanaci);
		this.cliente.setFechaNacii(fechanaci);
		
		java.util.Date fechaingre = format.parse(this.fechaingre);
		this.cliente.setFechaIngre(fechaingre);
		
		boolean result = clienteModel.addNew(this.cliente);
		if (result) {
			this.lstClientes = clienteModel.getClientes();
			return SUCCESS;
		}
		request.setAttribute("message", "No se agrego el nuevo registro!");
		return ERROR;
	}

	public String update() throws Exception {
		this.cliente = clienteModel.getClienteByID(this.clienteID);
		return SUCCESS;
	}

	public String processUpdate() throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date fechanaci = format.parse(this.fechanaci);
		this.cliente.setFechaNacii(fechanaci);
		
		java.util.Date fechaingre = format.parse(this.fechaingre);
		this.cliente.setFechaIngre(fechaingre);
		
		boolean result = clienteModel.update(this.cliente);
		if (result) {
			this.lstClientes = clienteModel.getClientes();
			return SUCCESS;
		}
		request.setAttribute("message", "Update is unsuccessful!");
		return ERROR;
	}

	public String search() throws Exception {
		this.lstClientes = clienteModel.getClientes();
		return SUCCESS;
	}

	public String processSearch() throws Exception {
		if (this.nombre.trim().equals("")) {
			this.lstClientes = clienteModel.getClientes();
		} else {
			this.lstClientes = clienteModel.searchClienteByName(this.nombre);
		}
		return SUCCESS;
	}
}