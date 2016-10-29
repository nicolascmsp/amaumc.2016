package atm.nic.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class RMIServer {
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		LocateRegistry.createRegistry(1099);
	    Implents nic = new Implents();
	    Naming.rebind("nic", nic);
	    System.err.println("Servidor RUNNING ");
	     
	}
}
