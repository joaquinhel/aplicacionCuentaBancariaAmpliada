package programaciontarea09;

/*Esta es la clase padre de todas las cuentas Bancarias, tanto las de ahorro como las Personales
 La declaramos abstract porque de esta clase no se podr�n crear objetos, sino que los objetos los
 crearemos de las clases que hereden de esta clase padre. 
 En esta clase definimos las variables y m�todos comunes a todas los tipos de cuenta bancaria*/
public abstract class CuentaBancaria {
    //Declaramos la variables privadas cumpliendo con el principio de encapsulaci�nn que rige en la POO
    protected Persona titular; //Objetos de la clase persona que hemos definido previamente en esta aplicaci�n
    protected Double saldo;
    protected String ccc; //El n�mero de cuenta lo guardamos en un String

    //Creamos el m�todo constructor para inicializar los objetos que creemos de esta clase
    public CuentaBancaria(Persona persona, Double saldo, String ccc) {
        this.titular = persona; //Usamos this para evitar la confusi�n entre los par�metros y las variables de clase
        this.saldo = saldo;
        this.ccc = ccc;
    }

    //Creamos un constructor sin paramatros por si lo necesitaramos m�s adelante
    public CuentaBancaria() {
    }

    /*M�todo que controlar� la forma en la que se realiza un ingreso. Le proporcionamos como par�metro 
    la cantidad a ingresar */
    public void realizarIngreso(Double cantidad) {
        saldo = saldo + cantidad; //El nuevo saldo (tras el ingreso) es el que hab�a al principio m�s la cantidad ingresada
    }
    /*M�todo que controla la retirada de efectivo de la cuenta. Le proporcionamos como par�metro 
    la cantidad a retirar*/
    public boolean retirarEfectivo(Double cantidad) {
        if (cantidad <= saldo) { //Si la cantidad a retirar es mayor que el saldo
            saldo = saldo - cantidad; //Actulizamos el saldo
            return true;
        } else { //En caso de querer sacar m�s del saldo existente
            return false; //No lo permitimos
        }
    }

    //Metodo get para poder consultar el valor de la variable persona
    public Persona getTitular() {
        return titular;
    }

    //Metodo get para poder consultar el valor de la variable saldo
    public Double getSaldo() {
        return saldo;
    }

    //Metodo get para poder consultar el valor de la variable ccc
    public String getccc() {
        return ccc;
    }

    //Metodo set para poder modificar el valor de la variable Persona
    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    //Metodo set para poder establecer el valor de la variable saldo
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

//Metodo set para poder modificar el valor de la variable ccc
    public void setccc(String ccc) {
        this.ccc = ccc;
    }

}//Cerramos la clase CuentaBancaria
