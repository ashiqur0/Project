package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UpdateEmployee extends JFrame implements ActionListener {

    JTextField teducation, tfname, taddress, tphone, temail, tnid, tsalary, tdesignation;
    JLabel tempId;
    JButton update, back;
    String number;
    
    UpdateEmployee(String number){
        
        this.number = number;
        getContentPane().setBackground(new Color(163, 255, 188));

        JLabel heading = new JLabel("Update Employee Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 25));
        add(heading);

        JLabel name = new JLabel("Name");
        name.setBounds(50, 150, 150, 30);
        name.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(name);

        JLabel tname = new JLabel();
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

        JLabel tdob  = new JLabel();
        tdob.setBounds(200, 200, 150, 30);
        tdob.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
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
        
        teducation = new JTextField();
        teducation.setBounds(600, 300, 150, 30);
        teducation.setBackground(new Color(177, 252, 197));
        add(teducation);

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
        
        JLabel tnid = new JLabel();
        tnid.setBounds(600, 350, 150, 30);
        tnid.setBackground(new Color(177, 252, 197));
        add(tnid);
        
        JLabel empId = new JLabel("Employee ID");
        empId.setBounds(50, 400, 150, 30);
        empId.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(empId);
        
        tempId = new JLabel();
        tempId.setBounds(200, 400, 150, 30);
        tempId.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        tempId.setForeground(Color.RED);
        add(tempId);
        
        try{
            Connector connector = new Connector();
            String query = "select * from employee where empId = '"+number+"'";
            ResultSet resultSet = connector.statement.executeQuery(query);
            while(resultSet.next()){
                tname.setText(resultSet.getString("name"));
                tfname.setText(resultSet.getString("fname"));
                tdob.setText(resultSet.getString("dob"));
                tsalary.setText(resultSet.getString("salary"));
                taddress.setText(resultSet.getString("address"));
                tphone.setText(resultSet.getString("phone"));
                temail.setText(resultSet.getString("email"));
                teducation.setText(resultSet.getString("education"));
                tdesignation.setText(resultSet.getString("designation"));
                tnid.setText(resultSet.getString("nid"));
                tempId.setText(resultSet.getString("empId"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        update = new JButton("Update");
        update.setBounds(250, 550, 150, 40);
        update.setBackground(Color.WHITE);
        update.setForeground(Color.BLACK);
        update.addActionListener(this);
        add(update);

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
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==update){
            String fname = tfname.getText();
            String salary = tsalary.getText();
            String address = taddress.getText();
            String phone = tphone.getText();
            String email = temail.getText();
            String education = teducation.getText();
            String designation = tdesignation.getText();

            try{
                Connector connector = new Connector();
                String query = "update employee set fname = '"+fname+"', salary='"+salary+"', address='"+address+"', phone='"+phone+"', email='"+email+"', education='"+education+"', designation='"+designation+"' where empId='"+number+"'";
                connector.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details Updated Successfully");
                setVisible(false);
                new Main();
            }catch(Exception E){
                E.printStackTrace();
            }
        }else if(e.getSource()==back){
            setVisible(false);
            new Main();
        }
    }

        public static void main(String[] args) {
        
        new UpdateEmployee("");
    }
}
