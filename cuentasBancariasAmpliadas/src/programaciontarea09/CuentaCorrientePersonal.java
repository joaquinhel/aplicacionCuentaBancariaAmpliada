package programaciontarea09;

import java.util.Hashtable;

/*Esta clase hereda de CuentaCorriente que a su vez hereda de CuentaBancaria, por lo que tendr� disponibles
 las variables y m�todos de estas dos clases anteriores */
public class CuentaCorrientePersonal extends CuentaCorriente {
    /*Variable que recoge el valor de la comisi�n de mantenimiento. Es esclusivo de las cuentas
     corrientes personales*/
    private Double comisionMantenimiento;

    /*M�todo constructor de la clase, pasamos como par�metros la comisi�n de mantenimiento, el Hashtable 
     que contendr� los datos de las entidades autorizadas, el objeto persona, el saldo y el n�mero de cuenta*/
    public CuentaCorrientePersonal(Double comisionMantenimiento, Hashtable<String, Double> listaEntidesAutorizadas, Persona persona, Double saldo, String ccc) {
        super(listaEntidesAutorizadas, persona, saldo, ccc);
        this.comisionMantenimiento = comisionMantenimiento;
    }
    //M�todo get para poder consultar el valor de la variable comisi�n de mantenimiento
    public Double getComision() {
        return comisionMantenimiento;
    }
    //M�todo set para establecer el valor de la variable comisi�n de mantenimiento
    public void setComision(Double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }

}
