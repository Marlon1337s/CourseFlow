package Front.Curse.Form;

import Front.Curse.Tabbed.TabbedForm;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.EventQueue;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Back.Curse.Entidades.Aluno;
import Front.Curse.Login.TelaLogin;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author Bruno H
 */
public class TurmaForm extends TabbedForm {

    Aluno alunoDao = new Aluno();

    public TurmaForm() {
        initComponents();
        testData(jTable1);
    }
//     private void testData(JTable table) {
//        DefaultTableModel model = (DefaultTableModel) table.getModel();
//        model.addRow(new Object[]{false, "beear","Bruno"});
//        ResultSet resultadoAluno = alunoDao.alunoConsulta();
//        // To do  
//     }

    private void testData(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Limpa as linhas existentes no modelo da tabela
        model.setRowCount(0);

        try {
            ResultSet resultadoAluno = alunoDao.alunoConsulta();

               while (resultadoAluno.next()) {
                // Recuperando dados do ResultSet
                int codAluno = resultadoAluno.getInt("cod_aluno");
                String nomeAluno = resultadoAluno.getString("nome_aluno");
                String cpfAluno = resultadoAluno.getString("cpf_aluno");
                Date dataNascimentoAluno = resultadoAluno.getDate("data_nascimento_aluno");
                String generoAluno = resultadoAluno.getString("genero_aluno");
                String telefoneAluno = resultadoAluno.getString("telefone_aluno");
                String emailAluno = resultadoAluno.getString("email_aluno");
                String cepAluno = resultadoAluno.getString("cep_aluno");
                String statusAluno = resultadoAluno.getString("status_aluno");
                String dataCadastroAluno = resultadoAluno.getString("data_cadastro_aluno");
                

                // Adicionando a linha ao modelo da tabela
                model.addRow(new Object[]{
                    false,
                    codAluno,
                    nomeAluno,
                    cpfAluno,
                    dataNascimentoAluno,
                    generoAluno,
                    telefoneAluno,
                    emailAluno,
                    cepAluno,
                    statusAluno,
                    dataCadastroAluno
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        crazyPanel1 = new raven.crazypanel.CrazyPanel();
        crazyPanel2 = new raven.crazypanel.CrazyPanel();
        cmdAdd = new javax.swing.JButton();
        cmdUpdate = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        RefreshBanco = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Front/Curse/Icon/Dmoon.png"))); // NOI18N
        jButton2.setDisabledIcon(null);
        jButton2.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Front/Curse/Icon/Lmoon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        crazyPanel1.setFlatLafStyleComponent(new raven.crazypanel.FlatLafStyleComponent(
            "background:$Table.background;[light]border:0,0,0,0,shade(@background,5%),,20;[dark]border:0,0,0,0,tint(@background,5%),,20",
            null
        ));
        crazyPanel1.setMigLayoutConstraints(new raven.crazypanel.MigLayoutConstraints(
            "wrap,fill,insets 15",
            "[fill]",
            "[grow 0][fill]",
            null
        ));

        crazyPanel2.setFlatLafStyleComponent(new raven.crazypanel.FlatLafStyleComponent(
            "background:$Table.background",
            new String[]{
                "background:lighten(@background,8%);borderWidth:1",
                "background:lighten(@background,8%);borderWidth:1",
                "background:lighten(@background,8%);borderWidth:1",
                ""
            }
        ));
        crazyPanel2.setMigLayoutConstraints(new raven.crazypanel.MigLayoutConstraints(
            "",
            "[]push[][]",
            "",
            new String[]{
                "width 200"
            }
        ));

        cmdAdd.setText("Adicionar");
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });
        crazyPanel2.add(cmdAdd);

        cmdUpdate.setText("Editar");
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });
        crazyPanel2.add(cmdUpdate);

        cmdDelete.setText("Deletar");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });
        crazyPanel2.add(cmdDelete);

        RefreshBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Front/Curse/Icon/IconRefresh.png"))); // NOI18N
        RefreshBanco.setBorderPainted(false);
        RefreshBanco.setDoubleBuffered(true);
        RefreshBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBancoActionPerformed(evt);
            }
        });
        crazyPanel2.add(RefreshBanco);

        crazyPanel1.add(crazyPanel2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Codigo", "Nome", "CPF", "Data Nasc.", "Gênero", "Telefone", "Email", "CEP", "Status", "Data Cad."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        crazyPanel1.add(jScrollPane1);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Front/Curse/Icon/TurmaIcon.png"))); // NOI18N
        jLabel1.setText("Turmas");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Front/Curse/Icon/logout.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(crazyPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(crazyPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!FlatLaf.isLafDark()) {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatMacDarkLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        } else {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatMacLightLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed
        // Crie um painel para a entrada de dados
        JPanel panel = new JPanel(new GridLayout(0, 2));
        JTextField txtNome = new JTextField();
        JTextField txtCpf = new JTextField();
        JTextField txtDataNascimento = new JTextField();
        JTextField txtGenero = new JTextField();
        JTextField txtEmail = new JTextField();
        JTextField txtTelefone = new JTextField();
        JTextField txtCep = new JTextField();
        JTextField txtStatus = new JTextField();
        // Adicione outros campos de texto conforme necessário...
        panel.add(new JLabel("Nome:"));
        panel.add(txtNome);
        panel.add(new JLabel("CPF:"));
        panel.add(txtCpf);
        panel.add(new JLabel("Data de Nascimento (yyyy-mm-dd):"));
        panel.add(txtDataNascimento);
        panel.add(new JLabel("Gênero:"));
        panel.add(txtGenero);
        panel.add(new JLabel("Email:"));
        panel.add(txtEmail);
        panel.add(new JLabel("Telefone:"));
        panel.add(txtTelefone);
        panel.add(new JLabel("CEP:"));
        panel.add(txtCep);
        panel.add(new JLabel("Status:"));
        panel.add(txtStatus);
        // Adicione outros rótulos e campos de texto...

        // Exiba a janela de diálogo com os campos de entrada
        int result = JOptionPane.showConfirmDialog(null, panel, "Adicionar Aluno",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        // Verifique se o usuário clicou em OK (Adicionar)
        if (result == JOptionPane.OK_OPTION) {
            // Obtenha os valores dos campos de texto
            String nome = txtNome.getText();
            String cpf = txtCpf.getText();
            String dataNascimentoStr = txtDataNascimento.getText();
            String cep = txtCep.getText();
            String genero = txtGenero.getText();
            String email = txtEmail.getText();
            String telefone = txtTelefone.getText();
            String status = txtStatus.getText();
            // Obtenha outros valores dos campos de texto...

            // Converte a string da data de nascimento para um objeto Date
            java.sql.Date dataNascimento = null;
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date utilDate = sdf.parse(dataNascimentoStr);
                dataNascimento = new java.sql.Date(utilDate.getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }

            // Crie uma instância de Aluno e configure os valores
            Aluno aluno = new Aluno();
            aluno.setNomeAluno(nome);
            aluno.setCpfAluno(cpf);
            aluno.setDataNascimentoAluno((java.sql.Date) dataNascimento);
            aluno.setCepAluno(cep);
            aluno.setGeneroAluno(genero);
            aluno.setEmailAluno(email);
            aluno.setTelefoneAluno(telefone);
            aluno.setStatusAluno(status);

            // Configure outros valores do aluno...
            // Adicione o aluno ao banco de dados
            boolean sucesso = aluno.alunoCadastrar();

            // Exiba uma mensagem com base no sucesso da operação
            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Aluno adicionado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao adicionar aluno.");
            }

            // Atualize a tabela ou faça outras atualizações necessárias
            testData(jTable1);
        }
        // Se o usuário clicou em Cancelar, não é necessário fazer nada


    }//GEN-LAST:event_cmdAddActionPerformed

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
        // Obtenha as linhas selecionadas na tabela
        int[] selectedRows = jTable1.getSelectedRows();

        // Verifique se nenhuma linha está selecionada
        if (selectedRows.length != 1) {
            showMessage("Nenhuma linha selecionada.");
            return;
        }

        // Se houver apenas uma linha selecionada, continue com a deleção
        if (selectedRows.length == 1) {
            // Obtenha o valor da coluna "Codigo" da linha selecionada
            int selectedRow = selectedRows[0];
            Object codAlunoObj = jTable1.getValueAt(selectedRow, 1);

            if (codAlunoObj == null) {
                showMessage("Código do aluno não encontrado.");
                return;
            }

            int codAluno = Integer.parseInt(codAlunoObj.toString());

            Aluno alunoToDelete = new Aluno();
            alunoToDelete.setCodAluno(codAluno);

            // Crie um painel para a entrada de dados
            JPanel panel = new JPanel(new GridLayout(0, 2));
            JTextField txtNome = new JTextField(getCellValue(selectedRow, 2));
            JTextField txtCpf = new JTextField(getCellValue(selectedRow, 3));
            JTextField txtDataNascimento = new JTextField(getCellValue(selectedRow, 4));
            JTextField txtGenero = new JTextField(getCellValue(selectedRow, 5));
            JTextField txtEmail = new JTextField(getCellValue(selectedRow, 6));
            JTextField txtTelefone = new JTextField(getCellValue(selectedRow, 7));
            JTextField txtCep = new JTextField(getCellValue(selectedRow, 8));
            JTextField txtStatus = new JTextField(getCellValue(selectedRow, 9));
            // Adicione outros campos de texto conforme necessário...
            panel.add(new JLabel("Nome:"));
            panel.add(txtNome);
            panel.add(new JLabel("CPF:"));
            panel.add(txtCpf);
            panel.add(new JLabel("Data de Nascimento (yyyy-mm-dd):"));
            panel.add(txtDataNascimento);
            panel.add(new JLabel("Gênero:"));
            panel.add(txtGenero);
            panel.add(new JLabel("Email:"));
            panel.add(txtEmail);
            panel.add(new JLabel("Telefone:"));
            panel.add(txtTelefone);
            panel.add(new JLabel("CEP:"));
            panel.add(txtCep);
            panel.add(new JLabel("Status:"));
            panel.add(txtStatus);
            // Adicione outros rótulos e campos de texto...

            // Exiba a janela de diálogo com os campos de entrada
            int result = JOptionPane.showConfirmDialog(null, panel, "Editar Aluno",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            // Verifique se o usuário clicou em OK (Adicionar)
            if (result == JOptionPane.OK_OPTION) {
                // Obtenha os valores dos campos de texto
                String nome = txtNome.getText();
                String cpf = txtCpf.getText();
                String dataNascimentoStr = txtDataNascimento.getText();
                String cep = txtCep.getText();
                String genero = txtGenero.getText();
                String email = txtEmail.getText();
                String telefone = txtTelefone.getText();
                String status = txtStatus.getText();
                // Obtenha outros valores dos campos de texto...

                // Converte a string da data de nascimento para um objeto Date
                java.sql.Date dataNascimento = null;
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date utilDate = sdf.parse(dataNascimentoStr);
                    dataNascimento = new java.sql.Date(utilDate.getTime());
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                // Crie uma instância de Aluno e configure os valores
                Aluno aluno = new Aluno();
                aluno.setCodAluno(codAluno);
                aluno.setNomeAluno(nome);
                aluno.setCpfAluno(cpf);
                aluno.setDataNascimentoAluno((java.sql.Date) dataNascimento);
                aluno.setCepAluno(cep);
                aluno.setGeneroAluno(genero);
                aluno.setEmailAluno(email);
                aluno.setTelefoneAluno(telefone);
                aluno.setStatusAluno(status);
                // Configure outros valores do aluno...

                // Adicione o aluno ao banco de dados
                boolean sucesso = aluno.alunoAlterar();

                // Exiba uma mensagem com base no sucesso da operação
                if (sucesso) {
                    JOptionPane.showMessageDialog(this, "Aluno adicionado com sucesso.");
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao adicionar aluno.");
                }

                // Atualize a tabela ou faça outras atualizações necessárias
                testData(jTable1);
            }

        }

    }//GEN-LAST:event_cmdUpdateActionPerformed
    private String getCellValue(int row, int column) {
        Object cellValue = jTable1.getValueAt(row, column);
        return (cellValue != null) ? cellValue.toString() : "";
    }
    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // Obtenha as linhas selecionadas na tabela
        int[] selectedRows = jTable1.getSelectedRows();

        // Verifique se nenhuma linha está selecionada
        if (selectedRows.length == 0) {
            showMessage("Nenhuma linha selecionada.");
            return;
        }

        // Se houver apenas uma linha selecionada, continue com a deleção
        if (selectedRows.length == 1) {
            // Obtenha o valor da coluna "Codigo" da linha selecionada
            int selectedRow = selectedRows[0];
            Object codAlunoObj = jTable1.getValueAt(selectedRow, 1);

            if (codAlunoObj == null) {
                showMessage("Código do aluno não encontrado.");
                return;
            }

            int codAluno = Integer.parseInt(codAlunoObj.toString());

            Aluno alunoToDelete = new Aluno();
            alunoToDelete.setCodAluno(codAluno);

            int option = showConfirmDialog("Você tem certeza que deseja excluir este aluno?");
            if (option == JOptionPane.YES_OPTION) {
                boolean success = alunoToDelete.alunoDeletar();

                if (success) {
                    testData(jTable1);
                    showMessage("Aluno excluído com sucesso.");
                } else {
                    showMessage("Erro ao excluir o aluno.");
                }
            }
        } else {
            // Se mais de uma linha estiver selecionada, exiba uma mensagem de confirmação especial
            int option = showConfirmDialog("Você tem certeza que deseja excluir " + selectedRows.length + " alunos?");
            if (option == JOptionPane.YES_OPTION) {
                for (int selectedRow : selectedRows) {
                    Object codAlunoObj = jTable1.getValueAt(selectedRow, 1);

                    if (codAlunoObj != null) {
                        int codAluno = Integer.parseInt(codAlunoObj.toString());

                        Aluno alunoToDelete = new Aluno();
                        alunoToDelete.setCodAluno(codAluno);

                        boolean success = alunoToDelete.alunoDeletar();

                        if (!success) {
                            showMessage("Erro ao excluir alguns alunos.");
                            return;
                        }
                    }
                }

                testData(jTable1);
                showMessage("Alunos excluídos com sucesso.");
            }
        }
    }

    private int showConfirmDialog(String message) {
        return JOptionPane.showConfirmDialog(
                this,
                message,
                "Confirmação",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(
                this,
                message,
                "Informação",
                JOptionPane.INFORMATION_MESSAGE
        );

    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void RefreshBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBancoActionPerformed
        // Botão de Atualizar com Banco
        testData(jTable1);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.fireTableDataChanged();
    }//GEN-LAST:event_RefreshBancoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
   // Botão de Logout
    int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION);

    
    if (resposta == JOptionPane.YES_OPTION) {
        java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(jButton1);
        
        if (window != null) {
            window.dispose();
        }

        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
    }
    

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(TurmaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TurmaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TurmaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TurmaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         FlatRobotoFont.install();
            FlatLaf.registerCustomDefaultsSource("Front.Curse.Themes");
            UIManager.put("defaultFont",new Font(FlatRobotoFont.FAMILY, Font.PLAIN,13));
            FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TurmaForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RefreshBanco;
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdUpdate;
    private raven.crazypanel.CrazyPanel crazyPanel1;
    private raven.crazypanel.CrazyPanel crazyPanel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    
}
