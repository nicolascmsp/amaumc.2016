package atm.nic.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import javax.persistence.EntityManager;

import atm.nic.model.Entity;
import atm.nic.model.MyFirstClass;

public class Implents implements IRMII {
	
	  public Implents() throws RemoteException {
			UnicastRemoteObject.exportObject(this,1099);
		}  

	public void remover(MyFirstClass obj) throws RemoteException {
		EntityManager em = new Entity().getEntityManager();

		em.getTransaction().begin();
		em.remove(obj.getId());
		em.getTransaction().commit();

		em.close();
	}

	public void salvar(MyFirstClass obj) throws RemoteException {
		EntityManager em = new Entity().getEntityManager();

		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();

		em.close();
	}

	public void atualizar(MyFirstClass obj) throws RemoteException {
		EntityManager em = new Entity().getEntityManager();

		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();

		em.close();
	}

	public MyFirstClass consultar(String texto) throws RemoteException {
		EntityManager em = new Entity().getEntityManager();
		List<MyFirstClass> lista = em.createQuery("FROM MyFirstClass", MyFirstClass.class).getResultList();

		for (MyFirstClass selected : lista) {
			if (selected.getTexto().equals(texto))
				return selected;
		}
		return null;
	}

}
