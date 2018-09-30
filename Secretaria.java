package logicadenegocios;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Secretaria extends Usuario{
  private ArrayList<Secretaria> secretarios=new ArrayList<Secretaria>();
  private ArrayList<Viaje> viajesIngresados=new ArrayList<Viaje>();
  
  public Secretaria(String pNombre, String pDepartamento, String pNombreUsuario, int pTelefono, String pContrasenia) {
      super(pNombre, pDepartamento, pNombreUsuario, pTelefono, pContrasenia);
    }
  
  public ArrayList<Viaje> getViajesIngresados(){
    return viajesIngresados;
  }
  
  public void registrarPasajero(String pNombre, int pCedula, String pCorreo, int pTelefono){
    boolean Encontrado=false;
    int i=0;
    while(i<Pasajero.getCantPasajeros()&&Encontrado!=true){
      if((Pasajero.getPasajeros().get(i).getCedula())==pCedula){
        Encontrado=true;
      }
      i++;
    }
    if(Encontrado==false){
      Pasajero pasajero= new Pasajero(pNombre,pCedula,pCorreo,pTelefono);
      Pasajero.setPasajeros(pasajero);
      //mostrar mensaje de pasajero registrado en la interfaz
    }else{
        //mostrar mensaje de pasajero inválido en la interfaz
    }
  }
  
  
  
  public void SolicitarViaje(ArrayList<Pasajero> pasajeros,String pDestino,String pHoraInicio,String pHoraFinal, float pKilometrajeInicial,String pEstado,String pPuntoSalida,String pFechaInicio,String pFechaFinalizacion){
    Viaje viaje= new Viaje(pDestino,pHoraInicio,pHoraFinal,pKilometrajeInicial,"En confección",pPuntoSalida,pFechaInicio,pFechaFinalizacion);
    int i=0;
    while(i<pasajeros.size()){
      viaje.asignarPasajero(pasajeros.get(i));
      i++;
    }
    viaje.setFechaSolicitud();
    Viaje.setViajes(viaje);
    viaje.informacionViajeSolicitud();
    //Almacenar en archivo de Viajes
  }
  
  public void ListaViajesSolicitados(String filtro,String palabraAnalizar){
    int i=0;
    ArrayList<Viaje> viajes=viajesIngresados;
    ArrayList<Viaje> viajesValidos=new ArrayList<Viaje>();
    if("destino"==filtro){
      while(i<viajes.size()){
        if(palabraAnalizar!=(viajes.get(i)).getDestino()){
         viajesValidos.add(viajes.get(i));
        }
        i++;
      }
    }else if("estado"==filtro){
      while(i<viajes.size()){
        if(palabraAnalizar!=(viajes.get(i)).getEstado()){
         viajesValidos.add(viajes.get(i));
        }
        i++;
      }
    }else if("fecha"==filtro){
      while(i<viajes.size()){
        if(palabraAnalizar!=(viajes.get(i)).getFechaSolicitud()){
         viajesValidos.add(viajes.get(i));
        }
        i++;
      }
    }
    i=0;
    while(i<viajes.size()){
      Viaje viajeFiltrado= viajes.get(i);
      String msg="El identificador  del viaje es "+viajeFiltrado.getIdentificador()+"\n"+"La fecha de solicitud es: "
      +viajeFiltrado.getFechaSolicitud()+"\n"+"el estado es "+viajeFiltrado.getEstado()+"\n"
              +"El destino es "+viajeFiltrado.getDestino()+"\n"+"La fecha de inicio es "+viajeFiltrado.getFechaInicio();
      i++;
      //ciclo información de viajes solicitados.
    }
  }
  
  //falta el requirimiento 4, ya que depende de la interfaz.
  
  public void CancelarViaje(String idViaje){
    int contador=0;
    ArrayList<Viaje> viajes=Viaje.getViajes();
   while(contador<viajes.size()){
     if(viajes.get(contador).getIdentificador()==idViaje){
      if("En confección"==viajes.get(contador).getEstado()){
        viajes.get(contador).setEstado("Cancelado");
      }else if("Aprobado"==viajes.get(contador).getEstado()){
        viajes.get(contador).setEstado("Cancelado");
          //notificar por Telegram
     }
     //eliminar el chofer y el vehiculo
   }
   contador++;
  }
}
