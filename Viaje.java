package logicadenegocios;

import java.util.*;

public class Viaje{
  
  private static int cantViajes;
  private Date fechaSolicitud;
  private String identificador;
  private String inicio;
  private String fin;
  private String destino;
  private float kilomInicial;
  private float kilomFinal;
  private Chofer chofer;
  private ArrayList<Persona> personas;
  
  public Viaje(String pDestino,String pHoraInicio, float pKilometrajeInicial){
    cantViajes++;
    identificador="VIA"+cantViajes;
    destino=pDestino;
    inicio=pHoraInicio;
    kilomInicial=pKilometrajeInicial;
  }

  public String getDestino(){
    return destino;
  }
  
  public float getKilomInicial(){
    return kilomInicial;
  }
  
  public void setFechaSolicitud(){
    Calendar calendario = Calendar.getInstance();
    fechaSolicitud = calendario.getTime();
  }
  
  public float getKilomFinal(){
    return kilomFinal;  
  }
  
  public void asignarChofer(Chofer pChofer){
    chofer= pChofer;
  }
}
