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
        Licencia licencia=new Licencia(pNumero,pTipo);
    }
  }
}
