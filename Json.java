
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
  public void leerJsonVehiculo() throws FileNotFoundException,IOException,ParseException{
    JSONParser parser= new JSONParser();
    JSONArray arregloJson = (JSONArray) parser.parse(new FileReader("C:\\Users\\Carlos Vega\\Desktop\\Progra\\leer.json"));
    for (int i =0; i<arregloJson.size();i++){
      JSONObject elemento = (JSONObject) arregloJson.get(i);
      Vehiculo vehiculo = new Vehiculo(elemento.get("placa").toString(),elemento.get("anio").toString(),elemento.get("color").toString(),
      elemento.get("marca").toString(),Integer.parseInt(elemento.get("capacidad").toString()),elemento.get("sede").toString(),
      elemento.get("estado").toString(),Integer.parseInt(elemento.get("vin").toString()));
      vehiculos.add(vehiculo);
      
    }
  }
  public void escribirJson(){  
    
    try (FileWriter file = new FileWriter("C:\\Users\\Carlos Vega\\Desktop\\Progra\\leer.json")) {
      JSONObject obj = new JSONObject();
      JSONArray company = new JSONArray();

      obj.put("Name", "Prueba" );

      obj.put("hola","mundo" );
      obj.put("c++", "python" );
      obj.put("Author", "Vega" );

      company.add(obj);



      JSONObject wy = new JSONObject();
      wy.put("que", "weon");
      company.add(wy);
      file.write(company.toJSONString()+"\n");
      file.flush();
      file.close();
      System.out.println("Successfully Copied JSON Object to File...");
      System.out.println("\nJSON Object: " + obj);
    }catch(IOException e){

    }
    
  }
  public void leerJsonChofer() throws FileNotFoundException,IOException,ParseException{
    JSONParser parser= new JSONParser();
    JSONArray arregloJson = (JSONArray) parser.parse(new FileReader("C:\\Users\\Carlos Vega\\Desktop\\Progra\\leer.json"));
    for (int i =0; i<arregloJson.size();i++){
      JSONObject elemento = (JSONObject) arregloJson.get(i);
      Chofer chofer= new Chofer(elemento.get("nombre").toString(),Integer.parseInt(elemento.get("capacidad").toString()),
      elemento.get("correo").toString(),Integer.parseInt(elemento.get("capacidad").toString()));
      choferes.add(chofer);
              
    }
    
  }
  public void leerJsonPasajeros() throws FileNotFoundException,IOException,ParseException{
    JSONParser parser= new JSONParser();
    JSONArray arregloJson = (JSONArray) parser.parse(new FileReader("C:\\Users\\Carlos Vega\\Desktop\\Progra\\Pasajeros.json"));
    for (int i =0; i<arregloJson.size();i++){
      JSONObject elemento = (JSONObject) arregloJson.get(i);
     // if(buscarPlaca(elemento.get("placa").toString())){
        Pasajero pasajero= new Pasajero(elemento.get("nombre").toString(),Integer.parseInt(elemento.get("cedula").toString()),
        elemento.get("correo").toString(),Integer.parseInt(elemento.get("telefono").toString()));
        pasajeros.add(pasajero);
    }
  }
  public void leerJsonUsuarios() throws FileNotFoundException,IOException,ParseException{
    JSONParser parser= new JSONParser();
    JSONArray arregloJson = (JSONArray) parser.parse(new FileReader("C:\\Users\\Carlos Vega\\Desktop\\Progra\\Usuarios.json"));
    for (int i =0; i<arregloJson.size();i++){
      JSONObject elemento = (JSONObject) arregloJson.get(i);
      Usuario usuario= new Usuario(elemento.get("nombre").toString(),elemento.get("departamento").toString(),
      elemento.get("nombreUsuario").toString(),Integer.parseInt(elemento.get("telefono").toString()),
      elemento.get("contraseña").toString());
      usarios.add(usuario);
    }
  }
}
/*String beautify(String json) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    Object obj = mapper.readValue(json, Object.class);
    return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
}
}*/
