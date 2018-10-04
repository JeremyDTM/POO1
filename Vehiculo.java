package logicadenegocios;

import java.util.*;

public class Vehiculo {
  private String placa;
  private String anio;
  private String color;
  private String marca;
  private int capacidad;
  private double kiloms;
  private String sede;
  private int vin;
  private String estado;
  private ArrayList<Servicio> regitroDeServicios=new ArrayList<Servicio>();
  

  public Vehiculo(String pPlaca,String pAnio,String pColor,String pMarca,int pCapacidad,String pSede,String pEstado,int pVin){
    vin=pVin;
    placa = pPlaca;
    anio = pAnio;
    color = pColor;
    marca = pMarca;
    capacidad = pCapacidad;
    sede = pSede;
    estado = pEstado;
  }

  public void realizarViaje(int kilometros){
    kiloms+= kilometros;
  }

  public void realizarMantenimiento(String identificacion,int monto,String detalle,Empresa empresa,String tipo){
    Servicio servicio = new Servicio(identificacion,monto,detalle,empresa,tipo);
    regitroDeServicios.add(servicio);

  }

  public void cambiarEstado(String pEstado){
    estado = pEstado;
  }

  public String getPlaca() {
    return placa;
  }

  public String getAnio() {
    return anio;
  }

  public String getColor() {
    return color;
  }

  public String getMarca() {
    return marca;
  }

  public int getCapacidad() {
    return capacidad;
  }

  public double getKiloms() {
    return kiloms;
  }
  
  public int getVin() {
    return vin;
  }

  public String getSede() {
    return sede;
  }

  public String getEstado() {
    return estado;
  }

  public ArrayList<Servicio> getRegitroDeServicios(){
    return regitroDeServicios;
  }
  
   public static ArrayList<Chofer> getChoferes(){
    return Choferes;
  }
  
  public static void setChoferes(Chofer chofer){
    Choferes.add(chofer);
  }
  
}
