/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicadenegocios;

import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
import java.lang.reflect.Array;
import java.util.stream.IntStream;

/**
 *
 * @author Dell
 */
public class Administrador extends Usuario{
  private static ArrayList<Administrador> administradores= new ArrayList<Administrador>();
          
  public Administrador(String pNombre, String pDepartamento, String pNombreUsuario, int pTelefono, String pContrasenia) {
    super(pNombre, pDepartamento, pNombreUsuario, pTelefono, pContrasenia);
  }
  
  public static void setAdmistrador(Administrador administrador){
    administradores.add(administrador);
  }
  
  public static ArrayList<Administrador> getAdministrador(){
    return administradores;
  }
  
  public void registrarChofer(String pNombre, int pCedula, String pCorreo,int pTelefono,String pNumero, String pTipo,String pFechaEmision,String pFechaExpira){
    boolean Encontrado=false;
    int i=0;
    while(i<Chofer.getCantChoferes()&&Encontrado!=true){
      if((Usuario.getChoferes().get(i).getCedula())==pCedula){
        Encontrado=true;
      }
      i++;
    }
    if(Encontrado==false){
        Chofer chofer= new Chofer(pNombre,pCedula,pCorreo,pTelefono);
        chofer.agregarLicencia(pNumero,pTipo, pFechaEmision, pFechaExpira);
        Usuario.setChoferes(chofer);
        //mostrar mensaje registro correcto en la interfaz
    }else{
        //mostrar mensaje registro inválido en la interfaz
    }
  }

  public void  registrarVehiculo(String pPlaca,String pAnio,String pColor,String pMarca,int pCapacidad,String pSede,int pVin){
    boolean Encontrado=false;
    int i=0;
    while(i<Usuario.getVehiculos().size()&&Encontrado!=true){
      if((Usuario.getVehiculos().get(i).getVin())==pVin||(Usuario.getVehiculos().get(i).getPlaca())==pPlaca){
        Encontrado=true;
      }
      i++;
    }
    if(Encontrado==false){
        Vehiculo vehiculo=new Vehiculo(pPlaca,pAnio,pColor,pMarca,pCapacidad,pSede,"En servicio",pVin);
        Usuario.setVehiculo(vehiculo);
        //mostrar mensaje registro correcto en la interfaz
    }else{
        //mostrar mensaje registro inválido en la interfaz
    }
  }
  
  public void registrarSecretaria(String pNombre, String pDepartamento, String pNombreUsuario, int pTelefono){
    boolean Encontrado=false;
    int i=0;
    while(i<Usuario.getSecretaria().size()&&Encontrado!=true){
      if((Usuario.getSecretaria().get(i).getNombreUsuario())==pNombreUsuario){
        Encontrado=true;
      }
      i++;
    }
    if(Encontrado==false){
        Random r = new Random();
        
        int number= (int)(r.nextInt(9 - 0) + 0);
        char[] especiales= new char[]{'!','@','#','?','@','^','~'};
        int seleccion=(int)(r.nextInt(6 - 0) + 0);
        char caracterEspecial=especiales[seleccion];
        int rnd = new Random().nextInt(especiales.length);
        int posicionNumber=(int)(r.nextInt(12 - 1) + 1);
        int posicionNumber2=posicionNumber;
        while(posicionNumber2==posicionNumber){
          posicionNumber2=(int)(r.nextInt(12 - 1) + 1);
        }
        String Contrasenia="";
        int number2= (int)(r.nextInt(12 - 8) + 8);
        int contador=1;
        while(number2>=contador){
          if(posicionNumber==contador){
            Contrasenia+=String.valueOf(number);
          }else if(posicionNumber2==contador){
              Contrasenia+=String.valueOf(caracterEspecial);
          }else{
            if (contador%2==0){
              char y = (char)(r.nextInt('z' - 'a') + 'a');
              Contrasenia+=String.valueOf(y);
            }else{
              char l = (char)(r.nextInt('Z' - 'A') + 'A');
              Contrasenia+=String.valueOf(l);
            }
          }
          contador++;
        }
        
        Secretaria secretaria=new Secretaria(pNombre,pDepartamento,pNombreUsuario,pTelefono,Contrasenia);
        Usuario.setSecretaria(secretaria);
        //mostrar mensaje registro correcto en la interfaz
    }else{
        //mostrar mensaje registro inválido en la interfaz
    }    
  }
  

}