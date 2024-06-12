package src;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

class UniversityVotingApp extends JFrame implements ActionListener{

    static JLabel titleLabel, messageLaJLabel, departmentLabel, batchLabel, rollLabel;
    JComboBox<String> departmentComboBox, batchComboBox, rollComboBox;
    static JRadioButton alimJRadioButton, risaJRadioButton, samiulJRadioButton, muradJRadioButton;
    ButtonGroup group;
    static JTextArea resulJTextArea, welcomeMessageJTextArea;
    static JButton resultJButton, clearJButton, closeJButton, yesJButton, noJButton, voteJButton;
    static int alimsVote = 0, raisasVote = 0, samiulsVote = 0, muradsVote = 0;
    static String[][] selector = new String[5000][4];
    static int i=0;

    UniversityVotingApp(){

        titleLabel = new JLabel("Pundra University Voting App");
        titleLabel.setBounds(200,-20,1200,150);
        titleLabel.setFont(new Font("serif", Font.BOLD, 75));
        titleLabel.setForeground(new Color(20,0,124));
        add(titleLabel);
        
        String message = "VP Eletion Spring 2024 is Going on. Please follow the procedure to vote your favorite candidate.";
        messageLaJLabel = new JLabel(message);
        // messageLaJLabel.setBounds(0,0,0,0);
        messageLaJLabel.setBounds(150,120,1200,50);
        messageLaJLabel.setFont(new Font("SAN_SARIF", Font.PLAIN, 18));
        messageLaJLabel.setForeground(new Color(122,0,2));
        messageLaJLabel.setForeground(Color.MAGENTA);
        add(messageLaJLabel);
        
        departmentLabel = new JLabel("Department");
        departmentLabel.setBounds(0,0,0,0);
        // departmentLabel.setBounds(120,160,520,50);
        departmentLabel.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        departmentLabel.setForeground(new Color(122,0,2));
        add(departmentLabel);
        
        batchLabel = new JLabel("Batch");
        batchLabel.setBounds(0,0,0,0);
        // batchLabel.setBounds(700,160,200,50);
        batchLabel.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        batchLabel.setForeground(new Color(122,0,2));
        add(batchLabel);
        
        rollLabel = new JLabel("Roll");
        rollLabel.setBounds(0,0,0,0);
        // rollLabel.setBounds(960,160,250,50);
        rollLabel.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        rollLabel.setForeground(new Color(122,0,2));
        add(rollLabel);
        
        String[] selectD = {"    Business Adminstration", "    Electrical & Electronic Engineering", "    Computer Science & Engineering", "    Civil Engineering", "    Electrical & Communication Engineering", "    Public Helth", "    Islamin Studies", "    English", "    Education"};
        departmentComboBox = new JComboBox<String>(selectD);
        departmentComboBox.setBounds(0,0,0,0);
        // departmentComboBox.setBounds(120, 203, 520, 33);
        departmentComboBox.setBackground(new Color(27,134,69));
        departmentComboBox.setForeground(Color.YELLOW);
        departmentComboBox.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(departmentComboBox);
        
        String[] Batch = new String[31];
        Batch[0] = "    1st";
        Batch[1] = "    2nd";
        Batch[2] = "    3rd";
        for(int i=3; i<31; Batch[i]= "    " + (++i) + "th");
        batchComboBox = new JComboBox<String>(Batch);
        batchComboBox.setBounds(0,0,0,0);
        // batchComboBox.setBounds(700, 203, 200, 33);        
        batchComboBox.setBackground(new Color(27,134,69));
        batchComboBox.setForeground(Color.YELLOW);
        batchComboBox.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(batchComboBox);
        
        String[] rollNo = new String[70];
        for(int i=0; i<70; rollNo[i]= "    " + (++i));
        rollComboBox = new JComboBox<String>(rollNo);
        rollComboBox.setBounds(0,0,0,0);
        // rollComboBox.setBounds(960, 203, 250, 33);
        rollComboBox.setBackground(new Color(27,134,69));      
        rollComboBox.setForeground(Color.YELLOW);        
        rollComboBox.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(rollComboBox);
        
        group = new ButtonGroup();
        
        alimJRadioButton = new JRadioButton("Alim");
        alimJRadioButton.setBounds(0,0,0,0);
        // alimJRadioButton.setBounds(770,330,200,100);
        alimJRadioButton.setFont(new Font("SAN_SARIF", Font.BOLD, 30));
        alimJRadioButton.setBackground(Color.WHITE); 
        alimJRadioButton.setForeground(Color.MAGENTA); 
        alimJRadioButton.setBorder(BorderFactory.createEmptyBorder(0, 40,0,0));
        alimJRadioButton.addActionListener(this);
        add(alimJRadioButton);
        group.add(alimJRadioButton);
        
        risaJRadioButton = new JRadioButton("Raisa");
        risaJRadioButton.setBounds(0,0,0,0);
        // risaJRadioButton.setBounds(1010,330,200,100);
        risaJRadioButton.setFont(new Font("SAN_SARIF", Font.BOLD, 30));
        risaJRadioButton.setBackground(Color.WHITE);
        risaJRadioButton.setForeground(Color.MAGENTA);
        risaJRadioButton.setBorder(BorderFactory.createEmptyBorder(0, 40,0,0));
        risaJRadioButton.addActionListener(this);
        add(risaJRadioButton);
        group.add(risaJRadioButton);
        
        samiulJRadioButton = new JRadioButton("Samiul");
        samiulJRadioButton.setBounds(0,0,0,0);
        // samiulJRadioButton.setBounds(770,470,200,100);
        samiulJRadioButton.setFont(new Font("SAN_SARIF", Font.BOLD, 30));
        samiulJRadioButton.setBackground(Color.WHITE);
        samiulJRadioButton.setForeground(Color.MAGENTA);
        samiulJRadioButton.setBorder(BorderFactory.createEmptyBorder(0, 40,0,0));
        samiulJRadioButton.addActionListener(this);
        add(samiulJRadioButton);
        group.add(samiulJRadioButton);
        
        muradJRadioButton = new JRadioButton("Murad");
        muradJRadioButton.setBounds(0,0,0,0);
        // muradJRadioButton.setBounds(1010,470,200,100);
        muradJRadioButton.setFont(new Font("SAN_SARIF", Font.BOLD, 30));
        muradJRadioButton.setBackground(Color.WHITE);        
        muradJRadioButton.setForeground(Color.MAGENTA);        
        muradJRadioButton.setBorder(BorderFactory.createEmptyBorder(0, 40,0,0));
        muradJRadioButton.addActionListener(this);
        add(muradJRadioButton);
        group.add(muradJRadioButton);
        
        // yesJButton
        yesJButton = new JButton("Yes");
        yesJButton.setBounds(480, 680, 150, 40);
        yesJButton.setBackground(Color.CYAN);
        yesJButton.setForeground(Color.MAGENTA);
        yesJButton.setFont(new Font("SANSARIF", Font.BOLD, 20));
        yesJButton.addActionListener(this);
        add(yesJButton);
        
        // noJButton
        noJButton = new JButton("No");
        noJButton.setBounds(710, 680, 150, 40);
        noJButton.setBackground(Color.MAGENTA);
        noJButton.setForeground(Color.GREEN);
        noJButton.setFont(new Font("SANSARIF", Font.BOLD, 20));
        noJButton.addActionListener(this);
        add(noJButton);
        
        // resultButton
        resultJButton = new JButton("Result");
        resultJButton.setBounds(0, 0, 0, 0);
        // resultJButton.setBounds(120, 630, 150, 40);
        resultJButton.setBackground(Color.CYAN);
        resultJButton.setForeground(Color.MAGENTA);
        resultJButton.setFont(new Font("SANSARIF", Font.BOLD, 20));
        resultJButton.addActionListener(this);
        add(resultJButton);
        
        // clearJButton
        clearJButton = new JButton("Clear");
        clearJButton.setBounds(5, 0, 0, 0);
        // clearJButton.setBounds(305, 630, 150, 40);
        clearJButton.setBackground(Color.GREEN);
        clearJButton.setForeground(Color.YELLOW);
        clearJButton.setFont(new Font("SANSARIF", Font.BOLD, 20));
        clearJButton.addActionListener(this);
        add(clearJButton);
        
        // closeJButton
        closeJButton = new JButton("Close");
        closeJButton.setBounds(0, 0, 0, 0);
        // closeJButton.setBounds(490, 630, 150, 40);
        closeJButton.setBackground(Color.MAGENTA);
        closeJButton.setForeground(Color.CYAN);
        closeJButton.setFont(new Font("SANSARIF", Font.BOLD, 20));
        add(closeJButton);
        closeJButton.addActionListener(e -> {    // by clicking on close button: it will terminate the program
            dispose();
        });

        // voteJButton
        voteJButton = new JButton("Vote");
        voteJButton.setBounds(0, 0, 0, 0);
        // voteJButton.setBounds(675, 630, 150, 40);
        voteJButton.setBackground(Color.GREEN);
        voteJButton.setForeground(Color.YELLOW);
        voteJButton.setFont(new Font("SANSARIF", Font.BOLD, 20));
        voteJButton.addActionListener(this);
        add(voteJButton);
        
        String welcomeMessage = "WELCOME TO\nPUNDRA UNIVERSITY\nVOTING APP\nWant to Vote?";
        welcomeMessageJTextArea = new JTextArea(welcomeMessage);
        welcomeMessageJTextArea.setBounds(120,130, 1110, 550);
        // welcomeMessageJTextArea.setBounds(0,0,0,0);
        welcomeMessageJTextArea.setBorder(BorderFactory.createEmptyBorder(10, 40,10,10));
        welcomeMessageJTextArea.setFont(new Font("SAN_SARIF", Font.BOLD, 100));
        welcomeMessageJTextArea.setForeground(Color.GREEN);
        add(welcomeMessageJTextArea);
        
        resulJTextArea = new JTextArea("");
        // resulJTextArea.setBounds(120,330, 520, 240);
        resulJTextArea.setBounds(0,0,0,0);
        resulJTextArea.setBorder(BorderFactory.createEmptyBorder(10, 40,10,10));
        resulJTextArea.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        resulJTextArea.setForeground(Color.GREEN);
        add(resulJTextArea);
        
        // Suggestion White Background Image:
        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image logo1 = logo.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon logo2 = new ImageIcon(logo1);
        JLabel logo3 = new JLabel(logo2);
        logo3.setBounds(100,20, 70, 70);
        add(logo3);
        
        // Icon:
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icons/icon.png"));
        setIconImage(icon.getImage());

        // Background Image:
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/background.png"));
        Image i2 = i1.getImage().getScaledInstance(1386, 768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,120, 1386, 768);
        add(image); 
        
        // Frame design
        setTitle("University Voting App");
        setBounds(-5, 0, 1386, 768);
        setLayout(null);
        // setLayout(new FlowLayout());
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==yesJButton){
            resulJTextArea.setText("Select your identity and click on \'Vote\' button");
            resulJTextArea.setBounds(120,330, 520, 240);

            yesJButton.setBounds(0,0,0,0);
            noJButton.setBounds(0,0,0,0);

            
            rollComboBox.setBounds(960, 203, 250, 33);
            batchComboBox.setBounds(700, 203, 200, 33);
            departmentComboBox.setBounds(120, 203, 520, 33);
            rollLabel.setBounds(960,160,250,50);
            batchLabel.setBounds(700,160,200,50);
            departmentLabel.setBounds(120,160,520,50);
            
            messageLaJLabel.setBounds(0,0,0,0);
            welcomeMessageJTextArea.setBounds(0,0,0,0);
            voteJButton.setBounds(675, 630, 150, 40);
            
        }else if(e.getSource()==noJButton){
            dispose();
        }else if(e.getSource()==voteJButton){
            
            resulJTextArea.setBounds(0,0,0,0);
            String selectedDepartment = ((String)departmentComboBox.getSelectedItem()).substring(4);
            String selectedBatch = ((String)batchComboBox.getSelectedItem()).substring(4);
            String selectedRoll = ((String)rollComboBox.getSelectedItem()).substring(4);
            boolean isVoted = false;
            isVoted(selectedDepartment, selectedBatch, selectedRoll);
            for(int j=0; j<5; j++){
                if(selectedDepartment==selector[j][0] && selectedBatch==selector[j][1] && selectedRoll==selector[j][2]){
                    isVoted=true;
                }
            }
            
            if(isVoted){
                resulJTextArea.setText("You already voted");
                resulJTextArea.setBounds(120,330, 520, 240);
            }else{
                resulJTextArea.setText("Please vote your Favorite candidate");
                resulJTextArea.setBounds(120,330, 520, 240);
                
                muradJRadioButton.setBounds(1010,470,200,100);
                samiulJRadioButton.setBounds(770,470,200,100);
                risaJRadioButton.setBounds(1010,330,200,100);
                alimJRadioButton.setBounds(770,330,200,100);                
            }
        }if(e.getSource()==alimJRadioButton){
            resulJTextArea.setText("Your vote is successfully taken");
            resulJTextArea.setBounds(120,330, 520, 240);
            String selectedDepartment = ((String)departmentComboBox.getSelectedItem()).substring(4);
            String selectedBatch = ((String)batchComboBox.getSelectedItem()).substring(4);
            String selectedRoll = ((String)rollComboBox.getSelectedItem()).substring(4);

            if(!isVoted(selectedDepartment, selectedBatch, selectedRoll)){
                storeData(selectedDepartment, selectedBatch, selectedRoll, "samiul");
            }else{
                resulJTextArea.setText("You are already voted");
            }

            resultJButton.setBounds(120, 630, 150, 40);
            clearJButton.setBounds(305, 630, 150, 40);
            closeJButton.setBounds(490, 630, 150, 40);
            clear();
            alimsVote++;
            alimJRadioButton.setBackground(Color.GREEN);
        }else if(e.getSource()==risaJRadioButton){
            resulJTextArea.setText("Your vote is successfully taken");
            resulJTextArea.setBounds(120,330, 520, 240);
            String selectedDepartment = ((String)departmentComboBox.getSelectedItem()).substring(4);
            String selectedBatch = ((String)batchComboBox.getSelectedItem()).substring(4);
            String selectedRoll = ((String)rollComboBox.getSelectedItem()).substring(4);

            if(!isVoted(selectedDepartment, selectedBatch, selectedRoll)){
                storeData(selectedDepartment, selectedBatch, selectedRoll, "samiul");
            }else{
                resulJTextArea.setText("You are already voted");
            }

            resultJButton.setBounds(120, 630, 150, 40);
            clearJButton.setBounds(305, 630, 150, 40);
            closeJButton.setBounds(490, 630, 150, 40);
            clear();
            risaJRadioButton.setBackground(Color.GREEN);
        }else if(e.getSource()==samiulJRadioButton){
            resulJTextArea.setText("Your vote is successfully taken");
            resulJTextArea.setBounds(120,330, 520, 240);
            String selectedDepartment = ((String)departmentComboBox.getSelectedItem()).substring(4);
            String selectedBatch = ((String)batchComboBox.getSelectedItem()).substring(4);
            String selectedRoll = ((String)rollComboBox.getSelectedItem()).substring(4);

            if(!isVoted(selectedDepartment, selectedBatch, selectedRoll)){
                storeData(selectedDepartment, selectedBatch, selectedRoll, "samiul");
            }else{
                resulJTextArea.setText("You are already voted");
            }

            resultJButton.setBounds(120, 630, 150, 40);
            clearJButton.setBounds(305, 630, 150, 40);
            closeJButton.setBounds(490, 630, 150, 40);
            clear();
            samiulJRadioButton.setBackground(Color.GREEN);
        }else if(e.getSource()==muradJRadioButton){   
            resulJTextArea.setText("Your vote is successfully taken");
            resulJTextArea.setBounds(120,330, 520, 240); 
            String selectedDepartment = ((String)departmentComboBox.getSelectedItem()).substring(4);
            String selectedBatch = ((String)batchComboBox.getSelectedItem()).substring(4);
            String selectedRoll = ((String)rollComboBox.getSelectedItem()).substring(4);

            if(!isVoted(selectedDepartment, selectedBatch, selectedRoll)){
                storeData(selectedDepartment, selectedBatch, selectedRoll, "samiul");
            }else{
                resulJTextArea.setText("You are already voted");
            }

            resultJButton.setBounds(120, 630, 150, 40);
            clearJButton.setBounds(305, 630, 150, 40);
            closeJButton.setBounds(490, 630, 150, 40);
            clear();
            muradJRadioButton.setBackground(Color.GREEN);
        }else if(e.getSource()==resultJButton){            
            String result = "                               Result\n\n\nAlim: " + alimsVote + "\nRaisa: " + raisasVote + "\nSamiul: " + samiulsVote + "\nMurad: " + muradsVote;
            resulJTextArea.setText(result);
            resulJTextArea.setBounds(120,330, 520, 240);
        }else if(e.getSource()==clearJButton){            
            alimsVote = 0;
            raisasVote = 0;
            samiulsVote = 0;
            muradsVote = 0;
            clear();
        }
    }

    static void clear(){
        alimJRadioButton.setBackground(Color.WHITE);
        risaJRadioButton.setBackground(Color.WHITE);
        samiulJRadioButton.setBackground(Color.WHITE);
        muradJRadioButton.setBackground(Color.WHITE);
        alimJRadioButton.setBounds(0,0,0,0);
        risaJRadioButton.setBounds(0,0,0,0);
        samiulJRadioButton.setBounds(0,0,0,0);
        muradJRadioButton.setBounds(0,0,0,0);
        resulJTextArea.setText("");
        resulJTextArea.setBounds(0,0,0,0);
    }

    // File writter program:
    static void storeData(String deparment, String batch, String roll, String candidate){
        try(FileWriter writer = new FileWriter("data/data.csv", true)){
            writer.write(deparment + "," + batch + "," + roll + "," + candidate + System.lineSeparator());
        }catch(IOException e){
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // CVS file read:
    static boolean isVoted(String selectedDepartment, String selectedBatch, String selectedRoll){

        String file = "data/data.csv";
        BufferedReader reader = null;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                int m=0;
                for(int j=0; j<4; j++){
                    selector[i][j] = row[m++];
                }

                if(selectedDepartment==selector[i][0] && selectedBatch== selector[i][0] && selectedRoll==selector[i][2]){
                    return true;
                }

                i++;
            }
            i=0;
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new UniversityVotingApp();
    }
}