/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author savidu
 */
public class StartMain {
    public static void main(String[] args) {
        try {
            Registry rmiRegistry=LocateRegistry.createRegistry(5050);
            rmiRegistry.rebind("RemoteServer", new RemoteClass());
            System.out.println("Starting server....");
        } catch (RemoteException ex) {
            Logger.getLogger(StartMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
