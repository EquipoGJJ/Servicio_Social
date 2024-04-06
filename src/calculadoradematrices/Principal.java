package calculadoradematrices;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sumar = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        inversa = new javax.swing.JButton();
        Determinante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(121, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Bk", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿Qué operación deseas realizar?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 20));

        sumar.setText("Sumar");
        sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarActionPerformed(evt);
            }
        });
        jPanel1.add(sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 80, 110, 25));

        restar.setText("Restar");
        restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarActionPerformed(evt);
            }
        });
        jPanel1.add(restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 80, 110, 25));

        multiplicar.setText("Multiplicación");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });
        jPanel1.add(multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 110, 25));

        dividir.setText("División");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });
        jPanel1.add(dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 110, 25));

        inversa.setText("Inversa");
        inversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inversaActionPerformed(evt);
            }
        });
        jPanel1.add(inversa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 110, 25));

        Determinante.setText("Determinante");
        Determinante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeterminanteActionPerformed(evt);
            }
        });
        jPanel1.add(Determinante, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 110, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        CalculadoraMatricesMultiplicacion conexion5 = new CalculadoraMatricesMultiplicacion();
        conexion5.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_multiplicarActionPerformed

    private void sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarActionPerformed
        CalculadoraMatricesSuma conexion1 = new CalculadoraMatricesSuma();
        conexion1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sumarActionPerformed

    private void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed
        CalculadoraMatricesResta conexion3 = new CalculadoraMatricesResta();
        conexion3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_restarActionPerformed

    private void inversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inversaActionPerformed
        CalculadoraMatricesInversa xxxd = new CalculadoraMatricesInversa();
        xxxd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inversaActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        CalculadoraMatricesDivision xxd = new CalculadoraMatricesDivision();
        xxd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dividirActionPerformed

    private void DeterminanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeterminanteActionPerformed
        CalculadoraMatricesDeterminante conexion7 = new CalculadoraMatricesDeterminante();
        conexion7.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DeterminanteActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Determinante;
    private javax.swing.JButton dividir;
    private javax.swing.JButton inversa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton restar;
    private javax.swing.JButton sumar;
    // End of variables declaration//GEN-END:variables
}
