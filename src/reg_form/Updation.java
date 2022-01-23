/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reg_form;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Subashini
 */
public class Updation {
    JFrame j1=new JFrame();
    void update()
    {
        
        JPanel p1 = new JPanel();
        p1.setSize(1075,1080);        
        p1.setBackground(Color.orange);
        p1.setLayout(null);
        j1.setLayout(null);
        j1.setBounds(300,0,1075,1080);
        j1.add(p1);
        JLabel jll1=new JLabel("Login");
        jll1.setFont(new Font("Algerian",Font.PLAIN,40));
        jll1.setBounds(480,100,300,60);
        JLabel jll2,jll3;
        JTextField jtt2;
        jll2=new JLabel("Register Number ");
        jll2.setBounds(350,240,200,60);
        jll2.setFont(new Font("Cambria",Font.PLAIN,20));
        jll3=new JLabel("Password ");
        jll3.setFont(new Font("Cambria",Font.PLAIN,20));
        jll3.setBounds(350,340,200,60);
        
        jtt2=new JTextField("");
        jtt2.setFont(new Font("Calibri",Font.PLAIN,20));
        jtt2.setBounds(550,260,200,30);  
        JPasswordField jtt3=new JPasswordField("");
        jtt3.setFont(new Font("Calibri",Font.PLAIN,20));
        jtt3.setBounds(550,360,200,30);
        
        JButton jb1=new JButton("Enter");
        jb1.setFont(new Font("Calibri",Font.PLAIN,20));
        jb1.setBounds(480,450,150,50);
       
        
        
        
        ActionListener a1;
        a1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/t1","root","suba");
                    Statement st=con.createStatement();
                    ResultSet prs=st.executeQuery("select * from proj1 where Reg_No='"+jtt2.getText()+"' and Password='"+jtt3.getText()+"'"); 
                    
                    if(prs.next())
                    {
                        JFrame jf2=new JFrame();
                         jf2.setLayout(null);
                        JPanel jpa1=new JPanel();
                        jpa1.setLayout(null);
                         jpa1.setSize(1075,1080);                        
                         jpa1.setBackground(Color.RED);
                         
                         /*******************************************************************************/
                         
                         JLabel jl1=new JLabel("Updation Form");
        jl1.setFont(new Font("Times New Roman",Font.PLAIN,30));
        jl1.setBounds(400,50,300,60);
        JLabel jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11;
        JTextField jt2,jt3,jt4,jt5,jt6,jt7,jt8,jt9,jt10,jt11;
        jl2=new JLabel("First Name ");
        jl2.setFont(new Font("Calibri",Font.PLAIN,20));
        jl2.setBounds(100,150,200,80);  
        jl3=new JLabel("Last Name ");
        jl3.setFont(new Font("Calibri",Font.PLAIN,20));
        jl3.setBounds(540,150,200,80);  
        jl4=new JLabel("Register Number ");
        jl4.setFont(new Font("Calibri",Font.PLAIN,20));
        jl4.setBounds(100,250,200,80);  
        jl5=new JLabel("Phone Number ");
        jl5.setFont(new Font("Calibri",Font.PLAIN,20));
        jl5.setBounds(540,250,200,80); 
        jl6=new JLabel("Gender ");        
        jl6.setFont(new Font("Calibri",Font.PLAIN,20));
        jl6.setBounds(100,350,200,80);
        jl7=new JLabel("Date of Birth ");
        jl7.setFont(new Font("Calibri",Font.PLAIN,20));
        jl7.setBounds(540,350,200,80);  
        jl8=new JLabel("Email Id");
        jl8.setFont(new Font("Calibri",Font.PLAIN,20));
        jl8.setBounds(100,450,200,80); 
        jl9=new JLabel("Place ");
        jl9.setFont(new Font("Calibri",Font.PLAIN,20));
        jl9.setBounds(540,450,200,80); 
        jl10=new JLabel("Password ");
        jl10.setFont(new Font("Calibri",Font.PLAIN,20));
        jl10.setBounds(100,550,200,80);  
        jl11=new JLabel("Confirm Password ");
        jl11.setFont(new Font("Calibri",Font.PLAIN,20));
        jl11.setBounds(540,550,200,80);  
        
        jt2=new JTextField(prs.getString(1));
        jt2.setFont(new Font("Calibri",Font.PLAIN,20));
        jt2.setBounds(280,170,200,25);  
        jt3=new JTextField(prs.getString(2));
        jt3.setFont(new Font("Calibri",Font.PLAIN,20));
        jt3.setBounds(730,170,200,25);  
        jt4=new JTextField(prs.getString(3));
        jt4.setFont(new Font("Calibri",Font.PLAIN,20));
        jt4.setBounds(280,270,200,25);  
        jt5=new JTextField(prs.getString(4));
        jt5.setFont(new Font("Calibri",Font.PLAIN,20));
        jt5.setBounds(730,270,200,25); 
        jt6=new JTextField("");
        jt6.setFont(new Font("Calibri",Font.PLAIN,20));
        JRadioButton jr1=new JRadioButton("Female");
        JRadioButton jr2=new JRadioButton("Male");
        ButtonGroup bg1=new ButtonGroup();
        bg1.add(jr1);
        bg1.add(jr2);
        jr1.setBounds(280,370,80,25);
        jr2.setBounds(400,370,80,25);
//        jt7=new JTextField(null);
//        jt7.setFont(new Font("Calibri",Font.PLAIN,20));
//        jt7.setBounds(730,370,200,25); 
        String[] DD={"DD","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String[] MM={"MM","01","02","03","04","05","06","07","08","09","10","11","12"};
        String[] YY={"  YY","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991","1990"};
        JComboBox cb1=new JComboBox(DD);
        cb1.setFont(new Font("Calibri",Font.PLAIN,20));
        cb1.setBounds(730,370,60,25);
        JComboBox cb2=new JComboBox(MM);
        cb2.setFont(new Font("Calibri",Font.PLAIN,20));
        cb2.setBounds(790,370,60,25);
        JComboBox cb3=new JComboBox(YY);
        cb3.setFont(new Font("Calibri",Font.PLAIN,20));
        cb3.setBounds(850,370,80,25);
//       jt7.add(cb1);
//        jt7.add(cb2);
//        jt7.add(cb3);
        jt8=new JTextField(prs.getString(7));
        jt8.setFont(new Font("Calibri",Font.PLAIN,20));
        jt8.setBounds(280,470,200,25); 
//        jt9=new JTextField("            ");
        String[] place={"Chennai","Coimbatore","Namakkal","Karur","Trichy","Salem","Madurai","Pudukottai","Kanchipuram"};
        JComboBox cb9=new JComboBox(place);
        cb9.setFont(new Font("Calibri",Font.PLAIN,20));
        cb9.setBounds(730,470,200,25); 
        jt10=new JTextField(prs.getString(9));
        jt10.setFont(new Font("Calibri",Font.PLAIN,20));
        jt10.setBounds(280,570,200,25);  
        jt11=new JTextField(prs.getString(9));
        jt11.setFont(new Font("Calibri",Font.PLAIN,20));
        jt11.setBounds(730,570,200,25);  
        
        JButton jb1=new JButton("Update");
        ActionListener a1;
        a1 = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    
                    String s2="[a-zA-Z]*";
                    String s3="[A-Za-z]{1,50}";
                    String s4="[0-9]{1,5}[A-Za-z]{1,50}[0-9]{1,}";
                    String s5="[0-9]{1,12}";
                    String s8="^[a-z0-9.+%+-]+@[a-z0-9.-]+.[a-z]{2,6}$";
                    String s10="^.{5,}$";
                    
                    Pattern p2=Pattern.compile(s2);
                    Matcher m2=p2.matcher(jt2.getText());
                    Pattern p3=Pattern.compile(s3);
                    Matcher m3=p3.matcher(jt3.getText());
                    Pattern p4=Pattern.compile(s4);
                    Matcher m4=p4.matcher(jt4.getText());
                    Pattern p5=Pattern.compile(s5);
                    Matcher m5=p5.matcher(jt5.getText());
                    Pattern p8=Pattern.compile(s8);
                    Matcher m8=p8.matcher(jt8.getText());
                    Pattern p10=Pattern.compile(s10);
                    Matcher m10=p10.matcher(jt10.getText());
                    if(!m2.matches())
                    {
                        JOptionPane.showMessageDialog(null,"Enter Valid First Name");
                        
                    }
                    else if(!m3.matches())
                    {
                        JOptionPane.showMessageDialog(null,"Enter Valid Last Name");
                    }
                    else if(!m4.matches())
                    {
                        JOptionPane.showMessageDialog(null,"Enter Valid Register Number");
                    }
                    else if(!m5.matches())
                    {
                        JOptionPane.showMessageDialog(null,"Enter Valid Phone Number");
                    }
                    else if(!(jr1.isSelected() || jr2.isSelected()))
                    {
                        JOptionPane.showMessageDialog(null,"Enter Female or Male");
                    }
                    else if((cb1.getSelectedItem().equals("DD") || (cb2.getSelectedItem().equals("MM") || cb3.getSelectedItem().equals("  YY"))))
                    {
                        JOptionPane.showMessageDialog(null,"Enter Valid DOB");
                    }
                    else if(!m8.matches())
                    {
                        JOptionPane.showMessageDialog(null,"Enter Valid Email Id");
                    }
                    else if(!(jt10.getText().equals(jt11.getText())))
                    {
                        JOptionPane.showMessageDialog(null,"Enter Valid Password");
                    }
                    else if(!m10.matches())
                    {
                        JOptionPane.showMessageDialog(null,"Enter Strong Password");
                    }
                    else
                    {
                        
                        PreparedStatement ps2=con.prepareStatement("update proj1 set F_Name=(?) where Reg_No='"+jtt2.getText()+"' ");
                        PreparedStatement ps3=con.prepareStatement("update proj1 set L_Name=(?) where Reg_No='"+jtt2.getText()+"' ");
                        PreparedStatement ps4=con.prepareStatement("update proj1 set Reg_No=(?) where Reg_No='"+jtt2.getText()+"' ");
                        PreparedStatement ps5=con.prepareStatement("update proj1 set Phone_No=(?) where Reg_No='"+jtt2.getText()+"' ");
                        PreparedStatement ps6=con.prepareStatement("update proj1 set Gender=(?) where Reg_No='"+jtt2.getText()+"' ");
                        PreparedStatement ps7=con.prepareStatement("update proj1 set Date_Of_Birth=(?) where Reg_No='"+jtt2.getText()+"' ");
                       
                        PreparedStatement ps8=con.prepareStatement("update proj1 set Email_Id=(?) where Reg_No='"+jtt2.getText()+"' ");
                        PreparedStatement ps9=con.prepareStatement("update proj1 set Place=(?) where Reg_No='"+jtt2.getText()+"' ");
                        PreparedStatement ps10=con.prepareStatement("update proj1 set Password=(?) where Reg_No='"+jt3.getText()+"' ");
                        
                        
//                        PreparedStatement prep=con.prepareStatement("update proj1 set(?,?) where Reg_No='"+jtt2.getText()+"' ");
                        
 
//                            prep.executeUpdate();
                            ps2.setString(1, jt2.getText()); 
                            ps3.setString(1, jt3.getText()); 
                            ps4.setString(1, jt4.getText()); 
                            ps5.setString(1, jt5.getText());
                            if(jr1.isSelected())
                            {
                             ps6.setString(1,jr1.getText());
                            
                            }
                            if(jr2.isSelected())
                            {
                                ps6.setString(1,jr2.getText());
                          
                            }
                            ps7.setString(1,((String)cb1.getSelectedItem()+"-"+(String)cb2.getSelectedItem()+"-"+(String)cb3.getSelectedItem())); 
                            ps8.setString(1,  jt8.getText()); 
                            ps9.setString(1, (String)cb9.getSelectedItem()); 
                            ps10.setString(1, jt11.getText()); 
                           
                           
                            
                            
                            
                            ps2.executeUpdate();
                            ps3.executeUpdate();
                            ps4.executeUpdate();
                            ps5.executeUpdate();
                           ps6.executeUpdate();
                           ps7.executeUpdate();
                            ps8.executeUpdate();                         
                            ps9.executeUpdate();
                            ps10.executeUpdate();
                           
                            
                            JOptionPane.showMessageDialog(null,"Updation Sucessful!!!");
                           
                    }
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null,e);
                    j1.dispose();
                }
                
                //To change body of generated methods, choose Tools | Templates.
            }
        };
        jb1.setBounds(450,650,150,40);
        jb1.addActionListener(a1);
        
        
        jpa1.add(jl1);
        jpa1.add(jl2);
        jpa1.add(jl3);
        jpa1.add(jl4);
        jpa1.add(jl5);
        jpa1.add(jl6);
        jpa1.add(jl7);
        jpa1.add(jl8);
        jpa1.add(jl9);
        jpa1.add(jl10);
        jpa1.add(jl11);
        
        jpa1.add(jt2);
        jpa1.add(jt3);
        jpa1.add(jt4);
        jpa1.add(jt5);
        jpa1.add(jr1);
        jpa1.add(jr2);
        jpa1.add(cb1);
        jpa1.add(cb2);
        jpa1.add(cb3);
        jpa1.add(jt8);
        jpa1.add(cb9);
        jpa1.add(jt10);
        jpa1.add(jt11);
        
        
        jpa1.add(jb1);
                         
                         
                         
                         
                         
                         
                         /*********************************************************************************/
                         
                         jf2.setVisible(true);
                         jf2.setBounds(300,0,1075,1080);                          
                        jf2.add(jpa1);
                        jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        j1.dispose();
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Wrong Entries...!");
                        jtt2.setText("");
                        jtt3.setText("");
                    }
                }                
                catch (Exception e){
                    JOptionPane.showMessageDialog(null,e);
                    jtt2.setText("");
                    jtt3.setText("");
                }
                
                
                
                //To change body of generated methods, choose Tools | Templates.
            }
        };
        jb1.addActionListener(a1);
        
        p1.add(jll1);
        p1.add(jll2);
        p1.add(jll3);
        p1.add(jtt2);
        p1.add(jtt3);
        p1.add(jtt3);
        p1.add(jb1);
        
        j1.setVisible(true);
    
    
}
    void exit3()
    {
         j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j1.dispose();
    }
}