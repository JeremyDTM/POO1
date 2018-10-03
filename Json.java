
package logicadenegocios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json {
  public void leerJsonVehiculo(){
    JSONParser parser= new JSONParser();
    try{
      JSONArray arregloJson = (JSONArray) parser.parse(new FileReader("C:\\Users\\Carlos Vega\\Desktop\\Progra\\Vehiculo.json"));
      for (int i =0; i<arregloJson.size();i++){
        JSONObject elemento = (JSONObject) arregloJson.get(i);
        Vehiculo vehiculo = new Vehiculo(elemento.get("placa").toString(),elemento.get("anio").toString(),elemento.get("color").toString(),
        elemento.get("marca").toString(),Integer.parseInt(elemento.get("capacidad").toString()),elemento.get("sede").toString(),
        elemento.get("estado").toString(),Integer.parseInt(elemento.get("vin").toString()));
        Vehiculo.setVehiculo(vehiculo);
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
      JSONArray arregloJson = (JSONArray) parser.parse(new FileReader("C:\\Users\\Carlos Vega\\Desktop\\Progra\\Chofer.json"));
      for (int i =0; i<arregloJson.size();i++){
        JSONObject elemento = (JSONObject) arregloJson.get(i);
        Chofer chofer= new Chofer(elemento.get("nombre").toString(),Integer.parseInt(elemento.get("cedula").toString()),
        elemento.get("correo").toString(),Integer.parseInt(elemento.get("telefono").toString()));
        Chofer.setChoferes(chofer);
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
      JSONArray arregloJson = (JSONArray) parser.parse(new FileReader("C:\\Users\\Carlos Vega\\Desktop\\Progra\\Pasajeros.json"));
      for (int i =0; i<arregloJson.size();i++){
        JSONObject elemento = (JSONObject) arregloJson.get(i);
        // if(buscarPlaca(elemento.get("placa").toString())){
        Pasajero pasajero= new Pasajero(elemento.get("nombre").toString(),Integer.parseInt(elemento.get("cedula").toString()),
        elemento.get("correo").toString(),Integer.parseInt(elemento.get("telefono").toString()));
        Pasajero.setPasajeros(pasajero);
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
      JSONArray arregloJson = (JSONArray) parser.parse(new FileReader("C:\\Users\\Carlos Vega\\Desktop\\Progra\\Usuarios.json"));
      for (int i =0; i<arregloJson.size();i++){
        JSONObject elemento = (JSONObject) arregloJson.get(i);
        Usuario usuario= new Usuario(elemento.get("nombre").toString(),elemento.get("departamento").toString(),
        elemento.get("nombreUsuario").toString(),Integer.parseInt(elemento.get("telefono").toString()),
        elemento.get("contraseña").toString());
        //Usuario.setUsuario(usuario);
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
