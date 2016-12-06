package programaciontarea09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comprobaciones {

    public static boolean comprobarFecha(String fecha) {
        String fecha1= fecha.replace("-","/");
        Pattern pat = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
        Matcher mat = pat.matcher(fecha1);
        if (mat.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comprobarCuenta(String cuenta) {
        boolean comprueba = false;
        if (cuenta.length() != 20) { // la cuenta no tiene 20 digitos

            comprueba = false;
        } else { // la cuenta si tiene 20 digitos
            // comprobamos si lo introducido son enteros
            comprueba = this.sonEnteros(cuenta);
            if (comprueba == false) { // No son enteros

            } else { // Los dígitos son enteros y comprobamos los digitos de control
                //Calculamos los dígitos de control y los comparamos con lo introducidos
                if (this.obtenerDigitosControl(cuenta).equals(cuenta.substring(8, 10))) {
                    comprueba = true; // Son correctos los dÃ­gitos de control
                } else {
                    comprueba = false;
                }
            }
        }
        return comprueba;
    }

    public boolean sonEnteros(String cadena) {
        // Recorre la cadena entera comprobando si es nÃºmero entero o no
        for (int x = 0; x < cadena.length(); x++) {
            try {
                Integer.parseInt(cadena.substring(x, x + 1));
            } catch (NumberFormatException e) { //Se ejecuta cuando no es un nÂº entero

                return false;
            }
        }
        return true;
    }

   // Calculos de los dígitos de control.
    public static String obtenerDigitosControl(String cuenta) {
        // Inicializamos las variables para las operaciones
        int d1 = 0;
        int d2 = 0;
        int cont;
        // Guardamos en un array los multiplicadores
        int[] multiplica = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
    // Sumamos cada dígito de entidad y oficina (d1), 
        // por la misma posición del array multiplica
        // nos saltamos las 2 primeras posiciones del multiplicador

        for (cont = 0; cont < (multiplica.length - 2); cont++) {
            d1 += multiplica[cont + 2] * Integer.parseInt(cuenta.substring(cont, cont + 1));
        }
        // Sumamos cada digito del número de cuenta por la misma posición del array multiplica
        for (cont = 0; cont < multiplica.length; cont++) {
            d2 += multiplica[cont] * Integer.parseInt(cuenta.substring((cont + 10), (cont + 10 + 1)));
        }
        // Restamos a 11 el resto de la división entre el valor obtenido y el número 11
        d1 = 11 - (d1 % 11);
        d2 = 11 - (d2 % 11);
        // Si el resto es 10 el dígito es 1 y si es 11 es 0
        d1 = (d1 == 11) ? 0 : (d1 == 10) ? 1 : d1;
        d2 = (d2 == 11) ? 0 : (d2 == 10) ? 1 : d2;
        // Convertimos los valores enteros a String
        String digitos = String.valueOf(d1) + String.valueOf(d2);
        return digitos;
    }
}
