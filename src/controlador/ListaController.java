/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;
import modelo.Clientes;
import modelo.ListaModel;
import vista.frmListas;

/**
 *
 * @author Fabian
 */
public class ListaController implements ActionListener {
    frmListas VistaLista;
    ListaModel ModeloLista;

    public ListaController(frmListas VistaLista, ListaModel ModeloLista) {
        this.VistaLista = VistaLista;
        this.ModeloLista = ModeloLista;
        
        this.VistaLista.btnAtenderCliente.addActionListener(this);
        this.VistaLista.btnAtenderTodos.addActionListener(this);
        this.VistaLista.btnIngresarCliente.addActionListener(this);
        
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaLista.btnIngresarCliente){
            this.ModeloLista.EncolarCliente(this.VistaLista.txtApellidos.getText(),
                    this.VistaLista.txtNombre.getText());
            
           
            
            //mostrar los datos en el text area
            Queue <Clientes> ListaLocal = this.ModeloLista.ListarClientes();
            
            String Cadena = "";
           for (Clientes MiListaClientes: ListaLocal)
               
               Cadena = Cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombre()+"\n";
            this.VistaLista.txtListaClientes.setText(Cadena);
            
            this.VistaLista.txtApellidos.setText("");
            this.VistaLista.txtNombre.setText("");
            
        }
        
        if(e.getSource()==this.VistaLista.btnAtenderCliente){
            
           
        }
        
        if(e.getSource()==this.VistaLista.btnAtenderTodos){
            
            
        }
        
    }
    
}
