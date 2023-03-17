package clase_3_14;

import controlador.ListaController;
import modelo.ListaModel;
import vista.frmListas;

/**
 *
 * @author Fabian
 */
public class Clase_3_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmListas VistaListas = new frmListas(null, true);
        ListaModel ModeloLista = new ListaModel();
        ListaController ControladorLista = new ListaController(VistaListas, ModeloLista);
    }
    
}
