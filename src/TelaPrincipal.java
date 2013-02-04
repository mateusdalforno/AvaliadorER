
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mateus
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form telaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelER = new javax.swing.JLabel();
        jTextFieldER = new javax.swing.JTextField();
        jButtonConcatenacao = new javax.swing.JButton();
        jButtonEstrela = new javax.swing.JButton();
        jButtonUniao = new javax.swing.JButton();
        jButtonAbreParenteses = new javax.swing.JButton();
        jButtonFechaParenteses = new javax.swing.JButton();
        jButtonValidarER = new javax.swing.JButton();
        jButtonStringVazia = new javax.swing.JButton();
        jButtonConjuntoVazio = new javax.swing.JButton();
        jLabelString = new javax.swing.JLabel();
        jTextFieldString = new javax.swing.JTextField();
        jButtonValidarString = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Avaliador de Expressões Regulares");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 580));
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitulo.setText("Avaliador de Expressões Regulares");

        jLabelER.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelER.setText("Expressão Regular");

        jTextFieldER.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonConcatenacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonConcatenacao.setText(".");
        jButtonConcatenacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcatenacaoActionPerformed(evt);
            }
        });

        jButtonEstrela.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEstrela.setText("*");
        jButtonEstrela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstrelaActionPerformed(evt);
            }
        });

        jButtonUniao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUniao.setText("|");
        jButtonUniao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUniaoActionPerformed(evt);
            }
        });

        jButtonAbreParenteses.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAbreParenteses.setText("(");
        jButtonAbreParenteses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbreParentesesActionPerformed(evt);
            }
        });

        jButtonFechaParenteses.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonFechaParenteses.setText(")");
        jButtonFechaParenteses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFechaParentesesActionPerformed(evt);
            }
        });

        jButtonValidarER.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonValidarER.setText("Validar Expressão Regular");
        jButtonValidarER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarERActionPerformed(evt);
            }
        });

        jButtonStringVazia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonStringVazia.setText("ε");
        jButtonStringVazia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStringVaziaActionPerformed(evt);
            }
        });

        jButtonConjuntoVazio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonConjuntoVazio.setText("Ø");
        jButtonConjuntoVazio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConjuntoVazioActionPerformed(evt);
            }
        });

        jLabelString.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelString.setText("String");
        jLabelString.setEnabled(false);

        jTextFieldString.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldString.setEnabled(false);
        jTextFieldString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStringActionPerformed(evt);
            }
        });

        jButtonValidarString.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonValidarString.setText("Validar String");
        jButtonValidarString.setEnabled(false);
        jButtonValidarString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarStringActionPerformed(evt);
            }
        });

        jMenu3.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Ajuda");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem2.setText("Sobre...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonConcatenacao)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEstrela)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUniao)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAbreParenteses)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFechaParenteses)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonStringVazia)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConjuntoVazio))
                    .addComponent(jLabelString)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldER, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                            .addComponent(jTextFieldString))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonValidarString, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonValidarER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(29, 29, 29)
                .addComponent(jLabelER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonValidarER))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConcatenacao)
                    .addComponent(jButtonEstrela)
                    .addComponent(jButtonUniao)
                    .addComponent(jButtonAbreParenteses)
                    .addComponent(jButtonFechaParenteses)
                    .addComponent(jButtonStringVazia)
                    .addComponent(jButtonConjuntoVazio))
                .addGap(34, 34, 34)
                .addComponent(jLabelString)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonValidarString))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Avaliador de Expressões Regulares");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Ajuda ajuda = new Ajuda();
        ajuda.show(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButtonConcatenacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcatenacaoActionPerformed
        jTextFieldER.setText(jTextFieldER.getText()+'.');
        jTextFieldER.requestFocus();
    }//GEN-LAST:event_jButtonConcatenacaoActionPerformed

    private void jButtonEstrelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstrelaActionPerformed
        jTextFieldER.setText(jTextFieldER.getText()+'*');
        jTextFieldER.requestFocus();
    }//GEN-LAST:event_jButtonEstrelaActionPerformed

    private void jButtonAbreParentesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbreParentesesActionPerformed
        jTextFieldER.setText(jTextFieldER.getText()+'(');  
        jTextFieldER.requestFocus();
    }//GEN-LAST:event_jButtonAbreParentesesActionPerformed

    private void jButtonValidarERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarERActionPerformed
        String ER = jTextFieldER.getText();
        boolean statusER = true;
        if(statusER){
            jLabelString.setEnabled(true);
            jTextFieldString.setEnabled(true);
            jButtonValidarString.setEnabled(true);
            JOptionPane.showMessageDialog(null, "A Expressão Regular é válida!","ER Válida",1);
        }else{
            
            JOptionPane.showMessageDialog(null, "A Expressão Regular é inválida","ER Inválida",0);
        }
        
    }//GEN-LAST:event_jButtonValidarERActionPerformed

    private void jButtonUniaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUniaoActionPerformed
        jTextFieldER.setText(jTextFieldER.getText()+'|');
        jTextFieldER.requestFocus();
    }//GEN-LAST:event_jButtonUniaoActionPerformed

    private void jButtonFechaParentesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFechaParentesesActionPerformed
        jTextFieldER.setText(jTextFieldER.getText()+')');
        jTextFieldER.requestFocus();
    }//GEN-LAST:event_jButtonFechaParentesesActionPerformed

    private void jButtonStringVaziaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStringVaziaActionPerformed
        jTextFieldER.setText(jTextFieldER.getText()+'ε');
        jTextFieldER.requestFocus();
    }//GEN-LAST:event_jButtonStringVaziaActionPerformed

    private void jButtonConjuntoVazioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConjuntoVazioActionPerformed
        jTextFieldER.setText(jTextFieldER.getText()+'Ø');
        jTextFieldER.requestFocus();
    }//GEN-LAST:event_jButtonConjuntoVazioActionPerformed

    private void jTextFieldStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStringActionPerformed

    }//GEN-LAST:event_jTextFieldStringActionPerformed

    private void jButtonValidarStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarStringActionPerformed
        boolean statusString = false;
        if(statusString){
           
            JOptionPane.showMessageDialog(null, "A String é reconhecida pela expressão regular!","String Reconhecida",1);
        }else{
            
            JOptionPane.showMessageDialog(null, "A String não é reconhecida pela expressão regular!","String Não Reconhecida",0);
        }
    }//GEN-LAST:event_jButtonValidarStringActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbreParenteses;
    private javax.swing.JButton jButtonConcatenacao;
    private javax.swing.JButton jButtonConjuntoVazio;
    private javax.swing.JButton jButtonEstrela;
    private javax.swing.JButton jButtonFechaParenteses;
    private javax.swing.JButton jButtonStringVazia;
    private javax.swing.JButton jButtonUniao;
    private javax.swing.JButton jButtonValidarER;
    private javax.swing.JButton jButtonValidarString;
    private javax.swing.JLabel jLabelER;
    private javax.swing.JLabel jLabelString;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField jTextFieldER;
    private javax.swing.JTextField jTextFieldString;
    // End of variables declaration//GEN-END:variables
}
