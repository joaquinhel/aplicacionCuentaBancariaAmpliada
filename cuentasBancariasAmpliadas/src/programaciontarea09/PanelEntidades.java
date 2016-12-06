package programaciontarea09;

import java.util.Hashtable;
import javax.swing.JOptionPane;

public class PanelEntidades extends javax.swing.JPanel {
    Comprobaciones comprobar; //Creamos una instancia de la clase comprobar
    AplicacionCuentaBancaria panelPrincipalAplicacion; //Creamos una instancia de la clase principal
    Hashtable<String, Double> hashLista; //Creamos un objeto de Hashtable

    //Constructor sin parámetros
    public PanelEntidades() {
    }

    //Constructor de la clase que recibe como parámetro un objeto de la clase principal
    public PanelEntidades(AplicacionCuentaBancaria padre) {
        panelPrincipalAplicacion = padre;
        initComponents();
        hashLista = new Hashtable<>(); //Creamos el objeto hashLista de la clas Hashtable()
        comprobar = new Comprobaciones(); //Hacemos una llamada al método comprobaciones
        txtSalida.setText("");
        hashLista.clear(); //Borramos la hashTable de forma que no contenga claves
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEntidad = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Añadir entidades autorizadas");

        jLabel2.setText("Entidad:");

        jLabel3.setText("Cantidad máxima autorizada: ");

        txtEntidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntidadActionPerformed(evt);
            }
        });

        btnAdd.setText("Añadir");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEntidad))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantidad)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
//Método en el que definimos las acciones a realizar cuando pulsamos sobre el botón volver
  private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
      panelPrincipalAplicacion.hashLista = hashLista;
      hashLista.clear(); //Borramos la hashTable de forma que no contenga claves
      panelPrincipalAplicacion.setContentPane(panelPrincipalAplicacion.panelCrearCuenta);
      panelPrincipalAplicacion.pack();
  }//GEN-LAST:event_btnVolverActionPerformed

  //Método en el que definimos las acciones a realizar cuando pulsamos sobre el botón añadir
  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
      Double num;
      try {
          num = Double.parseDouble(txtCantidad.getText()); //Nos aseguramos que el dato intoducido en la casilla es numérico
          if (num < 0) { //Si es negativo mostramos el mensaje de error
              JOptionPane.showMessageDialog(this, "No se admiten cifras negativas", "ERROR", JOptionPane.ERROR_MESSAGE);
          } else {//Si el número introducido es válido
              hashLista.put(txtEntidad.getText(), num); //Guardamos en la hashList tanto el nombre como el dígito
              //Mostramos en el segundo cuadro de texto los valores introducidos y validados
              txtSalida.setText(txtSalida.getText() + txtEntidad.getText() + " -- " + num+" €"+ "\n");
          }
      } catch (NumberFormatException nfe) {
          JOptionPane.showMessageDialog(this, "Sólo se admiten números", "ERROR", JOptionPane.ERROR_MESSAGE);
      }
  }//GEN-LAST:event_btnAddActionPerformed

    private void txtEntidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntidadActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtEntidad;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}
