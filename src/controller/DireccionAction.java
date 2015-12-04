package controller;

import javax.servlet.http.HttpServletRequest;

import model.DireccionModel;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.*;

import entities.DirecCliente;

/**
 * 
 * @author Franco Escobar
 *
 */

public class DireccionAction extends ActionSupport implements ServletRequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5063057665191581804L;

	private HttpServletRequest request;
	
	private DireccionModel direccionModel = new DireccionModel();
	
	private DirecCliente direcCliente = new DirecCliente();
	
	private int clienteID;
	private String provincia;
	private String canton;
	private String distrito;
	private String otro;
	
	public DirecCliente getDirecCliente() {
		return direcCliente;
	}
	public void setDirecClienteId(DirecCliente direcCliente) {
		this.direcCliente = direcCliente;
	}
	public int getClienteID() {
		return clienteID;
	}
	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCanton() {
		return canton;
	}
	public void setCanton(String canton) {
		this.canton = canton;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getOtro() {
		return otro;
	}
	public void setOtro(String otro) {
		this.otro = otro;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public String direccion() throws Exception {
		this.direcCliente = direccionModel.getByID(this.clienteID);
		if(this.direcCliente==null){
			this.direcCliente=new DirecCliente();
			this.direcCliente.setIdcliente(this.clienteID);
		}
		return SUCCESS;
	}
	
	public String processDireccion() throws Exception {
		boolean result = direccionModel.addDireccion(this.direcCliente);
		if (result) {
			return SUCCESS;
		}
		request.setAttribute("message", "No se ha guardado la informacion!");
		return ERROR;
	}
}
