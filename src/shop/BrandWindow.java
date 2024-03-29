/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import db.exceptions.NonexistentEntityException;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.SwingUtilities;
import org.jdesktop.beansbinding.AutoBinding;


/**
 *
 * @author aruna
 */
public class BrandWindow extends javax.swing.JFrame {

    /**
     * Creates new form Catagory
     */
    public BrandWindow() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        POSPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("POSPU").createEntityManager();
        brandQuery = java.beans.Beans.isDesignTime() ? null : POSPUEntityManager.createQuery("SELECT b FROM Brand b");
        brandList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : brandQuery.getResultList();
        mainPanel = new javax.swing.JPanel();
        mainMenuBtnLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        productLabel = new javax.swing.JLabel();
        brandBox = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        tableScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        storeNameLabel = new javax.swing.JLabel();
        firmNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        mainPanel.setBackground(java.awt.Color.gray);

        mainMenuBtnLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        mainMenuBtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        mainMenuBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainMenuBtnLabel.setText("Main Menu");
        mainMenuBtnLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainMenuBtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainMenuBtnLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainMenuBtnLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainMenuBtnLabelMouseEntered(evt);
            }
        });

        typeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        typeLabel.setForeground(java.awt.Color.white);
        typeLabel.setText("Brand");

        addPanel.setBackground(java.awt.Color.lightGray);
        addPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addPanel.setName("product"); // NOI18N

        productLabel.setText("Brand");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, table, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.brand}"), brandBox, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        brandBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandBoxActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(productLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brandBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productLabel)
                    .addComponent(brandBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table.setBackground(java.awt.Color.lightGray);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, brandList, table);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${brand}"));
        columnBinding.setColumnName("Brand");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tableScrollPane.setViewportView(table);

        storeNameLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        storeNameLabel.setForeground(java.awt.Color.white);
        storeNameLabel.setText("Store Name");

        firmNameLabel.setText("Powerd by Kode");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainMenuBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(typeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(firmNameLabel))
                            .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                            .addComponent(addPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(storeNameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(storeNameLabel)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(typeLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firmNameLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainMenuBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bindTable(){
        brandQuery = java.beans.Beans.isDesignTime() ? null : POSPUEntityManager.createQuery("SELECT b FROM Brand b");
        brandList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : brandQuery.getResultList();
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, brandList, table);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${brand}"));
        columnBinding.setColumnName("Brand");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
    }
    
    private void addBrand(){
        String br;
        db.Brand brand = new db.Brand();
        
        br = brandBox.getText();
        brand.setBrand(br);
        
        bjc.create(brand);
        
    }
    
    private void editBrand(){
        String br;
        int id;
        
        id = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        db.Brand brand = new db.Brand(id);
        br = brandBox.getText();
        brand.setBrand(br);
        
        try {
            bjc.edit(brand);
        } catch (Exception ex) {
            Logger.getLogger(BrandWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void deleteBrand(){
        int id;
        
        id = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        try {
            bjc.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(BrandWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void mainMenuBtnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenuBtnLabelMouseClicked
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_mainMenuBtnLabelMouseClicked
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
               // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void mainMenuBtnLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenuBtnLabelMouseEntered
        mainMenuBtnLabel.setForeground(Color.yellow);        // TODO add your handling code here:
    }//GEN-LAST:event_mainMenuBtnLabelMouseEntered

    private void mainMenuBtnLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenuBtnLabelMouseExited
        mainMenuBtnLabel.setForeground(Color.white);  // TODO add your handling code here:
    }//GEN-LAST:event_mainMenuBtnLabelMouseExited

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteBrand();
        bindTable();

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        editBrand();
        bindTable();
    }//GEN-LAST:event_editButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        addBrand();
        bindTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void brandBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandBoxActionPerformed

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
            java.util.logging.Logger.getLogger(BrandWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrandWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrandWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrandWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrandWindow().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager POSPUEntityManager;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addPanel;
    private javax.swing.JTextField brandBox;
    private java.util.List<db.Brand> brandList;
    private javax.persistence.Query brandQuery;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel firmNameLabel;
    private javax.swing.JLabel mainMenuBtnLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel productLabel;
    private javax.swing.JLabel storeNameLabel;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JLabel typeLabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public EntityManagerFactory emf=Persistence.createEntityManagerFactory("POSPU");
    public db.BrandJpaController bjc = new db.BrandJpaController(emf);
}
