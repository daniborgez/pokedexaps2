/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pokedex.view;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import pokedex.controller.PokemonController;

/**
 *
 * @author danie
 */
public class TelaRegistrar extends javax.swing.JFrame {
    private TelaPrincipal telaPrincipal;
    private Integer id_Pokemon = 0; 
    /**
     * Creates new form TelaRegistrar
     */
    public TelaRegistrar() {
        initComponents();
        this.telaPrincipal = telaPrincipal;
    }
    
    private void limparTela(){
        jTextFieldNome.setText("");
        jTextFieldCategoria.setText("");
        jTextFieldCor.setText("");
        jTextFieldHabitat.setText("");
        jTextAreaDescricao.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRegistro = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabelRegistro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabeLCategoria = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabeLNome1 = new javax.swing.JLabel();
        jTextFieldCor = new javax.swing.JTextField();
        jTextFieldCategoria = new javax.swing.JTextField();
        jTextFieldHabitat = new javax.swing.JTextField();
        jLabeLCor = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jLabeLHabitat = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();

        jPanelRegistro.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanelRegistroLayout = new javax.swing.GroupLayout(jPanelRegistro);
        jPanelRegistro.setLayout(jPanelRegistroLayout);
        jPanelRegistroLayout.setHorizontalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanelRegistroLayout.setVerticalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelRegistro.setBackground(new java.awt.Color(0, 0, 153));
        jLabelRegistro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelRegistro.setForeground(new java.awt.Color(0, 0, 153));
        jLabelRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18898701.png"))); // NOI18N
        jLabelRegistro.setText("ÁREA DE REGISTRO");

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabeLCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeLCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabeLCategoria.setText("CATEGORIA :");

        jTextFieldNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabeLNome1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeLNome1.setForeground(new java.awt.Color(255, 255, 255));
        jLabeLNome1.setText("NOME :");

        jTextFieldCor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextFieldCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextFieldHabitat.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabeLCor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeLCor.setForeground(new java.awt.Color(255, 255, 255));
        jLabeLCor.setText("COR :");

        jLabelDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDescricao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescricao.setText("DESCRIÇÃO :");

        jLabeLHabitat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeLHabitat.setForeground(new java.awt.Color(255, 255, 255));
        jLabeLHabitat.setText("HABITAT :");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseClicked(evt);
            }
        });
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("Consultar");

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLimpar)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabeLCategoria)
                    .addComponent(jLabeLNome1)
                    .addComponent(jLabeLCor)
                    .addComponent(jLabeLHabitat)
                    .addComponent(jLabelDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldHabitat, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(jTextFieldCor, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(jTextFieldNome)
                    .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeLNome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeLCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeLCor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeLHabitat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescricao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonSalvar))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabelRegistro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
            boolean sucesso; 
            
            try{
                PokemonController pokemonController = new PokemonController();
                
            
                sucesso = pokemonController.cadastrarPokemon(jTextFieldNome.getText(), jTextFieldCategoria.getText(), jTextAreaDescricao.getText()
                        , jTextFieldHabitat.getText(), jTextFieldCor.getText());
         
                
                
                if(sucesso == true){
                    JOptionPane.showMessageDialog(null, "Pokemon registrado com sucesso!! :)");
                   this.limparTela();
                }else {
                    JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente.");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro:" + e);
            }   
        
        
                
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarMouseClicked

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
            java.util.logging.Logger.getLogger(TelaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRegistrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabeLCategoria;
    private javax.swing.JLabel jLabeLCor;
    private javax.swing.JLabel jLabeLHabitat;
    private javax.swing.JLabel jLabeLNome1;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldCor;
    private javax.swing.JTextField jTextFieldHabitat;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

    private void limparTela(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
