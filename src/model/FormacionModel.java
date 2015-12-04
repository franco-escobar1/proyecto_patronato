package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entities.FormacionCliente;

public class FormacionModel {
	// Add or update formacion.
		public boolean addFormacion(FormacionCliente formacionCliente) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
				session.saveOrUpdate(formacionCliente);
				transaction.commit();
				return true;
			} catch (Exception e) {
				if (!(transaction == null)) {
					transaction.rollback();
				}
			} finally {
				session.close();
			}
			return false;
		}
		
		public FormacionCliente getByID(int clienteID) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
				FormacionCliente id=new FormacionCliente();
				id.setIdcliente(clienteID);
				FormacionCliente formacionCliente = (FormacionCliente) session.get(FormacionCliente.class, clienteID);
				transaction.commit();
				return formacionCliente;
			} catch (Exception e) {
				if (!(transaction == null)) {
					transaction.rollback();
				}
			} finally {
				session.close();
			}
			return null;
		}
}
