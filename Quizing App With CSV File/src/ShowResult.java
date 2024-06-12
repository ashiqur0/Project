package src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ShowResult extends JFrame implements ActionListener {

    JButton back, close;
    JLabel result, percentage;

    ShowResult(){
        
        JLabel title = new JLabel("Quizing App with CSV File");
        title.setBounds(260,-20,1200,150);
        title.setFont(new Font("serif", Font.BOLD, 75));
        title.setForeground(Color.CYAN);
        add(title);

        result = new JLabel("  Result: " + QuizingApp.result + "/28");
        result.setBounds(370,270,800,50);
        result.setFont(new Font("Tahoma", Font.BOLD, 30));
        result.setForeground(Color.WHITE);
        add(result);

        double p = Math.round((100.0/28)*QuizingApp.result);
        percentage = new JLabel("  Percentage: " + p);
        percentage.setBounds(370,340,800,50);
        percentage.setFont(new Font("Tahoma", Font.BOLD, 30));
        percentage.setForeground(Color.WHITE);
        add(percentage);
        
        back = new JButton("Back To Quiz");
        back.setBounds(500, 600, 180, 40);
        back.setBackground(Color.CYAN);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("SANSARIF", Font.BOLD, 20));
        back.addActionListener(this);
        add(back);
        
        close = new JButton("Close");
        close.setBounds(700, 600, 180, 40);
        close.setBackground(Color.MAGENTA);
        close.setForeground(Color.BLACK);
        close.setFont(new Font("SANSARIF", Font.BOLD, 20));
        close.addActionListener(this);
        add(close);

        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icons/Picture1.png"));
        setIconImage(icon.getImage());

        setTitle("Quizing App With Database");
        setBounds(-5, 0, 1386, 768);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(new Color(100,100,100));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            new QuizingApp();
            dispose();
        }else if(e.getSource()==close){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new ShowResult();
    }
    
}
