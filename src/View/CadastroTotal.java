/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;




import CustomExceptions.CustomException;
import Database.ConnectionFactory;
import Model.Room;
import Model.RoomDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Administrador
 */
public class CadastroTotal extends javax.swing.JFrame {
	
	 // variavel global

    /**
     * Creates new form CadastroTotal
     */
    public CadastroTotal() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tabelaSala.getModel();
        tabelaSala.setRowSorter(new TableRowSorter(modelo));
        
        readJTable();
            
    }
    public void readJTable(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaSala.getModel();
        modelo.setNumRows(0);
        RoomDAO rdao = new RoomDAO();
        
            try {
                for(Room room: rdao.getRooms()){
                    
                    modelo.addRow(new Object[]{
                        room.getIdRoom(), room.getNameRoom(),room.getCapacityRoom()
                            
                    });
                }   } catch (CustomException ex) {
                Logger.getLogger(CadastroTotal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtNomeSala = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtLotacao = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSala = new javax.swing.JTable();
        btSalvarSala = new javax.swing.JButton();
        btExcluirSalas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("NOME");

        jtNomeSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeSalaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("CADASTRO DE SALAS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("LOTAÇÃO");

        jtLotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtLotacaoActionPerformed(evt);
            }
        });

        jButton2.setText("PRÓXIMO >");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabelaSala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "LOTAÇÃO"
            }
        ));
        jScrollPane1.setViewportView(tabelaSala);

        btSalvarSala.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador.pc-mikael\\Documents\\NetBeansProjects\\GUIFormExamples\\src\\View\\imagenss\\mais verde.png")); // NOI18N
        btSalvarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarSalaActionPerformed(evt);
            }
        });

        btExcluirSalas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagenss/menos vermelho.jpg"))); // NOI18N
        btExcluirSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirSalasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel2))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jtNomeSala, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jtLotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btExcluirSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)
                        .addComponent(btSalvarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtNomeSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addComponent(jtLotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton2)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNomeSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeSalaActionPerformed

    private void jtLotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtLotacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtLotacaoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Espaco().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btSalvarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarSalaActionPerformed
        // TODO add your handling code here:
    	//inserindo os dados na tabela room por parametro(preparedStatement)
        
        Room room = new Room();
        RoomDAO dao = new RoomDAO();
        try {
            room.setNameRoom(jtNomeSala.getText());
        } catch (CustomException ex) {
   JOptionPane.showMessageDialog(null, ex.getMessage(),"ATENÇÃO!" , JOptionPane.WARNING_MESSAGE);
        }
        try {
            room.setCapacityRoom(Integer.parseInt(jtLotacao.getText()));
            
        } catch (CustomException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ATENÇÃO!" , JOptionPane.WARNING_MESSAGE);
        }
        try {
            dao.createRoom(room);
            readJTable();
            
//        DefaultTableModel dtm = (DefaultTableModel) tabelaSala.getModel();
//        Object[] dados = {jtNomeSala.getText(), jtLotacao.getText()};
//        dtm.addRow(dados);

//inserindo os dados na tabela room por parametro(preparedStatement)
        } catch (CustomException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ATENÇÃO!" , JOptionPane.WARNING_MESSAGE);
        }
		
		
    }//GEN-LAST:event_btSalvarSalaActionPerformed

    private void btExcluirSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirSalasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExcluirSalasActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTotal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluirSalas;
    private javax.swing.JButton btSalvarSala;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtLotacao;
    private javax.swing.JTextField jtNomeSala;
    private javax.swing.JTable tabelaSala;
    // End of variables declaration//GEN-END:variables
}
