package logicadenegocios;



public class Persona{
    // instance variables - replace the example below with your own
  private String nombre;
  private String cedula;
  private String correo;
  private String telefono;
  private Direccion direccion;

    /**
     * Constructor for objects of class Persona
     */
  public Persona(String pNombre, String pCedula, String pCorreo,String pTelefono){
    nombre = pNombre;
    cedula = pCedula;
    correo = pCorreo;
    telefono = pTelefono;
  }
  
  public String getNombre(){
    return nombre;
  }
  
  public String getCedula(){
    return cedula;
  }
  
  public String getCorreo(){
    return correo;
  }
  
  public String getTelefono(){
    return telefono;  
  }
  
  public String getDireccion(){
    return direccion.toString();
  }
}
