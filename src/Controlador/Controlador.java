/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.*;
import java.util.ArrayList;
import modelo.*;

/**
 *
 * @author Usuario
 */
public class Controlador {
    private Pantalla1 p1;
    private Cajero b;
    public double i;
    
    public Controlador(){
        this.b = new Cajero();
    }
    
    public void Iniciar(Pantalla1 f){
        this.p1 = f;
        f.setVisible(true);
    }

    public boolean verificarCuenta(int numCuenta) {
        return b.verificarCuenta(numCuenta);
    }
     
    public double VerificarPin(int pin) {
        if(b.VerificarPin(pin)!=null){
            this.i = b.VerSaldo(pin);
        }
        return i;
    }

    
    public double getSaldo(int p){
       return b.VerSaldo(p);
    }

  

}
