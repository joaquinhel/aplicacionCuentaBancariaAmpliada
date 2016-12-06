package programaciontarea09;

import java.util.Hashtable;

/*Esta clase hereda de CuentaCorriente que a su vez hereda de CuentaBancaria, por lo que tendrá disponibles
 las variables y métodos de estas dos clases anteriores */
public class CuentaCorrientePersonal extends CuentaCorriente {
    /*Variable que recoge el valor de la comisión de mantenimiento. Es esclusivo de las cuentas
     corrientes personales*/
    private Double comisionMantenimiento;

    /*Método constructor de la clase, pasamos como parámetros la comisión de mantenimiento, el Hashtable 
     que contendrá los datos de las entidades autorizadas, el objeto persona, el saldo y el número de cuenta*/
    public CuentaCorrientePersonal(Double comisionMantenimiento, Hashtable<String, Double> listaEntidesAutorizadas, Persona persona, Double saldo, String ccc) {
        super(listaEntidesAutorizadas, persona, saldo, ccc);
        this.comisionMantenimiento = comisionMantenimiento;
    }
    //Método get para poder consultar el valor de la variable comisión de mantenimiento
    public Double getComision() {
        return comisionMantenimiento;
    }
    //Método set para establecer el valor de la variable comisión de mantenimiento
    public void setComision(Double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }

}
