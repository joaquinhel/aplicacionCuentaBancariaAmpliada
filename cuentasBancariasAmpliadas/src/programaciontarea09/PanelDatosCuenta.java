package programaciontarea09;

import javax.swing.DefaultComboBoxModel;

public class PanelDatosCuenta extends javax.swing.JPanel {

    //Creamos un objeto de la clase principal (AplicaciónCuentaBancaria)
    AplicacionCuentaBancaria panelPrincipalAplicacion;

    /*Método constructor de la clase. Como parámetro recibe un objeto AplicaciónCuentaBancaria
     Al llamar a la clase en AplicacónCuentaBancaria debemos pasar como parametro "this" */
    public PanelDatosCuenta(AplicacionCuentaBancaria padre) {
        panelPrincipalAplicacion = padre; //Inicializamos el objeto
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        cmbCuentas = new javax.swing.JComboBox();
        labelDatos = new javax.swing.JLabel();

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        cmbCuentas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCuentasItemStateChanged(evt);
            }
        });
        cmbCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCuentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver)
                    .addComponent(cmbCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
/*Método con el que actualizamos los datos del combo cuando se agregan nuevas cuentas. Para ello lo que se
     hace es volcar los datos del array al combo*/

    public void actualizarCombo() {
        //Objeto con el que definimos el modelo por defecto para los combos
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        //Establecemos el modelo por defecto para nuestro combo
        cmbCuentas.setModel(modeloCombo);
        //Agregamos todas las cuentas del array a nuestro combo
        for (CuentaBancaria cuenta : panelPrincipalAplicacion.arrayListaCuentas) {
            cmbCuentas.addItem(cuenta);
        }
    }

    /*Método con el que definimos el funcionamiento del botón volver del panel*/
  private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
      panelPrincipalAplicacion.setContentPane(panelPrincipalAplicacion.panelPorDefecto);//Vamos al panel por defecto
      panelPrincipalAplicacion.pack(); //Ajustamos el tamaño a los datos existentes
  }//GEN-LAST:event_btnVolverActionPerformed

    /*Método de la interfaz ItemListener (java.awt.event). Se invoca cuando un elemento se ha seleccionado o deseleccionado 
     por el usuario. El código escrito para este método lleva a cabo las operaciones que deben ocurrir 
     cuando se selecciona un elemento (o deselecciona).*/
  private void cmbCuentasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCuentasItemStateChanged
      labelDatos.setText(""); //Definimos sin datos una capa en la que iremos escribiendo los datos siguientes
      for (CuentaBancaria cuenta : panelPrincipalAplicacion.arrayListaCuentas) { //Recorremos el array ListaCuentas de AplicaciónCuentaBancaria
          // Cuando hay una cuenta en el array que coincide con la que selecionamos en el combo
          if (cuenta.equals(cmbCuentas.getSelectedItem())) {
              nuevaLinea("<html>");//Vamos realizando llamadas al método nueva linea y pasando como parámetro el HTML
              nuevaLinea("<center><h2>Datos de la cuenta: <br>" + cuenta.getccc() + "</h2></center>");
              nuevaLinea("<b>Titular: </b>" + cuenta.getTitular().getNombre() + " " + cuenta.getTitular().getApellidos() + "<br>");
              nuevaLinea("<b>Fecha de nacimiento:</b> " + (cuenta.titular.getFechaNacim()) + "<br>");
              nuevaLinea("<b>Saldo:</b> " + cuenta.getSaldo() + "<br>");
              // Comprobamos el tipo de cuenta que es para visualizar unos datos u otros.
              if (cuenta instanceof CuentaAhorro) { //Si la cuenta es una instancia de la clase CuentaAhorro
                  CuentaAhorro cuentaAhorro = (CuentaAhorro) cuenta; //Creamos un objeto de la clase
                  nuevaLinea("<center><h3>Cuenta de Ahorro</h3></center><br>"); //Se trata de una Cuenta de Ahorro
                  //Imprimimos sus datos identificativos
                  nuevaLinea("<b>Tipo de interés:</b> " + cuentaAhorro.getInteresRemuneracion() + "<br>");
              } else if (cuenta instanceof CuentaCorrienteEmpresa) { //Si la cuenta es una instancia de la clase CuentaCorrienteEmpresa
                  CuentaCorrienteEmpresa ccEmpresa = (CuentaCorrienteEmpresa) cuenta;  //Creamos un objeto de la clase
                  nuevaLinea("<center><h3>Cuenta Corriente de Empresa</h3></center><br>"); //Se trata de una Cuenta Corriente Empresa
                  //Imprimimos sus datos identificativos
                  nuevaLinea("<b>Descubierto máximo:</b> " + ccEmpresa.getDescubiertoMax() + "<br>");
                  nuevaLinea("<b>Interés descubierto:</b> " + ccEmpresa.getInteresDescubierto() + "<br>");
                  nuevaLinea("<b>Comisión Descubierto:</b> " + ccEmpresa.getComisionDescubierto() + "<br>");
              } else {
                  CuentaCorrientePersonal ccPersonal = (CuentaCorrientePersonal) cuenta; //Creamos un objeto de la clase
                  //Imprimimos sus datos identificativos
                  nuevaLinea("<center><h3>Cuenta Corriente Personal</h3></center><br>");
                  nuevaLinea("<b>Comisión mantenimiento:</b> " + ccPersonal.getComision() + "<br>");
              }
              nuevaLinea("<html>"); //Cerramos el HTML

          }
      }
  }//GEN-LAST:event_cmbCuentasItemStateChanged
    //Método en el que definimos el funcionamiento del combo
    private void cmbCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCuentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCuentasActionPerformed
    //Método que nos sirve para escribir en la capa. Como parámetro recibe un String, que será codigo HTML

    private void nuevaLinea(String cadena) {
        labelDatos.setText(labelDatos.getText() + cadena);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox cmbCuentas;
    private javax.swing.JLabel labelDatos;
    // End of variables declaration//GEN-END:variables
}
