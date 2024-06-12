package src;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ArticleAndWordCounterApp extends JFrame implements ActionListener {

    JLabel title, nowL, noaL;
    JTextArea textArea;
    JButton count, clear, close;
    JTextField now, noa;

    ArticleAndWordCounterApp(){

        title = new JLabel("Article and Word Counter App");
        title.setBounds(180,-20,1200,150);
        title.setFont(new Font("serif", Font.BOLD, 75));
        title.setForeground(new Color(254, 194, 96));
        add(title);

        textArea = new JTextArea("");
        textArea.setBounds(600, 150, 700, 300);
        textArea.setBackground(Color.WHITE);    
        textArea.setForeground(Color.MAGENTA);
        textArea.setFont(new Font("SAN_SARIF", Font.PLAIN, 14));
        textArea.setBorder(BorderFactory.createEmptyBorder(20, 20,20,20));
        textArea.setLineWrap(true);
        add(textArea);
        
        now = new JTextField("");
        now.setBounds(400, 150, 120, 40);
        now.setBackground(Color.WHITE);    
        now.setForeground(Color.MAGENTA);
        now.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        // now.setHorizontalAlignment(JTextField.CENTER);
        now.setBorder(BorderFactory.createEmptyBorder(0, 0,0,40));
        now.setHorizontalAlignment(JTextField.RIGHT);
        add(now);
        
        nowL = new JLabel("No. of Word: ");
        nowL.setBounds(180, 150, 220, 50);
        nowL.setBackground(Color.WHITE);    
        nowL.setForeground(Color.MAGENTA);
        nowL.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        add(nowL);
        
        noa = new JTextField("");
        noa.setBounds(400, 200, 120, 40);
        noa.setBackground(Color.WHITE);    
        noa.setForeground(Color.MAGENTA);
        noa.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        noa.setBorder(BorderFactory.createEmptyBorder(0, 0,0,40));
        noa.setHorizontalAlignment(JTextField.RIGHT);
        add(noa);
        
        noaL = new JLabel("No. of Article: ");
        noaL.setBounds(180, 200, 220, 50);
        noaL.setBackground(Color.WHITE);    
        noaL.setForeground(Color.MAGENTA);
        noaL.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        add(noaL);
        
        count = new JButton("Count");
        count.setBounds(320, 500, 150, 40);
        count.setBackground(Color.CYAN);
        count.setForeground(Color.MAGENTA);
        count.setFont(new Font("SANSARIF", Font.BOLD, 20));
        count.addActionListener(this);
        add(count);

        
        clear = new JButton("Clear");
        clear.setBounds(500, 500, 150, 40);
        clear.setBackground(Color.GREEN);
        clear.setForeground(Color.YELLOW);
        clear.setFont(new Font("SANSARIF", Font.BOLD, 20));
        clear.addActionListener(this);
        add(clear);

        close = new JButton("Close");
        close.setBounds(680, 500, 150, 40);
        close.setBackground(Color.MAGENTA);
        close.setForeground(Color.GREEN);
        close.setFont(new Font("SANSARIF", Font.BOLD, 20));
        add(close);
        close.addActionListener(e -> {
            dispose();
        });

        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icons/icon.png"));
        setIconImage(icon.getImage());

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/picture1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1386, 768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 1386, 768);
        add(image); 

        // Frame Design:
        setBounds(-5,0,1386,768);    // size and position
        setResizable(false);               // resize off
        setLayout(null);
        setVisible(true);                          // allow to visible
        setTitle("Article and Word Counter App");
        getContentPane().setBackground(new Color(100,100,100));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==count){
            String[] row = textArea.getText().split(" ");
            now.setText(""+row.length);

            int noOfArticle = 0;
            for(int i=0; i<row.length; i++){
                if(isArticle(row[i])){
                    noOfArticle++;
                }
            }
            noa.setText(""+noOfArticle);
        }else if(e.getSource()==clear){
            textArea.setText("");
            now.setText("");
            noa.setText("");
        }
    }

    static boolean isArticle(String str) {
        if(str.equalsIgnoreCase("a") || str.equalsIgnoreCase("an") || str.equalsIgnoreCase("the")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new ArticleAndWordCounterApp();
    }
}