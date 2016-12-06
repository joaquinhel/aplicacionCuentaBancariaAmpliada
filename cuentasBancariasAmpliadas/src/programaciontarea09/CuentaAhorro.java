package programaciontarea09;
/*La clase cuenta de Ahorro hereda de la clase padre Cuenta Bancaria, que tiene las variables y los métodos
 comunes a todas las Cuentas Bancarias*/

public class CuentaAhorro extends CuentaBancaria {

    //Variable que recoge interes de remuneración. Es exclusivo de las cuentas de ahorro.
    private Double interesRemuneracion;

    /*Método constructor de la clase, pasamos como parámetros el interes, el objeto persona, el saldo y el 
    número de cuenta*/
    public CuentaAhorro(Double interesRemuneracion, Persona persona, Double saldo, String ccc) {
        //Inicializamos el constructor de la superclase CuentaBancaria con los datos introducidos como parámetros
        super(persona, saldo, ccc);
        this.interesRemuneracion = interesRemuneracion; //Inicializamos la variable propia de esta clase
    }

    //Método get para poder consultar el valor de la variable interesRemuneracion
    public Double getInteresRemuneracion() {
        return interesRemuneracion;
    }
    //Método set para definir el valor de la variable interesRemuneracion
    public void setInteresRemuneracion(Double interesRemuneracion) {
        this.interesRemuneracion = interesRemuneracion;
    }
} //Cerramos la clase CuentaAhorro
