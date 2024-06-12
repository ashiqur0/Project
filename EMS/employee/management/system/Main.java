package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

    Main(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0, 0, 1120, 630);
        add(img);

        JLabel heading = new JLabel("Employee Mangement System");
        heading.setBounds(340, 155, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        img.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(335, 270, 150, 40);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                setVisible(false);                
            }
        });
        img.add(add);

        JButton view = new JButton("View Employee");
        view.setBounds(565, 270, 150, 40);
        view.setBackground(Color.BLACK);
        view.setForeground(Color.WHITE);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewEmployee();
                setVisible(false);
            }
        });
        img.add(view);

        JButton rem = new JButton("Remove Employee");
        rem.setBounds(440, 370, 150, 40);
        rem.setBackground(Color.BLACK);
        rem.setForeground(Color.WHITE);
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();
            }
        });
        img.add(rem);

        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icons/icon.png"));
        setIconImage(icon.getImage());
        setSize(1120, 630);
        setLocation(120, 75);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Main();        
    }
}
