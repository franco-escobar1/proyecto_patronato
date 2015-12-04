package controller;

import javax.servlet.http.HttpServletRequest;

import model.FormacionModel;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.*;

import entities.FormacionCliente;


/**
 * 
 * @author Franco Escobar
 *
 */

public class FormacionAction extends ActionSupport implements ServletRequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 521233718728265143L;

	private HttpServletRequest request;
	
	private FormacionModel formacionModel = new FormacionModel();
	
	private FormacionCliente formacionCliente = new FormacionCliente();
	
	private int clienteID;
	private String escolaridad;
	private String ocupacion;
	private String carrera;
	private String educEspe;
	private String otros;
	
	public FormacionCliente getFormacionCliente() {
		return formacionCliente;
	}
	public void setFormacionClienteId(FormacionCliente formacionCliente) {
		this.formacionCliente = formacionCliente;
	}
	public int getClienteID() {
		return clienteID;
	}
	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}
	public String getEscolaridad() {
		return escolaridad;
	}
	public void setEscolaridad(String escolaridad) {
		this.escolaridad = escolaridad;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getEducEspe() {
		return educEspe;
	}
	public void setEducEspe(String educEspe) {
		this.educEspe = educEspe;
	}
	public String getOtros() {
		return otros;
	}
	public void setOtros(String otros) {
		this.otros = otros;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public String formacion() throws Exception {
		this.formacionCliente = formacionModel.getByID(this.clienteID);
		if(this.formacionCliente==null){
			this.formacionCliente=new FormacionCliente();
			this.formacionCliente.setIdcliente(this.clienteID);
		}
		return SUCCESS;
	}
	
	public String processFormacion() throws Exception {
		boolean result = formacionModel.addFormacion(this.formacionCliente);
		if (result) {
			return SUCCESS;
		}
		request.setAttribute("message", "No se ha guardado la informacion!");
		return ERROR;
	}
	
}
