/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n2ds1.caio.lobo.GUI;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import n2ds1.caio.lobo.Control.ImovelControl;
import n2ds1.caio.lobo.Control.TipoControl;
import n2ds1.caio.lobo.model.Imovel;
import n2ds1.caio.lobo.model.Tipo;
import static org.eclipse.persistence.platform.database.oracle.plsql.OraclePLSQLTypes.Int;

/**
 *
 * @author hellk
 */
public class ImovelGUI extends javax.swing.JFrame {

    /**
     * Creates new form ImovelGUI
     */
    public ImovelGUI() throws SQLException {
        initComponents();
        StartSet();
                        
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblImoveis = new javax.swing.JTable();
        btmSalvar = new javax.swing.JButton();
        btmCancelar = new javax.swing.JButton();
        btmNovo = new javax.swing.JButton();
        btmEditar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtAreaConstruida = new javax.swing.JTextField();
        txtAreaTotal = new javax.swing.JTextField();
        cbbTipo = new javax.swing.JComboBox<>();
        btmTipos = new javax.swing.JButton();
        btmRemover = new javax.swing.JButton();
        btmUpdateTipos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Descricao");

        jLabel3.setText("Area Construida");

        jLabel4.setText("Area Total");

        jLabel5.setText("Tipo");

        jLabel6.setText("Nome");

        jLabel7.setText("Imoveis");

        tblImoveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descricao", "Area Construida", "Area Total", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblImoveis.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblImoveis);
        tblImoveis.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btmSalvar.setText("Salvar");
        btmSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmSalvarActionPerformed(evt);
            }
        });

        btmCancelar.setText("Cancelar");
        btmCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCancelarActionPerformed(evt);
            }
        });

        btmNovo.setText("Novo");
        btmNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmNovoActionPerformed(evt);
            }
        });

        btmEditar.setText("Editar");
        btmEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEditarActionPerformed(evt);
            }
        });

        txtID.setText("jTextField1");

        txtNome.setText("jTextField2");

        txtDesc.setText("jTextField3");

        txtAreaConstruida.setText("jTextField4");

        txtAreaTotal.setText("jTextField5");

        btmTipos.setText("Menu Tipos");
        btmTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmTiposActionPerformed(evt);
            }
        });

        btmRemover.setText("Remover");
        btmRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmRemoverActionPerformed(evt);
            }
        });

        btmUpdateTipos.setText("Atualizar Tipos");
        btmUpdateTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmUpdateTiposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btmUpdateTipos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmTipos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDesc))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAreaConstruida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btmSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btmCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btmNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btmEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btmRemover)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(txtAreaConstruida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmTipos)
                    .addComponent(btmUpdateTipos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmSalvar)
                    .addComponent(btmCancelar)
                    .addComponent(btmNovo)
                    .addComponent(btmEditar)
                    .addComponent(btmRemover))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmTiposActionPerformed
        try {
            // TODO add your handling code here:
            new TipoGUI().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ImovelGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btmTiposActionPerformed

    private void btmSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmSalvarActionPerformed
        // TODO add your handling code here:
        ImovelControl control = new ImovelControl();
        
       
            Imovel i = new Imovel();
            i.setAreaConstruída(Long.parseLong(txtAreaConstruida.getText()));
            i.setAreaTotal(Long.parseLong(txtAreaTotal.getText()));
            i.setDescricao(txtDesc.getText());
            if(!"Gerado Automaticamente".equals(txtID.getText())) {
                i.setId(Long.parseLong(txtID.getText()));
        } else {
                i.setId(null);
        }
            i.setTipo((Tipo) cbbTipo.getSelectedItem());
         
        try {
            control.gravar(i);
        } catch (SQLException ex) {
            Logger.getLogger(ImovelGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            atualizarLista();
        } catch (SQLException ex) {
            Logger.getLogger(ImovelGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        textClear();
        
        
        
        
    }//GEN-LAST:event_btmSalvarActionPerformed

    private void btmCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCancelarActionPerformed
        // TODO add your handling code here:
        textClear();
        buttonStartSet();
        try {
            atualizarLista();
        } catch (SQLException ex) {
            Logger.getLogger(ImovelGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btmCancelarActionPerformed

    private void btmNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmNovoActionPerformed
        // TODO add your handling code here:
        textEditable();
        buttonEditSet();
        
    }//GEN-LAST:event_btmNovoActionPerformed

    private void btmEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEditarActionPerformed
        // TODO add your handling code here:
        
        if(tblImoveis.getSelectedRowCount()>0){
        ImovelControl controle = new ImovelControl();
        

        textClear();
        
        Object o = ((DefaultTableModel) tblImoveis.getModel()).getValueAt(tblImoveis.getSelectedRow(),0);
        try{
            
            
            Imovel i =  controle.getImovelPorId((Long) o);
            Tipo t = i.getTipo();
            txtAreaConstruida.setText(i.getAreaConstruída().toString());
            txtAreaTotal.setText(i.getAreaConstruída().toString());
            txtDesc.setText(i.getDescricao());
            txtID.setText(i.getId().toString());
            txtNome.setText(i.getNome());
            atualizarCombo();
            cbbTipo.setSelectedItem(t);
            
        } catch (SQLException ex) {
            Logger.getLogger(ImovelGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        textEditable();
        buttonEditSet();
        }
        else JOptionPane.showConfirmDialog(this, "Favor selecionar um Imovel na lista");
    }//GEN-LAST:event_btmEditarActionPerformed

    private void btmRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmRemoverActionPerformed
        // TODO add your handling code here:
         ImovelControl controle = new ImovelControl();
        
        try {
            
            controle.excluir(controle.getImovelPorId(Long.parseLong(txtID.getText())));
        } catch (SQLException ex) {
            Logger.getLogger(ImovelGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btmRemoverActionPerformed

    private void btmUpdateTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmUpdateTiposActionPerformed
        try {
            // TODO add your handling code here:
            atualizarCombo();
        } catch (SQLException ex) {
            Logger.getLogger(ImovelGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btmUpdateTiposActionPerformed

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
            java.util.logging.Logger.getLogger(ImovelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImovelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImovelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImovelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ImovelGUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ImovelGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmCancelar;
    private javax.swing.JButton btmEditar;
    private javax.swing.JButton btmNovo;
    private javax.swing.JButton btmRemover;
    private javax.swing.JButton btmSalvar;
    private javax.swing.JButton btmTipos;
    private javax.swing.JButton btmUpdateTipos;
    private javax.swing.JComboBox<Tipo> cbbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblImoveis;
    private javax.swing.JTextField txtAreaConstruida;
    private javax.swing.JTextField txtAreaTotal;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void StartSet() throws SQLException {
     textClear();
     atualizarLista();
     buttonStartSet();
     
    }

    private void buttonStartSet() {
    
        btmCancelar.setEnabled(false);
        btmSalvar.setEnabled(false);
        btmEditar.setEnabled(true);
        
        btmNovo.setEnabled(true);
    
    }
    
    private void buttonEditSet(){
        btmCancelar.setEnabled(true);
        btmSalvar.setEnabled(true);
        btmEditar.setEnabled(false);
        
        btmNovo.setEnabled(false);
    }
    
    private void buttonSelectedSet(){
        btmEditar.setEnabled(true);
        
    }

    private void textClear() {
     txtAreaConstruida.setText(""); 
     txtAreaTotal.setText(""); 
     txtDesc.setText(""); 
     txtID.setText("Gerado Automaticamente"); 
     txtNome.setText(""); 
     cbbTipo.setSelectedIndex(-1);
     textDisable();
    
    }

    private void atualizarLista() throws SQLException {
    
        ImovelControl controle = new ImovelControl();
        controle.atualizarLista(tblImoveis);
        
    }
    
    private void atualizarCombo() throws SQLException{
        TipoControl controle = new TipoControl();
        cbbTipo.setEnabled(true);
        cbbTipo.removeAllItems();
        List tipo = controle.listarTipos();
        
        
        for(Object o:tipo){
            Tipo t = (Tipo) o;
            cbbTipo.addItem(t);
        }
    }

    private void textDisable() {
    
        txtAreaConstruida.setEditable(false);
     txtAreaTotal.setEditable(false); 
     txtDesc.setEditable(false); 
     txtID.setEditable(false); 
     txtNome.setEditable(false);
     cbbTipo.setEnabled(false);
    }
    
    private void textEditable(){
    txtAreaConstruida.setEditable(true);
     txtAreaTotal.setEditable(true); 
     txtDesc.setEditable(true); 
     txtID.setEditable(true); 
     txtNome.setEditable(true);
     cbbTipo.setEnabled(true);
}
    
}
