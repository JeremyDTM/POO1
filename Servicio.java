package logicadenegocios;

import java.text.SimpleDateFormat;
import java.util.*;

public class Servicio {
  private static int cantidad=0;
  private String ident;
  private Date fechaIn;
  private String fechaFin;
  private int monto;
  private String detalle;
  private String tipo;
  private Empresa empresaAsignada;

  public Servicio(String pIdent,int pMonto,String pDetalle,Empresa pEmpresa,String pTipo){
    cantidad++;
    ident = "ID-SM"+cantidad;
    setFechaIn();
    monto = pMonto;
    tipo=pTipo;
    detalle = pDetalle;
    empresaAsignada = pEmpresa;
  }

  public void setFechaIn(){
    Calendar calendario = Calendar.getInstance();
    fechaIn = calendario.getTime();
  }

  public void setFechaFin(String pFecha){
    fechaFin=pFecha;
  }
  
  public String getFechaIn(){
    SimpleDateFormat mascara= new SimpleDateFormat("dd/MM/yy");
    return mascara.format(fechaIn);
  }
  
  public String getFechaFin(){
    SimpleDateFormat mascara= new SimpleDateFormat("dd/MM/yy");
    return mascara.format(fechaFin);
  }
  
  public String getIdentificador(){
    return ident;
  }
  
  public String getDetalle(){
    return detalle;
  }
  
  public Empresa getEmpresa(){
    return empresaAsignada;
  }
  
  public int getMonto(){
    return monto;
  }
  
  public String getTipo(){
    return tipo;
  }
  
}
