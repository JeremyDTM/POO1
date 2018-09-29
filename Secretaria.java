package logicadenegocios;

import logicadenegocios.Pasajero;

/**
 *
 * @author Dell
 */
public class Secretaria extends Usuario{
    
  public Secretaria(String pNombre, String pDepartamento, String pNombreUsuario, int pTelefono, String pContrasenia) {
      super(pNombre, pDepartamento, pNombreUsuario, pTelefono, pContrasenia);
    }
  public void registrarPasajero(String pNombre, int pCedula, String pCorreo, int pTelefono){
    boolean Encontrado=false;
    int i=0;
    while(Encontrado!=true||i<Pasajero.getCantPasajeros()){
      if((Pasajero.getPasajeros().get(i).getCedula())==pCedula){
        Encontrado=true;
      }
      i++;
    }
    if(Encontrado==false){
      Pasajero pasajero= new Pasajero(pNombre,pCedula,pCorreo,pTelefono);
      (Pasajero.getPasajeros()).add(pasajero);
    }
  }
}
