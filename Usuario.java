/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicadenegocios;

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
  
  public int getTelefono(){
    return telefono;
  }
}
