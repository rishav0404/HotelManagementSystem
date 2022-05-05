
package hotel.mangementt.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

public class dashboard extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem i1,i2,i3,i4;
    
    dashboard()
    {
        mb= new JMenuBar();
        add(mb);
        
        m1= new JMenu("HOTEL MANAGEMENT");
        m1.setForeground(Color.red);
        mb.add(m1);
        
        
        m2= new JMenu("ADMIN");
        m2.setForeground(Color.blue);
        mb.add(m2);
        
        i1= new JMenuItem("RECEPTION");
        i1.addActionListener(this);
        m1.add(i1);
        
        i2= new JMenuItem("ADD EMPLOYEE");
        i2.addActionListener(this);
        m2.add(i2);
        
        i3= new JMenuItem("ADD ROOMS");
        i3.addActionListener(this);
        m2.add(i3);
        
        i4= new JMenuItem("ADD DRIVERS");
        i4.addActionListener(this);
        m2.add(i4);
        
        mb.setBounds(0,0,1920,30);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("hotel/mangementt/system/icons/third.jpg"));
        Image i2= i1.getImage().getScaledInstance(1925,1000,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l1= new JLabel(i3);
        l1.setBounds(0,0,1920,1000);
        add(l1);
        
        JLabel l2= new JLabel("THE TAJ GROUP WELCOMES YOU");
        l2.setBounds(400,80,1000,50);
        l2.setBackground(Color.WHITE);
        l2.setFont(new Font("Tohima",Font.PLAIN,46));
        l1.add(l2);
       
        
        
        setLayout(null);
        setBounds(0,0,1920,1080);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("RECEPTION")){ // in menu item use getActionCommand
          new Reception().setVisible(true);  
        }else if(ae.getActionCommand().equals("ADD EMPLOYEE")){
            new AddEmployee().setVisible(true);
        }else if(ae.getActionCommand().equals("ADD ROOMS")){
            new AddRooms().setVisible(true);
        }else if(ae.getActionCommand().equals("ADD DRIVERS")){
             new AddDriver().setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        new dashboard().setVisible(true);
    }
}
