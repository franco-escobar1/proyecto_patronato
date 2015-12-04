package controller;

import javax.servlet.http.HttpServletRequest;

import model.TelefonoModel;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.*;

import entities.TelefonoCliente;


public class TelefonoAction extends ActionSupport implements ServletRequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2074953980857101524L;

	private HttpServletRequest request;
	
	private TelefonoModel telefonoModel = new TelefonoModel();
		
	private TelefonoCliente telefonoCliente = new TelefonoCliente();
	
	private int clienteID;
	private String telhabit;
	private String telmovil;
	private String teltrab;
	private String otrostel;
	
	public TelefonoCliente getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(TelefonoCliente telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	public int getClienteID() {
		return clienteID;
	}
	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}
	public String getTelhabit() {
		return telhabit;
	}
	public void setTelhabit(String telhabit) {
		this.telhabit = telhabit;
	}
	public String getTelmovil() {
		return telmovil;
	}
	public void setTelmovil(String telmovil) {
		this.telmovil = telmovil;
	}
	public String getTeltrab() {
		return teltrab;
	}
	public void setTeltrab(String teltrab) {
		this.teltrab = teltrab;
	}
	public String getOtrostel() {
		return otrostel;
	}
	public void setOtrostel(String otrostel) {
		this.otrostel = otrostel;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public String telefono() throws Exception {
		this.telefonoCliente = telefonoModel.getByID(this.clienteID);
		if(this.telefonoCliente==null){
			this.telefonoCliente=new TelefonoCliente();
			this.telefonoCliente.setIdcliente(this.clienteID);
		}
		return SUCCESS;
	}
	
	public String processTelefono() throws Exception {
		boolean result = telefonoModel.addTelefono(this.telefonoCliente);
		if (result) {
			return SUCCESS;
		}
		request.setAttribute("message", "No se ha guardado la informacion!");
		return ERROR;
	}
}
