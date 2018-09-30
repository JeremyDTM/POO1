/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicadenegocios;

/**
 *
 * @author Dell
 */
public class Administrador extends Usuario{  
  public Administrador(String pNombre, String pDepartamento, String pNombreUsuario, int pTelefono, String pContrasenia) {
    super(pNombre, pDepartamento, pNombreUsuario, pTelefono, pContrasenia);   
  }
  
  public void registrarChofer(String pNombre, int pCedula, String pCorreo,int pTelefono,String pNumero, String pTipo){
    boolean Encontrado=false;
    int i=0;
    while(i<Chofer.getCantChoferes()&&Encontrado!=true){
      if((Chofer.getChoferes().get(i).getCedula())==pCedula){
        Encontrado=true;
      }
      i++;
    }
    if(Encontrado==false){
        Chofer chofer= new Chofer(pNombre,pCedula,pCorreo,pTelefono);
        chofer.agregarLicencia(pNumero,pTipo);
        Chofer.setChoferes(chofer);
        //mostrar mensaje registro correcto en la interfaz
    }else{
        //mostrar mensaje registro inválido en la interfaz
    }
  }

  public void  registrarVehiculo(String pPlaca,String pAnio,String pColor,String pMarca,int pCapacidad,String pSede,int pVin){
    boolean Encontrado=false;
    int i=0;
    while(i<Vehiculo.getVehiculos().size()&&Encontrado!=true){
      if((Vehiculo.getVehiculos().get(i).getVin())==pVin||(Vehiculo.getVehiculos().get(i).getPlaca())==pPlaca){
        Encontrado=true;
      }
      i++;
    }
    if(Encontrado==false){
        Vehiculo vehiculo=new Vehiculo(pPlaca,pAnio,pColor,pMarca,pCapacidad,pSede,"En servicio",pVin);
        Vehiculo.setVehiculo(vehiculo);
        //mostrar mensaje registro correcto en la interfaz
    }else{
        //mostrar mensaje registro inválido en la interfaz
    }
  }
  
  public void RegistrarSecretaria(String pNombre, String pDepartamento, String pNombreUsuario, int pTelefono){
    boolean Encontrado=false;
    int i=0;
    while(i<Secretaria.getSecretaria().size()&&Encontrado!=true){
      if((Secretaria.getSecretaria().get(i).getNombreUsuario())==pNombreUsuario){
        Encontrado=true;
      }
      i++;
    }
    if(Encontrado==false){
        Secretaria secretaria=new Secretaria(pNombre,pDepartamento,pNombreUsuario,pTelefono,"");
        Secretaria.setSecretaria(secretaria);
        //mostrar mensaje registro correcto en la interfaz
    }else{
        //mostrar mensaje registro inválido en la interfaz
    }    
  }
  

}