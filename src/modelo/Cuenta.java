/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.*;

public class Cuenta {
    public static int CANT_CARACTER_NIP = 5; 
    int id;
    double saldo;
    int pin;
    
    
    public Cuenta(int id, int pin, double saldo){
        this.id = id;
        this.pin = pin;
        this.saldo = saldo;
    }

   
    
    public int getId(){
        return this.id;
    }
    
    public int getPin(){
        return this.pin;
    }
    
    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        System.out.println("salde desde cuenta "+saldo);
        this.saldo = saldo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean largoPermitido(int pin){
        int largo = String.valueOf(pin).length();
       if(largo == CANT_CARACTER_NIP) {
           return true;
       }else{
         return false;
       }
    }
    @Override
    public String toString() {
        return "Cuenta{" + "id=" + id + ", saldo=" + saldo + ", pin=" + pin + '}';
    }
    
}
