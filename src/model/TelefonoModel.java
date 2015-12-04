package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entities.TelefonoCliente;

public class TelefonoModel {
	// Add or update telefono.
			public boolean addTelefono(TelefonoCliente telefonoCliente) {
				Session session = HibernateUtil.getSessionFactory().openSession();
				Transaction transaction = null;
				try {
					transaction = session.beginTransaction();
					session.saveOrUpdate(telefonoCliente);
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
			
			public TelefonoCliente getByID(int clienteID) {
				Session session = HibernateUtil.getSessionFactory().openSession();
				Transaction transaction = null;
				try {
					transaction = session.beginTransaction();
					TelefonoCliente id=new TelefonoCliente();
					id.setIdcliente(clienteID);
					TelefonoCliente telefonoCliente = (TelefonoCliente) session.get(TelefonoCliente.class, clienteID);
					transaction.commit();
					return telefonoCliente;
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
