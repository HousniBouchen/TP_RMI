
package server;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;
import org.hibernate.Hibernate;
import service.SalleService;
import util.HibernateUtil;

public class Serveur {
    
    public static void main(String[] args) {
        try {
            IDao<Machine> machine = new MachineService();
            IDao<Salle> salle = new SalleService();
            LocateRegistry.createRegistry(1099);
            Naming.bind("rmi://localhost:1099/machine", machine);
            Naming.bind("rmi://localhost:1099/salle", salle);
            System.out.println("En attente des clients");
        } catch (RemoteException ex) {
            Logger.getLogger(Serveur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(Serveur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Serveur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
