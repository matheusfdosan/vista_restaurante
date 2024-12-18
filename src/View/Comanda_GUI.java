/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pichau
 */
public class Comanda_GUI extends javax.swing.JFrame {
    private String valoresPedido;

    /**
     * Creates new form comandP_GUI
     */
    public Comanda_GUI(String idPedido) {
        initComponents();
        
        this.valoresPedido = idPedido;
        Controller.Funcoes_DAO.finalizar_pedido(valoresPedido);
    }

    Comanda_GUI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_pedido_txt_4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Pratcons_txt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botao_comanda = new org.edisoncor.gui.button.ButtonAction();
        container = new javax.swing.JScrollPane();
        todos_pratos_painel = new javax.swing.JTextArea();
        total_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        garcom_txt_3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        mesa_txt_3 = new javax.swing.JTextField();
        jMenuBar3 = new javax.swing.JMenuBar();
        vPed_btn2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        efetP_btn = new javax.swing.JMenuItem();
        consultP_btn = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        exit_btn = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jToggleButton1.setText("jToggleButton1");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg-sys.png"))); // NOI18N
        panelImage1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerar Comanda");
        panelImage1.add(jLabel1);
        jLabel1.setBounds(20, 20, 110, 30);

        jLabel2.setText("jLabel2");
        panelImage1.add(jLabel2);
        jLabel2.setBounds(10, 50, 34, 14);

        id_pedido_txt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_pedido_txt_4ActionPerformed(evt);
            }
        });
        panelImage1.add(id_pedido_txt_4);
        id_pedido_txt_4.setBounds(110, 70, 160, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id do Pedido:");
        panelImage1.add(jLabel5);
        jLabel5.setBounds(20, 80, 90, 20);

        Pratcons_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pratcons_txt.setForeground(new java.awt.Color(255, 255, 255));
        Pratcons_txt.setText("Pratos Consumidos:");
        panelImage1.add(Pratcons_txt);
        Pratcons_txt.setBounds(320, 20, 150, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Valor Total:");
        panelImage1.add(jLabel7);
        jLabel7.setBounds(170, 240, 100, 30);

        botao_comanda.setText("Gerar Comanda");
        botao_comanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_comandaActionPerformed(evt);
            }
        });
        panelImage1.add(botao_comanda);
        botao_comanda.setBounds(20, 280, 130, 40);

        container.setBackground(new java.awt.Color(102, 102, 102));

        todos_pratos_painel.setColumns(20);
        todos_pratos_painel.setRows(5);
        container.setViewportView(todos_pratos_painel);

        panelImage1.add(container);
        container.setBounds(320, 50, 220, 270);

        total_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_txtActionPerformed(evt);
            }
        });
        panelImage1.add(total_txt);
        total_txt.setBounds(170, 280, 110, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Garçom:");
        panelImage1.add(jLabel6);
        jLabel6.setBounds(20, 130, 60, 20);

        garcom_txt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                garcom_txt_3ActionPerformed(evt);
            }
        });
        panelImage1.add(garcom_txt_3);
        garcom_txt_3.setBounds(80, 120, 190, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mesa:");
        panelImage1.add(jLabel8);
        jLabel8.setBounds(20, 180, 40, 20);

        mesa_txt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa_txt_3ActionPerformed(evt);
            }
        });
        panelImage1.add(mesa_txt_3);
        mesa_txt_3.setBounds(70, 170, 200, 30);

        vPed_btn2.setText("Cozinha");

        jMenuItem4.setText("Ver Pedidos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        vPed_btn2.add(jMenuItem4);

        jMenuBar3.add(vPed_btn2);

        jMenu1.setText("Garçom");

        efetP_btn.setText("Efetuar Pedido");
        efetP_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efetP_btnActionPerformed(evt);
            }
        });
        jMenu1.add(efetP_btn);

        consultP_btn.setText("Consultar Pedido");
        consultP_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultP_btnActionPerformed(evt);
            }
        });
        jMenu1.add(consultP_btn);

        jMenuItem5.setText("Menu");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar3.add(jMenu1);

        jMenu5.setText("Ajuda");

        jMenuItem6.setText("Arquivo de ajuda");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuBar3.add(jMenu5);

        exit_btn.setText("Fechar");

        jMenuItem3.setText(" Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        exit_btn.add(jMenuItem3);

        jMenuBar3.add(exit_btn);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(565, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new Ver_Pedidos_GUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void efetP_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efetP_btnActionPerformed
        new Efetuar_Pedido_GUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_efetP_btnActionPerformed

    private void consultP_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultP_btnActionPerformed
        new Consultar_Pedido_GUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_consultP_btnActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new Menu_GUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void id_pedido_txt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_pedido_txt_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pedido_txt_4ActionPerformed

    private void botao_comandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_comandaActionPerformed
        try {
            Controller.Funcoes_DAO.criar_comanda_pdf();
        } catch (Exception ex) {
            Logger.getLogger(Comanda_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botao_comandaActionPerformed

    private void total_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_txtActionPerformed

    private void garcom_txt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_garcom_txt_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_garcom_txt_3ActionPerformed

    private void mesa_txt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa_txt_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa_txt_3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            Controller.Funcoes_DAO.abrir_arquivo_de_ajuda();
        } catch (IOException ex) {
            Logger.getLogger(Comanda_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(Comanda_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comanda_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comanda_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comanda_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comanda_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pratcons_txt;
    private org.edisoncor.gui.button.ButtonAction botao_comanda;
    private javax.swing.JMenuItem consultP_btn;
    public static javax.swing.JScrollPane container;
    private javax.swing.JMenuItem efetP_btn;
    private javax.swing.JMenu exit_btn;
    public static javax.swing.JTextField garcom_txt_3;
    public static javax.swing.JTextField id_pedido_txt_4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JToggleButton jToggleButton1;
    public static javax.swing.JTextField mesa_txt_3;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    public static javax.swing.JTextArea todos_pratos_painel;
    public static javax.swing.JTextField total_txt;
    private javax.swing.JMenu vPed_btn2;
    // End of variables declaration//GEN-END:variables
}
