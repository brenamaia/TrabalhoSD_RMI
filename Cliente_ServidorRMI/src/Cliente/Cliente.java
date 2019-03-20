/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.net.MalformedURLException;
import java.rmi.*;
import Interfaces.interfaceRMI;

/**
 *
 * @author Milton
 */

public class Cliente {
    
    public interfaceRMI init() {

        String remoteHostName = "192.168.43.21";
        int remotePort = 9000;
        String connectLocation = "//" + remoteHostName + ":" + remotePort
                + "/Hello";

        interfaceRMI hello = null;
        try {
            System.out.println("Connecting to client at : " + connectLocation);
            hello = (interfaceRMI) Naming.lookup(connectLocation);
        } catch (MalformedURLException | RemoteException | NotBoundException e1) { }
        
        return hello;
    }
}


