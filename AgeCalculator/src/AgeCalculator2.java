package src;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.*;
import java.util.*;
import javax.swing.*;

public class AgeCalculator2 extends JFrame implements ActionListener {

    JLabel title, dateOfBirth, govJobLeftDays, currentaAgeLabel;
    JComboBox<String> month, day, year;
    JTextField currentaAgeField;
    JTextArea result;
    JButton check, clear, close;
    
    AgeCalculator2(){

        title = new JLabel("Age Calculator App");
        title.setBounds(320,-20,700,150);
        title.setFont(new Font("serif", Font.BOLD, 75));
        title.setForeground(new Color(255,179,103));
        add(title);

        dateOfBirth = new JLabel("Date of Birth");
        dateOfBirth.setBounds(120,170,250,50);
        dateOfBirth.setFont(new Font("SAN_SARIF", Font.BOLD, 30));
        dateOfBirth.setForeground(new Color(255,179,103));
        add(dateOfBirth);
        
        currentaAgeLabel = new JLabel("Current Age");
        currentaAgeLabel.setBounds(120,250,400,50);
        currentaAgeLabel.setFont(new Font("SAN_SARIF", Font.BOLD, 30));
        currentaAgeLabel.setForeground(new Color(255,179,103));
        add(currentaAgeLabel);
        
        JLabel govJobLeftDays = new JLabel("Government Job Eligibility");
        govJobLeftDays.setBounds(120,330,400,50);
        govJobLeftDays.setFont(new Font("SAN_SARIF", Font.BOLD, 30));
        govJobLeftDays.setForeground(new Color(255,179,103));
        add(govJobLeftDays);

        // Birth day input: by dropdown list
        String[] daySelection = new String[31];
        for(int i=0; i<31; daySelection[i]="    "+(++i));
        day = new JComboBox<String>(daySelection);
        day.setBounds(520, 170, 170, 40);
        day.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        day.setBackground(new Color(254,186,165));
        day.setForeground(Color.WHITE);
        add(day);

        // Birth month input: by dropdown list
        String[] monthSelection = {"    January","    February","    March","    April","    May","    June","    July","    August","    September","    October","    November","    December"};
        month = new JComboBox<String>(monthSelection);
        month.setBounds(710, 170, 220, 40);
        month.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        month.setBackground(new Color(254,186,165));
        month.setForeground(Color.WHITE);
        add(month);

        // Birth year input: by dropdown list
        String[] yearSelection = new String[50];
        for(int i=0; i<50; i++){
            int num = 1990+i;
            yearSelection[i]="    " + num;
        }
        year = new JComboBox<String>(yearSelection);
        year.setBounds(950, 170, 170, 40);        
        year.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        year.setBackground(new Color(254,186,165));
        year.setForeground(Color.WHITE);
        add(year);

        // TextField along with "Current Age":
        currentaAgeField = new JTextField();
        currentaAgeField.setBounds(520, 250, 600, 40);
        currentaAgeField.setBackground(new Color(177, 252, 197));        
        currentaAgeField.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        currentaAgeField.setBackground(new Color(254,186,165));
        currentaAgeField.setForeground(Color.WHITE);
        add(currentaAgeField);

        // TextArea along with "Government Job Eligibility": 'JTextArea' and 'JTextField' both are used to take input from file or app. The common difference between the is 'JTextField' can take single line text input while 'JTextArea' can monethan one.
        result = new JTextArea();
        result.setBounds(520, 330, 600, 40);        
        result.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        result.setBackground(new Color(254,186,165));
        result.setForeground(Color.WHITE);
        add(result);

        // check button
        check = new JButton("Check");
        check.setBounds(120, 500, 150, 40);
        check.setFont(new Font("SANSARIF", Font.BOLD, 20));
        check.setBackground(new Color(255,179,103));
        check.setForeground(Color.WHITE);
        check.addActionListener(this);
        add(check);

        // clear button
        clear = new JButton("Clear");
        clear.setBounds(305, 500, 150, 40);
        clear.setFont(new Font("SANSARIF", Font.BOLD, 20));
        clear.setBackground(new Color(255,157,146));
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        // close button
        close = new JButton("Close");
        close.setBounds(490, 500, 150, 40);
        close.setFont(new Font("SANSARIF", Font.BOLD, 20));
        close.setBackground(new Color(254,186,165));
        close.setForeground(Color.WHITE);
        add(close);
        close.addActionListener(e -> {    // by clicking on close button: it will terminate the program
            dispose();
        });

        // set logo for the frame
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icons/icon.png"));
        setIconImage(icon.getImage());

        // Background
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/background.jpg"));
        Image img1 = img.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT);
        ImageIcon img2 = new ImageIcon(img1);
        JLabel img3 = new JLabel(img2);
        img3.setBounds(916,318,450, 450);
        add(img3);

        // Frame Design:
        setBounds(-5,0,1386,768);    // size and position
        setResizable(false);               // resize off
        setLayout(null);
        setVisible(true);                          // allow to visible
        setTitle("Age Calculator");
        getContentPane().setBackground(Color.WHITE);  // for background color
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==check){       // when clicked on 'check' button
            int birthYear = Integer.parseInt(((String)year.getSelectedItem()).substring(4));
            int birthMonth = (int) month.getSelectedIndex()+1;
            int birthDay = Integer.parseInt(((String) day.getSelectedItem()).substring(4));
            Date date = new Date();     // Date object creation
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");    // collect current date and time
            // Typecasting: DateFormat to String
            String dateStr = dateFormat.format(date);
            // Typecasting: String to int
            int currentYear = Integer.parseInt(dateStr.substring(0,4)); 
            int currentMonth = Integer.parseInt(dateStr.substring(5,7));
            int currentDay = Integer.parseInt(dateStr.substring(8,10));
            int yearDiffrence = birthYear+30-currentYear;
            int monthDiffrence = birthMonth-currentMonth;
            int dayDiffrence = birthDay-currentDay;
            if(dayDiffrence>=31){
                monthDiffrence++;
                dayDiffrence-=31;
            }else if(dayDiffrence<0){
                monthDiffrence--;
                dayDiffrence+=31;
            }
            if(monthDiffrence>=12){
                yearDiffrence++;
                monthDiffrence-=12;
            }else if(monthDiffrence<0){
                yearDiffrence--;
                monthDiffrence+=12;
            }
            if(yearDiffrence<=0){
                result.setText("    Sorry! you are not eligible for government job");
            }else if(birthYear>currentYear){
                result.setText("    Error! Birth year is not correct");
            }else{
                result.setText("    "+yearDiffrence+" year "+monthDiffrence+" month "+dayDiffrence+" day left");
            }
            int currentAgeYear = currentYear-birthYear;
            int currentAgeMonth = currentMonth-birthMonth;
            int currentAgeDay = currentDay-birthDay;
            if(currentAgeDay>=31){
                currentAgeMonth++;
                currentAgeDay-=31;
            }else if(currentAgeDay<0){
                currentAgeMonth--;
                currentAgeDay+=31;
            }
            if(currentAgeMonth>=12){
                currentAgeYear++;
                currentAgeMonth-=12;
            }else if(currentAgeMonth<0){
                currentAgeYear--;
                currentAgeMonth+=12;
            }
            if(currentAgeYear<0){
                currentaAgeField.setText("    Sorry! you are not born yet");
            }else{
                currentaAgeField.setText("    "+currentAgeYear+" year "+currentAgeMonth+" month "+currentAgeDay+" day");
            }
        }else if(e.getSource()==clear){
            result.setText("");
            currentaAgeField.setText("");
        }
    }

    public static void main(String[] args) {
        // Constructor calling or invoking:
        new AgeCalculator2();
    }
}