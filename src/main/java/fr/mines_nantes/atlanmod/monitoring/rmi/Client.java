package fr.mines_nantes.atlanmod.monitoring.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Client extends Remote{
	public void receiveSrvMessage(String msg) throws RemoteException;
}
