package programaciontarea09;

import java.util.Hashtable;

/*Esta clase hereda de CuentaCorriente que a su vez hereda de CuentaBancaria, por lo que tendr� disponibles
 las variables y m�todos de estas dos clases anteriores */
public class CuentaCorrienteEmpresa extends CuentaCorriente {
    /*Variables que recogen el valor del descubierto m�ximo, el intere�s por descubierto y la comisi�n por descubierto.
     Son esclusivas de las cuentas corrientes de empresa*/

    private Double descubiertoMax;
    private Double interesDescubierto;
    private Double comisionDescubierto;

    /*M�todo constructor de la clase, pasamos como par�metros la comisi�n de mantenimiento, el Hashtable 
     que contendr� los datos de las entidades autorizadas, el objeto persona, el saldo y el n�mero de cuenta*/
    public CuentaCorrienteEmpresa(Double descubiertoMax, Double interesDescubierto, Double comisionDescubierto, Hashtable<String, Double> listaEntidesAutorizadas, Persona persona, Double saldo, String ccc) {
        /*Inicializamos el constructor de la superclase CuentaBancaria y de CuentaCorriente con los 
         datos introducidos como par�metros*/
        super(listaEntidesAutorizadas, persona, saldo, ccc);
        //Inicializamos las tres variables propias de esta clase
        this.descubiertoMax = descubiertoMax;
        this.interesDescubierto = interesDescubierto;
        this.comisionDescubierto = comisionDescubierto;
    }

    //M�todo get para poder consultar el valor de la variable DescubiertoMax
    public Double getDescubiertoMax() {
        return descubiertoMax;
    }
    //M�todo set para establecer el valor de la variable Descubierto M�ximo
    public void setDescubiertoMax(Double descubiertoMax) {
        this.descubiertoMax = descubiertoMax;
    }

    //M�todo get para poder consultar el valor de la variable Interes de Descubierto
    public Double getInteresDescubierto() {
        return interesDescubierto;
    }

     //M�todo set para establecer el valor de la variable interes de descubierto
    public void setInteresDescubierto(Double interesDescubierto) {
        this.interesDescubierto = interesDescubierto;
    }

    //M�todo get para poder consultar el valor de la variable Comisi�n de Descubierto
    public Double getComisionDescubierto() {
        return comisionDescubierto;
    }

    //M�todo set para establecer el valor de la variable comisi�n de descubierto
    public void setComisionDescubierto(Double comisionDescubierto) {
        this.comisionDescubierto = comisionDescubierto;
    }
}//Cerramos la clase CuentaCorrienteEmpresa
