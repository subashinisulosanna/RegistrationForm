/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reg_form;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import static javafx.scene.paint.Color.color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Subashini
 */
public class Login {
    JFrame j1=new JFrame();
    void login()
    {
        
        JPanel p1 = new JPanel();
        p1.setSize(1075,1080);        
        p1.setBackground(Color.orange);
        p1.setLayout(null);
        j1.setLayout(null);
        j1.setBounds(300,0,1075,1080);
        j1.add(p1);
        JLabel jl1=new JLabel("Login");
        jl1.setFont(new Font("Algerian",Font.PLAIN,40));
        jl1.setBounds(480,100,300,60);
        JLabel jl2,jl3;
        JTextField jt2;
        jl2=new JLabel("Register Number ");
        jl2.setBounds(350,240,200,60);
        jl2.setFont(new Font("Cambria",Font.PLAIN,20));
        jl3=new JLabel("Password ");
        jl3.setFont(new Font("Cambria",Font.PLAIN,20));
        jl3.setBounds(350,340,200,60);
        
        jt2=new JTextField("");
        jt2.setFont(new Font("Calibri",Font.PLAIN,20));
        jt2.setBounds(550,260,200,30);  
        JPasswordField jt3=new JPasswordField("");
        jt3.setFont(new Font("Calibri",Font.PLAIN,20));
        jt3.setBounds(550,360,200,30);
        
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
                    ResultSet rs=st.executeQuery("select * from proj1 where Reg_No='"+jt2.getText()+"' and Password='"+jt3.getText()+"'"); 
                    
                    if(rs.next())
                    {
                        JFrame jf2=new JFrame();
                         jf2.setLayout(null);
                        JPanel jpa1=new JPanel();
                        jpa1.setLayout(null);
                         jpa1.setSize(1075,1080);                        
                         jpa1.setBackground(Color.cyan);
                         JLabel jlabel1;
                         if(rs.getString(5).equals("Female"))
                         {
                            jlabel1=new JLabel("Welcome Ms "+rs.getString(1)+" !");
                         }
                         else
                         {
                             jlabel1=new JLabel("Welcome Mr "+rs.getString(1)+" !");
                         }
                         jlabel1.setBounds(400,250,500,100);
                         jpa1.add(jlabel1);   
                         jlabel1.setFont(new Font("Algerian",Font.PLAIN,40));
                         jf2.setVisible(true);
                         jf2.setBounds(300,0,1075,1080);                          
                        jf2.add(jpa1);
                        jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        j1.dispose();
                        con.close();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Wrong Entries...!");
                        jt2.setText("");
                        jt3.setText("");
                    }
                }                
                catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Enter valid Register number or password..");
                    jt2.setText("");
                    jt3.setText("");
                }
                
                
                
                //To change body of generated methods, choose Tools | Templates.
            }
        };
        jb1.addActionListener(a1);
        
        p1.add(jl1);
        p1.add(jl2);
        p1.add(jl3);
        p1.add(jt2);
        p1.add(jt3);
        p1.add(jt3);
        p1.add(jb1);
        
        j1.setVisible(true);
        
    }
    void exit2()
    {
         
        j1.dispose();
        int EXIT_ON_CLOSE = j1.EXIT_ON_CLOSE;
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
