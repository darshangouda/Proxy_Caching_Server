/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy.panels;

import java.lang.Runnable;
import javax.swing.JOptionPane;
public class Wellcome extends javax.swing.JPanel  {

    /**
     * Creates new form wellcome
     */
    public Wellcome() {
        initComponents();
         // JOptionPane.showMessageDialog(null,"heigh"+this.getHeight()+"width"+this.getWidth());
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

        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1262, 394));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 200));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 200));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1216, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    
}