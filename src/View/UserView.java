/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.RoomController;
import CustomExceptions.CustomException;

/**
 *
 * @author Administrador
 */
public class UserView extends javax.swing.JFrame {
 
    /**
     * Creates new form Home
     */
    public UserView() {
        initComponents();
    }
    
    private void buscarSalas() {
        RoomController.findRooms();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        sala3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_eventos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        aluno3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cadastrarAluno1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSala = new javax.swing.JTable();
        pesquisarSala = new javax.swing.JButton();
        salaPesquisada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 610));
        getContentPane().setLayout(null);

        jPanel6.setBackground(new java.awt.Color(54, 33, 89));
        jPanel6.setMaximumSize(new java.awt.Dimension(270, 610));

        sala3.setBackground(new java.awt.Color(54, 33, 89));
        sala3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sala3MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("ESPAÇOS");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagenss/WhatsApp Image 2021-03-12 at 17.26.12.jpeg"))); // NOI18N

        javax.swing.GroupLayout sala3Layout = new javax.swing.GroupLayout(sala3);
        sala3.setLayout(sala3Layout);
        sala3Layout.setHorizontalGroup(
            sala3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sala3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel13)
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        sala3Layout.setVerticalGroup(
            sala3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sala3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(sala3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11))
                .addGap(29, 29, 29))
        );

        btn_eventos.setBackground(new java.awt.Color(85, 65, 118));
        btn_eventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eventosMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("SALAS");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagenss/WhatsApp Image 2021-03-12 at 17.26.12.jpeg"))); // NOI18N

        javax.swing.GroupLayout btn_eventosLayout = new javax.swing.GroupLayout(btn_eventos);
        btn_eventos.setLayout(btn_eventosLayout);
        btn_eventosLayout.setHorizontalGroup(
            btn_eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_eventosLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        btn_eventosLayout.setVerticalGroup(
            btn_eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_eventosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(btn_eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        aluno3.setBackground(new java.awt.Color(54, 33, 89));
        aluno3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aluno3MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("PESSOAS");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagenss/WhatsApp Image 2021-03-12 at 17.26.12.jpeg"))); // NOI18N

        javax.swing.GroupLayout aluno3Layout = new javax.swing.GroupLayout(aluno3);
        aluno3.setLayout(aluno3Layout);
        aluno3Layout.setHorizontalGroup(
            aluno3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aluno3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel14)
                .addGap(31, 31, 31)
                .addComponent(jLabel12)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        aluno3Layout.setVerticalGroup(
            aluno3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aluno3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(aluno3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        cadastrarAluno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagenss/iconmonstr-friend-2-24.png"))); // NOI18N
        cadastrarAluno1.setText("CADASTRAR SALA");
        cadastrarAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAluno1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sala3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_eventos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(aluno3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastrarAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btn_eventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sala3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aluno3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(cadastrarAluno1)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 270, 610);

        tabelaSala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "LOTAÇÃO"
            }
        ));
        jScrollPane1.setViewportView(tabelaSala);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(265, 0, 570, 402);

        pesquisarSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagenss/lupaPreta (1).png"))); // NOI18N
        pesquisarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarSalaActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarSala);
        pesquisarSala.setBounds(440, 470, 30, 30);
        getContentPane().add(salaPesquisada);
        salaPesquisada.setBounds(480, 470, 220, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eventosMouseClicked
        // TODO add your handling code here:
        new UserView().setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_eventosMouseClicked

    private void aluno3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aluno3MouseClicked
        // TODO add your handling code here:
        new Aluno().setVisible(true);
        dispose();

    }//GEN-LAST:event_aluno3MouseClicked

    private void cadastrarAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAluno1ActionPerformed
        // TODO add your handling code here:
        new CadastroTotal().setVisible(true);
    }//GEN-LAST:event_cadastrarAluno1ActionPerformed

    private void sala3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sala3MouseClicked
        // TODO add your handling code here:
        new Find().setVisible(true);
        dispose();
    }//GEN-LAST:event_sala3MouseClicked

    private void pesquisarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarSalaActionPerformed

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
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aluno3;
    private javax.swing.JPanel btn_eventos;
    private javax.swing.JButton cadastrarAluno1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesquisarSala;
    private javax.swing.JPanel sala3;
    private javax.swing.JTextField salaPesquisada;
    private javax.swing.JTable tabelaSala;
    // End of variables declaration//GEN-END:variables
}
