package programaciontarea09;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JPanel;

/**
 * @author Joaquín
 */
public class AplicacionCuentaBancaria extends javax.swing.JFrame {
//Declaramos la variables que vamos a utilizar en la clase

    ArrayList<CuentaBancaria> arrayListaCuentas; //Array dinámico en el que vamos almacenando las cuentas
    Hashtable<String, Double> hashLista; //Similar a un diccionario almacena la clave y el significado

    /*Creamos objetos de las distintas clases que hemos definido en la aplicación. Cada una de las clases son un tipo 
     de panel*/
    PanelNuevaCuenta panelCrearCuenta;
    PanelEntidades panelEntidades;
    PanelListadoCuentas panelListado;
    PanelIngresarRetirar panelIngresarRetirar;
    PanelDatosCuenta panelDatosCuenta;
    JPanel panelPorDefecto;

    //Método constructor de la clase principal
    public AplicacionCuentaBancaria() {
        initComponents(); //Cargamos todos los elementos de la clase princpial
        arrayListaCuentas = new ArrayList<>(); //El arraylist se llamará listaCuentas
        hashLista = new Hashtable<>();//
        /*panelPorDefecto es un objeto de la clase JPanel que hereda de la Clase Container que tiene el método
         getContentPane(), por lo tanto para que JPanel utilice el método getContentPane es necesario realizar
         un downcasting. Todos los Container no son Jpanel, por eso debemos indicarlo (JPanel)*/
        panelPorDefecto = (JPanel) getContentPane(); // Panel principal
        /*Con "this" indicamos que el parámetro que pasamos a la clase PanelNuevaCuenta es el propio objeto que
         hemos creado de la clase AplicacionCuentaBancaria*/
        panelCrearCuenta = new PanelNuevaCuenta(this);
        panelEntidades = new PanelEntidades(this);
        panelListado = new PanelListadoCuentas(this);
        panelIngresarRetirar = new PanelIngresarRetirar(this);
        panelDatosCuenta = new PanelDatosCuenta(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Entidades = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Abrir una cuenta nueva");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ver cuentas diponibles");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Realizar un ingreso");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Retirar efectivo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Entidades.setText("Datos de una cuenta");
        Entidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntidadesActionPerformed(evt);
            }
        });

        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("APLICACIÓN CUENTA BANCARIA1");

        jButton7.setText("Entidades Autorizadas");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Entidades, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(Entidades)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Puesto que utilizamos el método actionListener, es necesario agregar ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setContentPane(panelCrearCuenta); //Al hacer click sobre el botón 1 se abre el panelCrearCuenta
        pack();//Hacemos que se abra con el menor tamaño posible que permite la visualización de todos los datos
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setContentPane(panelListado);//Al hacer click sobre el botón 2 se muestra el panelListado
        panelListado.listarCuentas(); //Llamamos al método listar cuentas de panel listado
        panelListado.getlblMostrar().setText("");//Borramos si hay algún mensaje almacenado en la label
        pack();//Hacemos que se abra con el menor tamaño posible que permite la visualización de todos los datos
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setContentPane(panelIngresarRetirar);//Al hacer click sobre el botón3 se muestra el panelIngresarRetirar
        pack();//Hacemos que se abra con el menor tamaño posible que permite la visualización de todos los datos
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setContentPane(panelIngresarRetirar);//Al hacer click sobre el botón se muestra el panelIngresarRetirar
        pack();//Hacemos que se abra con el menor tamaño posible que permite la visualización de todos los datos
    }//GEN-LAST:event_jButton4ActionPerformed

    private void EntidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntidadesActionPerformed
        setContentPane(panelDatosCuenta);//Al hacer click sobre el botón3 se muestra el panelDatosCuenta
        pack();//Hacemos que se abra con el menor tamaño posible que permite la visualización de todos los datos
    }//GEN-LAST:event_EntidadesActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0); //Al hacer click sobre el botón salimos de la aplicación
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        setContentPane(panelEntidades);//panelEntidades
        pack();//Hacemos que se abra con el menor tamaño posible que permite la visualización de todos los datos
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplicacionCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicacionCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicacionCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicacionCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplicacionCuentaBancaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entidades;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
