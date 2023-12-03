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
import Back.Curse.Entidades.Curso;
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
public class CursosForm extends TabbedForm {

   Curso cursoDao = new Curso();

    public CursosForm() {
        initComponents();
        testData(jTable1);
    }
    private void testData(JTable table) {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        try {
            ResultSet resultadoCurso = cursoDao.cursoConsulta();

            if (resultadoCurso != null) {
                while (resultadoCurso.next()) {
                    int codCurso = resultadoCurso.getInt("cod_curso");
                    String nomeCurso = resultadoCurso.getString("nome_curso");
                    String conteudoCurso = resultadoCurso.getString("conteudo_curso");
                    String statusCurso = resultadoCurso.getString("status_curso");
                    float cargaHorariaCurso = resultadoCurso.getFloat("carga_horaria_curso");
                    float valorMensalidadeCurso = resultadoCurso.getFloat("valor_mensalidade_curso");
                    String DataCadastroCurso = resultadoCurso.getString("data_cadastro_curso");

                    model.addRow(new Object[]{
                            false,
                            codCurso,
                            nomeCurso,
                            conteudoCurso,
                            statusCurso,
                            cargaHorariaCurso,
                            valorMensalidadeCurso,
                            DataCadastroCurso
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
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Cod.Curso", "Nome", "Conteúdo", "Status", "Carga Hor.", "Valor Mensa.", "Data Cad."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        crazyPanel1.add(jScrollPane1);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Front/Curse/Icon/CursoIcon.png"))); // NOI18N
        jLabel1.setText("Cursos");
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
    JTextField txtConteudo = new JTextField();
    JTextField txtStatus = new JTextField();
    JTextField txtCargaHoraria = new JTextField();
    JTextField txtValorMensalidade = new JTextField();

    // Adicione outros campos de texto conforme necessário...
    panel.add(new JLabel("Nome do Curso:"));
    panel.add(txtNome);
    panel.add(new JLabel("Conteúdo:"));
    panel.add(txtConteudo);
    panel.add(new JLabel("Status:"));
    panel.add(txtStatus);
    panel.add(new JLabel("Carga Horária:"));
    panel.add(txtCargaHoraria);
    panel.add(new JLabel("Valor Mensalidade:"));
    panel.add(txtValorMensalidade);

    // Exiba a janela de diálogo com os campos de entrada
    int result = JOptionPane.showConfirmDialog(null, panel, "Adicionar Curso",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

    // Verifique se o usuário clicou em OK (Adicionar)
    if (result == JOptionPane.OK_OPTION) {
        // Obtenha os valores dos campos de texto
        String nome = txtNome.getText();
        String conteudo = txtConteudo.getText();
        String status = txtStatus.getText();
        Float cargaHoraria = Float.parseFloat(txtCargaHoraria.getText());
        Float valorMensalidade = Float.parseFloat(txtValorMensalidade.getText());

        // Crie uma instância de Curso e configure os valores
        Curso curso = new Curso(nome, conteudo, status, cargaHoraria, valorMensalidade);

        // Adicione o curso ao banco de dados
        boolean sucesso = curso.cursoCadastrar();

        // Exiba uma mensagem com base no sucesso da operação
        if (sucesso) {
            JOptionPane.showMessageDialog(this, "Curso adicionado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar curso.");
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
        showMessage("Selecione uma linha para editar.");
        return;
    }

    // Se houver apenas uma linha selecionada, continue com a atualização
    if (selectedRows.length == 1) {
        // Obtenha o valor da coluna "Codigo" da linha selecionada
        int selectedRow = selectedRows[0];
        Object codCursoObj = jTable1.getValueAt(selectedRow, 1);

        if (codCursoObj == null) {
            showMessage("Código do curso não encontrado.");
            return;
        }

        int codCurso = Integer.parseInt(codCursoObj.toString());

        Curso cursoToUpdate = new Curso();
        cursoToUpdate.setCodCurso(codCurso);

        // Crie um painel para a entrada de dados
        JPanel panel = new JPanel(new GridLayout(0, 2));
        JTextField txtNome = new JTextField(getCellValue(selectedRow, 2));
        JTextField txtConteudo = new JTextField(getCellValue(selectedRow, 3));
        JTextField txtStatus = new JTextField(getCellValue(selectedRow, 4));
        JTextField txtCargaHoraria = new JTextField(getCellValue(selectedRow, 5));
        JTextField txtValorMensalidade = new JTextField(getCellValue(selectedRow, 6));
        // Adicione outros campos de texto conforme necessário...
        panel.add(new JLabel("Nome do Curso:"));
        panel.add(txtNome);
        panel.add(new JLabel("Conteúdo:"));
        panel.add(txtConteudo);
        panel.add(new JLabel("Status:"));
        panel.add(txtStatus);
        panel.add(new JLabel("Carga Horária:"));
        panel.add(txtCargaHoraria);
        panel.add(new JLabel("Valor Mensalidade:"));
        panel.add(txtValorMensalidade);
        // Adicione outros rótulos e campos de texto...

        // Exiba a janela de diálogo com os campos de entrada
        int result = JOptionPane.showConfirmDialog(null, panel, "Editar Curso",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        // Verifique se o usuário clicou em OK (Editar)
        if (result == JOptionPane.OK_OPTION) {
            // Obtenha os valores dos campos de texto
            String nome = txtNome.getText();
            String conteudo = txtConteudo.getText();
            String status = txtStatus.getText();
            Float cargaHoraria = Float.parseFloat(txtCargaHoraria.getText());
            Float valorMensalidade = Float.parseFloat(txtValorMensalidade.getText());
            // Obtenha outros valores dos campos de texto...

            // Configure os valores do curso
            cursoToUpdate.setNomeCurso(nome);
            cursoToUpdate.setConteudo(conteudo);
            cursoToUpdate.setStatus(status);
            cursoToUpdate.setCargaHoraria(cargaHoraria);
            cursoToUpdate.setValorMensalidade(valorMensalidade);
            // Configure outros valores do curso...

            // Atualize o curso no banco de dados
            boolean sucesso = cursoToUpdate.cursoAlterar();

            // Exiba uma mensagem com base no sucesso da operação
            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Curso atualizado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar curso.");
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
        Object codCursoObj = jTable1.getValueAt(selectedRow, 1);

        if (codCursoObj == null) {
            showMessage("Código do curso não encontrado.");
            return;
        }

        int codCurso = Integer.parseInt(codCursoObj.toString());

        Curso cursoToDelete = new Curso();
        cursoToDelete.setCodCurso(codCurso);

        int option = showConfirmDialog("Você tem certeza que deseja excluir este curso?");
        if (option == JOptionPane.YES_OPTION) {
            boolean success = cursoToDelete.cursoDeletar();

            if (success) {
                testData(jTable1);
                showMessage("Curso excluído com sucesso.");
            } else {
                showMessage("Erro ao excluir o curso.");
            }
        }
    } else {
        // Se mais de uma linha estiver selecionada, exiba uma mensagem de confirmação especial
        int option = showConfirmDialog("Você tem certeza que deseja excluir " + selectedRows.length + " cursos?");
        if (option == JOptionPane.YES_OPTION) {
            for (int selectedRow : selectedRows) {
                Object codCursoObj = jTable1.getValueAt(selectedRow, 1);

                if (codCursoObj != null) {
                    int codCurso = Integer.parseInt(codCursoObj.toString());

                    Curso cursoToDelete = new Curso();
                    cursoToDelete.setCodCurso(codCurso);

                    boolean success = cursoToDelete.cursoDeletar();

                    if (!success) {
                        showMessage("Erro ao excluir alguns cursos.");
                        return;
                    }
                }
            }

            testData(jTable1);
            showMessage("Cursos excluídos com sucesso.");
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
            java.util.logging.Logger.getLogger(CursosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         FlatRobotoFont.install();
            FlatLaf.registerCustomDefaultsSource("Front.Curse.Themes");
            UIManager.put("defaultFont",new Font(FlatRobotoFont.FAMILY, Font.PLAIN,13));
            FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CursosForm().setVisible(true);
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
