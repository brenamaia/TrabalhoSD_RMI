/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.rmi.RemoteException;
import java.rmi.Remote;
/**
 *
 * @author Milton
 */
public interface interfaceRMI extends Remote{
   
    public void sendData(String texto)throws RemoteException; 

}
