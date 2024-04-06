package calculadoradematrices;

public class CalculadoraMatricesDeterminante extends javax.swing.JFrame {

    public CalculadoraMatricesDeterminante() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TituloCalculadora = new javax.swing.JLabel();
        A11 = new javax.swing.JTextField();
        A12 = new javax.swing.JTextField();
        A13 = new javax.swing.JTextField();
        A21 = new javax.swing.JTextField();
        A22 = new javax.swing.JTextField();
        A23 = new javax.swing.JTextField();
        A31 = new javax.swing.JTextField();
        A32 = new javax.swing.JTextField();
        A33 = new javax.swing.JTextField();
        Multiplicar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        VolverElegir = new javax.swing.JButton();
        MatrizA = new javax.swing.JLabel();
        DetaA = new javax.swing.JLabel();
        ResultadoDet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(121, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloCalculadora.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        TituloCalculadora.setForeground(new java.awt.Color(255, 255, 255));
        TituloCalculadora.setText("Introduce los datos de tu matriz");
        jPanel1.add(TituloCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 270, 30));

        A11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        A11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A11.setToolTipText("");
        A11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A11ActionPerformed(evt);
            }
        });
        jPanel1.add(A11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 35, 35));

        A12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        A12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A12.setToolTipText("");
        A12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A12ActionPerformed(evt);
            }
        });
        jPanel1.add(A12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 35, 35));

        A13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        A13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A13.setToolTipText("");
        A13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A13ActionPerformed(evt);
            }
        });
        jPanel1.add(A13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 35, 35));

        A21.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        A21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A21.setToolTipText("");
        A21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A21ActionPerformed(evt);
            }
        });
        jPanel1.add(A21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 35, 35));

        A22.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        A22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A22.setToolTipText("");
        A22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A22ActionPerformed(evt);
            }
        });
        jPanel1.add(A22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 35, 35));

        A23.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        A23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A23.setToolTipText("");
        A23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A23ActionPerformed(evt);
            }
        });
        jPanel1.add(A23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 35, 35));

        A31.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        A31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A31.setToolTipText("");
        A31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A31ActionPerformed(evt);
            }
        });
        jPanel1.add(A31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 35, 35));

        A32.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        A32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A32.setToolTipText("");
        A32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A32ActionPerformed(evt);
            }
        });
        jPanel1.add(A32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 35, 35));

        A33.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        A33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A33.setToolTipText("");
        A33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A33ActionPerformed(evt);
            }
        });
        jPanel1.add(A33, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 35, 35));

        Multiplicar.setText("Determinar");
        Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicarActionPerformed(evt);
            }
        });
        jPanel1.add(Multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 110, -1));

        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        jPanel1.add(Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 110, -1));

        VolverElegir.setText("Volver a elegir");
        VolverElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverElegirActionPerformed(evt);
            }
        });
        jPanel1.add(VolverElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 110, -1));

        MatrizA.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        MatrizA.setForeground(new java.awt.Color(255, 255, 255));
        MatrizA.setText("Matriz A");
        jPanel1.add(MatrizA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 80, 30));

        DetaA.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        DetaA.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(DetaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 60, 30));

        ResultadoDet.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        ResultadoDet.setForeground(new java.awt.Color(255, 255, 255));
        ResultadoDet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ResultadoDet.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(ResultadoDet, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverElegirActionPerformed
        Principal conexion8 = new Principal();
        conexion8.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverElegirActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        A11.setText("");
        A12.setText("");
        A13.setText("");
        A21.setText("");
        A22.setText("");
        A23.setText("");
        A31.setText("");
        A32.setText("");
        A33.setText("");
        DetaA.setText("");
        ResultadoDet.setText("");
    }//GEN-LAST:event_BorrarActionPerformed

    private void MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicarActionPerformed

        double multia11, multia12, multia13, deterA;
        //Asignar valores a valores de la matriz de A
        String na11 = A11.getText();
        String na12 = A12.getText();
        String na13 = A13.getText();
        String na21 = A21.getText();
        String na22 = A22.getText();
        String na23 = A23.getText();
        String na31 = A31.getText();
        String na32 = A32.getText();
        String na33 = A33.getText();
        //Convertir valores de String a byte de la matriz A
        double cna11 = Double.parseDouble(na11);
        double cna12 = Double.parseDouble(na12);
        double cna13 = Double.parseDouble(na13);
        double cna21 = Double.parseDouble(na21);
        double cna22 = Double.parseDouble(na22);
        double cna23 = Double.parseDouble(na23);
        double cna31 = Double.parseDouble(na31);
        double cna32 = Double.parseDouble(na32);
        double cna33 = Double.parseDouble(na33);
        //Obtener la determinante
        multia11 = cna11 * ((cna22 * cna33) - (cna32 * cna23));
        multia12 = cna12 * ((cna21 * cna33) - (cna31 * cna23));
        multia13 = cna13 * ((cna21 * cna32) - (cna31 * cna22));
        deterA = multia11 - multia12 + multia13;

        //Pasar de String a double
        String rdetA = String.valueOf(deterA);
        //Mostrar resultado
        DetaA.setText("ΔA=");
        ResultadoDet.setText(rdetA);
    }//GEN-LAST:event_MultiplicarActionPerformed

    private void A33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A33ActionPerformed

    private void A32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A32ActionPerformed

    private void A31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A31ActionPerformed

    private void A23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A23ActionPerformed

    private void A22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A22ActionPerformed

    private void A21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A21ActionPerformed

    private void A13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A13ActionPerformed

    private void A12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A12ActionPerformed

    private void A11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A11ActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraMatricesDeterminante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraMatricesDeterminante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraMatricesDeterminante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraMatricesDeterminante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new CalculadoraMatricesDeterminante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A11;
    private javax.swing.JTextField A12;
    private javax.swing.JTextField A13;
    private javax.swing.JTextField A21;
    private javax.swing.JTextField A22;
    private javax.swing.JTextField A23;
    private javax.swing.JTextField A31;
    private javax.swing.JTextField A32;
    private javax.swing.JTextField A33;
    private javax.swing.JButton Borrar;
    private javax.swing.JLabel DetaA;
    private javax.swing.JLabel MatrizA;
    private javax.swing.JButton Multiplicar;
    private javax.swing.JLabel ResultadoDet;
    private javax.swing.JLabel TituloCalculadora;
    private javax.swing.JButton VolverElegir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
