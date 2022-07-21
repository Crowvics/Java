/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Gui;
import classes.aluno;
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
public class FrAluno extends javax.swing.JFrame {

    aluno alunoEditando;
    List<aluno> lista;
    
    public FrAluno() {
        this.alunoEditando = null;
        lista = new ArrayList <>();
        initComponents();
        this.habilitarCampos(false);
        this.limparCampos();
        this.loadAlunos();
    }
    
    public void habilitarCampos (boolean flag) {
        edtNome.setEnabled (flag);
        edtSexo.setEnabled (flag);
        edtIdade.setEnabled (flag);
        edtMatricula.setEnabled (flag);
        edtAnoIngresso.setEnabled (flag);
    }
    
    public void limparCampos (){
        edtNome.setText ("");
        edtSexo.setText ("");
        edtIdade.setText ("");
        edtMatricula.setText ("");
        edtAnoIngresso.setText("");
    }
    
    public String imprimirListaAlunos (){
        String listagemTotal = " ";
        for (int i = 0; i <= lista.size()-1; i++){
            listagemTotal += lista.get(i).imprimirParaString();
        }
        return listagemTotal;
    }
    
    public aluno camposParaObjeto (){
        aluno al = new aluno ();
        al.setNome(edtNome.getText());
        String sexo = edtSexo.getText();
        
        if (!sexo.isEmpty()){
             al.setSexo(edtSexo.getText());
        }
        
        int a = 0;
        String idade = edtIdade.getText();
        
        if (!idade.isEmpty()){
            a = Integer.parseInt (edtIdade.getText().trim());
        }
        
        al.setIdade(a);
        int m = 0;
        String matricula = edtMatricula.getText();
        
        if (!matricula.isEmpty()){
            m = Integer.parseInt (edtMatricula.getText().trim());
        }
        al.setMatricula(m);
        
        int ano = 0;
        String anoIngresso = edtAnoIngresso.getText();
        
        if (!anoIngresso.isEmpty()){
            ano = Integer.parseInt (edtAnoIngresso.getText().trim());
        }
        al.setAnoIngresso(ano);
        
        return al;
    }
    
    public void objetoParaCampos(aluno al){
        edtNome.setText(al.getNome());
        edtSexo.setText(al.getSexo());
        edtIdade.setText(al.getIdade() + "");
        edtMatricula.setText(al.getMatricula() + "");
        edtAnoIngresso.setText(al.getAnoIngresso() + "");
    }
    
        public aluno pesquisarAluno (int matricula){
        for (int i = 0; i <= lista.size() -1; i++){
            if (lista.get(i).getMatricula() == matricula){
                return lista.get(i);
            }
        }
        return null;
    }
        
        public String criarListaAlunosCSV() {
         String texto = " ";
         aluno al = new aluno ();
         texto = al.cabecalho();
            
         for (int i = 0; i <= this.lista.size()-1; i++){
                aluno a = this.lista.get(i);
                texto = texto + a.atributoToCSV();
         }
         return texto;
    }
        
    public void salvarAlunos(String texto) {
         FileWriter arquivo = null;
         try {
                arquivo = new FileWriter ("ListaAlunos.csv");
                PrintWriter gravaArq = new PrintWriter (arquivo);
                gravaArq.print(texto);
                arquivo.close();
          } catch (IOException ex) {
                Logger.getLogger(FrAluno.class.getName()).log(Level.SEVERE, null, ex);
          } finally {
                try {
                    arquivo.close();
                } catch (IOException ex) {
                Logger.getLogger(FrAluno.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
       
    public void loadAlunos() {
         FileReader file = null;
         try {
         file = new FileReader ("ListaAlunos.csv");
         Scanner arqLido = new Scanner(file);
         arqLido.useDelimiter("\n");
         this.lista = new ArrayList<>();
         String linhaLida = arqLido.next();
         while (arqLido.hasNext()){
                linhaLida = arqLido.next();
                aluno a = new aluno ();
                a.CSVToAtributo(linhaLida);
                this.lista.add(a);
         }
            edtListagem.setText(imprimirListaAlunos());
         } catch (FileNotFoundException ex) {
            Logger.getLogger(FrAluno.class.getName()).log(Level.SEVERE, null, ex);
         } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(FrAluno.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        lblTitulo = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        lblAnoIngresso = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtIdade = new javax.swing.JTextField();
        edtMatricula = new javax.swing.JTextField();
        edtSexo = new javax.swing.JTextField();
        edtAnoIngresso = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        edtListagem = new javax.swing.JTextArea();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Aluno");

        btnNovo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\NetBeans-13\\netbeans\\NetBeansProjects\\projetoEscola\\src\\main\\java\\imagens\\Add-icon.png")); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\NetBeans-13\\netbeans\\NetBeansProjects\\projetoEscola\\src\\main\\java\\imagens\\edit-icon.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\NetBeans-13\\netbeans\\NetBeansProjects\\projetoEscola\\src\\main\\java\\imagens\\cancel-icon.png")); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\NetBeans-13\\netbeans\\NetBeansProjects\\projetoEscola\\src\\main\\java\\imagens\\close-icon.png")); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\NetBeans-13\\netbeans\\NetBeansProjects\\projetoEscola\\src\\main\\java\\imagens\\save-icon.png")); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblNome.setText("Nome");

        lblIdade.setText("Idade");

        lblSexo.setText("Sexo");

        lblMatricula.setText("Matrícula");

        lblAnoIngresso.setText("Ano de Ingresso");

        edtListagem.setColumns(20);
        edtListagem.setRows(5);
        jScrollPane2.setViewportView(edtListagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSexo)
                            .addComponent(lblIdade)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtNome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                    .addComponent(edtSexo))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAnoIngresso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtAnoIngresso))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMatricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblMatricula)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade)
                    .addComponent(lblAnoIngresso)
                    .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtAnoIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int matriculaEscolhida = Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula do aluno a ser editado:", ""));
        alunoEditando = this.pesquisarAluno(matriculaEscolhida);
       
        if (alunoEditando == null){
            JOptionPane.showMessageDialog(this, "A matrícula não pertence a nenhuma aluno");
       } else {
           this.limparCampos();
           this.habilitarCampos(true);
           this.objetoParaCampos(alunoEditando);
       }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitarCampos(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int matriculaEscolhida = Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula do aluno a ser excluído:", ""));
        aluno al = this.pesquisarAluno(matriculaEscolhida);
        
        if (al == null){
            JOptionPane.showMessageDialog(this, "A matrícula não pertence a nenhum aluno");
        } else {
            lista.remove(al);
            JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso");
        }
        edtListagem.setText(this.imprimirListaAlunos());
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       if (this.alunoEditando == null){
            aluno al = new aluno ();
            al = this.camposParaObjeto();
            lista.add(al);
        } else {
            this.lista.remove(this.alunoEditando);
            this.alunoEditando = this.camposParaObjeto();
            this.lista.add(alunoEditando);
        }
            this.limparCampos();
            this.habilitarCampos(false);
            edtListagem.setText(this.imprimirListaAlunos());
            String texto = this.criarListaAlunosCSV();
            this.salvarAlunos(texto);
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtAnoIngresso;
    private javax.swing.JTextField edtIdade;
    private javax.swing.JTextArea edtListagem;
    private javax.swing.JTextField edtMatricula;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtSexo;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnoIngresso;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

}
