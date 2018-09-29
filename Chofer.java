package logicadenegocios;

import java.util.*;

public class Chofer extends Persona{
  private static int cantChoferes;
  private static ArrayList<Chofer> choferes= new ArrayList<Chofer>();
  private ArrayList<Licencia> licenciasChofer= new ArrayList<Licencia>();
  
  public Chofer(String pNombre, int pCedula, String pCorreo,int pTelefono){
    super(pNombre,pCedula,pCorreo,pTelefono);
    cantChoferes++;
  }

  public void agregarLicencia(String pNumero, String pTipo){
    Licencia licencia = new Licencia(pNumero,pTipo);
    licenciasChofer.add(licencia);
  }
  
  public ArrayList<Licencia> getLicenciasChofer(){
    return licenciasChofer;
  }
  
  public static ArrayList<Chofer> getChoferes(){
    return choferes;
  }
  
  public static int getCantChoferes(){
    return cantChoferes;    
  }
}
