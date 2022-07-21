/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

/**
 *
 * @author victo
 */
public class FrSelecao extends javax.swing.JFrame {

    /**
     * Creates new form FrSelecao
     */
    public FrSelecao() {
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
        btnCadastramentoProfessor = new javax.swing.JButton();
        btnCadastramentoAluno = new javax.swing.JButton();
        btnCadastramentoDisciplina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleção de Cadastramento");

        btnCadastramentoProfessor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastramentoProfessor.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\NetBeans-13\\netbeans\\NetBeansProjects\\projetoEscola\\src\\main\\java\\imagens\\icons8-matrícula-30.png")); // NOI18N
        btnCadastramentoProfessor.setText("Cadastramento de Professor");
        btnCadastramentoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastramentoProfessorActionPerformed(evt);
            }
        });

        btnCadastramentoAluno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastramentoAluno.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\NetBeans-13\\netbeans\\NetBeansProjects\\projetoEscola\\src\\main\\java\\imagens\\icons8-estudante,-escrivaninha-30.png")); // NOI18N
        btnCadastramentoAluno.setText("Cadastramento de Aluno");
        btnCadastramentoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastramentoAlunoActionPerformed(evt);
            }
        });

        btnCadastramentoDisciplina.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastramentoDisciplina.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\NetBeans-13\\netbeans\\NetBeansProjects\\projetoEscola\\src\\main\\java\\imagens\\icons8-devolver-o-livro-30.png")); // NOI18N
        btnCadastramentoDisciplina.setText("Cadastramento de Disciplina");
        btnCadastramentoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastramentoDisciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnCadastramentoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCadastramentoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnCadastramentoProfessor)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastramentoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastramentoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastramentoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastramentoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastramentoDisciplinaActionPerformed
        FrDisciplina telaDisciplina = new FrDisciplina();
        telaDisciplina.setVisible(true);
    }//GEN-LAST:event_btnCadastramentoDisciplinaActionPerformed

    private void btnCadastramentoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastramentoAlunoActionPerformed
        FrAluno telaAluno = new FrAluno();
        telaAluno.setVisible(true);
    }//GEN-LAST:event_btnCadastramentoAlunoActionPerformed

    private void btnCadastramentoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastramentoProfessorActionPerformed
        FrProfessor telaProfessor = new FrProfessor();
        telaProfessor.setVisible(true);
    }//GEN-LAST:event_btnCadastramentoProfessorActionPerformed

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
            java.util.logging.Logger.getLogger(FrSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrSelecao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastramentoAluno;
    private javax.swing.JButton btnCadastramentoDisciplina;
    private javax.swing.JButton btnCadastramentoProfessor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
