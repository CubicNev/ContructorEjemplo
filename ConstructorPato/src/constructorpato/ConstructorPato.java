/*
AUTOR: J. Carlos Nevarez Tovar 5IM6
VERSIÓN: 1.0 
DESCRIPCIÓN: Programa que ejemplifica el uso de constructores
OBSERVACIONES: Agregar abstraccion y sobrescritura
COMPILACIÓN: Se compila en tiempo de ejecucion. 
EJECUCIÓN: Se ejecuta desde NeatBeans (8.0 en adelante) presionando la tecla F6
*/
package constructorpato;

/**
 * <h2>Clase principal "ConstructorPato"</h2>
 * <p>Aplicacion de consola que usa la asbtraccion de objetos (en este caso Patos), ejemplificando la sobrecarga de constructores</p>
 * @author J. Carlos Nevarez
 * @version v1.0.0
 * @since 01/09/2017
 */
public class ConstructorPato {

    /**
     * <h1>PROGRAMA PRINCIPAL</h1>
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        //Objetos de la clase Pato
        Pato p = new Pato();
        Pato vuelo = new Pato(true);
        Pato ganso =  new Pato("Peces", "Negro", true, 5);
        Pato fisico = new Pato("Verde", 4);
    }
    
}//Cierre de la clase
