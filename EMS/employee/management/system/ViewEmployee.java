package employee.management.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class ViewEmployee extends JFrame implements ActionListener {
    
    Choice choiceEMP;
    JTable table;
    JButton searchbtn, print, update, back;

    ViewEmployee(){

        getContentPane().setBackground(new Color(255, 131, 122));
        JButton search = new JButton("Search by Employee ID");
        search.setBounds(20, 20, 150, 20);
        add(search);

        choiceEMP = new Choice();
        choiceEMP.setBounds(180, 20, 150, 20);
        add(choiceEMP);

        try{
            Connector connector = new Connector();
            ResultSet resultSet = connector.statement.executeQuery("select * from employee");
            while(resultSet.next()){
                choiceEMP.add(resultSet.getString("empId"));
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        table = new JTable();
        try{
            Connector connector = new Connector();
            ResultSet resultSet = connector.statement.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch(Exception ex){
            ex.printStackTrace();
        }

        JScrollPane jp = new JScrollPane(table);
        jp.setBounds(11, 100, 1335, 600);
        add(jp);

        searchbtn = new JButton("Search");
        searchbtn.setBounds(20, 70, 80, 20);
        searchbtn.addActionListener(this);
        add(searchbtn);

        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);

        update = new JButton("Update");
        update.setBounds(220, 70, 80, 20);
        update.addActionListener(this);
        add(update);

        back = new JButton("Back");
        back.setBounds(320, 70, 80, 20);
        back.addActionListener(this);
        add(back);

        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icons/icon.png"));
        setIconImage(icon.getImage());
        setSize(1373, 774);
        setLayout(null);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==searchbtn){
            String query = "select * from employee where empId = '"+choiceEMP.getSelectedItem()+"'";
            try{
                Connector connector = new Connector();
                ResultSet resultSet = connector.statement.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch(Exception E){
                E.printStackTrace();
            }
        }else if(e.getSource()==print){
            try{
                table.print();
            }catch(Exception E){
                E.printStackTrace();
            }
        }else if(e.getSource()==update){
            setVisible(false);
            new UpdateEmployee(choiceEMP.getSelectedItem());
        }else{
            setVisible(false);
            new Main();
        }
    }

    public static void main(String[] args) {

        new ViewEmployee();
    }
}
