
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
     // if(buscarPlaca(elemento.get("placa").toString())){
        Vehiculo vehiculo;
        //vehiculo = new Vehiculo(elemento.get("placa").toString(),elemento.get("anio").toString(),elemento.get("color").toString(),
        //elemento.get("marca").toString(),Integer.parseInt(elemento.get("capacidad").toString()),
        //elemento.get("sede").toString(),elemento.get("estado").toString(),
        //Integer.parseInt(elemento.get("vin").toString()));
       // vehiculos.add(vehiculo);
     // }
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
      file.write(company.toJSONString());
      file.flush();
      System.out.println("Successfully Copied JSON Object to File...");
      System.out.println("\nJSON Object: " + obj);
    }catch(IOException e){
        
    }
  }
}
/*String beautify(String json) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    Object obj = mapper.readValue(json, Object.class);
    return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
}
}*/


  //public boolean buscarPlaca(String pPlaca){
      
    //for (int i=0; i<vehiculos.size();i++){
      //System.out.println("hola");
      //if((vehiculos.get(i).getPlaca()).equals(pPlaca)){
        //return false;
        //}
    //}
    //return true;
  //}
//}
