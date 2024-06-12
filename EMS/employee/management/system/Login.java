package employee.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{

    JTextField tusername;
    JPasswordField tpassword;

    JButton login, back;

    Login(){

        JLabel username = new JLabel("Username");
        username.setBounds(40, 60, 100, 30);
        username.setForeground(Color.white);
        add(username);

        tusername = new JTextField();
        tusername.setBounds(150, 60, 150, 30);
        add(tusername);

        JLabel password = new JLabel("Password");
        password.setForeground(Color.white);
        password.setBounds(40, 110, 100, 30);
        add(password);

        tpassword = new JPasswordField();
        tpassword.setBounds(150, 110, 150, 30);
        add(tpassword);

        login = new JButton("LOGIN");
        login.setBounds(150, 180, 150, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        back = new JButton("BACK");
        back.setBounds(350, 180, 150, 30);
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.addActionListener(this);
        add(back);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/login2.png"));
        Image i22 = i11.getImage().getScaledInstance(126, 133, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel img1 = new JLabel(i33);
        img1.setBounds(371, -200, 100, 605);
        add(img1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0, 0, 600, 300);
        add(img);

        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icons/icon.png"));
        setIconImage(icon.getImage());
        setSize(600,300);
        setLocation(400,200);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login){
            try{
                String username = tusername.getText();
                char[] passwordChar = tpassword.getPassword();
                String password = new String(passwordChar);

                Connector connector = new Connector();

                String query = "select * from login where username='"+username+"' and password = '"+password+"'";
                ResultSet resultSet = connector.statement.executeQuery(query);

                if(resultSet.next()){
                    setVisible(false);
                    new Main();
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Username of Password");
                }

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }else if(e.getSource()==back){
            System.exit(90);
        }     
    }

    public static void main(String[] args) {

        new Login();
    }
}
