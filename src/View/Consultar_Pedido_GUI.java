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
 * @author mathe
 */
public class Consultar_Pedido_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Consultar_Pedido_GUI
     */
    public Consultar_Pedido_GUI() {
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

        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_pedido_txt = new javax.swing.JTextField();
        numero_pedidos_txt_2 = new javax.swing.JTextField();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        Finilizarped_btn = new org.edisoncor.gui.button.ButtonAction();
        consultar_pedido_btn = new org.edisoncor.gui.button.ButtonAction();
        atualizar_pedido = new org.edisoncor.gui.button.ButtonAction();
        jLabel3 = new javax.swing.JLabel();
        obs_txt_2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mesa_txt_2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        status_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        datetime_txt = new javax.swing.JTextField();
        garcom_txt_2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        num_mesa_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        numeros_pedidos_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        observacao_txt = new javax.swing.JTextField();
        efetuar_pedido_btn = new org.edisoncor.gui.button.ButtonAction();
        jLabel11 = new javax.swing.JLabel();
        garcom_txt = new javax.swing.JTextField();
        valorP_txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        valorP_txt_2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
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

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id do Pedido:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Números dos Pedidos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        id_pedido_txt.setForeground(new java.awt.Color(102, 102, 102));
        id_pedido_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_pedido_txtActionPerformed(evt);
            }
        });
        jPanel1.add(id_pedido_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 98, 30));

        numero_pedidos_txt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_pedidos_txt_2ActionPerformed(evt);
            }
        });
        jPanel1.add(numero_pedidos_txt_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 248, 30));

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg-sys.png"))); // NOI18N
        panelImage1.setLayout(null);

        Finilizarped_btn.setText("Finalizar Pedido");
        Finilizarped_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Finilizarped_btnActionPerformed(evt);
            }
        });
        panelImage1.add(Finilizarped_btn);
        Finilizarped_btn.setBounds(421, 125, 142, 35);

        consultar_pedido_btn.setText("Consultar");
        consultar_pedido_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_pedido_btnActionPerformed(evt);
            }
        });
        panelImage1.add(consultar_pedido_btn);
        consultar_pedido_btn.setBounds(421, 33, 142, 35);

        atualizar_pedido.setText("Atualizar Pedido");
        atualizar_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizar_pedidoActionPerformed(evt);
            }
        });
        panelImage1.add(atualizar_pedido);
        atualizar_pedido.setBounds(421, 79, 142, 35);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Observação:");
        panelImage1.add(jLabel3);
        jLabel3.setBounds(30, 178, 81, 17);

        obs_txt_2.setForeground(new java.awt.Color(102, 102, 102));
        obs_txt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obs_txt_2ActionPerformed(evt);
            }
        });
        panelImage1.add(obs_txt_2);
        obs_txt_2.setBounds(30, 198, 249, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mesa:");
        panelImage1.add(jLabel4);
        jLabel4.setBounds(30, 238, 38, 17);

        mesa_txt_2.setForeground(new java.awt.Color(102, 102, 102));
        panelImage1.add(mesa_txt_2);
        mesa_txt_2.setBounds(30, 258, 85, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Status:");
        panelImage1.add(jLabel5);
        jLabel5.setBounds(30, 298, 44, 17);

        status_txt.setForeground(new java.awt.Color(102, 102, 102));
        panelImage1.add(status_txt);
        status_txt.setBounds(30, 318, 104, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data e hora do pedido:");
        panelImage1.add(jLabel6);
        jLabel6.setBounds(173, 296, 146, 17);

        datetime_txt.setForeground(new java.awt.Color(102, 102, 102));
        panelImage1.add(datetime_txt);
        datetime_txt.setBounds(173, 316, 183, 30);

        garcom_txt_2.setForeground(new java.awt.Color(102, 102, 102));
        panelImage1.add(garcom_txt_2);
        garcom_txt_2.setBounds(173, 258, 183, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Garçom:");
        panelImage1.add(jLabel7);
        jLabel7.setBounds(173, 238, 54, 17);

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg-sys.png"))); // NOI18N
        panelImage2.setLayout(null);

        num_mesa_txt.setForeground(new java.awt.Color(102, 102, 102));
        num_mesa_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_mesa_txtActionPerformed(evt);
            }
        });
        panelImage2.add(num_mesa_txt);
        num_mesa_txt.setBounds(340, 50, 159, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mesa:");
        panelImage2.add(jLabel8);
        jLabel8.setBounds(350, 30, 38, 17);

        numeros_pedidos_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeros_pedidos_txtActionPerformed(evt);
            }
        });
        panelImage2.add(numeros_pedidos_txt);
        numeros_pedidos_txt.setBounds(60, 50, 250, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Números dos Pedidos:");
        panelImage2.add(jLabel9);
        jLabel9.setBounds(65, 25, 142, 17);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Observação:");
        panelImage2.add(jLabel10);
        jLabel10.setBounds(60, 140, 81, 17);

        observacao_txt.setForeground(new java.awt.Color(102, 102, 102));
        observacao_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacao_txtActionPerformed(evt);
            }
        });
        panelImage2.add(observacao_txt);
        observacao_txt.setBounds(60, 160, 452, 20);

        efetuar_pedido_btn.setText("Efetuar Pedido");
        efetuar_pedido_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efetuar_pedido_btnActionPerformed(evt);
            }
        });
        panelImage2.add(efetuar_pedido_btn);
        efetuar_pedido_btn.setBounds(65, 248, 149, 35);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Garçom:");
        panelImage2.add(jLabel11);
        jLabel11.setBounds(350, 80, 60, 17);

        garcom_txt.setForeground(new java.awt.Color(102, 102, 102));
        garcom_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                garcom_txtActionPerformed(evt);
            }
        });
        panelImage2.add(garcom_txt);
        garcom_txt.setBounds(350, 100, 130, 20);

        valorP_txt.setForeground(new java.awt.Color(102, 102, 102));
        valorP_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorP_txtActionPerformed(evt);
            }
        });
        panelImage2.add(valorP_txt);
        valorP_txt.setBounds(60, 100, 250, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Preço dos Pratos:");
        panelImage2.add(jLabel12);
        jLabel12.setBounds(60, 80, 130, 17);

        panelImage1.add(panelImage2);
        panelImage2.setBounds(0, 0, 0, 0);

        valorP_txt_2.setForeground(new java.awt.Color(102, 102, 102));
        valorP_txt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorP_txt_2ActionPerformed(evt);
            }
        });
        panelImage1.add(valorP_txt_2);
        valorP_txt_2.setBounds(300, 200, 250, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Preço dos Pratos:");
        panelImage1.add(jLabel13);
        jLabel13.setBounds(300, 180, 130, 17);

        jPanel1.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(600, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void id_pedido_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_pedido_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pedido_txtActionPerformed

    private void obs_txt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obs_txt_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_obs_txt_2ActionPerformed

    private void numero_pedidos_txt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_pedidos_txt_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_pedidos_txt_2ActionPerformed

    private void consultar_pedido_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_pedido_btnActionPerformed
        Controller.Funcoes_DAO.consultar_pedido();
    }//GEN-LAST:event_consultar_pedido_btnActionPerformed

    private void atualizar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizar_pedidoActionPerformed
        Controller.Funcoes_DAO.atualizar_pedido();
    }//GEN-LAST:event_atualizar_pedidoActionPerformed

    private void num_mesa_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_mesa_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_mesa_txtActionPerformed

    private void numeros_pedidos_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeros_pedidos_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeros_pedidos_txtActionPerformed

    private void observacao_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacao_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observacao_txtActionPerformed

    private void efetuar_pedido_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efetuar_pedido_btnActionPerformed

        Controller.Funcoes_DAO.efetuar_pedido();
    }//GEN-LAST:event_efetuar_pedido_btnActionPerformed

    private void garcom_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_garcom_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_garcom_txtActionPerformed

    private void valorP_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorP_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorP_txtActionPerformed

    private void valorP_txt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorP_txt_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorP_txt_2ActionPerformed

    private void Finilizarped_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Finilizarped_btnActionPerformed
       String id = id_pedido_txt.getText();
       new Comanda_GUI(id).setVisible(true);
       dispose();
    }//GEN-LAST:event_Finilizarped_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Consultar_Pedido_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar_Pedido_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar_Pedido_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar_Pedido_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_Pedido_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction Finilizarped_btn;
    private org.edisoncor.gui.button.ButtonAction atualizar_pedido;
    private javax.swing.JMenuItem consultP_btn;
    private org.edisoncor.gui.button.ButtonAction consultar_pedido_btn;
    public static javax.swing.JTextField datetime_txt;
    private javax.swing.JMenuItem efetP_btn;
    private org.edisoncor.gui.button.ButtonAction efetuar_pedido_btn;
    private javax.swing.JMenu exit_btn;
    public static javax.swing.JTextField garcom_txt;
    public static javax.swing.JTextField garcom_txt_2;
    public static javax.swing.JTextField id_pedido_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField mesa_txt_2;
    public static javax.swing.JTextField num_mesa_txt;
    public static javax.swing.JTextField numero_pedidos_txt_2;
    public static javax.swing.JTextField numeros_pedidos_txt;
    public static javax.swing.JTextField obs_txt_2;
    public static javax.swing.JTextField observacao_txt;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    public static javax.swing.JTextField status_txt;
    private javax.swing.JMenu vPed_btn2;
    public static javax.swing.JTextField valorP_txt;
    public static javax.swing.JTextField valorP_txt_2;
    // End of variables declaration//GEN-END:variables
}