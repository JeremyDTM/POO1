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
public class Usuario {
  protected String nombre;
  protected String departamento;
  protected String nombreUsuario;
  protected int telefono;
  protected String contrasenia;
  private static ArrayList<Viaje> viajes=new ArrayList<Viaje>();
  private static ArrayList<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
  private static ArrayList<Pasajero> pasajeros=new ArrayList<Pasajero>();
  private static  ArrayList<Chofer> Choferes= new ArrayList<Chofer>();
  private static ArrayList<Secretaria> secretarios=new ArrayList<Secretaria>();
  
  public Usuario(String pNombre, String pDepartamento, String pNombreUsuario,
    int pTelefono, String pContrasenia){
    nombre=pNombre;
    departamento=pDepartamento;
    nombreUsuario=pNombreUsuario;
    telefono=pTelefono;
    contrasenia=pContrasenia;        
  }
  
  public String getNombre(){
    return nombre;
  }
  public String getDepartamento(){
    return departamento;
  }
  public String getNombreUsuario(){
    return nombreUsuario;
  }
  public String getContrasenia(){
    return contrasenia;
  }
  
    public static ArrayList<Vehiculo> getVehiculos(){
    return vehiculos;
  }
  
  public static void setVehiculo(Vehiculo vehiculo){
    vehiculos.add(vehiculo);
  }
  
  public static ArrayList<Pasajero> getPasajeros(){
    return pasajeros;
  }
  
  public static void setPasajeros(Pasajero pasajero){
    pasajeros.add(pasajero);
  }
  
  public static ArrayList<Chofer> getChoferes(){
    return Choferes;
  }
  
  public static void setChoferes(Chofer chofer){
    Choferes.add(chofer);
  }
  
    public static ArrayList<Viaje> getViajes(){
    return viajes;
  }
  
    /**
     *
     * @param viaje
     */
    public static void setViajes(Viaje viaje){
     viajes.add(viaje);
  }
    
  public static ArrayList<Secretaria> getSecretaria(){
    return secretarios;
  }
  
  public static void setSecretaria(Secretaria secretaria){
    secretarios.add(secretaria);
  }
    
  public int getTelefono(){
    return telefono;
  }
}
