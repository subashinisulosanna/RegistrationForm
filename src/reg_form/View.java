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
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Subashini
 */
public class View {

    JFrame jj1 = new JFrame();

    void view() {

        JPanel p1 = new JPanel();
        p1.setSize(1075, 1080);
        p1.setBackground(Color.orange);
        p1.setLayout(null);
        jj1.setLayout(null);
        jj1.setBounds(300, 0, 1075, 1080);
        jj1.add(p1);
        JLabel jl1 = new JLabel("Login");
        jl1.setFont(new Font("Algerian", Font.PLAIN, 40));
        jl1.setBounds(480, 100, 300, 60);
        JLabel jl2, jl3;
        JTextField jt2, jt3;
        jl2 = new JLabel("Register Number ");
        jl2.setBounds(350, 240, 200, 60);
        jl2.setFont(new Font("Cambria", Font.PLAIN, 20));
        jl3 = new JLabel("Password ");
        jl3.setFont(new Font("Cambria", Font.PLAIN, 20));
        jl3.setBounds(350, 340, 200, 60);

        jt2 = new JTextField("");
        jt2.setFont(new Font("Calibri", Font.PLAIN, 20));
        jt2.setBounds(550, 260, 200, 30);
        jt3 = new JTextField("");
        jt3.setFont(new Font("Calibri", Font.PLAIN, 20));
        jt3.setBounds(550, 360, 200, 30);

        JButton jb1 = new JButton("Enter");
        jb1.setFont(new Font("Calibri", Font.PLAIN, 20));
        jb1.setBounds(480, 450, 150, 50);

        ActionListener a1;
        a1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/t1", "root", "suba");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select * from proj1 where Reg_No='" + jt2.getText() + "' and Password='" + jt3.getText() + "'");

                    if (rs.next()) {

                        /**
                         * ******************************************************************
                         */
                        JFrame j1 = new JFrame();
                        JPanel p1 = new JPanel();
                        p1.setSize(1075, 1080);
                        p1.setBackground(Color.pink);
                        p1.setLayout(null);
                        j1.setLayout(new GridLayout());
                        j1.setBounds(300, 0, 1075, 1080);
                        j1.add(p1);
                        JLabel jl1 = new JLabel("Registration Form");
                        jl1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
                        jl1.setBounds(400, 50, 300, 60);
                        JLabel jl2, jl3, jl4, jl5, jl6, jl7, jl8, jl9, jl10, jl11, jt2, jt3, jt4, jt5, jt6, jt7, jt8, jt9, jt10, jt11;

                        jl2 = new JLabel("First Name ");
                        jl2.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jl2.setBounds(100, 150, 200, 80);
                        jl3 = new JLabel("Last Name ");
                        jl3.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jl3.setBounds(540, 150, 200, 80);
                        jl4 = new JLabel("Register Number ");
                        jl4.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jl4.setBounds(100, 250, 200, 80);
                        jl5 = new JLabel("Phone Number ");
                        jl5.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jl5.setBounds(540, 250, 200, 80);
                        jl6 = new JLabel("Gender ");
                        jl6.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jl6.setBounds(100, 350, 200, 80);
                        jl7 = new JLabel("Date of Birth ");
                        jl7.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jl7.setBounds(540, 350, 200, 80);
                        jl8 = new JLabel("Email Id");
                        jl8.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jl8.setBounds(100, 450, 200, 80);
                        jl9 = new JLabel("Place ");
                        jl9.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jl9.setBounds(540, 450, 200, 80);
                        jl10 = new JLabel("Password ");
                        jl10.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jl10.setBounds(100, 550, 200, 80);
                        jl11 = new JLabel("Confirm Password ");
                        jl11.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jl11.setBounds(540, 550, 200, 80);

                        jt2 = new JLabel(":   " + rs.getString(1));
                        jt2.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jt2.setBounds(280, 180, 200, 25);
                        jt3 = new JLabel(":   " + rs.getString(2));
                        jt3.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jt3.setBounds(730, 180, 200, 25);
                        jt4 = new JLabel(":   " + rs.getString(3));
                        jt4.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jt4.setBounds(280, 280, 200, 25);
                        jt5 = new JLabel(":   " + rs.getString(4));
                        jt5.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jt5.setBounds(730, 280, 200, 25);
                        jt6 = new JLabel(":   " + rs.getString(5));
                        jt6.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jt6.setBounds(280, 380, 200, 25);
                        jt7 = new JLabel(":   " + rs.getString(6));
                        jt7.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jt7.setBounds(730, 380, 200, 25);
//       jt7.add(cb1);
//        jt7.add(cb2);
//        jt7.add(cb3);
                        jt8 = new JLabel(":   " + rs.getString(7));
                        jt8.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jt8.setBounds(280, 480, 200, 25);
//        jt9=new JTextField("            ");
//        String[] place={"Chennai","Coimbatore","Namakkal","Karur","Trichy","Salem","Madurai","Pudukottai","Kanchipuram"};
//        JComboBox cb9=new JComboBox(place);
//        cb9.setFont(new Font("Calibri",Font.PLAIN,20));
//        cb9.setBounds(730,470,200,25); 
                        jt9 = new JLabel(":   " + rs.getString(8));
                        jt9.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jt9.setBounds(730, 480, 200, 25);
                        jt10 = new JLabel(":  " + rs.getString(9));
                        jt10.setFont(new Font("Calibri", Font.PLAIN, 20));
                        jt10.setBounds(280, 580, 200, 25);
//        jt11=new JLabel("");
//        jt11.setFont(new Font("Calibri",Font.PLAIN,20));
//        jt11.setBounds(730,570,200,25);  
//        
                        JButton jb1 = new JButton("Close");
                        jb1.setBounds(450, 600, 150, 40);

                        ActionListener a1 = new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                j1.dispose();
                                jj1.dispose();
                                //To change body of generated methods, choose Tools | Templates.
                            }
                        };
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

                        p1.add(jt2);
                        p1.add(jt3);
                        p1.add(jt4);
                        p1.add(jt5);
                        p1.add(jt6);
                        p1.add(jt7);
                        p1.add(jt8);
                        p1.add(jt9);
                        p1.add(jt10);

                        p1.add(jb1);

                        j1.setVisible(true);

                        /**
                         * ****************************************************************************
                         */
                        con.close();
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Entries...!");
                        jt2.setText("");
                        jt3.setText("");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Enter valid Register number or password..");
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

        jj1.setVisible(true);

    }

    void exit5() {
        jj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jj1.dispose();
    }

}
