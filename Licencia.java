package logicadenegocios;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Licencia{
    // instance variables - replace the example below with your own
  String numero;
  String fechaEmision;
  String fechaExpira;
  String tipo;
    /**
     * Constructor for objects of class Licencia
     * @param pNumero
     * @param pTipo
     * @param pFechaEmision
     * @param pFechaExpira
     */
  public Licencia(String pNumero, String pTipo,String pFechaEmision,String pFechaExpira){
    setFechaEmision(pFechaEmision);
    setFechaExpira(pFechaExpira);
    numero = pNumero;
    tipo = pTipo;
  }

  public String getNumero(){
    return numero;
  }
  
  public String getTipo(){
     return tipo;
  }
  
  private void setFechaEmision(String pFechaEmision){
    fechaEmision=pFechaEmision;
  }
  
  private void setFechaExpira(String pFechaExpira){
    fechaExpira=pFechaExpira;
  }
}
