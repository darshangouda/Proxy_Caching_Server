/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy.panels;

import java.awt.PopupMenu;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author om
 */
public class Three extends javax.swing.JPanel {
   String[] strings =new String[100];
   int count;
   String filename="";
    public Three() {
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

        jPanel1 = new javax.swing.JPanel();
        Lname = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        Badd = new javax.swing.JButton();
        Bremove = new javax.swing.JButton();
        Bsave = new javax.swing.JButton();
        Breload = new javax.swing.JButton();

        Lname.setText("List of <set> allowed to access from this server");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Badd.setText("ADD");
        Badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaddActionPerformed(evt);
            }
        });

        Bremove.setText("REMOVE");
        Bremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BremoveActionPerformed(evt);
            }
        });

        Bsave.setText("SAVE");
        Bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsaveActionPerformed(evt);
            }
        });

        Breload.setText("RELOAD");
        Breload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Bsave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(Badd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bremove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Breload, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 173, Short.MAX_VALUE)
                        .addComponent(Breload)
                        .addGap(18, 18, 18)
                        .addComponent(Bremove)
                        .addGap(18, 18, 18)
                        .addComponent(Bsave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Badd)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addGap(56, 56, 56))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 314, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void BaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaddActionPerformed
        String ent=jTextField1.getText();
        if(ent.equals("") || ent == null)
         {
             JOptionPane.showMessageDialog(null,"PLEASE ENTER VALUE"); 
             return;
         }
        if(isUnique(ent))
         {
             add(ent);
         }
        else
        {
          JOptionPane.showMessageDialog(null,"ENTERED VALUE IS ALREADY EXIST'S IN LIST");   
        }
    }//GEN-LAST:event_BaddActionPerformed

    private void BreloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreloadActionPerformed
         for(int i=0;i<strings.length;i++)
             strings[i]="";
         fillList();
         JOptionPane.showMessageDialog(null,"RELOADED SUCCESSFUL FROM FILE ->"+filename); 
    }//GEN-LAST:event_BreloadActionPerformed

    private void BsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveActionPerformed
                
                File file = new File(filename);
                FileWriter fileWriter = null;
                PrintWriter writer1 =null;
                BufferedWriter writer =null;
       try {
           writer1 = new PrintWriter(file);
           fileWriter = new FileWriter(file,true);
             writer1.print("");
                writer1.close();
               writer = new BufferedWriter(fileWriter);
         for(int j=0;j<count;j++)
         {writer.append(strings[j]);
           writer.newLine();
         }
           JOptionPane.showMessageDialog(null,"SUCCESSFULLY SAVED TO FILE ->"+filename); 
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,"EXCEPTION "+ex);
       }
        finally{
                    try {
                        writer.close();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,"EXCEPTION "+ex);
                    }
       }
    }//GEN-LAST:event_BsaveActionPerformed

    private void BremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BremoveActionPerformed
        int selectedno=this.jList1.getSelectedIndices().length;
           if(selectedno > 0) 
           {
              int[] selectedIndices = jList1.getSelectedIndices();
                for (int i =0; i< selectedIndices.length; i++) 
                {   
                 strings[selectedIndices[i]]=null;
                } 
          }
          else if(selectedno == 0)
                  {
                  JOptionPane.showMessageDialog(null,"PLEASE SELECT ANY ONE ITEM TO REMOVE FROM LIST");
                  return;
                  }
            int item=0;
            for(int j=0;j<count;j++)
            {
                if(strings[j] != null && strings[j].length() > 0)
                {
                strings[item]=strings[j];
                item++;
                }
            }
            if(count-selectedno==item)
            {
                  
               count=count-selectedno;
               setElement(); 
               JOptionPane.showMessageDialog(null,"SUCCESSFULLY REMOVED FORM LIST");
            }         
    }//GEN-LAST:event_BremoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Badd;
    private javax.swing.JButton Breload;
    private javax.swing.JButton Bremove;
    private javax.swing.JButton Bsave;
    private javax.swing.JLabel Lname;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void fillList()
    {         BufferedReader reader;
              count=0;
		try {
			reader = new BufferedReader(new FileReader(
					filename));
			String line = reader.readLine();
			while (line != null) {
				//System.out.println(line);
				 strings[count]=line;
				line = reader.readLine();   
                                count++;
			}
			reader.close();
		} catch (IOException e) {
		JOptionPane.showMessageDialog(null,"EXCEPTION "+e); 
		}
       setElement();
       
    }
    private void add(String str)
    {  
        try{
        strings[count]=str;
        count++;
         setElement();
         jTextField1.setText("");
         JOptionPane.showMessageDialog(null,str+"SUCCESSFULLY ADDED TO LIST");
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"EXCEPTION "+e); 
        }
    }
    private void setElement()
    {
         jList1.setModel(new javax.swing.AbstractListModel<String>() {           
            @Override
            public int getSize() { return count; }
            @Override
            public String getElementAt(int i) { return strings[i];
            }
        });
        jScrollPane1.setViewportView(jList1);
    }
    private Boolean isUnique(String ent)
    {
        for(int i=0;i<count;i++)
        {
            if(strings[i].equals(ent))
              return false;  
        }
        return true;
    }

       public void setClient() 
       { 
        Lname.setText("List of Client's allowed to access from this server");
        filename=FileData.strc;
        fillList();
       }

    public void setWebsite()
    {   Lname.setText("List of Website's not allowed to access from this server");
        filename=FileData.strw;
        fillList();
     }

    public void setFiles()
    {   Lname.setText("List of File's not allowed to access from this server");
        filename=FileData.strf;
        fillList();
    }

   
}
