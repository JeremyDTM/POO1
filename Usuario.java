/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicadenegocios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
  private static  ArrayList<Chofer> choferes= new ArrayList<Chofer>();
  private static ArrayList<Secretaria> secretarios=new ArrayList<Secretaria>();
  private static ArrayList<Empresa>  empresas= new ArrayList(); 
  
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
    return choferes;
  }
  
  public static void setChoferes(Chofer chofer){
    choferes.add(chofer);
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
  
  public static ArrayList<Empresa> getEmpresas(){
    return empresas;
  }
  
  public static void setEmpresa(Empresa empresa){
    empresas.add(empresa);
  }
    
  public int getTelefono(){
    return telefono;
  }
  
  public void escribirJsonVehiculo(){  
    try (FileWriter file = new FileWriter("VehiculoDB.json")) {
      JSONArray company = new JSONArray();
      for(int indice=0; indice<vehiculos.size();indice++){
        JSONObject obj = new JSONObject();
        obj.put("placa", vehiculos.get(indice).getPlaca());
        obj.put("color",vehiculos.get(indice).getColor());
        obj.put("marca", vehiculos.get(indice).getMarca());
        obj.put("capacidad", vehiculos.get(indice).getCapacidad());
        obj.put("sede", vehiculos.get(indice).getSede());
        obj.put("estado", vehiculos.get(indice).getEstado());
        obj.put("vin",vehiculos.get(indice).getVin());
        obj.put("anio",vehiculos.get(indice).getAnio());
        company.add(obj);
      }
      file.write(company.toJSONString());
      file.flush();
      file.close();
    }catch(IOException e){
      //advertencia
    } 
  }
  public void escribirJsonChofer(){
    try(FileWriter file = new FileWriter("ChoferDB.json")){
      JSONArray company = new JSONArray();
      for(int indice=0; indice<choferes.size();indice++){
        JSONObject obj = new JSONObject();
        obj.put("nombre",choferes.get(indice).getNombre());
        obj.put("cedula",choferes.get(indice).getCedula());
        obj.put("correo",choferes.get(indice).getCorreo());
        obj.put("telefono",choferes.get(indice).getTelefono());
        obj.put("numero", choferes.get(indice).getLicenciasChofer().get(0).getNumero());
        obj.put("tipo", choferes.get(indice).getLicenciasChofer().get(0).getTipo());
        obj.put("fechaEmision", choferes.get(indice).getLicenciasChofer().get(0).getFechaEmision());
        obj.put("fechaExpira", choferes.get(indice).getLicenciasChofer().get(0).getFechaExpira());
        company.add(obj);
      }
      file.write(company.toJSONString());
      file.flush();
      file.close();
    }catch(IOException e){
       //advertencia
    }
  }
  public void escribirJsonPasajeros(){
    try(FileWriter file = new FileWriter("PasajeroDB.json")){
      JSONArray company = new JSONArray();
      for(int indice=0; indice<pasajeros.size();indice++){
        JSONObject obj = new JSONObject();
        obj.put("nombre",pasajeros.get(indice).getNombre());
        obj.put("cedula",pasajeros.get(indice).getCedula());
        obj.put("correo",pasajeros.get(indice).getCorreo());
        obj.put("telefono",pasajeros.get(indice).getTelefono());
        company.add(obj);
      }
      file.write(company.toJSONString());
      file.flush();
      file.close();
    }catch(IOException e){
       //advertencia
    }
  }
  public void escribirJsonUsuarios(){  
    try (FileWriter file = new FileWriter("UsuarioDB.json")) {
      JSONArray company = new JSONArray();
      for(int indice=0; indice<secretarios.size();indice++){
        JSONObject obj = new JSONObject();
        obj.put("nombre", secretarios.get(indice).getNombre());
        obj.put("departamento",secretarios.get(indice).getDepartamento());
        obj.put("nombreUsuario", secretarios.get(indice).getNombreUsuario());
        obj.put("telefono", secretarios.get(indice).getTelefono());
        obj.put("contraseña", secretarios.get(indice).getContrasenia());
        company.add(obj);
      }
      file.write(company.toJSONString());
      file.flush();
      file.close();
    }catch(IOException e){
      //advertencia
    } 
  }
}
