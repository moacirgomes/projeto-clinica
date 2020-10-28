/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class TelaPrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipalView
     */
    public TelaPrincipalView() {
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

        jLabel1 = new javax.swing.JLabel();
        jItenalFrame = new javax.swing.JInternalFrame();
        jLabelFundoPricipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        jMenuCadastroV = new javax.swing.JMenuItem();
        menuAdministrador = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        menuLaboratorio = new javax.swing.JMenu();
        menuRemedio = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenu();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica_veterinaria_projeto_java/imagens/internalframe.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jItenalFrame.setBackground(new java.awt.Color(204, 204, 204));
        jItenalFrame.setClosable(true);
        jItenalFrame.setIconifiable(true);
        jItenalFrame.setMaximizable(true);
        jItenalFrame.setResizable(true);
        jItenalFrame.setTitle("Bem-Vindo");
        jItenalFrame.setToolTipText("Sistema de Gerenciamento:");
        try {
            jItenalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        jItenalFrame.setVisible(true);
        jItenalFrame.getContentPane().setLayout(null);
        getContentPane().add(jItenalFrame);
        jItenalFrame.setBounds(20, 50, 920, 400);

        jLabelFundoPricipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica_veterinaria_projeto_java/imagens/fundo_telaprincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPricipal);
        jLabelFundoPricipal.setBounds(0, 0, 970, 520);

        menuCadastro.setText("Cadastro ");

        jMenuCadastroV.setText("Cadastro  Veterinario ");
        jMenuCadastroV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroVActionPerformed(evt);
            }
        });
        menuCadastro.add(jMenuCadastroV);

        menuAdministrador.setText("Cadastro Administrador");
        menuAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdministradorActionPerformed(evt);
            }
        });
        menuCadastro.add(menuAdministrador);

        jMenuItem1.setText("Cadastro Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCadastro.add(jMenuItem1);

        jMenuBar1.add(menuCadastro);

        menuConsulta.setText("Consulta");
        jMenuBar1.add(menuConsulta);

        menuLaboratorio.setText("Labaratório");
        menuLaboratorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLaboratorioMouseClicked(evt);
            }
        });
        menuLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLaboratorioActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuLaboratorio);

        menuRemedio.setText("Remédio");
        menuRemedio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRemedioMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuRemedio);

        MenuSair.setText("Sair");
        MenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(983, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSairMouseClicked
       this.dispose();
       TelaLoginView telaL = new TelaLoginView();
       telaL.setVisible(true);
    }//GEN-LAST:event_MenuSairMouseClicked

    private void jMenuCadastroVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroVActionPerformed
       TelaVeterinarioView telav = new TelaVeterinarioView();
       telav.setVisible(true);
    }//GEN-LAST:event_jMenuCadastroVActionPerformed

    private void menuAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdministradorActionPerformed
            // TODO add your handling code here:
        TelaAdministrador telaAdm = new TelaAdministrador();
        telaAdm.show();
    }//GEN-LAST:event_menuAdministradorActionPerformed

    private void menuLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLaboratorioActionPerformed

    }//GEN-LAST:event_menuLaboratorioActionPerformed

    private void menuLaboratorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLaboratorioMouseClicked
        // TODO add your handling code here:
        TelaLaboratorioView telaLab = new TelaLaboratorioView();
        telaLab.setVisible(true);
    }//GEN-LAST:event_menuLaboratorioMouseClicked

    private void menuRemedioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRemedioMouseClicked
        // TODO add your handling code here:
        TelaRemedioView telaRemedio = new TelaRemedioView();
        telaRemedio.setVisible(true);
    }//GEN-LAST:event_menuRemedioMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaClienteAnimalView telaClienteA = new TelaClienteAnimalView();
        telaClienteA.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuSair;
    private javax.swing.JInternalFrame jItenalFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFundoPricipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadastroV;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuAdministrador;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenu menuLaboratorio;
    private javax.swing.JMenu menuRemedio;
    // End of variables declaration//GEN-END:variables
}
