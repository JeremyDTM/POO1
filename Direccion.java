package logicadenegocios;

public class Direccion {
  private String provincia;
  private String canton;
  private String distrito;
  private String senias;

  public Direccion(String pProvincia,String pCanton,String pDistrito,String pSenias){
    provincia = pProvincia;
    canton = pCanton;
    distrito = pDistrito;
    senias = pSenias;
  }

  public String getProvincia(){
    return this.provincia;
  }

  public String getCanton(){
    return this.canton;
  }

  public String getDistrito(){
    return this.distrito;
  }

  public String getSenias(){
    return this.senias;
  }

  public String toString(){
    String msg = "Provincia: " + this.provincia + "\n";
    msg += "Cantón: " + this.canton + "\n";
    msg += "Distrito: " + this.distrito + "\n";
    msg += "Señas: " + this.senias + "\n";

    return msg;
  }
}