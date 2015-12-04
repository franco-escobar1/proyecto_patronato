package controller;

import javax.servlet.http.HttpServletRequest;

import model.DiagnosticoModel;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.*;

import entities.DiagnosticoCliente;

/**
 * 
 * @author Franco Escobar
 *
 */

public class DiagnosticoAction extends ActionSupport implements ServletRequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = -950767912999216216L;

	private HttpServletRequest request;
	
	private DiagnosticoModel diagnosticoModel = new DiagnosticoModel();
	
	private DiagnosticoCliente diagnosticoCliente = new DiagnosticoCliente();
	
	private int clienteID;
	private String diagnostico;
	private String nivelceguera;
	private String origenceguera;
	private String otradiscap;
	private String comentario;
	
	public DiagnosticoCliente getDiagnosticoCliente() {
		return diagnosticoCliente;
	}
	public void setDiagnosticoCliente(DiagnosticoCliente diagnosticoCliente) {
		this.diagnosticoCliente = diagnosticoCliente;
	}
	public int getClienteID() {
		return clienteID;
	}
	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getNivelceguera() {
		return nivelceguera;
	}
	public void setNivelceguera(String nivelceguera) {
		this.nivelceguera = nivelceguera;
	}
	public String getOrigenceguera() {
		return origenceguera;
	}
	public void setOrigenceguera(String origenceguera) {
		this.origenceguera = origenceguera;
	}
	public String getOtradiscap() {
		return otradiscap;
	}
	public void setOtradiscap(String otradiscap) {
		this.otradiscap = otradiscap;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	@Override
	public String execute() throws Exception {
		//this.lstClientes = clienteModel.getClientes();
		return SUCCESS;
	}
	
	public String diagnostico() throws Exception {
		this.diagnosticoCliente = diagnosticoModel.getByID(this.clienteID);
		if(this.diagnosticoCliente==null){
			this.diagnosticoCliente=new DiagnosticoCliente();
			this.diagnosticoCliente.setIdcliente(this.clienteID);
		}
		return SUCCESS;
	}
	
	public String processDiagnostico() throws Exception {
		boolean result = diagnosticoModel.addDiagnostico(this.diagnosticoCliente);
		if (result) {
			return SUCCESS;
		}
		request.setAttribute("message", "No se ha guardado la informacion!");
		return ERROR;
	}
}
