/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Administrador
 */
public class CadastroNovoAluno extends javax.swing.JFrame {

    /**
     * Creates new form CadastroNovoAluno
     */
    public CadastroNovoAluno() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeAluno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idadeAluno = new javax.swing.JTextField();
        proximoCadastroAluno = new javax.swing.JButton();
        proximoCadastroAluno1 = new javax.swing.JButton();
        cadastrarAluno = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nomeAluno1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idadeAluno1 = new javax.swing.JTextField();
        fecharJanelaCadastroAlunos = new javax.swing.JButton();
        removerCadastro = new javax.swing.JButton();
        addCadastro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAluno = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("NOME E SOBRENOME");

        nomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAlunoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("CADASTRO DE ALUNOS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("IDADE");

        idadeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeAlunoActionPerformed(evt);
            }
        });

        proximoCadastroAluno.setText("PRÓXIMO >");
        proximoCadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoCadastroAlunoActionPerformed(evt);
            }
        });

        proximoCadastroAluno1.setText("< VOLTAR");
        proximoCadastroAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoCadastroAluno1ActionPerformed(evt);
            }
        });

        cadastrarAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cadastrarAluno.setText("Cadastrar");
        cadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(239, 239, 239))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(proximoCadastroAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proximoCadastroAluno))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(8, 8, 8)
                .addComponent(idadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(idadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(cadastrarAluno)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proximoCadastroAluno)
                    .addComponent(proximoCadastroAluno1))
                .addGap(36, 36, 36))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.setMaximumSize(new java.awt.Dimension(599, 484));
        jPanel2.setMinimumSize(new java.awt.Dimension(599, 484));
        jPanel2.setPreferredSize(new java.awt.Dimension(599, 484));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("NOME E SOBRENOME");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 379, 120, 16);

        nomeAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAluno1ActionPerformed(evt);
            }
        });
        jPanel2.add(nomeAluno1);
        nomeAluno1.setBounds(140, 378, 275, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("CADASTRO DE ALUNOS");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(260, 10, 132, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("IDADE");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(450, 379, 36, 16);

        idadeAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeAluno1ActionPerformed(evt);
            }
        });
        jPanel2.add(idadeAluno1);
        idadeAluno1.setBounds(496, 378, 34, 20);

        fecharJanelaCadastroAlunos.setText("FIM");
        fecharJanelaCadastroAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharJanelaCadastroAlunosActionPerformed(evt);
            }
        });
        jPanel2.add(fecharJanelaCadastroAlunos);
        fecharJanelaCadastroAlunos.setBounds(490, 440, 51, 23);

        removerCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagenss/menos vermelho.jpg"))); // NOI18N
        removerCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerCadastroActionPerformed(evt);
            }
        });
        jPanel2.add(removerCadastro);
        removerCadastro.setBounds(260, 410, 28, 23);

        addCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagenss/mais verde.png"))); // NOI18N
        addCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCadastroActionPerformed(evt);
            }
        });
        jPanel2.add(addCadastro);
        addCadastro.setBounds(340, 410, 31, 23);

        tabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOME", "SALA"
            }
        ));
        jScrollPane1.setViewportView(tabelaAluno);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 61, 600, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeAlunoActionPerformed

    private void idadeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeAlunoActionPerformed

    private void proximoCadastroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoCadastroAlunoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_proximoCadastroAlunoActionPerformed

    private void proximoCadastroAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoCadastroAluno1ActionPerformed
        // TODO add your handling code here:
        new Espaco().setVisible(true);
        dispose();
    }//GEN-LAST:event_proximoCadastroAluno1ActionPerformed

    private void cadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarAlunoActionPerformed

    private void nomeAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeAluno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeAluno1ActionPerformed

    private void idadeAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeAluno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeAluno1ActionPerformed

    private void fecharJanelaCadastroAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharJanelaCadastroAlunosActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_fecharJanelaCadastroAlunosActionPerformed

    private void removerCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerCadastroActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_removerCadastroActionPerformed

    private void addCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroNovoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroNovoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroNovoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroNovoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroNovoAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCadastro;
    private javax.swing.JButton cadastrarAluno;
    private javax.swing.JButton fecharJanelaCadastroAlunos;
    private javax.swing.JTextField idadeAluno;
    private javax.swing.JTextField idadeAluno1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JTextField nomeAluno1;
    private javax.swing.JButton proximoCadastroAluno;
    private javax.swing.JButton proximoCadastroAluno1;
    private javax.swing.JButton removerCadastro;
    private javax.swing.JTable tabelaAluno;
    // End of variables declaration//GEN-END:variables
}