/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Milton
 */
public class myIP {
    public String get(){
     
        try {
            InetAddress ipAddr = InetAddress.getLocalHost();
            return(ipAddr.getHostAddress());
        } catch (UnknownHostException ex) {
        }
        return "127.0.0.1";
    }    
}
