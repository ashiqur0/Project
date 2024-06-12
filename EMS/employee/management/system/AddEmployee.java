package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class AddEmployee extends JFrame implements ActionListener {

    JTextField tname, tfname, taddress, tphone, temail, tnid, tsalary, tdesignation;
    JDateChooser tdob;
    JComboBox<String> BoxEducation;
    Random randome = new Random();
    int number = randome.nextInt(999999);
    JLabel tempId;
    JButton add, back;

    AddEmployee(){

        getContentPane().setBackground(new Color(163, 255, 188));

        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 25));
        add(heading);

        JLabel name = new JLabel("Name");
        name.setBounds(50, 150, 150, 30);
        name.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(name);

        tname = new JTextField();
        tname.setBounds(200, 150, 150, 30);
        tname.setBackground(new Color(177, 252, 197));
        add(tname);

        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(400, 150, 150, 30);
        fname.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(fname);

        tfname = new JTextField();
        tfname.setBounds(600, 150, 150, 30);
        tfname.setBackground(new Color(177, 252, 197));
        add(tfname);

        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(50, 200, 150, 30);
        dob.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(dob);

        tdob = new JDateChooser();
        tdob.setBounds(200, 200, 150, 30);
        tdob.setBackground(new Color(177, 252, 197));
        add(tdob);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(400, 200, 150, 30);
        salary.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(salary);

        tsalary = new JTextField();
        tsalary.setBounds(600, 200, 150, 30);
        tsalary.setBackground(new Color(177, 252, 197));
        add(tsalary);

        JLabel address = new JLabel("Address");
        address.setBounds(50, 250, 150, 30);
        address.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(address);

        taddress = new JTextField();
        taddress.setBounds(200, 250, 150, 30);
        taddress.setBackground(new Color(177, 252, 197));
        add(taddress);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(400, 250, 150, 30);
        phone.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(phone);

        tphone = new JTextField();
        tphone.setBounds(600, 250, 150, 30);
        tphone.setBackground(new Color(177, 252, 197));
        add(tphone);

        JLabel email = new JLabel("Email");
        email.setBounds(50, 300, 150, 30);
        email.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(email);

        temail = new JTextField();
        temail.setBounds(200, 300, 150, 30);
        temail.setBackground(new Color(177, 252, 197));
        add(temail);

        JLabel education = new JLabel("Highest Education");
        education.setBounds(400, 300, 150, 30);
        education.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(education);

        String[] items = {"SSC","HSC","BA","B.com","BSC","MA","MSC","MBA","PHD","Others"};
        BoxEducation = new JComboBox<String>(items);
        BoxEducation.setBounds(600, 300, 150, 30);
        BoxEducation.setBackground(new Color(177, 252, 197));
        add(BoxEducation);        
        
        JLabel designation = new JLabel("Designation");
        designation.setBounds(50, 350, 150, 30);
        designation.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(designation);
        
        tdesignation = new JTextField();
        tdesignation.setBounds(200, 350, 150, 30);
        tdesignation.setBackground(new Color(177, 252, 197));
        add(tdesignation);
        
        JLabel nid = new JLabel("NID");
        nid.setBounds(400, 350, 150, 30);
        nid.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(nid);
        
        tnid = new JTextField();
        tnid.setBounds(600, 350, 150, 30);
        tnid.setBackground(new Color(177, 252, 197));
        add(tnid);
        
        JLabel empId = new JLabel("Employee ID");
        empId.setBounds(50, 400, 150, 30);
        empId.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(empId);
        
        tempId = new JLabel("" + number);
        tempId.setBounds(200, 400, 150, 30);
        tempId.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        tempId.setForeground(Color.RED);
        add(tempId);

        add = new JButton("ADD");
        add.setBounds(250, 550, 150, 40);
        add.setBackground(Color.WHITE);
        add.setForeground(Color.BLACK);
        add.addActionListener(this);
        add(add);

        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icons/icon.png"));
        setIconImage(icon.getImage());
        setSize(900, 700);
        setLayout(null);
        setLocation(300, 50);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
            String name = tname.getText();
            String fname = tfname.getText();
            String dob = ((JTextField) tdob.getDateEditor().getUiComponent()).getText();
            String salary = tsalary.getText();
            String address = taddress.getText();
            String phone = tphone.getText();
            String email = temail.getText();
            String education = (String) BoxEducation.getSelectedItem();
            String designation = tdesignation.getText();
            String nid = tnid.getText();
            String empId = tempId.getText();

            try{
                Connector connector = new Connector();
                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+nid+"', '"+empId+"')";
                connector.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Main();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        } else {
            setVisible(false);
            new Main();
        }
    }

    public static void main(String[] args) {
        
        new AddEmployee();
    }
}
