package calculos.estadisticos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class JFramePrincipal extends javax.swing.JFrame {

    final int nDatos = 15;
    int datos[] = new int[nDatos];

    public JFramePrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        button1 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonIngresarDatos = new javax.swing.JButton();
        jButtonCalcular = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        listResultados = new java.awt.List();
        listDatosOrdenados = new java.awt.List();

        label1.setText("label1");

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Resultados");

        jLabel2.setText("CALCULOS ESTADISTICOS");

        jLabel3.setText("Datos ordenados");

        jButtonIngresarDatos.setText("Ingresar Datos");
        jButtonIngresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarDatosActionPerformed(evt);
            }
        });

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(listResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(listDatosOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonIngresarDatos)
                            .addComponent(jButtonCalcular)
                            .addComponent(jButtonNuevo)
                            .addComponent(jButton4))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonIngresarDatos)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalcular)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addComponent(listDatosOrdenados, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(listResultados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarDatosActionPerformed
        for (int i = 0; i < datos.length; i++) {

            datos[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Dato N° " + (i + 1), "Ingreso de datos"));


    }//GEN-LAST:event_jButtonIngresarDatosActionPerformed
    }
    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed

        //declarion de variables
        double suma = 0;
        double suma1 = 0, prom, desviacion, varianza;
        double mayor = 0, menor = datos[0];
        int aux, medio;
//Creación de objeto para salida de datos formateada
        DecimalFormat F2D = new DecimalFormat("0.00");
//Determina el mayor, el menor y la suma de datos
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] > mayor) {
                mayor = datos[i];
            }
            if (datos[i] < menor) {
                menor = datos[i];
            }

            suma += datos[i];
        }
//Calculos
        prom = suma / nDatos;
        for (int i = 0; i < datos.length; i++) {
            suma1 += Math.pow((datos[i] - prom), 2);
        }
        desviacion = Math.sqrt(suma1 / nDatos);
        varianza = Math.pow(desviacion, 2);
//Ordenamiento de la lista
        for (int i = 1; i < (datos.length); i++) {
            for (int j = 0; j < (datos.length - i); j++) {
//Intercambio de datos
                if (datos[j] > datos[j + 1]) {
                    aux = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = aux;
                }
            }
        }
//Visualiza la lista ordenada
        for (int i = 0; i < datos.length; i++) {
            listDatosOrdenados.add("" + datos[i]);
        }
//Muestra resultados
        listResultados.add("El mayor es " + F2D.format(mayor));
        listResultados.add("El menor es " + F2D.format(menor));
        listResultados.add("La suma de los datos es " + F2D.format(suma));
        listResultados.add("El promedio es " + F2D.format(prom));
        listResultados.add("La desviación es " + F2D.format(desviacion));
        listResultados.add("La Varianza es " + F2D.format(varianza));
//Determina la mediana del conjunto de datos
        if (nDatos % 2 != 0) {
            medio = (int) (nDatos / 2) + 1;
            listResultados.add("Existe Una Mediana");
            listResultados.add("La Mediana es " + datos[medio - 1]);
        } else {
            medio = (int) (nDatos / 2);
            listResultados.add("Existen dos Medianas");
            listResultados.add("Una Mediana es " + datos[medio - 1]);
            listResultados.add("La otra Mediana es " + datos[medio]);
        }

    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        listDatosOrdenados.removeAll();
        listResultados.removeAll();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonIngresarDatos;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private java.awt.List listDatosOrdenados;
    private java.awt.List listResultados;
    // End of variables declaration//GEN-END:variables
}
