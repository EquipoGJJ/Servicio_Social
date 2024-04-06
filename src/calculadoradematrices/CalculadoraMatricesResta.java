package calculadoradematrices;

public class CalculadoraMatricesResta extends javax.swing.JFrame {

    public CalculadoraMatricesResta() {
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
        B11 = new javax.swing.JTextField();
        B12 = new javax.swing.JTextField();
        B13 = new javax.swing.JTextField();
        B21 = new javax.swing.JTextField();
        B22 = new javax.swing.JTextField();
        B23 = new javax.swing.JTextField();
        B31 = new javax.swing.JTextField();
        B32 = new javax.swing.JTextField();
        B33 = new javax.swing.JTextField();
        Restar = new javax.swing.JButton();
        SimboloOperacion = new javax.swing.JLabel();
        SimboloOperacion1 = new javax.swing.JLabel();
        R11 = new javax.swing.JLabel();
        R12 = new javax.swing.JLabel();
        R13 = new javax.swing.JLabel();
        R21 = new javax.swing.JLabel();
        R22 = new javax.swing.JLabel();
        R23 = new javax.swing.JLabel();
        R31 = new javax.swing.JLabel();
        R32 = new javax.swing.JLabel();
        R33 = new javax.swing.JLabel();
        Borrar = new javax.swing.JButton();
        VolverElegir = new javax.swing.JButton();
        MatrizA = new javax.swing.JLabel();
        MatrizB = new javax.swing.JLabel();
        MatrizRes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(121, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloCalculadora.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        TituloCalculadora.setForeground(new java.awt.Color(255, 255, 255));
        TituloCalculadora.setText("Introduce los datos de tu matriz");
        jPanel1.add(TituloCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 270, 30));

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

        B11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        B11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B11.setToolTipText("");
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });
        jPanel1.add(B11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 35, 35));

        B12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        B12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B12.setToolTipText("");
        B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ActionPerformed(evt);
            }
        });
        jPanel1.add(B12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 35, 35));

        B13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        B13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B13.setToolTipText("");
        B13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B13ActionPerformed(evt);
            }
        });
        jPanel1.add(B13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 35, 35));

        B21.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        B21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B21.setToolTipText("");
        B21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B21ActionPerformed(evt);
            }
        });
        jPanel1.add(B21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 35, 35));

        B22.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        B22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B22.setToolTipText("");
        B22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B22ActionPerformed(evt);
            }
        });
        jPanel1.add(B22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 35, 35));

        B23.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        B23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B23.setToolTipText("");
        B23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B23ActionPerformed(evt);
            }
        });
        jPanel1.add(B23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 35, 35));

        B31.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        B31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B31.setToolTipText("");
        B31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B31ActionPerformed(evt);
            }
        });
        jPanel1.add(B31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 35, 35));

        B32.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        B32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B32.setToolTipText("");
        B32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B32ActionPerformed(evt);
            }
        });
        jPanel1.add(B32, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 35, 35));

        B33.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        B33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B33.setToolTipText("");
        B33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B33ActionPerformed(evt);
            }
        });
        jPanel1.add(B33, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 35, 35));

        Restar.setText("Restar");
        Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarActionPerformed(evt);
            }
        });
        jPanel1.add(Restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 110, -1));

        SimboloOperacion.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        SimboloOperacion.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(SimboloOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 15, 35));

        SimboloOperacion1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        SimboloOperacion1.setForeground(new java.awt.Color(255, 255, 255));
        SimboloOperacion1.setText("-");
        jPanel1.add(SimboloOperacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 15, 35));

        R11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R11.setForeground(new java.awt.Color(255, 255, 255));
        R11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 35, 35));

        R12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R12.setForeground(new java.awt.Color(255, 255, 255));
        R12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 35, 35));

        R13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R13.setForeground(new java.awt.Color(255, 255, 255));
        R13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 35, 35));

        R21.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R21.setForeground(new java.awt.Color(255, 255, 255));
        R21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 35, 35));

        R22.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R22.setForeground(new java.awt.Color(255, 255, 255));
        R22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 35, 35));

        R23.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R23.setForeground(new java.awt.Color(255, 255, 255));
        R23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 35, 35));

        R31.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R31.setForeground(new java.awt.Color(255, 255, 255));
        R31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R31, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 35, 35));

        R32.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R32.setForeground(new java.awt.Color(255, 255, 255));
        R32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R32, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 35, 35));

        R33.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        R33.setForeground(new java.awt.Color(255, 255, 255));
        R33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R33, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 35, 35));

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
        jPanel1.add(VolverElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 110, -1));

        MatrizA.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        MatrizA.setForeground(new java.awt.Color(255, 255, 255));
        MatrizA.setText("Matriz A");
        jPanel1.add(MatrizA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 80, 30));

        MatrizB.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        MatrizB.setForeground(new java.awt.Color(255, 255, 255));
        MatrizB.setText("Matriz B");
        jPanel1.add(MatrizB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 80, 30));

        MatrizRes.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        MatrizRes.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(MatrizRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void A33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A33ActionPerformed

    private void A11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A11ActionPerformed

    private void A12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A12ActionPerformed

    private void A13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A13ActionPerformed

    private void A21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A21ActionPerformed

    private void A22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A22ActionPerformed

    private void A23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A23ActionPerformed

    private void A31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A31ActionPerformed

    private void A32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A32ActionPerformed

    private void RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarActionPerformed

        double resta11, resta12, resta13, resta21, resta22, resta23, resta31, resta32, resta33;
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
        //Asignar valores a valores de la matriz de B
        String nb11 = B11.getText();
        String nb12 = B12.getText();
        String nb13 = B13.getText();
        String nb21 = B21.getText();
        String nb22 = B22.getText();
        String nb23 = B23.getText();
        String nb31 = B31.getText();
        String nb32 = B32.getText();
        String nb33 = B33.getText();
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
        //Convertir valores de String a byte de la matriz B
        double cnb11 = Double.parseDouble(nb11);
        double cnb12 = Double.parseDouble(nb12);
        double cnb13 = Double.parseDouble(nb13);
        double cnb21 = Double.parseDouble(nb21);
        double cnb22 = Double.parseDouble(nb22);
        double cnb23 = Double.parseDouble(nb23);
        double cnb31 = Double.parseDouble(nb31);
        double cnb32 = Double.parseDouble(nb32);
        double cnb33 = Double.parseDouble(nb33);
        //Suma para obtener Matriz resultante
        resta11 = cna11 - cnb11;
        resta12 = cna12 - cnb12;
        resta13 = cna13 - cnb13;
        resta21 = cna21 - cnb21;
        resta22 = cna22 - cnb22;
        resta23 = cna23 - cnb23;
        resta31 = cna31 - cnb31;
        resta32 = cna32 - cnb32;
        resta33 = cna33 - cnb33;
        //Pasar de String a double
        String r11 = String.valueOf(resta11);
        String r12 = String.valueOf(resta12);
        String r13 = String.valueOf(resta13);
        String r21 = String.valueOf(resta21);
        String r22 = String.valueOf(resta22);
        String r23 = String.valueOf(resta23);
        String r31 = String.valueOf(resta31);
        String r32 = String.valueOf(resta32);
        String r33 = String.valueOf(resta33);
        //Asignar valores a la resultante de la suma de A y B
        R11.setText(r11);
        R12.setText(r12);
        R13.setText(r13);
        R21.setText(r21);
        R22.setText(r22);
        R23.setText(r23);
        R31.setText(r31);
        R32.setText(r32);
        R33.setText(r33);
        SimboloOperacion.setText("=");
        MatrizRes.setText("Matriz resultante");
    }//GEN-LAST:event_RestarActionPerformed

    private void B31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B31ActionPerformed

    private void B33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B33ActionPerformed

    private void B32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B32ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B11ActionPerformed

    private void B21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B21ActionPerformed

    private void B22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B22ActionPerformed

    private void B12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B12ActionPerformed

    private void B23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B23ActionPerformed

    private void B13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B13ActionPerformed

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
        B11.setText("");
        B12.setText("");
        B13.setText("");
        B21.setText("");
        B22.setText("");
        B23.setText("");
        B31.setText("");
        B32.setText("");
        B33.setText("");
        R11.setText("");
        R12.setText("");
        R13.setText("");
        R21.setText("");
        R22.setText("");
        R23.setText("");
        R31.setText("");
        R32.setText("");
        R33.setText("");
        MatrizRes.setText("");
        SimboloOperacion.setText("");
    }//GEN-LAST:event_BorrarActionPerformed

    private void VolverElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverElegirActionPerformed
        Principal conexion4 = new Principal();
        conexion4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverElegirActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraMatricesResta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraMatricesResta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraMatricesResta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraMatricesResta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraMatricesResta().setVisible(true);
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
    private javax.swing.JTextField B11;
    private javax.swing.JTextField B12;
    private javax.swing.JTextField B13;
    private javax.swing.JTextField B21;
    private javax.swing.JTextField B22;
    private javax.swing.JTextField B23;
    private javax.swing.JTextField B31;
    private javax.swing.JTextField B32;
    private javax.swing.JTextField B33;
    private javax.swing.JButton Borrar;
    private javax.swing.JLabel MatrizA;
    private javax.swing.JLabel MatrizB;
    private javax.swing.JLabel MatrizRes;
    private javax.swing.JLabel R11;
    private javax.swing.JLabel R12;
    private javax.swing.JLabel R13;
    private javax.swing.JLabel R21;
    private javax.swing.JLabel R22;
    private javax.swing.JLabel R23;
    private javax.swing.JLabel R31;
    private javax.swing.JLabel R32;
    private javax.swing.JLabel R33;
    private javax.swing.JButton Restar;
    private javax.swing.JLabel SimboloOperacion;
    private javax.swing.JLabel SimboloOperacion1;
    private javax.swing.JLabel TituloCalculadora;
    private javax.swing.JButton VolverElegir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
