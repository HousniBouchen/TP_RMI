
package dao;


import entities.Machine;
import entities.Salle;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface IDao <T> extends Remote{
    boolean create(T o) throws RemoteException;
    boolean update(T o) throws RemoteException;
    boolean delete(T o) throws RemoteException;
    T findById(int id) throws RemoteException;
    List<T> findAll() throws RemoteException;
    List<Machine> findMachineBySalle(String c) throws RemoteException;
}
