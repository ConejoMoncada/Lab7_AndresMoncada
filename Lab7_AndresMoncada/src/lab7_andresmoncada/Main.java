/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_andresmoncada;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Dell
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        menu_tree = new javax.swing.JPopupMenu();
        mi_elim = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_carro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        cb_carros = new javax.swing.JComboBox<>();
        addCarro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ensamblar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tf_pieza = new javax.swing.JTextField();
        s_tiempo = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addPieza = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        mi_elim.setText("Eliminar pieza");
        mi_elim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_elimActionPerformed(evt);
            }
        });
        menu_tree.add(mi_elim);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Agregar Carro");

        jLabel2.setText("Nombre del carro");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Carro");
        tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tree);

        cb_carros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carros" }));
        cb_carros.setEnabled(false);
        cb_carros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_carrosItemStateChanged(evt);
            }
        });

        addCarro.setText("Agregar");
        addCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Agregar Pieza");

        ensamblar.setText("Ensamblar");
        ensamblar.setEnabled(false);
        ensamblar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ensamblarActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre de la pieza");

        s_tiempo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel5.setText("Tiempo de ensamblaje");

        jLabel6.setText("s");

        jLabel7.setForeground(new java.awt.Color(100, 100, 100));
        jLabel7.setText("Seleccione la pieza (o el carro) al que se ensambla la pieza antes de agregar");

        addPieza.setText("Agregar");
        addPieza.setEnabled(false);
        addPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPiezaActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(100, 100, 100));
        jLabel8.setText("Se pueden eliminar piezas dándoles clic derecho en el árbol");
        jLabel8.setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_carros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(s_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3)
                                        .addComponent(addCarro, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tf_carro, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                        .addComponent(tf_pieza)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPieza)
                        .addGap(238, 238, 238)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ensamblar)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_carros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_carro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addCarro)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_pieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addPieza))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ensamblar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarroActionPerformed
        carros.add(new Carro(tf_carro.getText()));
        DefaultComboBoxModel cm = new DefaultComboBoxModel(carros.toArray());
        cb_carros.setEnabled(true);
        cb_carros.setModel(cm);
        cb_carros.setSelectedIndex(cb_carros.getItemCount()-1);
        addCarro.setEnabled(true);
        ensamblar.setEnabled(true);
        addPieza.setEnabled(true);
        tree.setModel(carros.get(carros.size()-1).getModel());
        tf_carro.setText("");
    }//GEN-LAST:event_addCarroActionPerformed

    private void cb_carrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_carrosItemStateChanged
        if (evt.getStateChange() == 1){
             Carro temp = (Carro) cb_carros.getSelectedItem();
            if(temp != null){
                tree.setModel(temp.getModel());
            }
        }
    }//GEN-LAST:event_cb_carrosItemStateChanged

    private void treeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeMouseClicked
        int row = tree.getClosestRowForLocation(evt.getX(), evt.getY());
        tree.setSelectionRow(row);
        if(evt.isMetaDown() && row > 0){
            menu_tree.show(tree, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_treeMouseClicked

    private void mi_elimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_elimActionPerformed
        try {
            DefaultTreeModel tm = (DefaultTreeModel) tree.getModel();
            DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
            tm.removeNodeFromParent(nodo);
            tm.reload();
            JOptionPane.showMessageDialog(this, "Pieza elminada");
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_mi_elimActionPerformed

    private void addPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPiezaActionPerformed
        if(tree.getLeadSelectionRow() >= 0){
            try{
                DefaultTreeModel tm = (DefaultTreeModel) tree.getModel();
                DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
                nodo.add(
                        new DefaultMutableTreeNode(
                                new Pieza(tf_pieza.getText(),(int)s_tiempo.getValue())));
                tm.reload();
                tf_pieza.setText("");
                s_tiempo.setValue(1);
            }catch(Exception e){
                
            }
        }else
            JOptionPane.showMessageDialog(this, "Seleccione una pieza o carro en el arbol\n"+"para agregarle esta pieza");
    }//GEN-LAST:event_addPiezaActionPerformed

    private void ensamblarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ensamblarActionPerformed
        elementos = new ArrayList();
        llenarlista((DefaultMutableTreeNode)tree.getModel().getRoot());
        LaTabla tb = new LaTabla(this, false, elementos);
        tb.setVisible(true);
        Thread t = new Thread(tb);
        t.start();
    }//GEN-LAST:event_ensamblarActionPerformed

    public void llenarlista(DefaultMutableTreeNode n){
        for (int i = 0; i < n.getChildCount(); i++) {
            if(n.getChildAt(i).getChildCount() == 0){
                elementos.add(new Elemento(
                tree.getModel().getRoot().toString(),
                n.getChildAt(i).toString(),
                ((Pieza)((DefaultMutableTreeNode)n.getChildAt(i)).getUserObject()).getTiempo()));
            }else{
                llenarlista((DefaultMutableTreeNode)n.getChildAt(i));
            }
        }
        if(!n.equals(tree.getModel().getRoot())){
            elementos.add(new Elemento(
            tree.getModel().getRoot().toString(),
            n.toString(),
            ((Pieza)n.getUserObject()).getTiempo()));
        }//para no agregar la raiz
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCarro;
    private javax.swing.JButton addPieza;
    private javax.swing.JComboBox<String> cb_carros;
    private javax.swing.JButton ensamblar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu menu_tree;
    private javax.swing.JMenuItem mi_elim;
    private javax.swing.JSpinner s_tiempo;
    private javax.swing.JTextField tf_carro;
    private javax.swing.JTextField tf_pieza;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables
    ArrayList<Carro> carros = new ArrayList();
    ArrayList<Elemento> elementos = new ArrayList();//para ordenar el arbol 
}
