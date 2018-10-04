package logicadenegocios;

import java.util.*;


public class Chofer extends Persona{
  private static int cantChoferes;
  private int cantViajes=0;
  private ArrayList<Licencia> LicenciasChofer= new ArrayList<>();
  
    /**
    *Constructor for objects of class Chofer
    *@param pNombre
    *@param pCedula
    * @param pCorreo
    * @param pTelefono
    */
  public Chofer(String pNombre, int pCedula, String pCorreo,int pTelefono, String pNumero, String pTipo,String pFechaEmision,String pFechaExpira){
    super(pNombre,pCedula,pCorreo,pTelefono);
    agregarLicencia(pNumero,pTipo,pFechaEmision,pFechaExpira);
    cantChoferes++;
  }

  public void agregarLicencia(String pNumero, String pTipo,String pFechaEmision,String pFechaExpira){
    Licencia licencia = new Licencia(pNumero,pTipo,pFechaEmision,pFechaExpira);
    LicenciasChofer.add(licencia);
  }
  
  public ArrayList<Licencia> getLicenciasChofer(){
    return LicenciasChofer;
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
