package employee.management.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RemoveEmployee extends JFrame implements ActionListener{

    Choice choiceEMPID;
    JLabel textName, textPhone, textEmail;
    JButton delete, back;

    RemoveEmployee(){

        JLabel label = new JLabel("Employee ID");
        label.setBounds(50, 50, 100, 30);
        label.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label);

        choiceEMPID = new Choice();
        choiceEMPID.setBounds(200, 50, 150, 30);
        add(choiceEMPID);

        try{
            Connector connector = new Connector();
            ResultSet resultSet = connector.statement.executeQuery("select * from employee");
            while (resultSet.next()) {
                choiceEMPID.add(resultSet.getString("empId"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JLabel labelName = new JLabel("Name");
        labelName.setBounds(50, 100, 100, 30);
        labelName.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(labelName);

        textName = new JLabel();
        textName.setBounds(200, 100, 100, 30);
        add(textName);

        JLabel labelPhone = new JLabel("Phone");
        labelPhone.setBounds(50, 150, 100, 30);
        labelPhone.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(labelPhone);
        
        textPhone = new JLabel();
        textPhone.setBounds(200, 150, 100, 30);
        add(textPhone);

        JLabel labelEmail = new JLabel("Email");
        labelEmail.setBounds(50, 200, 100, 30);
        labelEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(labelEmail);

        textEmail = new JLabel();
        textEmail.setBounds(200, 200, 100, 30);
        add(textEmail);
        
        try{
            Connector connector = new Connector();
            ResultSet resultSet = connector.statement.executeQuery("select * from employee where empId = '"+choiceEMPID.getSelectedItem()+"'");
            while (resultSet.next()) {
                textName.setText(resultSet.getString("name"));
                textPhone.setText(resultSet.getString("phone"));
                textEmail.setText(resultSet.getString("email"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        choiceEMPID.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try{
                    Connector connector = new Connector();
                    ResultSet resultSet = connector.statement.executeQuery("select * from employee where empId = '"+choiceEMPID.getSelectedItem()+"'");
                    while (resultSet.next()) {
                        textName.setText(resultSet.getString("name"));
                        textPhone.setText(resultSet.getString("phone"));
                        textEmail.setText(resultSet.getString("email"));
                    }
                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        delete = new JButton("Delete");
        delete.setBounds(80, 300, 100, 30);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(this);
        add(delete);

        back = new JButton("Back");
        back.setBounds(220, 300, 100, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(700, 80, 200, 200);
        add(img);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/rback.png"));
        Image i22 = i11.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel img2 = new JLabel(i33);
        img2.setBounds(0, 0, 1120, 630);
        add(img2);

        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icons/icon.png"));
        setIconImage(icon.getImage());
        setSize(1000, 400);
        setLocation(300, 150);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==delete){
            try{
                Connector connector = new Connector();
                String query = "delete from employee where empId = '"+choiceEMPID.getSelectedItem()+"'";
                connector.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Employee deleted successfully");
                setVisible(false);
                new Main();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }else if(e.getSource()==back){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new RemoveEmployee();
    }
}