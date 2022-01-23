/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reg_form;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Subashini
 */

public class Reg{
        JFrame j1=new JFrame();
        JPanel p1 = new JPanel();
    void reg()
    {
        p1.setSize(1075,1080);        
        p1.setBackground(Color.pink);
        p1.setLayout(null);
        j1.setLayout(new GridLayout());
        j1.setBounds(300,0,1075,1080);
        j1.add(p1);
        JLabel jl1=new JLabel("New User Registration");
        jl1.setFont(new Font("Times New Roman",Font.PLAIN,30));
        jl1.setBounds(400,50,300,60);
        JLabel jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11;
        JTextField jt2,jt3,jt4,jt5,jt6,jt7,jt8,jt9;
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
        
        jt2=new JTextField("");
        jt2.setFont(new Font("Calibri",Font.PLAIN,20));
        jt2.setBounds(280,170,200,25);  
        jt3=new JTextField("");
        jt3.setFont(new Font("Calibri",Font.PLAIN,20));
        jt3.setBounds(730,170,200,25);  
        jt4=new JTextField("");
        jt4.setFont(new Font("Calibri",Font.PLAIN,20));
        jt4.setBounds(280,270,200,25);  
        jt5=new JTextField("");
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
        jt8=new JTextField("");
        jt8.setFont(new Font("Calibri",Font.PLAIN,20));
        jt8.setBounds(280,470,200,25); 
//        jt9=new JTextField("            ");
        String[] place={"Chennai","Coimbatore","Namakkal","Karur","Trichy","Salem","Madurai","Pudukottai","Kanchipuram"};
        JComboBox cb9=new JComboBox(place);
        cb9.setFont(new Font("Calibri",Font.PLAIN,20));
        cb9.setBounds(730,470,200,25); 
        JPasswordField jt10=new JPasswordField("");
        jt10.setFont(new Font("Calibri",Font.PLAIN,20));
        jt10.setBounds(280,570,200,25);  
        JPasswordField jt11=new JPasswordField("");
        jt11.setFont(new Font("Calibri",Font.PLAIN,20));
        jt11.setBounds(730,570,200,25);  
        
        JButton jb1=new JButton("Register");
        ActionListener a1;
        a1 = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    
                    String s2="[A-Za-z]{1,50}";
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
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/t1","root","suba");
                        Statement st=con.createStatement();
                        PreparedStatement ps=con.prepareStatement("insert into proj1 values(?,?,?,?,?,?,?,?,?)");
                        ps.setString(1,jt2.getText());
                        ps.setString(2,jt3.getText());
                        ps.setString(3,jt4.getText());
                        ps.setString(4,jt5.getText());
                        if(jr1.isSelected())
                        {
                            ps.setString(5,jr1.getText());
                        }
                        if(jr2.isSelected())
                        {
                            ps.setString(5,jr2.getText());
                        }
                        ps.setString(6,(cb1.getSelectedItem()+"-"+cb2.getSelectedItem()+"-"+cb3.getSelectedItem()));
                        ps.setString(7,jt8.getText());
                        ps.setString(8, (String) cb9.getSelectedItem());
                        ps.setString(9,jt10.getText());
                        
                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(null,"Insertion Sucessful!!!");
                            j1.dispose();
                            con.close();
                    }
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Register Number is already taken!");
                }
                
                //To change body of generated methods, choose Tools | Templates.
            }
        };
        jb1.setBounds(450,650,150,40);
        jb1.addActionListener(a1);
        
        
        p1.add(jl1);
        p1.add(jl2);
        p1.add(jl3);
        p1.add(jl4);
        p1.add(jl5);
        p1.add(jl6);
        p1.add(jl7);
        p1.add(jl8);
        p1.add(jl9);
        p1.add(jl10);
        p1.add(jl11);
        
        p1.add(jt2);
        p1.add(jt3);
        p1.add(jt4);
        p1.add(jt5);
        p1.add(jr1);
        p1.add(jr2);
        p1.add(cb1);
        p1.add(cb2);
        p1.add(cb3);
        p1.add(jt8);
        p1.add(cb9);
        p1.add(jt10);
        p1.add(jt11);
        
        
        p1.add(jb1);
        
        j1.setVisible(true);
        
        
    }
    void exit1()
    {
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j1.dispose();
    }
}