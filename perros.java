/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package colegio.canino;

/**
 *
 * @author hdr5474
 */
public class Perros {
    private String nombre;
    private String raza;
    private String localidad;
    private Integer cedula;
    private String propietario;
    private Integer telefono;
    private String dia;


     public Perros() {
        
    }
    
    public String getNombre( ){
    return this.nombre;
  }
 
  public void setNombre(String nombre){
    this.nombre = nombre;
  }


   public String getRaza( ){
    return this.raza;
  }

  public void setRaza(String raza){
    this.raza = raza;
  }


   public String getLocalidad( ){
    return this.localidad;
  }

  public void setLocalidad(String localidad){

      this.localidad = localidad;
  }


   public Integer getCedula( ){
    return this.cedula;
  }

  public void setCedula(Integer cedula){

      this.cedula = cedula;
  }


   public String getPropietario( ){
    return this.propietario;
  }

  public void setPropietario(String propietario){

      this.propietario = propietario;
  }

   public Integer getTelefono( ){
    return this.telefono;
  }

  public void setTelefono(Integer telefono){

      this.telefono = telefono;
  }


  public String getDia( ){
    return this.dia;
  }

  public void setDia(String dia){

      this.dia = dia;
  }


 }




   
