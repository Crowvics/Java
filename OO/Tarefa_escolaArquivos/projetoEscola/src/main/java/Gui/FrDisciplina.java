/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

import classes.disciplina;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author victor
 */
public class FrDisciplina extends javax.swing.JFrame {
    
    disciplina disciplinaEditando;
    List<disciplina> lista;

    /**
     * Creates new form FrDisciplina
     */
    public FrDisciplina() {
        this.disciplinaEditando = null;
        lista = new ArrayList <>();
        initComponents();
        this.habilitarCampos(false);
        this.limparCampos();
        this.loadDisciplinas();
    }
    
    public void habilitarCampos(boolean flag) {
        edtNome.setEnabled (flag);
        edtHorario.setEnabled (flag);
        edtSemestre.setEnabled (flag);
    }
    
    public void limparCampos() {
        edtNome.setText ("");
        edtHorario.setText ("");
        edtSemestre.setText ("");
    }
    
    public String imprimirListaDisciplinas() {
        String listagemTotal = " ";
        for (int i = 0; i <= lista.size()-1; i++){
            listagemTotal += lista.get(i).imprimirDisciplinaParaString();
        }
        return listagemTotal;
    }
    
    public disciplina camposParaObjeto () {
        disciplina d = new disciplina ();
        d.setNome(edtNome.getText());
        String horario = edtHorario.getText();
        
        if (!horario.isEmpty()){
             d.setHorario(edtHorario.getText());
        }
        
        int a = 0;
        String semestre = edtSemestre.getText();
        
        if (!semestre.isEmpty()){
            a = Integer.parseInt (edtSemestre.getText().trim());
        }
        
        d.setSemestre(a);
        return d;
    }
    
    public void objetoParaCampos(disciplina d) {
        edtNome.setText(d.getNome());
        edtHorario.setText(d.getHorario());
        edtSemestre.setText(d.getSemestre() + "");
    }
    
    public disciplina pesquisarDisciplinas(String nome) {
        for (int i = 0; i <= lista.size() -1; i++){
            if (lista.get(i).getNome().equals(nome)){
                return lista.get(i);
            }
        }
        return null;
    }
        
    public String criarListaDisciplinaCSV() {
         String texto = " ";
         disciplina d = new disciplina ();
         texto = d.cabecalho();
            
         for (int i = 0; i <= this.lista.size()-1; i++){
                disciplina di = this.lista.get(i);
                texto = texto + di.atributoToCSV();
         }
         return texto;
    }
        
    public void salvarDisciplinas(String texto) {
        FileWriter arq = null;
        try {
            arq = new FileWriter ("ListaDisciplinas.csv");
            PrintWriter gravaArq = new PrintWriter (arq);
            gravaArq.print(texto);
            arq.close();
        } catch (IOException ex) {
            Logger.getLogger(FrDisciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
    public void loadDisciplinas() {
        FileReader f = null;
        try {
            f = new FileReader ("ListaDisciplinas.csv");
            Scanner arquivoLido = new Scanner(f);
            arquivoLido.useDelimiter("\n");
            this.lista = new ArrayList<>();
            String linhaLida = arquivoLido.next();
            while (arquivoLido.hasNext()){
                linhaLida = arquivoLido.next();
                disciplina d = new disciplina ();
                d.CSVToAtributo(linhaLida);
                this.lista.add(d);
            }
            edtListagem.setText(imprimirListaDisciplinas());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrDisciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtListagem = new javax.swing.JTextArea();
        lblNome = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblSemestre = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtHorario = new javax.swing.JTextField();
        edtSemestre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Disciplina");

        btnNovo.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\NetBeans-13\\netbeans\\NetBeansProjects\\projetoEscola\\src\\main\\java\\imagens\\Add-icon.png")); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\NetBeans-13\\netbeans\\NetBeansProjects\\projetoEscola\\src\\main\\java\\imagens\\edit-icon.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\NetBeans-13\\netbeans\\NetBeansProjects\\projetoEscola\\src\\main\\java\\imagens\\cancel-icon.png")); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\NetBeans-13\\netbeans\\NetBeansProjects\\projetoEscola\\src\\main\\java\\imagens\\close-icon.png")); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\NetBeans-13\\netbeans\\NetBeansProjects\\projetoEscola\\src\\main\\java\\imagens\\save-icon.png")); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        edtListagem.setColumns(20);
        edtListagem.setRows(5);
        jScrollPane1.setViewportView(edtListagem);

        lblNome.setText("Nome");

        lblHorario.setText("Horário");

        lblSemestre.setText("Semestre");

        edtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNomeActionPerformed(evt);
            }
        });

        edtHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtHorarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHorario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSemestre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHorario)
                            .addComponent(lblNome)
                            .addComponent(lblSemestre)
                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String nomeEscolhido = JOptionPane.showInputDialog("Informe o nome da disciplina a ser editada:", "");
        disciplinaEditando = this.pesquisarDisciplinas(nomeEscolhido);

        if (disciplinaEditando == null){
            JOptionPane.showMessageDialog(this, "O nome digitado não pertence a nenhuma disciplina");
        } else {
            this.limparCampos();
            this.habilitarCampos(true);
            this.objetoParaCampos(disciplinaEditando);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitarCampos(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String nomeEscolhido = JOptionPane.showInputDialog("Informe o nome da disciplina a ser editada:", "");
        disciplina d = this.pesquisarDisciplinas(nomeEscolhido);

        if (d == null){
            JOptionPane.showMessageDialog(this, "O nome digitado não pertence a nenhuma disciplina");
        } else {
            lista.remove(d);
            JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso");
        }
        edtListagem.setText(this.imprimirListaDisciplinas());
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (this.disciplinaEditando == null){
            disciplina d = new disciplina ();
            d = this.camposParaObjeto();
            lista.add(d);
        } else {
            this.lista.remove(this.disciplinaEditando);
            this.disciplinaEditando = this.camposParaObjeto();
            this.lista.add(disciplinaEditando);
        }
        this.limparCampos();
        this.habilitarCampos(false);
        edtListagem.setText(this.imprimirListaDisciplinas());
        String texto = this.criarListaDisciplinaCSV();
        this.salvarDisciplinas(texto);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void edtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNomeActionPerformed

    private void edtHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtHorarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtHorario;
    private javax.swing.JTextArea edtListagem;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtSemestre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
