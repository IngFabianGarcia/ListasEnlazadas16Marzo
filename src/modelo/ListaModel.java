package modelo;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabian
 */



public class ListaModel {
  Queue<Clientes> ListaClientes = new LinkedList();  
    public void EncolarCliente(String ape, String nom){
        Clientes nuevoCliente = new Clientes(nom, ape);
        this.ListaClientes.add(nuevoCliente);
    }
    
    public Queue ListarClientes(){
        return this.ListaClientes;
        
    }
    
    public void DesEncolar(){
        this.ListaClientes.poll();
    }
}
