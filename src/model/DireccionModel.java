package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entities.DirecCliente;

public class DireccionModel {
	
	// Add or update direccion.
			public boolean addDireccion(DirecCliente direcCliente) {
				Session session = HibernateUtil.getSessionFactory().openSession();
				Transaction transaction = null;
				try {
					transaction = session.beginTransaction();
					session.saveOrUpdate(direcCliente);
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
			
			public DirecCliente getByID(int clienteID) {
				Session session = HibernateUtil.getSessionFactory().openSession();
				Transaction transaction = null;
				try {
					transaction = session.beginTransaction();
					DirecCliente id=new DirecCliente();
					id.setIdcliente(clienteID);
					DirecCliente direcCliente = (DirecCliente) session.get(DirecCliente.class, clienteID);
					transaction.commit();
					return direcCliente;
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
