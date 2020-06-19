package tela;

import lotofacil.Lotofacil;

public class formview extends javax.swing.JFrame {
    int xx,yy;
    
    
    
    
    public formview() {
        
        initComponents();
        Lotofacil loto = new Lotofacil();
        loto.Loteria();
        txtData.setText(loto.pegaData());
        dataConc.setText(loto.pegaConcurso());
        result.setText(loto.pegaResultado());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtData = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        text11 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        text14 = new javax.swing.JTextField();
        text1 = new javax.swing.JTextField();
        text5 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        text6 = new javax.swing.JTextField();
        text9 = new javax.swing.JTextField();
        text7 = new javax.swing.JTextField();
        text8 = new javax.swing.JTextField();
        text10 = new javax.swing.JTextField();
        text15 = new javax.swing.JTextField();
        text13 = new javax.swing.JTextField();
        text12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();
        dataConc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOTOFÁCIL");
        setBackground(new java.awt.Color(50, 113, 168));
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(720, 480));
        setSize(new java.awt.Dimension(720, 480));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(null);

        txtData.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtData.setText("Data sorteio");
        getContentPane().add(txtData);
        txtData.setBounds(10, 290, 385, 30);

        jPanel1.setBackground(new java.awt.Color(50, 113, 168));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 480));
        jPanel1.setNextFocusableComponent(jLabel1);
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 480));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(50, 113, 168));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOTOFÁCIL");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 452, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 30);
        getContentPane().add(text11);
        text11.setBounds(10, 190, 50, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Insira os números jogados:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 220, 40);
        getContentPane().add(text14);
        text14.setBounds(160, 190, 50, 30);
        getContentPane().add(text1);
        text1.setBounds(10, 110, 50, 30);
        getContentPane().add(text5);
        text5.setBounds(210, 110, 50, 30);
        getContentPane().add(text4);
        text4.setBounds(160, 110, 50, 30);
        getContentPane().add(text2);
        text2.setBounds(60, 110, 50, 30);
        getContentPane().add(text3);
        text3.setBounds(110, 110, 50, 30);
        getContentPane().add(text6);
        text6.setBounds(10, 150, 50, 30);
        getContentPane().add(text9);
        text9.setBounds(160, 150, 50, 30);
        getContentPane().add(text7);
        text7.setBounds(60, 150, 50, 30);
        getContentPane().add(text8);
        text8.setBounds(110, 150, 50, 30);

        text10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text10ActionPerformed(evt);
            }
        });
        getContentPane().add(text10);
        text10.setBounds(210, 150, 50, 30);
        getContentPane().add(text15);
        text15.setBounds(210, 190, 50, 30);
        getContentPane().add(text13);
        text13.setBounds(110, 190, 50, 30);
        getContentPane().add(text12);
        text12.setBounds(60, 190, 50, 30);

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 340, 70, 26);

        jButton2.setText("Verificar");
        getContentPane().add(jButton2);
        jButton2.setBounds(430, 340, 100, 26);

        result.setEditable(false);
        result.setColumns(20);
        result.setRows(5);
        jScrollPane1.setViewportView(result);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(290, 100, 310, 120);
        getContentPane().add(dataConc);
        dataConc.setBounds(10, 50, 320, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       
    }//GEN-LAST:event_formMousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        
    }//GEN-LAST:event_jPanel1MouseReleased

    private void text10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(formview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dataConc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea result;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text10;
    private javax.swing.JTextField text11;
    private javax.swing.JTextField text12;
    private javax.swing.JTextField text13;
    private javax.swing.JTextField text14;
    private javax.swing.JTextField text15;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JTextField text6;
    private javax.swing.JTextField text7;
    private javax.swing.JTextField text8;
    private javax.swing.JTextField text9;
    private javax.swing.JLabel txtData;
    // End of variables declaration//GEN-END:variables
}
