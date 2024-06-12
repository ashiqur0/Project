package employee.management.system;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash extends JFrame {

    Splash(){        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));
        Image i2 = i1.getImage().getScaledInstance(1170, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 1170,659);
        add(image);
        
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icons/icon.png"));
        setIconImage(icon.getImage());
        
        setSize(1177,650);
        setLocation(100,70);
        setLayout(null);
        setVisible(true);

        try{
            Thread.sleep(5000);
            setVisible(false);
            new Login();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new Splash();
    }
}