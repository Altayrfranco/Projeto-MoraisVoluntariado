/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vision.voluntario;

import vision.TelaLogin;

/**
 *
 * @author Altayr
 */
public class MenuVoluntario extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuVoluntario() {
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

        btDoacao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btEvento = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Voluntario");
        getContentPane().setLayout(null);

        btDoacao.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btDoacao.setText("Doações");
        btDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btDoacao);
        btDoacao.setBounds(10, 310, 460, 53);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Morais Voluntariado");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 437, 69);

        btEvento.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btEvento.setText("Eventos");
        btEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEventoActionPerformed(evt);
            }
        });
        getContentPane().add(btEvento);
        btEvento.setBounds(10, 370, 460, 53);

        btSair.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair);
        btSair.setBounds(380, 440, 90, 40);

        setSize(new java.awt.Dimension(496, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btDoacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoacaoActionPerformed
        RealizarDoacao tela = new RealizarDoacao();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btDoacaoActionPerformed

    private void btEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEventoActionPerformed
        VerEvento tela = new VerEvento();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btEventoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVoluntario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDoacao;
    private javax.swing.JButton btEvento;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
