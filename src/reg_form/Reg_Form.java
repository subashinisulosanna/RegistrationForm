
package reg_form;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import static java.awt.font.TextAttribute.FONT;
import java.util.Locale;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.MatteBorder;

public class Reg_Form {

    public static void main(String[] args) {
        A ob=null;
        new A();
        
    }
    
}
class A extends JFrame implements ActionListener{
    Reg ob1=new Reg();
        Login ob2=new Login();
        Updation ob3=new Updation();
        Delete ob4=new Delete();
        View ob5=new View();
    JButton l1,l2,l3,l4,l5,l6;
    JTabbedPane jt1,jt2,jt3,jt4,jt5,jt6;
    MatteBorder def_bor=BorderFactory.createMatteBorder(1,0,1,0, Color.lightGray);
      MatteBorder panel_bor=BorderFactory.createMatteBorder(1,0,1,0, Color.blue);
          MatteBorder p_bor=BorderFactory.createMatteBorder(1,0,1,0, Color.pink);
          MatteBorder c_bor=BorderFactory.createMatteBorder(1,0,1,0, Color.blue);
          MatteBorder b_bor=BorderFactory.createMatteBorder(1,0,1,0, Color.black);
          Image im;
          ImageIcon icon;
          
    A()
    {
        
        setLayout(null);
        setVisible(true);
        setSize(1650,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel forimage=new JLabel("");
        
//        ImageIcon im;
//          im=new ImageIcon("box.jpg");
//        JLabel imgb=new JLabel("", im, JLabel.CENTER);
//         imgb.setBounds(300,0,500,500);
//          
         
          
          
          
          
        JPanel p=new JPanel();
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(300,0,1350,1080);
       p2.setBackground(Color.blue);
       p.setLayout(null);   
//       icon = new ImageIcon(new
//        ImageIcon(getClass().getResource("car.jpg")).getImage());
//       
//       
       
       
        
        
        p.setBounds(0,0,300,1080);
        add(p2);
        p.setBackground(Color.black);
        add(p);
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,300,230);
        p1.setBackground(Color.black); 
        
    JLabel jlabel1=new JLabel();
    jlabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reg_form/homePage_1400x800.jpg")));
        
        p.add(jlabel1);
//        p1.setBackground(setIconImage("box.jpg"));
        p.add(p1);
        JButton l7=new JButton();
        l7.setBounds(0,230,300,5);
        l7.setBackground(Color.cyan);
        l1=new JButton("Registration");
        l1.setBounds(0,300,300,60);    
        l1.setBackground(Color.black);
        javax.swing.border.Border b1=BorderFactory.createLineBorder(Color.BLACK);        
        l1.setBorder(b1);
        l2=new JButton("Login");
        l2.setBounds(0,370,300,60);
        l2.setBackground(Color.black);
        javax.swing.border.Border b2=BorderFactory.createLineBorder(Color.BLACK);
        l2.setBorder(b2);
        l3=new JButton("Update");
        l3.setBounds(0,440,300,60);
        l3.setBackground(Color.black);
        javax.swing.border.Border b3=BorderFactory.createLineBorder(Color.BLACK);
        l3.setBorder(b3);
        l4=new JButton("Delete");
        l4.setBounds(0,510,300,60);
        l4.setBackground(Color.black);
        javax.swing.border.Border b4=BorderFactory.createLineBorder(Color.BLACK);
        l4.setBorder(b4);
        l5=new JButton("View");
        l5.setBounds(0,580,300,60);
        l5.setBackground(Color.black);
        javax.swing.border.Border b5=BorderFactory.createLineBorder(Color.BLACK);
        l5.setBorder(b5);
        l6=new JButton("Exit");
        l6.setBounds(0,650,300,60);
        l6.setBackground(Color.black);
        javax.swing.border.Border b6=BorderFactory.createLineBorder(Color.BLACK);
        l6.setBorder(b6);
        ActionEvent ActionEvent;
        l1.setFont(new Font("Times New Roman",Font.PLAIN,18));
        l1.setForeground(Color.cyan);
        l2.setFont(new Font("Times New Roman",Font.PLAIN,18));
        l2.setForeground(Color.cyan);
        l3.setFont(new Font("Times New Roman",Font.PLAIN,18));
        l3.setForeground(Color.cyan);
        l4.setFont(new Font("Times New Roman",Font.PLAIN,18));
        l4.setForeground(Color.cyan);
        l5.setFont(new Font("Times New Roman",Font.PLAIN,18));
        l5.setForeground(Color.cyan);
        l6.setFont(new Font("Times New Roman",Font.PLAIN,18));
        l6.setForeground(Color.cyan);
        
        ActionListener a1,a2,a3,a4,a5,a6;
        a1=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Reg().reg();
                
               
                    //To change body of generated methods, choose Tools | Templates.
            }
        };
        a2=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Login().login();
                    //To change body of generated methods, choose Tools | Templates.
            }
        };
        a3=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Updation().update();
                    //To change body of generated methods, choose Tools | Templates.
            }
        };
        a4=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Delete().del();
                    //To change body of generated methods, choose Tools | Templates.
            }
        };
        a5=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new View().view();
                    //To change body of generated methods, choose Tools | Templates.
            }
        };
        a6=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ob1.exit1();
                ob2.exit2();
                ob3.exit3();
                ob4.exit4();
                ob5.exit5();
                System.exit(0);
                //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        l1.addActionListener(a1);
        l2.addActionListener(a2);
        l3.addActionListener(a3);
        l4.addActionListener(a4);
        l5.addActionListener(a5);
        l6.addActionListener(a6);
        
        l1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                l1.setBackground(Color.DARK_GRAY);
                
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent me) {
                l1.setForeground(Color.cyan); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                l1.setBorder(c_bor);//To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                l1.setBackground(Color.black); 
                l1.setForeground(Color.cyan);
                l1.setBorder(b_bor);
            }
        });
        l2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                l2.setBackground(Color.DARK_GRAY);
               
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent me) {
                l2.setForeground(Color.cyan); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                l2.setBorder(c_bor);//To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                l2.setBackground(Color.black); 
                l2.setForeground(Color.cyan);
                l2.setBorder(b_bor);
            }
        });
        l3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                l3.setBackground(Color.DARK_GRAY);
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent me) {
                l3.setForeground(Color.cyan);//To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                l3.setBorder(c_bor);//To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                l3.setBackground(Color.black);
                l3.setForeground(Color.cyan);
                l3.setBorder(b_bor);
            }
        });
        l4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                l4.setBackground(Color.DARK_GRAY);
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent me) {
                l4.setForeground(Color.cyan);//To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                l4.setBorder(c_bor);//To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                l4.setBackground(Color.black); 
                l4.setForeground(Color.cyan);
                l4.setBorder(b_bor);
            }
        });
        l5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                l5.setBackground(Color.DARK_GRAY);
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent me) {
                l5.setForeground(Color.cyan);//To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                l5.setBorder(c_bor);//To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                l5.setBackground(Color.black); 
                l5.setForeground(Color.cyan);
                l5.setBorder(b_bor);
            }
        });
        l6.addMouseListener(new MouseListener() {
           @Override
            public void mouseClicked(MouseEvent me) {
                l6.setBackground(Color.darkGray);
                
                ob1.exit1();
                ob2.exit2();
                ob3.exit3();
                ob4.exit4();
                ob5.exit5();
                
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent me) {
                 l6.setForeground(Color.cyan);
                 
                
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
                
                
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                l6.setBorder(c_bor);
               
//To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                l6.setBackground(Color.black); 
                l6.setForeground(Color.cyan);
                l6.setBorder(b_bor);
                
                
            }
        });
        
        
        p.add(l1);
        p.add(l2);
        p.add(l3);
        p.add(l4);
        p.add(l5);
        p.add(l6);
        p.add(l7);
        
        
    }
    

   
         //To change body of generated methods, choose Tools | Templates.

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
 }

    

        
    

    
    
