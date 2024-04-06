package calculadoradematrices;

import java.text.DecimalFormat;

public class CalculadoraMatricesInversa extends javax.swing.JFrame {

    public CalculadoraMatricesInversa() {
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
        Resolver = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        VolverElegir = new javax.swing.JButton();
        Inversa = new javax.swing.JLabel();
        MatrizA = new javax.swing.JLabel();
        Igual = new javax.swing.JLabel();
        R11 = new javax.swing.JLabel();
        R12 = new javax.swing.JLabel();
        R13 = new javax.swing.JLabel();
        R21 = new javax.swing.JLabel();
        R22 = new javax.swing.JLabel();
        R23 = new javax.swing.JLabel();
        R31 = new javax.swing.JLabel();
        R32 = new javax.swing.JLabel();
        R33 = new javax.swing.JLabel();
        detA = new javax.swing.JLabel();
        rdetA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(121, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloCalculadora.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        TituloCalculadora.setForeground(new java.awt.Color(255, 255, 255));
        TituloCalculadora.setText("Introduce los datos de tu matriz");
        jPanel1.add(TituloCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 270, 30));

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

        Resolver.setText("Resolver");
        Resolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResolverActionPerformed(evt);
            }
        });
        jPanel1.add(Resolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 110, -1));

        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        jPanel1.add(Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 110, -1));

        VolverElegir.setText("Volver a elegir");
        VolverElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverElegirActionPerformed(evt);
            }
        });
        jPanel1.add(VolverElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 110, -1));

        Inversa.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Inversa.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Inversa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 80, 30));

        MatrizA.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        MatrizA.setForeground(new java.awt.Color(255, 255, 255));
        MatrizA.setText("Matriz A");
        jPanel1.add(MatrizA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 80, 30));

        Igual.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        Igual.setForeground(new java.awt.Color(255, 255, 255));
        Igual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 30, 40));

        R11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R11.setForeground(new java.awt.Color(255, 255, 255));
        R11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 50, 35));

        R12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R12.setForeground(new java.awt.Color(255, 255, 255));
        R12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 50, 35));

        R13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R13.setForeground(new java.awt.Color(255, 255, 255));
        R13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 50, 35));

        R21.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R21.setForeground(new java.awt.Color(255, 255, 255));
        R21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 50, 35));

        R22.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R22.setForeground(new java.awt.Color(255, 255, 255));
        R22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 50, 35));

        R23.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R23.setForeground(new java.awt.Color(255, 255, 255));
        R23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R23, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 50, 35));

        R31.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R31.setForeground(new java.awt.Color(255, 255, 255));
        R31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R31, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 50, 35));

        R32.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R32.setForeground(new java.awt.Color(255, 255, 255));
        R32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R32, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 50, 35));

        R33.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R33.setForeground(new java.awt.Color(255, 255, 255));
        R33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R33, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 50, 35));

        detA.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        detA.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(detA, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 80, 30));

        rdetA.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        rdetA.setForeground(new java.awt.Color(255, 255, 255));
        rdetA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(rdetA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 340));

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
        R11.setText("");
        R12.setText("");
        R13.setText("");
        R21.setText("");
        R22.setText("");
        R23.setText("");
        R31.setText("");
        R32.setText("");
        R33.setText("");
        Igual.setText("");
        Inversa.setText("");
        detA.setText("");
        rdetA.setText("");
    }//GEN-LAST:event_BorrarActionPerformed

    private void ResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResolverActionPerformed

        //Declarar variables
        double multia11, multia12, multia13, deterA, r11, r12, r13, r21, r22,
                r23, r31, r32, r33, i11, i12, i13, i21, i22, i23, i31, i32, i33;
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
        //Obtener Determinante de la matriz
        multia11 = cna11 * ((cna22 * cna33) - (cna32 * cna23));
        multia12 = cna12 * ((cna21 * cna33) - (cna31 * cna23));
        multia13 = cna13 * ((cna21 * cna32) - (cna31 * cna22));
        deterA = multia11 - multia12 + multia13;
        //Obtener la Adjunta de la matriz
        r11 = (cna22 * cna33) - (cna32 * cna23);
        r12 = ((cna21 * cna33) - (cna31 * cna23)) * (-1);
        r13 = (cna21 * cna32) - (cna31 * cna22);
        r21 = ((cna12 * cna33) - (cna32 * cna13)) * (-1);
        r22 = (cna11 * cna33) - (cna31 * cna13);
        r23 = ((cna11 * cna32) - (cna31 * cna12)) * (-1);
        r31 = (cna12 * cna23) - (cna22 * cna13);
        r32 = ((cna11 * cna23) - (cna21 * cna13)) * (-1);
        r33 = (cna11 * cna22) - (cna21 * cna12);
        //Obtener Inversa de la matriz
        i11 = (1 / deterA) * r11;
        i12 = (1 / deterA) * r12;
        i13 = (1 / deterA) * r13;
        i21 = (1 / deterA) * r21;
        i22 = (1 / deterA) * r22;
        i23 = (1 / deterA) * r23;
        i31 = (1 / deterA) * r31;
        i32 = (1 / deterA) * r32;
        i33 = (1 / deterA) * r33;
        //Pasar de double a String
        String si11 = String.valueOf(i11);
        String si12 = String.valueOf(i12);
        String si13 = String.valueOf(i13);
        String si21 = String.valueOf(i21);
        String si22 = String.valueOf(i22);
        String si23 = String.valueOf(i23);
        String si31 = String.valueOf(i31);
        String si32 = String.valueOf(i32);
        String si33 = String.valueOf(i33);
        //Asignar valores a la determinante de A R11
        DecimalFormat limit = new DecimalFormat("###.##");
        /*R11.setText(limit.format(i11));
        R12.setText(limit.format(i12));
        R13.setText(limit.format(i13));
        R21.setText(limit.format(i21));
        R22.setText(limit.format(i22));
        R23.setText(limit.format(i23));
        R31.setText(limit.format(i31));
        R32.setText(limit.format(i32));
        R33.setText(limit.format(i33));*/
        R11.setText(si11);
        R12.setText(si21);
        R13.setText(si31);
        R21.setText(si12);
        R22.setText(si22);
        R23.setText(si32);
        R31.setText(si13);
        R32.setText(si23);
        R33.setText(si33);
        //Colocar signo de = (Igual)
        Igual.setText("=");
        Inversa.setText("A^-1");
        detA.setText("ΔA= ");
        rdetA.setText(limit.format(deterA));
    }//GEN-LAST:event_ResolverActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraMatricesInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraMatricesInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraMatricesInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraMatricesInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CalculadoraMatricesInversa().setVisible(true);
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
    private javax.swing.JLabel Igual;
    private javax.swing.JLabel Inversa;
    private javax.swing.JLabel MatrizA;
    private javax.swing.JLabel R11;
    private javax.swing.JLabel R12;
    private javax.swing.JLabel R13;
    private javax.swing.JLabel R21;
    private javax.swing.JLabel R22;
    private javax.swing.JLabel R23;
    private javax.swing.JLabel R31;
    private javax.swing.JLabel R32;
    private javax.swing.JLabel R33;
    private javax.swing.JButton Resolver;
    private javax.swing.JLabel TituloCalculadora;
    private javax.swing.JButton VolverElegir;
    private javax.swing.JLabel detA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel rdetA;
    // End of variables declaration//GEN-END:variables
}
