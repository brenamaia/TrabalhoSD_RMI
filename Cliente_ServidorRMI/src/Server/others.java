/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Server;

import Interfaces.interfaceRMI;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Milton
 */
public class others extends UnicastRemoteObject implements interfaceRMI {

public others() throws RemoteException { }

    
    public void sendData(String texto) throws RemoteException {
        String ordenados = null;
        System.out.println(texto);
        //ordenados = ordenaDados(vector);
        
    }
    private static String ordenaDados(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            int atual = vector[i];
            int j = i - 1;
            while (j >= 0 && vector[j] >= atual) {
                vector[j + 1] = vector[j];
                j--;
            }
            vector[j + 1] = atual;
        }
        return null;
    }

}
