/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.ArrayList;
import java.time.LocalTime;

/**
 *
 * @author Usuario
 */
public class Cajero {
    
    private ArrayList<Cuenta> Cuentas;
    private Cuenta cuentaIntroducida;
    private int montoCajero;
    
    public Cajero(){
        this.Cuentas = new ArrayList<>();
        this.AgregarCuentas();
    }
    
    public void AgregarCuentas(){
        this.Cuentas.add(new Cuenta(12345,12030,123999));
        this.Cuentas.add(new Cuenta(14545,33030,12350));
        this.Cuentas.add(new Cuenta(22305,89130,123789));
        this.Cuentas.add(new Cuenta(32395,67230,3067845));
        this.Cuentas.add(new Cuenta(42585,13330,6729345));
        this.Cuentas.add(new Cuenta(52675,92430,451238));
        this.Cuentas.add(new Cuenta(62965,82530,654045));
        this.Cuentas.add(new Cuenta(72155,72630,9804205));
    }
    
   
    
     public Cuenta VerificarPin(int pin) {//anda
        Cuenta cuentaIntroducida = null; 
        for(Cuenta cuenta: Cuentas){
            if(cuenta.getPin() == pin && cuenta.largoPermitido(pin)){
             this.cuentaIntroducida= cuenta;
            }
        }
         return this.cuentaIntroducida;
    }

    public boolean verificarCuenta(int numCuenta) {//anda
        for(Cuenta cuenta: Cuentas){
            if(cuenta.getId() == numCuenta){
                return true;
            }
        }
         return false;
    }
    
    public double VerSaldo(int p){
        double monto=0;
        for(Cuenta cuenta: Cuentas){
            if(cuenta.getPin()==p){
                return monto = cuenta.getSaldo();
                }
            }
        return monto;
        }
    
    public double Depositar(double montoDeposito, double saldoActual) {
       return saldoActual + montoDeposito;
    }

    public double Retirar(int montoRetiro, int saldoActual) {
        if(saldoActual>=montoRetiro){
            return saldoActual-montoRetiro;
        }else{
            return -1;
        }
    }
     
    public int CargarCajero(){
        return LocalTime.now()==LocalTime.MIDNIGHT? this.montoCajero = 10000 : this.montoCajero;
    }
 
    
}
