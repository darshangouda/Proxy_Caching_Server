package proxy.panels;

import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Monitor extends javax.swing.JPanel implements Runnable {
    BufferedReader br=null ;
    DefaultTableModel model=null;
    String line=null;
     String[] dataRow=null;
      String[] columnsName =null;
      String filePath=null;
    public Monitor() {
        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setAutoscrolls(false);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTable1MouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleParent(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1262, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseEntered(MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered

    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseExited(MouseEvent evt) {//GEN-FIRST:event_jTable1MouseExited

    }//GEN-LAST:event_jTable1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
   public void fill()
   {   
        int co=0;
        File file = new File(filePath);
        
        try {
            
             br = new BufferedReader(new FileReader(file));
             model = (DefaultTableModel)jTable1.getModel();
             model.setRowCount(0);
            dataRow=null;
             line=null;
             Object tableLine=null;
            model.setColumnIdentifiers(columnsName);
            
             while(true)
            {   tableLine = (String)br.readLine();   
               if(tableLine != null)
                {
                    
                 line = tableLine.toString().trim();
                dataRow=getRowdata(line);
                model.addRow(dataRow);
                jTable1.scrollRectToVisible(jTable1.getCellRect(co++, 0, true));
                
                }
               
            }
        }
            /*Object[] tableLines = br.lines().toArray();
            for(int i = 0; i < tableLines.length; i++)
            {
                 line = tableLines[i].toString().trim();
                 
                dataRow=getRowdata(line);
                model.addRow(dataRow);
                //jTable1.scrollRectToVisible(jTable1.getCellRect(i, 0, true));
                jTable1.changeSelection(jTable1.getRowCount(), 0, false, false);
                
            }*/  
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"EXCEPTION IN MONITOR "+e);
               
        }
   }
   
   private  String[] getRowdata(String line)
   {
       String[] datarow=new String[20];
       int j=0;
       char[] charr=line.toCharArray();
       Boolean empty=false;
       for(int i=0;i<charr.length;i++)
       {
           if(charr[i]!=' ')
           {   if(empty)
               { 
                   j++;
                   empty=false;
               }
                if(datarow[j]==null)
               datarow[j]=""+charr[i];
               else
                datarow[j]+=charr[i];
           }
           else
           {
                   empty=true;
           }
       }
       
       return datarow;
   }
    public void setNetMonitor()
    {   
        filePath = "/var/log/squid/access.log";
        columnsName =new String[]{"Time","Elapsed","RemoteHost","Code/Status","Bytes","Method","URL","RFC931","PeerStatus/PeerHost","Type"};              
    }
    @Override
    public void run() 
    {
      fill();
    }

    public void setStorageMonitor() 
    {
        filePath = "/var/log/squid/store.log";
        columnsName =new String[]{"Time","Action","Dir No.","File No.","Hash","Status","Date","Lastmod","Expires","Type","Sizes","Method","URI"};
    }
}
