package src;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumberConversionCalculator extends JFrame implements ActionListener {

    static JTextField textField1, textField2;
    JLabel cohoose, textLabel1, textLabel2;
    JButton check, clear, close;

    NumberConversionCalculator(){
        
        // Title:
        JLabel title = new JLabel("Number Conversion Calculator App");
        title.setBounds(90,-20,1200,150);
        title.setFont(new Font("serif", Font.BOLD, 75));
        title.setForeground(Color.GREEN);
        add(title);
        
        // choose label: laber for the choose list
        cohoose = new JLabel("Choose an Option");
        cohoose.setBounds(210,170,310,40);
        cohoose.setFont(new Font("SAN_SARIF", Font.BOLD, 30));
        cohoose.setForeground(Color.WHITE);
        add(cohoose);

        // list: option list creation
        String[] listJComboBox = {"  Decimal to Binary", "  Decimal to Octal", "  Decimal to Hexa Decimal", "  Binary to Decimal", "  Binary to Octal", "  Binary to Hexa Decimal", "  Octal to Decimal", "  Octal to Binary", "  Octal to Hexa Decimal", "  Hexa Decimal to Decimal", "  Hexa Decimal to Binary", "  Hexa Decimal to Octal"};
        JComboBox<String> list = new JComboBox<String>(listJComboBox);
        list.setBounds(210, 220, 350, 40);
        list.setBackground(Color.GRAY);
        list.setForeground(Color.GREEN);
        list.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        add(list);
        
        // check button
        check = new JButton("Check");
        check.setBounds(440, 500, 150, 40);
        check.setBackground(Color.CYAN);
        check.setForeground(Color.MAGENTA);
        check.setFont(new Font("SANSARIF", Font.BOLD, 20));
        add(check);

        // clear button
        clear = new JButton("Clear");
        clear.setBounds(620, 500, 150, 40);
        clear.setBackground(Color.GREEN);
        clear.setForeground(Color.YELLOW);
        clear.setFont(new Font("SANSARIF", Font.BOLD, 20));
        clear.addActionListener(this);
        add(clear);

        // close button
        close = new JButton("Close");
        close.setBounds(800, 500, 150, 40);
        close.setBackground(Color.MAGENTA);
        close.setForeground(Color.CYAN);
        close.setFont(new Font("SANSARIF", Font.BOLD, 20));
        add(close);
        close.addActionListener(e -> {    // by clicking on close button: it will terminate the program
            dispose();
        });

        // when select from "Choose an Option" then textLabel1 and textLable2 will change accordingly
        list.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = (int) list.getSelectedIndex()+1;
                if(index==1){
                    textLabel1.setText("Decimal");
                    textLabel2.setText("Binary");
                }else if(index==2){
                    textLabel1.setText("Decimal");
                    textLabel2.setText("Octal");
                }else if(index==3){
                    textLabel1.setText("Decimal");
                    textLabel2.setText("Hexadecimal");
                }else if(index==4){
                    textLabel1.setText("Binary");
                    textLabel2.setText("Decimal");
                }else if(index==5){
                    textLabel1.setText("Binary");
                    textLabel2.setText("Octal");
                }else if(index==6){
                    textLabel1.setText("Binary");
                    textLabel2.setText("Hexadecimal");
                }else if(index==7){
                    textLabel1.setText("Octal");
                    textLabel2.setText("Decimal");
                }else if(index==8){
                    textLabel1.setText("Octal");
                    textLabel2.setText("Binary");
                }else if(index==9){
                    textLabel1.setText("Octal");
                    textLabel2.setText("Hexadecimal");
                }else if(index==10){
                    textLabel1.setText("Hexadecimal");
                    textLabel2.setText("Decimal");
                }else if(index==11){
                    textLabel1.setText("Hexadecimal");
                    textLabel2.setText("Binary");
                }else if(index==12){
                    textLabel1.setText("Hexadecimal");
                    textLabel2.setText("Octal");
                }
            }            
        });

        // label for textField1
        textLabel1 = new JLabel("Decimal");
        textLabel1.setBounds(580,170,300,40);
        textLabel1.setFont(new Font("SAN_SARIF", Font.BOLD, 30));
        textLabel1.setForeground(Color.WHITE);
        add(textLabel1);
        
        // textField1 
        textField1 = new JTextField();
        textField1.setBounds(580, 220, 300, 40);
        textField1.setBackground(new Color(177, 252, 197));    
        textField1.setForeground(Color.MAGENTA);
        textField1.setHorizontalAlignment(JTextField.RIGHT);
        textField1.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        textField1.setBorder(BorderFactory.createEmptyBorder(0,0,0,40));
        add(textField1);
        
        // label for textField2
        textLabel2 = new JLabel("Binary");
        textLabel2.setBounds(900,170,300,40);
        textLabel2.setFont(new Font("SAN_SARIF", Font.BOLD, 30));
        textLabel2.setForeground(Color.WHITE);
        add(textLabel2);

        // textField2
        textField2 = new JTextField();
        textField2.setBounds(900, 220, 300, 40);
        textField2.setBackground(new Color(177, 252, 197));
        textField2.setForeground(Color.MAGENTA);
        textField2.setHorizontalAlignment(JTextField.RIGHT);        
        textField2.setFont(new Font("SAN_SARIF", Font.BOLD, 25));        
        textField2.setBorder(BorderFactory.createEmptyBorder(0,0,0,40));
        add(textField2);

        // When check button will be clicked: selected function will work accordingly(value must insert the textField1 before click on check button)
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = (int) list.getSelectedIndex()+1;

                switch(index){
                    case 1: decimalToBinary();
                    break;
                    case 2: decimalToOctal();
                    break;
                    case 3: decimalToHexaDecimal();
                    break;
                    case 4: binaryToDecimal();
                    break;
                    case 5: binaryToOctal();
                    break;
                    case 6: binaryToHexaDecimal();
                    break;
                    case 7: octalToDecimal();
                    break;
                    case 8: octalToBinary();
                    break;
                    case 9: octalToHexaDecimal();
                    break;
                    case 10: hexadecimalToDecimal();
                    break;
                    case 11: hexadecimalToBinary();
                    break;
                    case 12: hexadecimalToOctal();
                    break;
                }
            }

        });

        // set logo for the frame
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icons/icon2.png"));
        setIconImage(icon.getImage());

        // Background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bg2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1386, 768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(-5,0,1386,768);
        add(image); 

        // Frame Design:
        setBounds(-5,0,1386,768);              // size and position
        setResizable(false);                        // resize off
        setLayout(null);
        setVisible(true);                                   // allow to visible
        setTitle("Number Conversion Calculator");       // title for panel
        getContentPane().setBackground(new Color(100,100,100));     // background color
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // by clicking the cross(x), the program will be terminated
    }
    
    // Decimal number to Binary number conversion program
    public static void decimalToBinary(){
        String number = textField1.getText();
        int decimal = Integer.parseInt(number);
        if(decimal==0){
            textField2.setText("  " + decimal);
        }else{
            int[] binaryNum = new int[1000];
            int i = 0;
            while(decimal>0){
                binaryNum[i] = decimal % 2;
                decimal /= 2;
                i++;
            }
            String binaryNumber="";
            for(int j=i-1; j>=0; j--){
                binaryNumber+=binaryNum[j];
            }
            textField2.setText("  " + binaryNumber);
        }
    }

    // Decimal number to Octal number conversion program
    public static void decimalToOctal() {
        String number = textField1.getText();
        int decimal = Integer.parseInt(number);

        int octalNumber = 0, i = 1;
        while (decimal != 0) {
            octalNumber += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }
        textField2.setText("  " + octalNumber);
    }

    // Decimal number to Hexadecimal number conversion program
    public static void decimalToHexaDecimal(){
        String number = textField1.getText();
        int num = Integer.parseInt(number);
        String hexadecimal = Integer.toString(num, 16);

        textField2.setText("  " + hexadecimal.toUpperCase());
    }

    // Binary number ot Decimal number conversion program
    public static void binaryToDecimal(){
        String binaryString = textField1.getText();
        int decimal=0;
        int length=binaryString.length();
        for(int i=0; i<length; i++){
            char binaryChar=binaryString.charAt(length-1-i);
            if(binaryChar=='1'){
                decimal += Math.pow(2, i);
            }
        }
        textField2.setText("  " + decimal);
    }

    // Binary number to Octal number conversion program
    public static void binaryToOctal(){
        String binaryString = textField1.getText();
        Long binaryNumber = Long.parseLong(binaryString);
        int octalNumber = 0, decimalNumber = 0, i=0;
        while(binaryNumber != 0){
            decimalNumber += (binaryNumber%10)* Math.pow(2,i);
            ++i;
            binaryNumber /= 10;
        }
        i=1;
        while(decimalNumber != 0){
            octalNumber += (decimalNumber%8) * i;
            decimalNumber /= 8;
            i *= 10;
        }
        textField2.setText("  " + octalNumber);
    }

    // Binary number number to Hexadecimal Number conversion Program
    public static void binaryToHexaDecimal(){
        String binaryString = textField1.getText();
        int hexadecimalNumber = Integer.parseInt(binaryString, 2);
        textField2.setText("  " + (Integer.toHexString(hexadecimalNumber).toUpperCase()));
    }

    // Octal number to decimal number conversion program
    public static void octalToDecimal(){
        String octalString = textField1.getText();
        int decimalNumber = Integer.parseInt(octalString, 8);
        textField2.setText("  " + decimalNumber);
    }

    // Octal number to binary number conversion program
    public static void octalToBinary(){
        String octalString = textField1.getText();
        int octalNumber = Integer.parseInt(octalString);
        int decimalNumber = 0, i=0;
        long binaryNumber = 0;
        while(octalNumber != 0){
            decimalNumber += (octalNumber % 10) * Math.pow(8, i);
            ++i;
            octalNumber /= 10;
        }
        i=1;
        while(decimalNumber != 0){
            binaryNumber += (decimalNumber%2) * i;
            decimalNumber /= 2;
            i *= 10;
        }
        textField2.setText("  " + binaryNumber);
    }

    // Octal number to decimal number conversion program
    public static void octalToHexaDecimal(){
        String octalString = textField1.getText();
        int decimalNumber = Integer.parseInt(octalString, 8);
        String hexadecimalNumber = Integer.toHexString(decimalNumber);

        textField2.setText("  " + hexadecimalNumber.toUpperCase());
    }

    // Hexadecimal number to Decimal number conversion program
    public static void hexadecimalToDecimal(){
        String hexadecimalString = textField1.getText();
        int length = hexadecimalString.length();
        int base = 1;
        int decimalNumber = 0;
        for(int i=length-1; i>=0; i--){
            if(hexadecimalString.charAt(i)>= '0' && hexadecimalString.charAt(i)<='9'){
                decimalNumber += base*16;
            }else if(hexadecimalString.charAt(i)>'A' && hexadecimalString.charAt(i)<= 'F'){
                decimalNumber += (hexadecimalString.charAt(i)-55)*base;
                base *= 16;
            }
        }

        textField2.setText("  " + decimalNumber);
    }

    // Hexadecimal number to Binary Conversion Program
    public static void hexadecimalToBinary(){
        String hexadecimalString = textField1.getText();
        int num = Integer.parseInt(hexadecimalString, 16);
        String binaryNumber = Integer.toBinaryString(num);

        textField2.setText("  " + binaryNumber);
    }

    // Hexadecimal number to Octal number conversion program
    public static void hexadecimalToOctal(){
        String hexadecimalString = textField1.getText().toUpperCase();
        int num = 0;
        for(int i=0; i<hexadecimalString.length(); i++){
            char c = hexadecimalString.charAt(i);
            int digit = Character.digit(c, 16);
            num = 16*num + digit;
        }

        StringBuilder octalNumber = new StringBuilder();
        while(num>0){
            octalNumber.append(num%8);
            num /= 8;
        }

        textField2.setText("  " + octalNumber.reverse().toString());
    }

    // clear button: When clicked on clear button then it will clear textField1 and textField2
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==clear){
            textField1.setText("");
            textField2.setText("");
        }
    }

    // main method: Constructor Invocking or calling
    public static void main(String[] args) {
        new NumberConversionCalculator();
    }        
}