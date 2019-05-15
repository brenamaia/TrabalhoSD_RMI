/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;


import java.net.URL;
import java.rmi.RemoteException;
import Interfaces.interfaceRMI;
import java.util.Random;
/**
 *
 * @author Milton
 */
public class Main {
    
    public static void main(String[] args) throws RemoteException {
        int vector[] = new int [5];
        Random gerador = new Random();
        
        int i;
        
        for (i = 0; i<5; i++){
            vector[i] = gerador.nextInt(100);
            System.out.println(vector[i]+" ");
        }
        Cliente cliente = new Cliente();
        interfaceRMI rmiinter = cliente.init();
        rmiinter.sendData("uuuu");
        
    }
    
}
