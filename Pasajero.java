/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicadenegocios;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Pasajero extends Persona{
  private static int cantPasajeros;
  private static ArrayList<Pasajero> pasajeros=new ArrayList<Pasajero>();
  
  public Pasajero(String pNombre, int pCedula, String pCorreo,int pTelefono){
    super(pNombre, pCedula, pCorreo, pTelefono);
    cantPasajeros++;
  }
  public static ArrayList<Pasajero> getPasajeros(){
    return pasajeros;
  }
    
}
