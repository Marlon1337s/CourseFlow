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
import Back.Curse.Entidades.Professor;
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
public class ProfessorForm extends TabbedForm {

    Professor professorDao = new Professor();

    public ProfessorForm() {
        initComponents();
        testData(jTable1);
    }

    private void testData(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Limpa as linhas existentes no modelo da tabela
        model.setRowCount(0);

        try {
            ResultSet resultadoProfessor = professorDao.profConsulta(); // Use o método do ProfessorDao

            // Verifica se o resultadoProfessor é nulo antes de tentar acessar os resultados
            if (resultadoProfessor != null) {
                while (resultadoProfessor.next()) {
                    // Recuperando dados do ResultSet
                    int codProfessor = resultadoProfessor.getInt("cod_professor");
                    String nomeProfessor = resultadoProfessor.getString("nome_professor");
                    String cpfProfessor = resultadoProfessor.getString("cpf_professor");
                    String generoProfessor = resultadoProfessor.getString("genero_professor");
                    String emailProfessor = resultadoProfessor.getString("email_professor");
                    String telefoneProfessor = resultadoProfessor.getString("telefone_professor");
                    String cepProfessor = resultadoProfessor.getString("cep_professor");
                    String statusProfessor = resultadoProfessor.getString("status_professor");
                    Date dataNascimentoProfessor = resultadoProfessor.getDate("data_nascimento_professor");
                    Float salarioProfessor = resultadoProfessor.getFloat("salario_professor");
                    String dataCadastroProfessor = resultadoProfessor.getString("data_cadastro_professor");

                    // Adicionando a linha ao modelo da tabela
                    model.addRow(new Object[]{
                        false,
                        codProfessor,
                        nomeProfessor,
                        cpfProfessor,
                        generoProfessor,
                        emailProfessor,
                        telefoneProfessor,
                        cepProfessor,
                        statusProfessor,
                        dataNascimentoProfessor,
                        salarioProfessor,
                        dataCadastroProfessor
                    });
                }
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
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Codigo", "Nome", "CPF", "Gênero", "Email", "Telefone", "CEP", "Status", "Data Nasc.", "Salário", "Data Cad."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        crazyPanel1.add(jScrollPane1);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Front/Curse/Icon/professores.png"))); // NOI18N
        jLabel1.setText("Professores");
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
        JTextField txtCodigo = new JTextField();  // Adicione o campo do código
        JTextField txtNome = new JTextField();
        JTextField txtCpf = new JTextField();
        JTextField txtGenero = new JTextField();
        JTextField txtEmail = new JTextField();
        JTextField txtTelefone = new JTextField();
        JTextField txtCep = new JTextField();
        JTextField txtStatus = new JTextField();
        JTextField txtDataNascimento = new JTextField();
        JTextField txtSalario = new JTextField();  // Adicione o campo do salário

// Adicione outros campos de texto conforme necessário...
        panel.add(new JLabel("Código:"));
        panel.add(txtCodigo);  // Adicione o campo do código
        panel.add(new JLabel("Nome:"));
        panel.add(txtNome);
        panel.add(new JLabel("CPF:"));
        panel.add(txtCpf);
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
        panel.add(new JLabel("Data de Nascimento (yyyy-MM-dd):"));
        panel.add(txtDataNascimento);
        panel.add(new JLabel("Salário:"));
        panel.add(txtSalario);  // Adicione o campo do salário

// Exiba a janela de diálogo com os campos de entrada
        int result = JOptionPane.showConfirmDialog(null, panel, "Adicionar Professor",
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
            String salarioStr = txtSalario.getText();  // Obtenha o valor do salário

            // Validação para garantir que o campo do salário seja preenchido corretamente
            if (salarioStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, insira o salário.");
                return;
            }

            try {
                // Converte a string do salário para um número
                double salario = Double.parseDouble(salarioStr);

                // Converte a string da data de nascimento para um objeto Date
                java.sql.Date dataNascimento = null;
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date utilDate = sdf.parse(dataNascimentoStr);
                    dataNascimento = new java.sql.Date(utilDate.getTime());
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(this, "Erro ao converter a data. Certifique-se de inserir no formato yyyy-MM-dd.");
                    e.printStackTrace();
                    return;
                }

                // Crie uma instância de Professor e configure os valores
                Professor professor = new Professor();
                professor.setNomeProfessor(nome);
                professor.setCpfProfessor(cpf);
                professor.setDataNascimentoProfessor(dataNascimento);
                professor.setCepProfessor(cep);
                professor.setGeneroProfessor(genero);
                professor.setEmailProfessor(email);
                professor.setTelefoneProfessor(telefone);
                professor.setStatusProfessor(status);
                professor.setSalarioProfessor(toString(salario));

                // Adicione o professor ao banco de dados
                boolean sucesso = professor.profCadastrar();

                // Exiba uma mensagem com base no sucesso da operação
                if (sucesso) {
                    JOptionPane.showMessageDialog(this, "Professor adicionado com sucesso.");
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao adicionar professor.");
                }

                // Atualize a tabela ou faça outras atualizações necessárias
                testData(jTable1);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Erro ao converter o salário. Certifique-se de inserir um valor numérico.");
                e.printStackTrace();
            }
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
            Object codProfessorObj = jTable1.getValueAt(selectedRow, 1);

            if (codProfessorObj == null) {
                showMessage("Código do professor não encontrado.");
                return;
            }

            int codProfessor = Integer.parseInt(codProfessorObj.toString());

            Professor professorToDelete = new Professor();
            professorToDelete.setCodProfessor(codProfessor);

            // Crie um painel para a entrada de dados
            JPanel panel = new JPanel(new GridLayout(0, 2));
            JTextField txtCodigo = new JTextField(getCellValue(selectedRow, 1));
            JTextField txtNome = new JTextField(getCellValue(selectedRow, 2));
            JTextField txtCpf = new JTextField(getCellValue(selectedRow, 3));
            JTextField txtGenero = new JTextField(getCellValue(selectedRow, 4));
            JTextField txtEmail = new JTextField(getCellValue(selectedRow, 5));
            JTextField txtTelefone = new JTextField(getCellValue(selectedRow, 6));
            JTextField txtCep = new JTextField(getCellValue(selectedRow, 7));
            JTextField txtStatus = new JTextField(getCellValue(selectedRow, 8));
            JTextField txtDataNascimento = new JTextField(getCellValue(selectedRow, 9));
            JTextField txtSalario = new JTextField(getCellValue(selectedRow, 10));

            panel.add(new JLabel("Código:"));
            panel.add(txtCodigo);
            panel.add(new JLabel("Nome:"));
            panel.add(txtNome);
            panel.add(new JLabel("CPF:"));
            panel.add(txtCpf);
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
            panel.add(new JLabel("Data de Nascimento (yyyy-MM-dd):"));
            panel.add(txtDataNascimento);
            panel.add(new JLabel("Salário:"));
            panel.add(txtSalario);

            // Exiba a janela de diálogo com os campos de entrada
            int result = JOptionPane.showConfirmDialog(null, panel, "Editar Professor",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            // Verifique se o usuário clicou em OK (Atualizar)
            if (result == JOptionPane.OK_OPTION) {
                // Obtenha os valores dos campos de texto
                String nome = txtNome.getText();
                String cpf = txtCpf.getText();
                String genero = txtGenero.getText();
                String email = txtEmail.getText();
                String telefone = txtTelefone.getText();
                String cep = txtCep.getText();
                String status = txtStatus.getText();
                String dataNascimentoStr = txtDataNascimento.getText();
                String salario = txtSalario.getText();

                // Converte a string da data de nascimento para um objeto Date
                java.sql.Date dataNascimento = null;
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date utilDate = sdf.parse(dataNascimentoStr);
                    dataNascimento = new java.sql.Date(utilDate.getTime());
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                // Converte a string do salário para um número


                // Crie uma instância de Professor e configure os valores
                Professor professor = new Professor();
                professor.setCodProfessor(codProfessor);
                professor.setNomeProfessor(nome);
                professor.setCpfProfessor(cpf);
                professor.setGeneroProfessor(genero);
                professor.setEmailProfessor(email);
                professor.setTelefoneProfessor(telefone);
                professor.setCepProfessor(cep);
                professor.setStatusProfessor(status);
                professor.setDataNascimentoProfessor((java.sql.Date) dataNascimento);
                 professor.setStatusProfessor(salario);

                // Atualize o professor no banco de dados
                boolean sucesso = professor.profAlterar();

                // Exiba uma mensagem com base no sucesso da operação
                if (sucesso) {
                    JOptionPane.showMessageDialog(this, "Professor atualizado com sucesso.");
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao atualizar professor.");
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
            Object codProfessorObj = jTable1.getValueAt(selectedRow, 1);

            if (codProfessorObj == null) {
                showMessage("Código do professor não encontrado.");
                return;
            }

            int codProfessor = Integer.parseInt(codProfessorObj.toString());

            Professor professorToDelete = new Professor();
            professorToDelete.setCodProfessor(codProfessor);

            int option = showConfirmDialog("Você tem certeza que deseja excluir este professor?");
            if (option == JOptionPane.YES_OPTION) {
                boolean success = professorToDelete.profDeletar();

                if (success) {
                    testData(jTable1);
                    showMessage("Professor excluído com sucesso.");
                } else {
                    showMessage("Erro ao excluir o professor.");
                }
            }
        } else {
            // Se mais de uma linha estiver selecionada, exiba uma mensagem de confirmação especial
            int option = showConfirmDialog("Você tem certeza que deseja excluir " + selectedRows.length + " professores?");
            if (option == JOptionPane.YES_OPTION) {
                for (int selectedRow : selectedRows) {
                    Object codProfessorObj = jTable1.getValueAt(selectedRow, 1);

                    if (codProfessorObj != null) {
                        int codProfessor = Integer.parseInt(codProfessorObj.toString());

                        Professor professorToDelete = new Professor();
                        professorToDelete.setCodProfessor(codProfessor);

                        boolean success = professorToDelete.profDeletar();

                        if (!success) {
                            showMessage("Erro ao excluir alguns professores.");
                            return;
                        }
                    }
                }

                testData(jTable1);
                showMessage("Professores excluídos com sucesso.");
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
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProfessorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("Front.Curse.Themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ProfessorForm().setVisible(true);
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

    private Float toString(double salario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
