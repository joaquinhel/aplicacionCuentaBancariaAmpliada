package programaciontarea09;
/*La clase cuenta de Ahorro hereda de la clase padre Cuenta Bancaria, que tiene las variables y los m�todos
 comunes a todas las Cuentas Bancarias*/

public class CuentaAhorro extends CuentaBancaria {

    //Variable que recoge interes de remuneraci�n. Es exclusivo de las cuentas de ahorro.
    private Double interesRemuneracion;

    /*M�todo constructor de la clase, pasamos como par�metros el interes, el objeto persona, el saldo y el 
    n�mero de cuenta*/
    public CuentaAhorro(Double interesRemuneracion, Persona persona, Double saldo, String ccc) {
        //Inicializamos el constructor de la superclase CuentaBancaria con los datos introducidos como par�metros
        super(persona, saldo, ccc);
        this.interesRemuneracion = interesRemuneracion; //Inicializamos la variable propia de esta clase
    }

    //M�todo get para poder consultar el valor de la variable interesRemuneracion
    public Double getInteresRemuneracion() {
        return interesRemuneracion;
    }
    //M�todo set para definir el valor de la variable interesRemuneracion
    public void setInteresRemuneracion(Double interesRemuneracion) {
        this.interesRemuneracion = interesRemuneracion;
    }
} //Cerramos la clase CuentaAhorro
