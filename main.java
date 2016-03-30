/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package colegio.canino;
//import javax.swing.JOptionPane;

// para leer de teclado necesitamos la clase Scanner
import java.util.Scanner;

/**
 *
 * @author hdr5474
 */


public class main {
// Declaracion Variable Global de Tipo Clase Perros
    private static Perros[] ListaPerros = new Perros[10];
    private static Integer n;
    private static  Scanner sc = new Scanner(System.in);

     public static void main(String[] args) {

// Menu de opciones
  Integer op;

   boolean bandera=false;
   op = 0;
        setN((Integer) 0);
    do{
        cls();
        System.out.println("COLEGIO DE PERROS CIUDAD BOGOTA");
        System.out.println("\n");
        

    System.out.println("1. Cargar Datos a Base de Datos ");
    System.out.println("2. Visualizar Datos a Base de Datos ");
    System.out.println("3. Ordenar Datos por Ubicación ");
    System.out.println("4. Buscar información por Ubicación ");
    System.out.println("5. Salir ");
    System.out.println("Ingrese opción ");
    op =    getSc().nextInt();
  //  op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Opción : "));

    switch(op)
    {
        case 1: Llenardatos();
                break;
        case 2: if (getN()>0)
                 {   Mostrardatos();
                  }
                else
                { //JOptionPane.showMessageDialog(null, "Debe ingresar primero los datos de la BD");
                  System.out.println("Debe ingresar primero los datos de la Base de Datos ");
                }
                break;
        case 3:  if( getN() > 0)
                { Ordenardatos();
                   Mostrardatos();
                }
               else
               {//JOptionPane.showMessageDialog(null, "Debe ingresar primero los datos de la BD");
                   System.out.println("Debe ingresar primero los datos de la Base de Datos ");
               }
                break;
        case 4: if(getN()>0)
                { Buscarlocalidad();
                }  
               else
               {// JOptionPane.showMessageDialog(null, "Debe ingresar primero los datos de la BD");
                  System.out.println("Debe ingresar primero los datos de la Base de Datos ");
               }
                break;
        case 5: bandera = true;
                break;


        default:
               System.out.println("Opción no válida");
               break;

    }


    } while (bandera != true);

         
     }


     /******************************************/
      public static void  Llenardatos()
     {   cls();
         System.out.println("COLEGIO DE PERROS CIUDAD BOGOTA");
         System.out.println("\n");
      
         //n =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de Perros : "));
         System.out.println("Ingrese Numero de Perros : ");
         setN((Integer) getSc().nextInt());

         String nombre,localidad,raza,propietario,dia;
         Integer cedula, telefono;

     for(int i=0; i<getN();i++)
        {
            getListaPerros()[i] = new Perros();
        //ListaPerros[i].setNombre( JOptionPane.showInputDialog("Ingrese Nombre : "));
        System.out.println("Ingrese Nombre: ");
        nombre =getSc().next();
            getListaPerros()[i].setNombre(nombre);
        
        System.out.println("Ingrese Cedula: ");
        cedula =getSc().nextInt();
            getListaPerros()[i].setCedula(cedula);

        System.out.println(" Ingrese Raza: ");
        raza = getSc().next();
            getListaPerros()[i].setRaza(raza);
        
       // ListaPerros[i].setRaza( JOptionPane.showInputDialog("Ingrese Raza : "));
        System.out.println(" Ingrese Localidad: ");
        localidad = getSc().next();
         
            getListaPerros()[i].setLocalidad(localidad);
        //ListaPerros[i].setLocalidad( JOptionPane.showInputDialog("Ingrese Localidad : "));

     
       
        System.out.println("Ingrese Propietario: ");
        propietario = getSc().next();
        
            getListaPerros()[i].setPropietario(propietario);

 

        
         System.out.println("Ingrese Telefono: ");
         telefono = getSc().nextInt();
            getListaPerros()[i].setTelefono(telefono);



        System.out.println("Ingrese Dia: ");
        dia = getSc().next();
            getListaPerros()[i].setDia(dia);

                 }

      System.out.println("Presione x  y enter para continuar");
        getSc().next();

    }

/******************************************/
     public static void  Mostrardatos()
     {
         cls();
          System.out.println("COLEGIO DE PERROS CIUDAD BOGOTA");
         System.out.println("\n");
               // Lectura de los datos de la clase
        for(int i=0; i<getN();i++)
        {

        System.out.println("Nombre: " + getListaPerros()[i].getNombre());
        System.out.println("Raza:" +getListaPerros()[i].getRaza());
        System.out.println("Localidad:"+getListaPerros()[i].getLocalidad());
        System.out.println("Cedula:"+getListaPerros()[i].getCedula());
        System.out.println("Propietario:"+getListaPerros()[i].getPropietario());
        System.out.println("Telefono:"+getListaPerros()[i].getTelefono());
        System.out.println("Dia:"+getListaPerros()[i].getDia());

        
        
        System.out.println("\n");


        }
        
       System.out.println("Presione x y enter para continuar");
        getSc().next();


     }

/******************************************/
// Funcion Ordenarcion de Datos  por localidad
       public static void  Ordenardatos()
     {   cls();
         System.out.println("COLEGIO DE PERROS CIUDAD BOGOTA");
         System.out.println("\n");
         System.out.println("Ordenación por localización");
         Integer m;
         m = getN()-1;

         for(int k=0;k<m;k++)
         {
            for(int f=0;f<m-k;f++)
            {
                if (getListaPerros()[f].getLocalidad().compareTo(getListaPerros()[f+1].getLocalidad())>0)
                {
                    String auxl;
                    String auxn;
                    String auxr;
                    Integer auxc;
                    String auxp;
                    Integer auxt;
                    String auxd;


                    auxl=getListaPerros()[f].getLocalidad();
                    auxn = getListaPerros()[f].getNombre();
                    auxr = getListaPerros()[f].getRaza();
                    auxc = getListaPerros()[f].getCedula();
                    auxp=  getListaPerros()[f].getPropietario();
                    auxt=  getListaPerros()[f].getTelefono();
                    auxd=  getListaPerros()[f].getDia();

                   // paises[f]=paises[f+1];
                    getListaPerros()[f].setLocalidad(getListaPerros()[f+1].getLocalidad());
                    getListaPerros()[f].setNombre(getListaPerros()[f+1].getNombre());
                    getListaPerros()[f].setRaza(getListaPerros()[f+1].getRaza());
                    getListaPerros()[f].setCedula(getListaPerros()[f+1].getCedula());
                    getListaPerros()[f].setPropietario(getListaPerros()[f+1].getPropietario());
                    getListaPerros()[f].setTelefono(getListaPerros()[f+1].getTelefono());
                    getListaPerros()[f].setDia(getListaPerros()[f+1].getDia());

                   //  paises[f+1]=aux;
                    getListaPerros()[f+1].setLocalidad(auxl);
                    getListaPerros()[f+1].setNombre(auxn);
                    getListaPerros()[f+1].setRaza(auxr);
                    getListaPerros()[f+1].setCedula(auxc);
                    getListaPerros()[f+1].setPropietario(auxp);
                    getListaPerros()[f+1].setTelefono(auxt);
                    getListaPerros()[f+1].setDia(auxd);


                }
            }
        }



  }

/******************************************/
 public static void  Buscarlocalidad()
    {
    cls();
   String blocalidad;
   //blocalidad =JOptionPane.showInputDialog("Ingrese Localidad : ");
   System.out.println("Ingrese Localidad:");
   blocalidad = getSc().nextLine();
   System.out.println("COLEGIO DE PERROS CIUDAD BOGOTA");
   System.out.println("\n");
   System.out.println("Localidad: " + blocalidad);
   for(int i=0; i<getN();i++)
   {
        if ( getListaPerros()[i].getLocalidad().equals(blocalidad) )
        {
        System.out.println("Nombre: " + getListaPerros()[i].getNombre());
        System.out.println("Raza:" +getListaPerros()[i].getRaza());
        System.out.println("Localidad:"+getListaPerros()[i].getLocalidad());
        System.out.println("Cedula:"+getListaPerros()[i].getCedula());
        System.out.println("Propietario:"+getListaPerros()[i].getPropietario());
        System.out.println("Telefono:"+getListaPerros()[i].getTelefono());
        System.out.println("Dia:"+getListaPerros()[i].getDia());

        System.out.println("\n");

        }
     }
   
   System.out.println("Presione x  y enter para continuar");
        getSc().next();

  }



/******************************************/

  public static void cls()
    {
        for (int y = 0; y < 25; y++)
        System.out.println("\n");
      }

    /**
     * @return the ListaPerros
     */
    public static Perros[] getListaPerros() {
        return ListaPerros;
    }

    /**
     * @param aListaPerros the ListaPerros to set
     */
    public static void setListaPerros(Perros[] aListaPerros) {
        ListaPerros = aListaPerros;
    }

    /**
     * @return the n
     */
    public static Integer getN() {
        return n;
    }

    /**
     * @param aN the n to set
     */
    public static void setN(Integer aN) {
        n = aN;
    }

    /**
     * @return the sc
     */
    public static Scanner getSc() {
        return sc;
    }

    /**
     * @param aSc the sc to set
     */
    public static void setSc(Scanner aSc) {
        sc = aSc;
    }
        

}




