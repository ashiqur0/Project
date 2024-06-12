package src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class QuizingApp extends JFrame implements ActionListener {

    JLabel title, questionTitle, question;
    JButton previous, next;
    JRadioButton choice1, choice2, choice3, choice4;
    ButtonGroup group = new ButtonGroup();
    String[][] questionArr = new String[28][5];
    int i=0;
    public static int[] solution = {3,4,3,1,4,1,2,4,2,1,3,4,2,1,2,3,1,1,3,2,4,1,2,1,3,1,4,2};
    public static int result = 0;

    QuizingApp(){

        // CVS file read:
        String file = "src\\QuizeQuestion.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                int m=0;
                for(int j=0; j<5; j++){
                    questionArr[i][j] = row[m++];
                }
                i++;
            }
            i=0;
        } catch(Exception e) {
            
        } finally {
            try {
                reader.close();
            } catch(Exception e){

            }
        }

        // Interface design:
        title = new JLabel("Quizing App with CSV File");
        title.setBounds(260,-20,1200,150);
        title.setFont(new Font("serif", Font.BOLD, 75));
        title.setForeground(Color.CYAN);
        add(title);

        questionTitle = new JLabel("Question 1:");
        questionTitle.setBounds(180,160,200,50);
        questionTitle.setFont(new Font("Tahoma", Font.BOLD, 30));
        questionTitle.setForeground(Color.WHITE);
        add(questionTitle);

        question = new JLabel(questionArr[0][0]);
        question.setBounds(400,160,950,50);
        question.setFont(new Font("serif", Font.BOLD, 25));
        question.setForeground(Color.WHITE);
        add(question);

        choice1 = new JRadioButton("  " + questionArr[0][1]);
        choice1.setBounds(380,230,800,40);
        choice1.setFont(new Font("serif", Font.PLAIN, 20));
        choice1.setForeground(Color.BLACK);
        choice1.addActionListener(this);
        add(choice1);
        group.add(choice1);

        choice2 = new JRadioButton("  " + questionArr[0][2]);
        choice2.setBounds(380,290,800,40);
        choice2.setFont(new Font("serif", Font.PLAIN, 20));
        choice2.setForeground(Color.BLACK);
        choice2.addActionListener(this);
        add(choice2);
        group.add(choice2);

        choice3 = new JRadioButton("  " + questionArr[0][3]);
        choice3.setBounds(380,350,800,40);
        choice3.setFont(new Font("serif", Font.PLAIN, 20));
        choice3.setForeground(Color.BLACK);
        choice3.addActionListener(this);
        add(choice3);
        group.add(choice3);

        choice4 = new JRadioButton("  " + questionArr[0][4]);
        choice4.setBounds(380,410,800,40);
        choice4.setFont(new Font("serif", Font.PLAIN, 20));
        choice4.setForeground(Color.BLACK);
        choice4.addActionListener(this);
        add(choice4);
        group.add(choice4);

        previous = new JButton("Previous");
        previous.setBounds(500, 600, 180, 40);
        previous.setBackground(Color.CYAN);
        previous.setForeground(Color.BLACK);
        previous.setFont(new Font("SANSARIF", Font.BOLD, 30));
        previous.addActionListener(this);
        add(previous);

        next = new JButton("Next");
        next.setBounds(700, 600, 180, 40);
        next.setBackground(Color.GREEN);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("SANSARIF", Font.BOLD, 30));
        next.addActionListener(this);
        add(next);

        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icons/Picture1.png"));
        setIconImage(icon.getImage());

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Picture3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1386, 768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 1386, 768);
        add(image);        

        setTitle("Quizing App With Database");
        setBounds(-5, 0, 1386, 768);
        setLayout(null);
        setVisible(true);
        // getContentPane().setBackground(new Color(100,100,100));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int w = i;
        if(e.getSource()==choice1){
            if(solution[i]==1 && w==i){
                result++;
                w++;
            }
            choice1.setBackground(Color.green);
            choice2.setBackground(Color.WHITE);
            choice3.setBackground(Color.WHITE);
            choice4.setBackground(Color.WHITE);
            
        }else if(e.getSource()==choice2){
            if(solution[i]==2 && w==i){
                result++;
                w++;
            }
            choice1.setBackground(Color.WHITE);
            choice2.setBackground(Color.green);
            choice3.setBackground(Color.WHITE);
            choice4.setBackground(Color.WHITE);
            
        }else if(e.getSource()==choice3){
            if(solution[i]==3 && w==i){
                result++;
                w++;
            }
            choice1.setBackground(Color.WHITE);
            choice2.setBackground(Color.WHITE);
            choice3.setBackground(Color.green);
            choice4.setBackground(Color.WHITE);
            
        }else if(e.getSource()==choice4){
            if(solution[i]==4 && w==i){
                result++;
                w++;
            }
            choice1.setBackground(Color.WHITE);
            choice2.setBackground(Color.WHITE);
            choice3.setBackground(Color.WHITE);
            choice4.setBackground(Color.green);

        }else if(e.getSource()==next){
            if(i==27){
                new ShowResult();
                dispose();
            }
            if(i>26) i=26;
            ++i;
            questionTitle.setText("Question " + (i+1) + ":");
            question.setText("  " + questionArr[i][0]);
            choice1.setText("  " + questionArr[i][1]);
            choice2.setText("  " + questionArr[i][2]);
            choice3.setText("  " + questionArr[i][3]);
            choice4.setText("  " + questionArr[i][4]);
            
            choice1.setBackground(Color.WHITE);
            choice2.setBackground(Color.WHITE);
            choice3.setBackground(Color.WHITE);
            choice4.setBackground(Color.WHITE);

        }else if(e.getSource()==previous){
            if(i<1) i=1;
            --i;
            questionTitle.setText("Question " + (i+1) + ":");
            question.setText("  " + questionArr[i][0]);
            choice1.setText("  " + questionArr[i][1]);
            choice2.setText("  " + questionArr[i][2]);
            choice3.setText("  " + questionArr[i][3]);
            choice4.setText("  " + questionArr[i][4]);
            
            choice1.setBackground(Color.WHITE);
            choice2.setBackground(Color.WHITE);
            choice3.setBackground(Color.WHITE);
            choice4.setBackground(Color.WHITE);
        }
    }

    public static void main(String[] args) {
        new QuizingApp();
    }
}