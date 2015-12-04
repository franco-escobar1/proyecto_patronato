package model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entities.Cliente;

/**
 * 
 * @author Franco Escobar
 *
 */
public class ClienteModel {
	
	// 1. Get all pacientes.
	public List<Cliente> getClientes() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("FROM Cliente");
			List<Cliente> lstClientes = query.list();
			transaction.commit();
			return lstClientes;
		} catch (Exception e) {
			if (!(transaction == null)) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return null;
	}

	// 2. Add new paciente.
	public boolean addNew(Cliente cliente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(cliente);
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

	// 3. Get paciente by id.
	public Cliente getClienteByID(int clienteID) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Cliente cliente = (Cliente) session.get(Cliente.class, clienteID);
			transaction.commit();
			return cliente;
		} catch (Exception e) {
			if (!(transaction == null)) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return null;
	}

	// 4. Update paciente.
	public boolean update(Cliente cliente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(cliente);
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



	// 6. Search paciente by name.
	public List<Cliente> searchClienteByName(String nombre) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session
					.createQuery("FROM Cliente WHERE Nombre like :nombre");
			query.setString("nombre", "%" + nombre + "%");
			List<Cliente> lstClientes = query.list();
			transaction.commit();
			return lstClientes;
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