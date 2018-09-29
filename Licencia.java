package logicadenegocios;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Licencia{
    // instance variables - replace the example below with your own
  String numero;
  Date fechaEmision;
  Date fechaExpira;
  String tipo;
    /**
     * Constructor for objects of class Licencia
     */
  public Licencia(String pNumero, String pTipo){
    setFechaEmision();
    setFechaExpira();
    numero = pNumero;
    tipo = pTipo;
  }

  public String getNumero(){
    return numero;
  }
  
  public String getTipo(){
     return tipo;
  }
  
  private void setFechaEmision(){
    Calendar calendario = Calendar.getInstance();
    fechaEmision = calendario.getTime();
  }
  
  private void setFechaExpira(){
    int rand = ThreadLocalRandom.current().nextInt(1,5);
    Calendar calendario = Calendar.getInstance();
    calendario.add(Calendar.WEEK_OF_YEAR,rand);
    fechaExpira = calendario.getTime();
  }
}
