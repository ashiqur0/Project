package src;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EnergyCalculator extends JFrame implements ActionListener{

    JLabel title, questionTitle;

    EnergyCalculator(){

        title = new JLabel("Energy Calculator App");
        title.setBounds(260,-20,1200,150);
        title.setFont(new Font("serif", Font.BOLD, 75));
        title.setForeground(Color.GRAY);
        add(title);

        questionTitle = new JLabel("Question 1:");
        questionTitle.setBounds(180,160,200,50);
        questionTitle.setFont(new Font("Tahoma", Font.BOLD, 30));
        questionTitle.setForeground(Color.WHITE);
        add(questionTitle);

        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icons/Picture1.png"));
        setIconImage(icon.getImage());

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Picture2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1386, 768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 1386, 768);
        add(image);        

        setTitle("Energy Calculator App");
        setBounds(-5, 0, 1386, 768);
        setLayout(null);
        setVisible(true);
        // getContentPane().setBackground(new Color(100,100,100));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    public static void main(String[] args) {
        new EnergyCalculator();
    }
}
