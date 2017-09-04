/*
AUTOR: J. Carlos Nevarez Tovar 5IM6
VERSIÓN: 1.0 
DESCRIPCIÓN: Primer ejemplo en clase Pato.
COMPILACIÓN: Se compila en tiempo de ejecución. 
EJECUCIÓN: Ejecutando la clase principal.
*/
package constructorpato;

/**
 * <h2>Clase Pato</h2>
 * <p>Segundo ejemplo con uso de constructores</p>
 * @author J. Carlos Nevarez
 * @version v1.0.0
 * @since 01/09/2017
 */
public class Pato {
    
    //Campos de la clase
    private String alimento;
    private String color;
    private boolean vuela;
    private int edad;
    
    /**
     * <h3>Constructor default</h3>
     */
    public Pato(){
        
    }//Cierre del constructor
    
    /**
     * <h3>Constructor sobrecargado No.1</h3>
     * <p>Indica si el ave vuela</p>
     * @param vuela Parametro que define si el coche tiene gasolina o no;
     */
    public Pato(boolean vuela){
        this.vuela = vuela;
        this.color = "Blanco";
        this.alimento = "Pan";
        this.edad = 2;
        
        if(vuela==true)
        {
            System.out.println("Vuela");
        }
        else
        {
            System.out.println("Cae");
        }
    }//Cierre del constructor
    
    /**
     * <h3>Constructor sobrecargado No. 2</h3>
     * @param alimento Parametro que define lo que come el pato.
     * @param color Parametro que indica el color del pato.
     * @param vuela Parametro que indica si el pato vuela.
     * @param edad Parametro que indica la edad del pato.
     */
    public Pato(String alimento, String color, boolean vuela, int edad){
        this.alimento = alimento;
        this.color = color;
        this.edad = edad;
        this.vuela = vuela;
    }//Cierre del constructor
    
    /**
     * <h3>Constructor sobrecargado No. 3</h3>
     * <p>Contrucot para ver como luce el pato</p>
     * @param color Parametro que indica el color del pato.
     * @param edad Parametro que indica la edad del pato.
     */
    public Pato(String color,int edad){
        this.alimento = "Pan";
        this.color = color;
        this.edad = edad;
        this.vuela = true;
    }//Cierre del constructor
}
