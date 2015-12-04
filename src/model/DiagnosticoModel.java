package model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entities.DiagnosticoCliente;

public class DiagnosticoModel {
	// Add or update diagnostico.
		public boolean addDiagnostico(DiagnosticoCliente diagnosticoCliente) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
				session.saveOrUpdate(diagnosticoCliente);
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
		
		public DiagnosticoCliente getByID(int clienteID) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
				DiagnosticoCliente id=new DiagnosticoCliente();
				id.setIdcliente(clienteID);
				DiagnosticoCliente diagnosticoCliente = (DiagnosticoCliente) session.get(DiagnosticoCliente.class, clienteID);
				transaction.commit();
				return diagnosticoCliente;
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
