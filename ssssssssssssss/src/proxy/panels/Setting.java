package proxy.panels;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
  
public class Setting extends javax.swing.JPanel {
    static String storeAllString="";
    FileEdit fe;
    String pathnamec="",pathnamew="",pathnamef="";
    Boolean bolpathc=false,bolpathw=false,bolpathf=false; 
    public Setting()
    {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BOpenSquid = new javax.swing.JButton();
        LC = new javax.swing.JLabel();
        BC = new javax.swing.JButton();
        LF = new javax.swing.JLabel();
        LW = new javax.swing.JLabel();
        BW = new javax.swing.JButton();
        BF = new javax.swing.JButton();
        LC2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LLC = new javax.swing.JLabel();
        LLW = new javax.swing.JLabel();
        LLF = new javax.swing.JLabel();

        BOpenSquid.setText("squid.conf");
        BOpenSquid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOpenSquidActionPerformed(evt);
            }
        });

        LC.setText("CLIENTS =");

        BC.setText("CHOOSE FILE");
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });

        LF.setText("FILES =");

        LW.setText("WEBSITES =");

        BW.setText("CHOOSE FILE");
        BW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BWActionPerformed(evt);
            }
        });

        BF.setText("CHOOSE FILE");
        BF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFActionPerformed(evt);
            }
        });

        LC2.setText("FILE  PATHS  ARE LISTED BELOW");

        jButton1.setText("SAVE PATHS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("CONFIGURATION FILE ");

        LLC.setText("jLabel2");

        LLW.setText("jLabel2");

        LLF.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LC2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(191, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LC, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LW, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LLC, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BW)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LLW, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LF, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BOpenSquid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LLF, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 91, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LC2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BC)
                    .addComponent(LLC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LW, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BW)
                    .addComponent(LLW, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BF)
                    .addComponent(LLF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(BOpenSquid))
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BOpenSquidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOpenSquidActionPerformed
        this.setVisible(false);
        fe.setVisible(true);
        fe.TA.setText(loadFile());
    }//GEN-LAST:event_BOpenSquidActionPerformed

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); 
            int r = j.showSaveDialog(null); 
            if (r == JFileChooser.APPROVE_OPTION) 
            { 
                LC.setText("CLIENTS ="+j.getSelectedFile().getAbsolutePath()); 
                pathnamec=j.getSelectedFile().getAbsolutePath();
                LLC.setText("SELECTED");
                bolpathc=true;
            }
    }//GEN-LAST:event_BCActionPerformed

    private void BWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BWActionPerformed
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); 
            int r = j.showSaveDialog(null); 
            if (r == JFileChooser.APPROVE_OPTION) 
            { 
                LW.setText("WEBSITES ="+j.getSelectedFile().getAbsolutePath()); 
                pathnamew=j.getSelectedFile().getAbsolutePath();
                LLW.setText("SELECTED");
                bolpathw=true;
            }
          
    }//GEN-LAST:event_BWActionPerformed

    private void BFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFActionPerformed
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); 
            int r = j.showSaveDialog(null); 
            if (r == JFileChooser.APPROVE_OPTION) 
            { 
                LF.setText("FILES ="+j.getSelectedFile().getAbsolutePath()); 
                pathnamef=j.getSelectedFile().getAbsolutePath();
                LLF.setText("SELECTED");
                bolpathf=true;
            }
    }//GEN-LAST:event_BFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          if(bolpathc)
          FileData.strings[FileData.intc]="acl client src \""+pathnamec+"\"";
          if(bolpathf)
          FileData.strings[FileData.intf]="acl file urlpath_regex -i \""+pathnamef+"\"";    
          if(bolpathw)
          FileData.strings[FileData.intw]="acl web url_regex \""+pathnamew+"\"";
          saveToFile();
          FileData.setFilePath();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BC;
    private javax.swing.JButton BF;
    private javax.swing.JButton BOpenSquid;
    private javax.swing.JButton BW;
    private javax.swing.JLabel LC;
    private javax.swing.JLabel LC2;
    private javax.swing.JLabel LF;
    private javax.swing.JLabel LLC;
    private javax.swing.JLabel LLF;
    private javax.swing.JLabel LLW;
    private javax.swing.JLabel LW;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
   public void setFileEdit(FileEdit f)
   {
       fe=f;
   }
  public String loadFile() 
    {
     BufferedReader reader;
              storeAllString="";
		try 
                {
			reader = new BufferedReader(new FileReader(
					"/etc/squid/squid.conf"));
			String line = reader.readLine();
			while (line != null)
                        {       storeAllString=storeAllString+line+"\n";
                                //System.out.println(line);
				line = reader.readLine();       
			}
                      // TextArea.setText(storeAllString);
			reader.close();
                        return storeAllString;
		}
                catch(IOException e)
                {
		JOptionPane.showMessageDialog(null,"EXCEPTION "+e); 
		}
                return "EMPTY";
    }

    public void setFilePath()
    {
        LW.setText("WEBSITES ="+FileData.strw);
         LF.setText("FILES ="+FileData.strf);  
         LC.setText("CLIENTS ="+FileData.strc);
         LLC.setText("DEFAULT");
         LLW.setText("DEFAULT");
         LLF.setText("DEFAULT");
    }
    
    void saveToFile()
    {
        
                File file = new File("/etc/squid/squid.conf");
                FileWriter fileWriter = null;
                PrintWriter writer1 =null;
                BufferedWriter writer =null;
       try {
           writer1 = new PrintWriter(file);
           fileWriter = new FileWriter(file,true);
           writer1.print("");
           writer1.close();
           writer = new BufferedWriter(fileWriter);
            for(int j=0;j<FileData.count;j++)
            {
                 writer.append(FileData.strings[j]);
                writer.newLine();
            }
           JOptionPane.showMessageDialog(null,"SUCCESSFULLY SAVED TO FILE ->"+"/etc/squid/squid.conf"); 
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
    }
}
