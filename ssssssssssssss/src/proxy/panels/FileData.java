/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy.panels;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class FileData {
     static String strings[]=new String[10000];
     static BufferedReader reader;
     static int intf=0,intw=0,intc=0;
     static String strf="",strw="",strc="",strload="";
     
            static int count=0;
            public static void setFilePath()
            { count=0;
              strload="";
                try {
			reader = new BufferedReader(new FileReader(
					"/etc/squid/squid.conf"));
			String line = reader.readLine();
			while (line != null) 
                        {   
				//System.out.println(line);
                                strload=strload+line+"\n";
				 strings[count]=line; 
                                if(line.contains("acl web url_regex") &&  line.charAt(0)=='a')
                                {  intw=count;
                                   strw=line.substring(line.indexOf("\"")+1,line.lastIndexOf("\""));
                                }
                                else if(line.contains("acl file urlpath_regex") && line.charAt(0)=='a')
                                {  intf=count;
                                   strf=line.substring(line.indexOf("\"")+1,line.lastIndexOf("\""));;
                                }
                                else if(line.contains("acl client src") && line.charAt(0)=='a')
                                {
                                    intc=count;
                                    strc=line.substring(line.indexOf("\"")+1,line.lastIndexOf("\""));;
                                }
                                line=reader.readLine();
                                count++;
			}
			reader.close();
                        //System.out.println(intc+"|"+strc);
                        //System.out.println(intw+"|"+strw);
                        //System.out.println(intf+"|"+strf);        
		}
                catch (Exception e) 
                {
		  JOptionPane.showMessageDialog(null,e); 
		}
            }
}
