package logicadenegocios;

import java.text.SimpleDateFormat;
import logicadenegocios.Pasajero;
import java.util.*;

public class Viaje{
  
  private static int cantViajes;
  private static ArrayList<Viaje> viajes=new ArrayList<Viaje>();
  private Date fechaSolicitud;
  private String identificador="";
  private String horaInicio="";
  private String fechaInicio="";
  private String fechaFinalizacion="";
  private String horaFinal="";
  private String destino="";
  private String estado="";
  private String puntoSalida="";
  private float kilomInicial=0;
  private float kilomFinal=0;
  private Chofer chofer;
  private Vehiculo vehiculo;
  private ArrayList<Pasajero> pasajeros=new ArrayList<Pasajero>();
  
  public Viaje(String pDestino,String pHoraInicio,String pHoraFinal, float pKilometrajeInicial,String pEstado,String pPuntoSalida,String pFechaInicio,String pFechaFinalizacion){
    cantViajes++;
    estado=pEstado;
    horaFinal=pHoraFinal;
    fechaFinalizacion=pFechaFinalizacion;
    fechaInicio=pFechaInicio;
    puntoSalida=pPuntoSalida;
    identificador="VIA"+cantViajes;
    destino=pDestino;
    horaInicio=pHoraInicio;
    kilomInicial=pKilometrajeInicial;
  }

  public String getDestino(){
    return destino;
  }
  
  public void setEstado(String pEstado){
    estado=pEstado;
  }
  
  public String getEstado(){
    return estado;
  }
  
  public String getIdentificador(){
    return identificador;
  }
  
  public void asignarPasajero(Pasajero pasajero){
      pasajeros.add(pasajero);
  }
  
  public ArrayList<Pasajero> getPasajeros(){
    return pasajeros;
  }
  
  public static ArrayList<Viaje> getViajes(){
    return viajes;
  }
  
    /**
     *
     * @param viaje
     */
    public static void setViajes(Viaje viaje){
     viajes.add(viaje);
  }
  
  public float getKilomInicial(){
    return kilomInicial;
  }
  
  public void setFechaSolicitud(){
    Calendar calendario = Calendar.getInstance();
    fechaSolicitud = calendario.getTime();
  }
  
  public String getFechaSolicitud(){
    SimpleDateFormat mascara= new SimpleDateFormat("dd/MM/yy");
    return mascara.format(fechaSolicitud);
  }
  
  public String getFechaInicio(){
    return fechaInicio;
  }
  
  public String getHoraInicio(){
    return horaInicio;
  }
  
  public String getHoraFinal(){
    return horaFinal;
  }
  
  public String getFechaFinal(){
    return fechaFinalizacion;
  }
  
  public float getKilomFinal(){
    return kilomFinal;  
  }
  
  public void asignarChofer(Chofer pChofer){
    chofer= pChofer;
  }
  
  public String getPuntoSalida(){
    return puntoSalida;
  }
  
  private void asignarVehiculo(Vehiculo pVehiculo){
    vehiculo=pVehiculo;
  }
  
  public String informacionViajeSolicitud(){
    String msg="El identificador es "+getIdentificador()+"\n"+"la fecha de solicitud del viaje es "+getFechaSolicitud()+"\n"+
    "La hora de inicio es "+getHoraInicio()+"\n"+"La hora de finalización es "+getHoraFinal()+"\n"+"La fecha de inicio es "+getFechaInicio()
    +"\n"+"La fecha de finalizacion es "+getFechaFinal()+"\n"+"El kilometraje inicial es "+getKilomInicial()+"\n"+"El punto de salida es "+getPuntoSalida()
    +"\n"+"El destino es "+getDestino();
    return msg;
  }

  public Chofer getChofer() {
    return chofer;
  }
}
