/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.view;

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
        jMenuCadastroCA = new javax.swing.JMenuItem();
        jMenuCadastroV = new javax.swing.JMenuItem();
        menuAdministrador = new javax.swing.JMenuItem();
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
        jItenalFrame.setBounds(-10, 120, 980, 400);

        jLabelFundoPricipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica_veterinaria_projeto_java/imagens/fundo_telaprincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPricipal);
        jLabelFundoPricipal.setBounds(0, 0, 970, 520);

        menuCadastro.setText("Cadastro ");

        jMenuCadastroCA.setText("Cadastro de Clientes e Animal");
        menuCadastro.add(jMenuCadastroCA);

        jMenuCadastroV.setText("Cadastro de Veterinario ");
        jMenuCadastroV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroVActionPerformed(evt);
            }
        });
        menuCadastro.add(jMenuCadastroV);

        menuAdministrador.setText("Cadastro de Administrador");
        menuAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdministradorActionPerformed(evt);
            }
        });
        menuCadastro.add(menuAdministrador);

        jMenuBar1.add(menuCadastro);

        menuConsulta.setText("Consulta");
        jMenuBar1.add(menuConsulta);

        menuLaboratorio.setText("Labaratorio");
        jMenuBar1.add(menuLaboratorio);

        menuRemedio.setText("Remedio");
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
    private javax.swing.JMenuItem jMenuCadastroCA;
    private javax.swing.JMenuItem jMenuCadastroV;
    private javax.swing.JMenuItem menuAdministrador;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenu menuLaboratorio;
    private javax.swing.JMenu menuRemedio;
    // End of variables declaration//GEN-END:variables
}
