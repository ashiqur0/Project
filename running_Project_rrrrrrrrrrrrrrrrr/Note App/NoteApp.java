import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * NoteApp
 */
public class NoteApp extends JFrame implements ActionListener {

    JLabel title;
    JButton newNote;
    JTextField fileName;
    static JTextArea viewNote, noteWirte;
    int noteNum=0;

    NoteApp(){

        title = new JLabel("Daily Note");
        title.setBounds(450,0,1200,100);
        title.setFont(new Font("serif", Font.BOLD, 75));
        title.setForeground(Color.ORANGE);
        add(title);
        
        newNote = new JButton("New Note");
        newNote.setBounds(200,160,150,40);
        newNote.setFont(new Font("Tahoma", Font.BOLD, 15));
        newNote.setBackground(Color.WHITE);           
        newNote.setForeground(Color.MAGENTA);
        newNote.addActionListener(this);
        add(newNote);

        fileName = new JTextField("");
        fileName.setBounds(360,160,260,40);
        fileName.setFont(new Font("Tahoma", Font.BOLD, 20));
        fileName.setForeground(Color.BLACK);
        add(fileName);
        
        noteWirte = new JTextArea("");
        noteWirte.setBounds(630,160,500,200);
        noteWirte.setFont(new Font("Tahoma", Font.BOLD, 20));
        noteWirte.setForeground(Color.BLACK);
        add(new JScrollPane(noteWirte), BorderLayout.CENTER);
        add(noteWirte);

        viewNote = new JTextArea("");
        viewNote.setBounds(630,370,500,200);
        viewNote.setFont(new Font("Tahoma", Font.BOLD, 20));
        viewNote.setForeground(Color.BLACK);
        add(new JScrollPane(viewNote), BorderLayout.CENTER);
        add(viewNote);

        setTitle("Note App");
        setBounds(-5,0,1386,768);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(new Color(100,100,100));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==newNote){
            String fileName2 = fileName.getText();
            noteNum++;
            String path = ""+fileName2+noteNum+".txt";
            noteWrite(path);
            noteRead();
        }
    }

    static void noteWrite(String path){
        try (FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write(noteWirte.getText());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void noteRead(){
        String filePath = "1.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line="";
            String note = "";
            while ((line = bufferedReader.readLine()) != null) {
                note += line;
            }
            viewNote.setText(note);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new NoteApp();
    }
}