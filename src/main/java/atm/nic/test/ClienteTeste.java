package atm.nic.test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import atm.nic.model.MyFirstClass;
import atm.nic.rmi.IRMII;


public class ClienteTeste {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		IRMII testejpa = (IRMII)Naming.lookup("rmi://127.1.1.1/nic");
		
		MyFirstClass obj = new MyFirstClass();
		obj.setNumero(321);
		obj.setTexto("Nicolas");
		
		testejpa.salvar(obj);
		
	}
}
