/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.RemoteInterface;

/**
 *
 * @author savidu
 */
public class RemoteClient {
    public static void main(String[] args) {
        try {
            RemoteInterface remoteInterface=(RemoteInterface) Naming.lookup("rmi://localhost:5050/RemoteServer");
            remoteInterface.remoteMethod();
        } catch (NotBoundException ex) {
            Logger.getLogger(RemoteClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RemoteClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(RemoteClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
