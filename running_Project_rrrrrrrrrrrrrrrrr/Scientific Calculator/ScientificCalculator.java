import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ScientificCalculator extends JFrame implements ActionListener {

    JButton rad, deg, xFact, parentheseOpen, parenthesesClose, modulo, ac,
    inv, sin, ln, number7, number8, number9, divide, 
    pi, cos, log,  number4, number5, number6,  multiply,
    e, tan, sqrt, number1, number2, number3, subtract,
    ans, exp, xPowerY, number0, radix, sum, isEqual;
    
    JTextField textField1, textField2;    
    String[] expression = new String[100];
    double result=0;
    
    ScientificCalculator(){

        textField1 = new JTextField();
        textField1.setBounds(10, 10, 660, 35);
        textField1.setBackground(new Color(177, 252, 197));
        textField1.setHorizontalAlignment(JTextField.RIGHT);
        textField1.setFont(new Font("SANSARIF", Font.PLAIN, 20));
        add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(10, 45, 660, 35);
        textField2.setBackground(new Color(177, 252, 197));
        textField2.setHorizontalAlignment(JTextField.RIGHT);
        textField2.setFont(new Font("SANSARIF", Font.PLAIN, 20));
        add(textField2);

        rad = new JButton("Rad");
        rad.setBounds(10, 85, 90, 40);
        rad.setBackground(Color.BLACK);
        rad.setForeground(Color.WHITE);
        rad.setFont(new Font("SANSARIF", Font.BOLD, 20));
        rad.addActionListener(this);
        add(rad);
        
        deg = new JButton("Deg");
        deg.setBounds(105, 85, 90, 40);
        deg.setBackground(Color.BLACK);
        deg.setForeground(Color.WHITE);
        deg.setFont(new Font("SANSARIF", Font.BOLD, 20));
        deg.addActionListener(this);
        add(deg);
        
        xFact = new JButton("x!");
        xFact.setBounds(200, 85, 90, 40);
        xFact.setBackground(Color.BLACK);
        xFact.setForeground(Color.WHITE);
        xFact.setFont(new Font("SANSARIF", Font.BOLD, 20));
        xFact.addActionListener(this);
        add(xFact);

        parentheseOpen = new JButton("(");
        parentheseOpen.setBounds(295, 85, 90, 40);
        parentheseOpen.setBackground(Color.BLACK);
        parentheseOpen.setForeground(Color.WHITE);
        parentheseOpen.setFont(new Font("SANSARIF", Font.BOLD, 20));
        parentheseOpen.addActionListener(this);
        add(parentheseOpen);

        parenthesesClose = new JButton(")");
        parenthesesClose.setBounds(390, 85, 90, 40);
        parenthesesClose.setBackground(Color.BLACK);
        parenthesesClose.setForeground(Color.WHITE);
        parenthesesClose.setFont(new Font("SANSARIF", Font.BOLD, 20));
        parenthesesClose.addActionListener(this);
        add(parenthesesClose);

        modulo = new JButton("%");
        modulo.setBounds(485, 85, 90, 40);
        modulo.setBackground(Color.BLACK);
        modulo.setForeground(Color.WHITE);
        modulo.setFont(new Font("SANSARIF", Font.BOLD, 20));
        modulo.addActionListener(this);
        add(modulo);

        ac = new JButton("AC");
        ac.setBounds(580, 85, 90, 40);
        ac.setBackground(Color.BLACK);
        ac.setForeground(Color.WHITE);
        ac.setFont(new Font("SANSARIF", Font.BOLD, 20));
        ac.addActionListener(this);
        add(ac);

        inv = new JButton("Inv");
        inv.setBounds(10, 130, 90, 40);
        inv.setBackground(Color.BLACK);
        inv.setForeground(Color.WHITE);
        inv.setFont(new Font("SANSARIF", Font.BOLD, 20));
        inv.addActionListener(this);
        add(inv);
        
        sin = new JButton("sin");
        sin.setBounds(105, 130, 90, 40);
        sin.setBackground(Color.BLACK);
        sin.setForeground(Color.WHITE);
        sin.setFont(new Font("SANSARIF", Font.BOLD, 20));
        sin.addActionListener(this);
        add(sin);
        
        ln = new JButton("ln");
        ln.setBounds(200, 130, 90, 40);
        ln.setBackground(Color.BLACK);
        ln.setForeground(Color.WHITE);
        ln.setFont(new Font("SANSARIF", Font.BOLD, 20));
        ln.addActionListener(this);
        add(ln);

        number7 = new JButton("7");
        number7.setBounds(295, 130, 90, 40);
        number7.setBackground(Color.BLACK);
        number7.setForeground(Color.WHITE);
        number7.setFont(new Font("SANSARIF", Font.BOLD, 20));
        number7.addActionListener(this);
        add(number7);

        number8 = new JButton("8");
        number8.setBounds(390, 130, 90, 40);
        number8.setBackground(Color.BLACK);
        number8.setForeground(Color.WHITE);
        number8.setFont(new Font("SANSARIF", Font.BOLD, 20));
        number8.addActionListener(this);
        add(number8);

        number9 = new JButton("9");
        number9.setBounds(485, 130, 90, 40);
        number9.setBackground(Color.BLACK);
        number9.setForeground(Color.WHITE);
        number9.setFont(new Font("SANSARIF", Font.BOLD, 20));
        number9.addActionListener(this);
        add(number9);

        divide = new JButton("÷");
        divide.setBounds(580, 130, 90, 40);
        divide.setBackground(Color.BLACK);
        divide.setForeground(Color.WHITE);
        divide.setFont(new Font("SANSARIF", Font.BOLD, 20));
        divide.addActionListener(this);
        add(divide);

        pi = new JButton("π");
        pi.setBounds(10, 175, 90, 40);
        pi.setBackground(Color.BLACK);
        pi.setForeground(Color.WHITE);
        pi.setFont(new Font("SANSARIF", Font.BOLD, 20));
        pi.addActionListener(this);
        add(pi);
        
        cos = new JButton("cos");
        cos.setBounds(105, 175, 90, 40);
        cos.setBackground(Color.BLACK);
        cos.setForeground(Color.WHITE);
        cos.setFont(new Font("SANSARIF", Font.BOLD, 20));
        cos.addActionListener(this);
        add(cos);
        
        log = new JButton("log");
        log.setBounds(200, 175, 90, 40);
        log.setBackground(Color.BLACK);
        log.setForeground(Color.WHITE);
        log.setFont(new Font("SANSARIF", Font.BOLD, 20));
        log.addActionListener(this);
        add(log);

        number4 = new JButton("4");
        number4.setBounds(295, 175, 90, 40);
        number4.setBackground(Color.BLACK);
        number4.setForeground(Color.WHITE);
        number4.setFont(new Font("SANSARIF", Font.BOLD, 20));
        number4.addActionListener(this);
        add(number4);

        number5 = new JButton("5");
        number5.setBounds(390, 175, 90, 40);
        number5.setBackground(Color.BLACK);
        number5.setForeground(Color.WHITE);
        number5.setFont(new Font("SANSARIF", Font.BOLD, 20));
        number5.addActionListener(this);
        add(number5);

        number6 = new JButton("6");
        number6.setBounds(485, 175, 90, 40);
        number6.setBackground(Color.BLACK);
        number6.setForeground(Color.WHITE);
        number6.setFont(new Font("SANSARIF", Font.BOLD, 20));
        number6.addActionListener(this);
        add(number6);

        multiply = new JButton("*");
        multiply.setBounds(580, 175, 90, 40);
        multiply.setBackground(Color.BLACK);
        multiply.setForeground(Color.WHITE);
        multiply.setFont(new Font("SANSARIF", Font.BOLD, 20));
        multiply.addActionListener(this);
        add(multiply);

        e = new JButton("e");
        e.setBounds(10, 220, 90, 40);
        e.setBackground(Color.BLACK);
        e.setForeground(Color.WHITE);
        e.setFont(new Font("SANSARIF", Font.BOLD, 20));
        e.addActionListener(this);
        add(e);
        
        tan = new JButton("tan");
        tan.setBounds(105, 220, 90, 40);
        tan.setBackground(Color.BLACK);
        tan.setForeground(Color.WHITE);
        tan.setFont(new Font("SANSARIF", Font.BOLD, 20));
        tan.addActionListener(this);
        add(tan);
        
        sqrt = new JButton("√");
        sqrt.setBounds(200, 220, 90, 40);
        sqrt.setBackground(Color.BLACK);
        sqrt.setForeground(Color.WHITE);
        sqrt.setFont(new Font("SANSARIF", Font.BOLD, 20));
        sqrt.addActionListener(this);
        add(sqrt);

        number1 = new JButton("1");
        number1.setBounds(295, 220, 90, 40);
        number1.setBackground(Color.BLACK);
        number1.setForeground(Color.WHITE);
        number1.setFont(new Font("SANSARIF", Font.BOLD, 20));
        number1.addActionListener(this);
        add(number1);

        number2 = new JButton("2");
        number2.setBounds(390, 220, 90, 40);
        number2.setBackground(Color.BLACK);
        number2.setForeground(Color.WHITE);
        number2.setFont(new Font("SANSARIF", Font.BOLD, 20));
        number2.addActionListener(this);
        add(number2);

        number3 = new JButton("3");
        number3.setBounds(485, 220, 90, 40);
        number3.setBackground(Color.BLACK);
        number3.setForeground(Color.WHITE);
        number3.setFont(new Font("SANSARIF", Font.BOLD, 20));
        number3.addActionListener(this);
        add(number3);

        subtract = new JButton("-");
        subtract.setBounds(580, 220, 90, 40);
        subtract.setBackground(Color.BLACK);
        subtract.setForeground(Color.WHITE);
        subtract.setFont(new Font("SANSARIF", Font.BOLD, 20));
        subtract.addActionListener(this);
        add(subtract);

        ans = new JButton("Ans");
        ans.setBounds(10, 265, 90, 40);
        ans.setBackground(Color.BLACK);
        ans.setForeground(Color.WHITE);
        ans.setFont(new Font("SANSARIF", Font.BOLD, 20));
        ans.addActionListener(this);
        add(ans);
        
        exp = new JButton("Exp");
        exp.setBounds(105, 265, 90, 40);
        exp.setBackground(Color.BLACK);
        exp.setForeground(Color.WHITE);
        exp.setFont(new Font("SANSARIF", Font.BOLD, 20));
        exp.addActionListener(this);
        add(exp);
        
        xPowerY = new JButton("x^y");
        xPowerY.setBounds(200, 265, 90, 40);
        xPowerY.setBackground(Color.BLACK);
        xPowerY.setForeground(Color.WHITE);
        xPowerY.setFont(new Font("SANSARIF", Font.BOLD, 20));
        xPowerY.addActionListener(this);
        add(xPowerY);

        number0 = new JButton("0");
        number0.setBounds(295, 265, 90, 40);
        number0.setBackground(Color.BLACK);
        number0.setForeground(Color.WHITE);
        number0.setFont(new Font("SANSARIF", Font.BOLD, 20));
        number0.addActionListener(this);
        add(number0);

        radix = new JButton(".");
        radix.setBounds(390, 265, 90, 40);
        radix.setBackground(Color.BLACK);
        radix.setForeground(Color.WHITE);
        radix.setFont(new Font("SANSARIF", Font.BOLD, 20));
        radix.addActionListener(this);
        add(radix);

        isEqual = new JButton("=");
        isEqual.setBounds(485, 265, 90, 40);
        isEqual.setBackground(Color.BLACK);
        isEqual.setForeground(Color.WHITE);
        isEqual.setFont(new Font("SANSARIF", Font.BOLD, 20));
        isEqual.addActionListener(this);
        add(isEqual);

        sum = new JButton("+");
        sum.setBounds(580, 265, 90, 40);
        sum.setBackground(Color.BLACK);
        sum.setForeground(Color.WHITE);
        sum.setFont(new Font("SANSARIF", Font.BOLD, 20));
        sum.addActionListener(this);
        add(sum);
        
        // Frame Design
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(695,350);
        setLocation(250, 100);
        setLayout(null);
        setTitle("Scientific Calculator");
        getContentPane().setBackground(new Color(39, 40, 41));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==number0){
            textField2.setText(textField2.getText() + "0");
        }else if(e.getSource()==number1){
            textField2.setText(textField2.getText() + "1");
        }else if(e.getSource()==number2){
            textField2.setText(textField2.getText() + "2");
        }else if(e.getSource()==number3){
            textField2.setText(textField2.getText() + "3");
        }else if(e.getSource()==number4){
            textField2.setText(textField2.getText() + "4");
        }else if(e.getSource()==number5){
            textField2.setText(textField2.getText() + "5");
        }else if(e.getSource()==number6){
            textField2.setText(textField2.getText() + "6");
        }else if(e.getSource()==number7){
            textField2.setText(textField2.getText() + "7");
        }else if(e.getSource()==number8){
            textField2.setText(textField2.getText() + "8");
        }else if(e.getSource()==number9){
            textField2.setText(textField2.getText() + "9");
        }else if(e.getSource()==radix){
            textField2.setText(textField2.getText() + ".");
        }else if(e.getSource()==sum){
            textField2.setText(textField2.getText() + "+");
        }else if(e.getSource()==subtract){
            textField2.setText(textField2.getText() + "-");
        }else if(e.getSource()==multiply){
            textField2.setText(textField2.getText() + "*");
        }else if(e.getSource()==divide){
            textField2.setText(textField2.getText() + "/");
        }else if(e.getSource()==modulo){
            textField2.setText(textField2.getText() + "%");
        }else if(e.getSource()==ac){
            textField2.setText("");
        }
        if(e.getSource()==isEqual){
            String expression = textField2.getText();
            String[] array = new String[100];
            int i;
            for(i=0; i<expression.length(); i++){
                array[i]="";
                if(isNumber(expression.charAt(i))){
                    array[i] += expression.charAt(i);
                }else if(isOperator(expression.charAt(i))){
                    i++;
                    array[i] += expression.charAt(i);
                    i++;
                }
            }
            if(i==0) {
                textField1.setText(array[i]);
            }else{
                for(int j=0; j<i; j++){
                    if(isOperator(array[j])){
                        int num1 = Integer.parseInt(array[j-1]);
                        int num2 = Integer.parseInt(array[j+1]);
                        if(array[j]=="+"){
                            array[j-1] = "" + (num1+num2);
                            array[j]=array[j+2];
                            i-=2;
                        }
                    }
                }
            }
        }
    }

    static boolean isNumber(char c) {
        if(c>='0' && c<='9'){
            return true;
        }
        return false;
    }

    static boolean isOperator(char c) {
        if(c=='+' || c=='-' || c=='*' || c=='/' || c=='%'){
            return true;
        }
        return false;
    }

    static boolean isOperator(String c) {
        if(c=="+" || c=="-" || c=="*" || c=="/" || c=="%"){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new ScientificCalculator();
    }
}