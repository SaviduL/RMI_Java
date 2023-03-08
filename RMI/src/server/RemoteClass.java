/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmi.RemoteInterface;

/**
 *
 * @author savidu
 */
public class RemoteClass extends UnicastRemoteObject implements RemoteInterface{
    public RemoteClass()throws RemoteException{

    }
    @Override
    public void remoteMethod() throws RemoteException {
        System.out.println("Client Called this method");
    }
    
}
