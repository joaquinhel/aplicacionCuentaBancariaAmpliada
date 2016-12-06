package programaciontarea09;

import java.util.Hashtable;
/*Esta es la clase padre de los dos tipos de CuentaCorriente, las personales y las de empresa.
 La declaramos abstract porque de esta clase no se podrán crear objetos, sino que los objetos los
 crearemos de las clases que hereden de esta clase padre. 
 En esta clase definimos las variables y métodos comunes a los dos tipos de cuenta corriente*/

public abstract class CuentaCorriente extends CuentaBancaria {
    //Creamos una HashTable que contendrá la lista de Entidades Autorizadas <códigoEntidad, cantidadAutorizada>
    protected Hashtable<String, Double> listaEntidesAutorizadas;

    /*Método constructor de la clase, pasamos como parámetros el Hashtable que contendrá los datos
     de las entidades autorizadas, el objeto persona, el saldo y el número de cuenta*/
    public CuentaCorriente(Hashtable<String, Double> listaEntidesAutorizadas, Persona persona, Double saldo, String ccc) {
        super(persona, saldo, ccc);
        this.listaEntidesAutorizadas = listaEntidesAutorizadas;
    }
    
    //Método get para poder consultar la Hashtable listaEntidesAutorizadas
    public Hashtable<String, Double> getListaEntidesAutorizadas() {
        return listaEntidesAutorizadas;
    }
    
    //Método get para poder modificar la Hashtable listaEntidesAutorizadas
    public void setListaEntidesAutorizadas(Hashtable<String, Double> listaEntidesAutorizadas) {
        this.listaEntidesAutorizadas = listaEntidesAutorizadas;
    }

}
