package logicadenegocios;

import java.util.*;

public class Chofer extends Persona{
  private ArrayList<Licencia> licenciasChofer= new ArrayList<Licencia>();
  
  public Chofer(String pNombre, String pCedula, String pCorreo,String pTelefono){
    super(pNombre,pCedula,pCorreo,pTelefono);
  }

  public void agregarLicencia(String pNumero, String pTipo){
    Licencia licencia = new Licencia(pNumero,pTipo);
    licenciasChofer.add(licencia);
  }
  
  public ArrayList<Licencia> getLicenciasChofer(){
    return licenciasChofer;
  }
}
