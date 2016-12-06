package programaciontarea09;

import java.util.Hashtable;

/*Esta clase hereda de CuentaCorriente que a su vez hereda de CuentaBancaria, por lo que tendrá disponibles
 las variables y métodos de estas dos clases anteriores */
public class CuentaCorrienteEmpresa extends CuentaCorriente {
    /*Variables que recogen el valor del descubierto máximo, el intereés por descubierto y la comisión por descubierto.
     Son esclusivas de las cuentas corrientes de empresa*/

    private Double descubiertoMax;
    private Double interesDescubierto;
    private Double comisionDescubierto;

    /*Método constructor de la clase, pasamos como parámetros la comisión de mantenimiento, el Hashtable 
     que contendrá los datos de las entidades autorizadas, el objeto persona, el saldo y el número de cuenta*/
    public CuentaCorrienteEmpresa(Double descubiertoMax, Double interesDescubierto, Double comisionDescubierto, Hashtable<String, Double> listaEntidesAutorizadas, Persona persona, Double saldo, String ccc) {
        /*Inicializamos el constructor de la superclase CuentaBancaria y de CuentaCorriente con los 
         datos introducidos como parámetros*/
        super(listaEntidesAutorizadas, persona, saldo, ccc);
        //Inicializamos las tres variables propias de esta clase
        this.descubiertoMax = descubiertoMax;
        this.interesDescubierto = interesDescubierto;
        this.comisionDescubierto = comisionDescubierto;
    }

    //Método get para poder consultar el valor de la variable DescubiertoMax
    public Double getDescubiertoMax() {
        return descubiertoMax;
    }
    //Método set para establecer el valor de la variable Descubierto Máximo
    public void setDescubiertoMax(Double descubiertoMax) {
        this.descubiertoMax = descubiertoMax;
    }

    //Método get para poder consultar el valor de la variable Interes de Descubierto
    public Double getInteresDescubierto() {
        return interesDescubierto;
    }

     //Método set para establecer el valor de la variable interes de descubierto
    public void setInteresDescubierto(Double interesDescubierto) {
        this.interesDescubierto = interesDescubierto;
    }

    //Método get para poder consultar el valor de la variable Comisión de Descubierto
    public Double getComisionDescubierto() {
        return comisionDescubierto;
    }

    //Método set para establecer el valor de la variable comisión de descubierto
    public void setComisionDescubierto(Double comisionDescubierto) {
        this.comisionDescubierto = comisionDescubierto;
    }
}//Cerramos la clase CuentaCorrienteEmpresa
