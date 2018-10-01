package logicadenegocios;

import java.util.*;


public class Chofer extends Persona{
  private static int cantChoferes;
  private int cantViajes=0;
  private static  ArrayList<Chofer> Choferes= new ArrayList<Chofer>();
  private ArrayList<Licencia> LicenciasChofer= new ArrayList<>();
  
    /**
    *Constructor for objects of class Chofer
    *@param pNombre
    *@param pCedula
    * @param pCorreo
    * @param pTelefono
    */
  public Chofer(String pNombre, int pCedula, String pCorreo,int pTelefono){
    super(pNombre,pCedula,pCorreo,pTelefono);
    cantChoferes++;
  }

  public void agregarLicencia(String pNumero, String pTipo){
    Licencia licencia = new Licencia(pNumero,pTipo);
    LicenciasChofer.add(licencia);
  }
  
  public ArrayList<Licencia> getLicenciasChofer(){
    return LicenciasChofer;
  }
  
  public static ArrayList<Chofer> getChoferes(){
    return Choferes;
  }
  
  public static void setChoferes(Chofer chofer){
    Choferes.add(chofer);
  }
  
  public static int getCantChoferes(){
    return cantChoferes;    
  }
  
  public void setCantViajes(){
    cantViajes++;    
  }
  
  public int getCantViajes(){
    return cantViajes;    
  }
}
