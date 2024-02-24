/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprogavaltamirano;
import Controlador.Controlador;
import Vista.PantallaCuenta;
/**
 *
 * @author Usuario
 */
public class FinalProgAvAltamirano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PantallaCuenta f = new PantallaCuenta();
        Controlador c = new Controlador();
        c.Iniciar(f);
    }
    
}
