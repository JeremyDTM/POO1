package logicadenegocios;



public class Persona{
    // instance variables - replace the example below with your own
  protected String nombre;
  protected int cedula;
  protected String correo;
  protected int telefono;
  protected Direccion direccion;

    /**
     * Constructor for objects of class Persona 
     * @param pNombre
     * @param pCedula
     * @param pCorreo
     * @param pTelefono
     */
  
  public Persona(String pNombre, int pCedula, String pCorreo,int pTelefono){
    nombre = pNombre;
    cedula = pCedula;
    correo = pCorreo;
    telefono = pTelefono;
  }
  
  public String getNombre(){
    return nombre;
  }
  
  public int getCedula(){
    return cedula;
  }
  
  public String getCorreo(){
    return correo;
  }
  
  public int getTelefono(){
    return telefono;  
  }
  
  public String getDireccion(){
    return direccion.toString();
  }
}