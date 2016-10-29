package atm.nic.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import atm.nic.model.MyFirstClass;

public interface IRMII extends Remote {

	public void remover(MyFirstClass obj)  throws RemoteException;
	public void salvar(MyFirstClass obj)  throws RemoteException;
	public MyFirstClass consultar(String texto)  throws RemoteException;
	public void atualizar(MyFirstClass obj)  throws RemoteException;
	
}
