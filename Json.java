
package logicadenegocios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json {
  public void leerJsonVehiculo(){
    JSONParser parser= new JSONParser();
    try{
      JSONArray arregloJson = (JSONArray) parser.parse(new FileReader("Vehiculo.json"));
      for (int i =0; i<arregloJson.size();i++){
        JSONObject elemento = (JSONObject) arregloJson.get(i);
        Vehiculo vehiculo = new Vehiculo(elemento.get("placa").toString(),elemento.get("anio").toString(),elemento.get("color").toString(),
        elemento.get("marca").toString(),Integer.parseInt(elemento.get("capacidad").toString()),elemento.get("sede").toString(),
        elemento.get("estado").toString(),Integer.parseInt(elemento.get("vin").toString()));
        Usuario.setVehiculo(vehiculo);
      }
    }catch(FileNotFoundException e){
       //advertencia
    }catch(IOException e){
      //advertencia
    }catch(ParseException e){
      //advertencia
    }
  }
  
  
  public void leerJsonChofer(){
    JSONParser parser= new JSONParser();
    try{
      JSONArray arregloJson = (JSONArray) parser.parse(new FileReader("Chofer.json"));
      for (int i =0; i<arregloJson.size();i++){
        JSONObject elemento = (JSONObject) arregloJson.get(i);
        Chofer chofer= new Chofer(elemento.get("nombre").toString(),Integer.parseInt(elemento.get("cedula").toString()),
        elemento.get("correo").toString(),Integer.parseInt(elemento.get("telefono").toString()),
        elemento.get("numero").toString(),elemento.get("tipo").toString(),elemento.get("fechaEmision").toString(),
        elemento.get("fechaExpira").toString());
        Usuario.setChoferes(chofer);
      }
    }catch(FileNotFoundException e){
       //advertencia
    }catch(IOException e){
       //advertencia
    }catch(ParseException e){
       //advertencia
    }
  }
 
  public void leerJsonPasajeros() {
    JSONParser parser= new JSONParser();
    try{
      JSONArray arregloJson = (JSONArray) parser.parse(new FileReader("Pasajeros.json"));
      for (int i =0; i<arregloJson.size();i++){
        JSONObject elemento = (JSONObject) arregloJson.get(i);
        Pasajero pasajero= new Pasajero(elemento.get("nombre").toString(),Integer.parseInt(elemento.get("cedula").toString()),
        elemento.get("correo").toString(),Integer.parseInt(elemento.get("telefono").toString()));
        Usuario.setPasajeros(pasajero);
      }
    }catch(FileNotFoundException e){
       //advertencia
    }catch(IOException e){
       //advertencia
    }catch(ParseException e){
       //advertencia
    }
  }
  public void leerJsonUsuarios(){
    JSONParser parser= new JSONParser();
    try{
      JSONArray arregloJson = (JSONArray) parser.parse(new FileReader("Usuarios.json"));
      for (int i =0; i<arregloJson.size();i++){
        JSONObject elemento = (JSONObject) arregloJson.get(i);
        Secretaria secretaria= new Secretaria(elemento.get("nombre").toString(),elemento.get("departamento").toString(),
        elemento.get("nombreUsuario").toString(),Integer.parseInt(elemento.get("telefono").toString()),
        elemento.get("contraseña").toString());
        Usuario.setSecretaria(secretaria);
      }
    }catch(FileNotFoundException e){
       //advertencia
    }catch(IOException e){
       //advertencia
    }catch(ParseException e){
       //advertencia
    }
  }
 
}
