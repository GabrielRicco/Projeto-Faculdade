/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import dao.AlunoDAO;
import javax.swing.JOptionPane;
import modelo.Aluno;

/**
 *
 * @author Gabri
 */
public class AlunoTela extends javax.swing.JFrame {

    /**
     * Creates new form AlunoTela
     */
    public AlunoTela() {
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

        alunoNome = new javax.swing.JLabel();
        nomeAlunotxt = new javax.swing.JTextField();
        alunoCpf = new javax.swing.JLabel();
        cpfAlunotxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        planoAluno = new javax.swing.JLabel();
        multaAluno = new javax.swing.JLabel();
        enderecoAluno = new javax.swing.JLabel();
        enderecoAlunotxt = new javax.swing.JTextField();
        telefoneAluno = new javax.swing.JLabel();
        telefoneAlunotxt = new javax.swing.JTextField();
        idadePlano = new javax.swing.JLabel();
        botaoSairAluno = new javax.swing.JButton();
        botaoAlunoLimpar = new javax.swing.JButton();
        botaoCadastrarAluno = new javax.swing.JButton();
        planoAlunotxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idadeAlunotxt = new javax.swing.JSpinner();
        multaAlunotxt = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        alunoNome.setText("Nome");

        alunoCpf.setText("CPF");

        cpfAlunotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfAlunotxtActionPerformed(evt);
            }
        });

        planoAluno.setText("Plano");

        multaAluno.setText("Multa");

        enderecoAluno.setText("Endereço");

        telefoneAluno.setText("Telefone");

        telefoneAlunotxt.setToolTipText("");

        idadePlano.setText("Idade");

        botaoSairAluno.setText("Sair");
        botaoSairAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairAlunoActionPerformed(evt);
            }
        });

        botaoAlunoLimpar.setText("Limpar");
        botaoAlunoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlunoLimparActionPerformed(evt);
            }
        });

        botaoCadastrarAluno.setText("Cadastrar");
        botaoCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarAlunoActionPerformed(evt);
            }
        });

        planoAlunotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planoAlunotxtActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pjt_a3_lok_e_thor.png"))); // NOI18N

        jLabel4.setText("ALUNO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alunoNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefoneAluno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enderecoAluno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alunoCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idadePlano, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeAlunotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(telefoneAlunotxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                            .addComponent(enderecoAlunotxt, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoSairAluno))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cpfAlunotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                            .addComponent(idadeAlunotxt))
                                        .addGap(91, 91, 91)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(multaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(planoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(botaoAlunoLimpar)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoCadastrarAluno))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(planoAlunotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                            .addComponent(multaAlunotxt))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(planoAluno)
                            .addComponent(planoAlunotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(multaAluno)
                            .addComponent(multaAlunotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoSairAluno)
                            .addComponent(botaoAlunoLimpar)
                            .addComponent(botaoCadastrarAluno)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeAlunotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alunoNome)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfAlunotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alunoCpf))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idadePlano)
                            .addComponent(idadeAlunotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enderecoAlunotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enderecoAluno))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefoneAluno)
                            .addComponent(telefoneAlunotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpfAlunotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfAlunotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfAlunotxtActionPerformed

    private void botaoCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarAlunoActionPerformed
        // TODO add your handling code here:
        Aluno alunos = new Aluno();
        alunos.setNome(nomeAlunotxt.getText());
        alunos.setCpf(cpfAlunotxt.getText());
        alunos.setIdade((int) idadeAlunotxt.getValue());
        alunos.setEndereco(enderecoAlunotxt.getText());
        alunos.setTelefone(telefoneAlunotxt.getText());
        alunos.setPlano(planoAlunotxt.getText());
        alunos.setMultaAtraso((int) multaAlunotxt.getValue());     
        
        // VALIDAÇÃO DOS DADOS
        if((nomeAlunotxt.getText().isEmpty()) || (cpfAlunotxt.getText().isEmpty()) || (enderecoAlunotxt.getText().isEmpty()) || (telefoneAlunotxt.getText().isEmpty()) || (planoAlunotxt.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Campos vazios");
        } else if(alunos.getIdade() < 10) {
            JOptionPane.showMessageDialog(null, "Idade inválida");
        } else if(!alunos.validarPlano()) {
            JOptionPane.showMessageDialog(null, "Plano Inválido");
        } else {
            AlunoDAO dao = new AlunoDAO();
            dao.adiciona(alunos);
            JOptionPane.showMessageDialog(null, "Aluno " + nomeAlunotxt.getText() + " cadastrado com sucesso! Seu plano é " + planoAlunotxt.getText() + " com o valor de: " + alunos.getMensalidade() + " reais por mês" + " com multa de: " + multaAlunotxt.getValue() + " reais");
        }
        
        nomeAlunotxt.setText("");
        cpfAlunotxt.setText("");
        idadeAlunotxt.setValue(0);
        enderecoAlunotxt.setText("");
        telefoneAlunotxt.setText("");
        planoAlunotxt.setText("");
        multaAlunotxt.setValue(0);
    }//GEN-LAST:event_botaoCadastrarAlunoActionPerformed

    private void planoAlunotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planoAlunotxtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_planoAlunotxtActionPerformed

    private void botaoAlunoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlunoLimparActionPerformed
        // TODO add your handling code here:
        nomeAlunotxt.setText("");
        cpfAlunotxt.setText("");
        idadeAlunotxt.setValue(0);
        enderecoAlunotxt.setText("");
        telefoneAlunotxt.setText("");
        planoAlunotxt.setText("");
        multaAlunotxt.setValue(0);
    }//GEN-LAST:event_botaoAlunoLimparActionPerformed

    private void botaoSairAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairAlunoActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_botaoSairAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(AlunoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlunoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlunoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlunoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlunoTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alunoCpf;
    private javax.swing.JLabel alunoNome;
    private javax.swing.JButton botaoAlunoLimpar;
    private javax.swing.JButton botaoCadastrarAluno;
    private javax.swing.JButton botaoSairAluno;
    private javax.swing.JTextField cpfAlunotxt;
    private javax.swing.JLabel enderecoAluno;
    private javax.swing.JTextField enderecoAlunotxt;
    private javax.swing.JSpinner idadeAlunotxt;
    private javax.swing.JLabel idadePlano;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel multaAluno;
    private javax.swing.JSpinner multaAlunotxt;
    private javax.swing.JTextField nomeAlunotxt;
    private javax.swing.JLabel planoAluno;
    private javax.swing.JTextField planoAlunotxt;
    private javax.swing.JLabel telefoneAluno;
    private javax.swing.JTextField telefoneAlunotxt;
    // End of variables declaration//GEN-END:variables
}
