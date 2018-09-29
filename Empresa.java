package logicadenegocios;

public class Empresa{
  private String razonSocial;
  private String cedula;
  private String telefono;
  private Direccion direccion;

  public Empresa(String pRazonSocial,String pCedula,String pTelefono,String pProvincia,String pCanton,String pDistrito,String pSenias){
    razonSocial = pRazonSocial;
    cedula = pCedula;
    telefono = pTelefono;
    direccion = new Direccion(pProvincia,pCanton,pDistrito,pSenias);
  }

  public String getRazonSocial(){
    return this.razonSocial;
  }

  public String getCedula(){
    return this.cedula;
  }

  public String getTelefono(){
    return this.telefono;
  }

  public String getDireccion(){
    return this.direccion.toString();
  }
}
