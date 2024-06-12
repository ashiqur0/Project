
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

public class IPSSuggestorApp extends JFrame implements ActionListener {

    static JLabel title, 
    noOfLights,  noOfFans, powerUsePerlight, powerUsedPerFan, backUpTime, 
    ipsMarket, ips1L, ips2L, ips3L, ips4L, ips5L, ips6L, 
    suggestion, sug3, 
    sugIPS001, sugIPS002, sugIPS003, sugIPS004, sugIPS005, sugIPS006, 
    ips1, ips2, ips3, ips4, ips5, ips6, ipsL;
    JTextField noOfLightsTF, noOfFansTF, powerUsePerlightTF, powerUsedPerFanTF, backUpTiemTF;
    JTextArea resultTA;
    JButton check, clear, close;
    ImageIcon ips0001, ips0002, ips0003, ips0004, ips0005, ips0006;

    IPSSuggestorApp(){

        title = new JLabel("IPS Suggestor App");
        title.setBounds(350,-20,1000,150);
        title.setFont(new Font("serif", Font.BOLD, 75));
        title.setForeground(Color.MAGENTA);
        add(title);

        noOfLights = new JLabel("Number of Lights");
        noOfLights.setBounds(60,240,260,40);
        noOfLights.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        noOfLights.setForeground(Color.WHITE);
        add(noOfLights);

        noOfLightsTF = new JTextField("");
        noOfLightsTF.setBounds(320,240,260,40);
        noOfLightsTF.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        noOfLightsTF.setBorder(BorderFactory.createEmptyBorder(0, 40,0,0));
        noOfLightsTF.setForeground(Color.MAGENTA);
        add(noOfLightsTF);

        noOfFans = new JLabel("Number of Fans");
        noOfFans.setBounds(60,290,260,40);
        noOfFans.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        noOfFans.setForeground(Color.WHITE);
        add(noOfFans);

        noOfFansTF = new JTextField("");
        noOfFansTF.setBounds(320,290,260,40);
        noOfFansTF.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        noOfFansTF.setBorder(BorderFactory.createEmptyBorder(0, 40,0,0));
        noOfFansTF.setForeground(Color.MAGENTA);
        add(noOfFansTF);

        powerUsePerlight = new JLabel("Power used per light (watt)");
        powerUsePerlight.setBounds(60,340,260,40);
        powerUsePerlight.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        powerUsePerlight.setForeground(Color.WHITE);
        add(powerUsePerlight);

        powerUsePerlightTF = new JTextField("18");
        powerUsePerlightTF.setBounds(320,340,260,40);
        powerUsePerlightTF.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        powerUsePerlightTF.setBorder(BorderFactory.createEmptyBorder(0, 40,0,0));
        powerUsePerlightTF.setForeground(Color.MAGENTA);
        add(powerUsePerlightTF);

        powerUsedPerFan = new JLabel("Power used per Fan (watt)");
        powerUsedPerFan.setBounds(60,390,260,40);
        powerUsedPerFan.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        powerUsedPerFan.setForeground(Color.WHITE);
        add(powerUsedPerFan);

        powerUsedPerFanTF = new JTextField("75");
        powerUsedPerFanTF.setBounds(320,390,260,40);
        powerUsedPerFanTF.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        powerUsedPerFanTF.setBorder(BorderFactory.createEmptyBorder(0, 40,0,0));
        powerUsedPerFanTF.setForeground(Color.MAGENTA);
        add(powerUsedPerFanTF);

        backUpTime = new JLabel("BackUp Time (hours)");
        backUpTime.setBounds(60,440,260,40);
        backUpTime.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        backUpTime.setForeground(Color.WHITE);
        add(backUpTime);

        backUpTiemTF = new JTextField("");
        backUpTiemTF.setBounds(320,440,260,40);
        backUpTiemTF.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        backUpTiemTF.setBorder(BorderFactory.createEmptyBorder(0, 40,0,0));
        backUpTiemTF.setForeground(Color.MAGENTA);
        add(backUpTiemTF);

        resultTA = new JTextArea("");
        // resultTA.setBounds(60,560,520,100);
        resultTA.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        resultTA.setBorder(BorderFactory.createEmptyBorder(8, 20,5,10));
        resultTA.setForeground(Color.MAGENTA);
        add(resultTA);

        suggestion = new JLabel("You Can Buy");
        // suggestion.setBounds(670,240,300,50);
        suggestion.setFont(new Font("SAN_SARIF", Font.BOLD, 30));
        suggestion.setBorder(BorderFactory.createEmptyBorder(8, 20,5,10));
        suggestion.setForeground(Color.GREEN);
        add(suggestion);

        ipsL = new JLabel("");
        // ipsL.setBounds(670,380,300,50);
        ipsL.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        ipsL.setBorder(BorderFactory.createEmptyBorder(8, 20,5,10));
        ipsL.setForeground(Color.GREEN);
        add(ipsL);        
        
        // Suggestion1
        ImageIcon sugIPS = new ImageIcon(ClassLoader.getSystemResource("icons/ips1.PNG"));
        Image sugIPS1 = sugIPS.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);
        ImageIcon sugIPS01 = new ImageIcon(sugIPS1);
        sugIPS001 = new JLabel(sugIPS01);
        // sugIPS001.setBounds(680,280, 130, 130);
        sugIPS001.setBounds(0,0,0,0);
        add(sugIPS001);
        
        // Suggestion2
        ImageIcon sugIPS2 = new ImageIcon(ClassLoader.getSystemResource("icons/ips2.PNG"));
        Image sugIPS12 = sugIPS2.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);
        ImageIcon sugIPS012 = new ImageIcon(sugIPS12);
        sugIPS002 = new JLabel(sugIPS012);
        // sugIPS002.setBounds(680,280, 130, 130);
        sugIPS002.setBounds(0,0,0,0);
        add(sugIPS002);
        
        // Suggestion3
        ImageIcon sugIPS3 = new ImageIcon(ClassLoader.getSystemResource("icons/ips3.PNG"));
        Image sugIPS13 = sugIPS3.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);
        ImageIcon sugIPS013 = new ImageIcon(sugIPS13);
        sugIPS003 = new JLabel(sugIPS013);
        // sugIPS003.setBounds(680,280, 130, 130);
        sugIPS003.setBounds(0,0,0,0);
        add(sugIPS003);
        
        // Suggestion4
        ImageIcon sugIPS4 = new ImageIcon(ClassLoader.getSystemResource("icons/ips4.PNG"));
        Image sugIPS14 = sugIPS4.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);
        ImageIcon sugIPS014 = new ImageIcon(sugIPS14);
        sugIPS004 = new JLabel(sugIPS014);
        // sugIPS004.setBounds(680,280, 130, 130);
        sugIPS004.setBounds(0,0,0,0);
        add(sugIPS004);
        
        // Suggestion5
        ImageIcon sugIPS5 = new ImageIcon(ClassLoader.getSystemResource("icons/ips5.PNG"));
        Image sugIPS15 = sugIPS5.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);
        ImageIcon sugIPS015 = new ImageIcon(sugIPS15);
        sugIPS005 = new JLabel(sugIPS015);
        // sugIPS005.setBounds(680,280, 130, 130);
        sugIPS005.setBounds(0,0,0,0);
        add(sugIPS005);
        
        // Suggestion6
        ImageIcon sugIPS6 = new ImageIcon(ClassLoader.getSystemResource("icons/ips6.PNG"));
        Image sugIPS16 = sugIPS6.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);
        ImageIcon sugIPS016 = new ImageIcon(sugIPS16);
        sugIPS006 = new JLabel(sugIPS016);
        // sugIPS006.setBounds(680,280, 130, 130);
        sugIPS006.setBounds(0,0,0,0);
        add(sugIPS006);

        // Suggestion White Background Image:
        ImageIcon sug = new ImageIcon(ClassLoader.getSystemResource("icons/market.png"));
        Image sug1 = sug.getImage().getScaledInstance(400, 660, Image.SCALE_DEFAULT);
        ImageIcon sug2 = new ImageIcon(sug1);
        sug3 = new JLabel(sug2);
        // sug3.setBounds(640,240, 300, 250);
        add(sug3);

        // check button
        check = new JButton("Check");
        check.setBounds(60, 500, 150, 40);
        check.setBackground(Color.CYAN);
        check.setForeground(Color.MAGENTA);
        check.setFont(new Font("SANSARIF", Font.BOLD, 20));
        check.addActionListener(this);
        add(check);

        // clear button
        clear = new JButton("Clear");
        clear.setBounds(245, 500, 150, 40);
        clear.setBackground(Color.GREEN);
        clear.setForeground(Color.YELLOW);
        clear.setFont(new Font("SANSARIF", Font.BOLD, 20));
        clear.addActionListener(this);
        add(clear);

        // close button
        close = new JButton("Close");
        close.setBounds(430, 500, 150, 40);
        close.setBackground(Color.MAGENTA);
        close.setForeground(Color.CYAN);
        close.setFont(new Font("SANSARIF", Font.BOLD, 20));
        add(close);
        close.addActionListener(e -> {    // by clicking on close button: it will terminate the program
            dispose();
        });

        // IPS1 Image:
        ImageIcon ips01 = new ImageIcon(ClassLoader.getSystemResource("icons\\ips1.PNG"));
        Image ips001 = ips01.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);
        ips0001 = new ImageIcon(ips001);
        ips1 = new JLabel(ips0001);
        ips1.setBounds(1020,130, 130, 130);
        add(ips1);

        // IPS2 Image:
        ImageIcon ips02 = new ImageIcon(ClassLoader.getSystemResource("icons\\ips2.PNG"));
        Image ips002 = ips02.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);
        ips0002 = new ImageIcon(ips002);
        ips2 = new JLabel(ips0002);
        ips2.setBounds(1200,130, 130, 130);
        add(ips2);        
        
        // IPS3 Image:
        ImageIcon ips03 = new ImageIcon(ClassLoader.getSystemResource("icons\\ips3.PNG"));
        Image ips003 = ips03.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);
        ips0003 = new ImageIcon(ips003);
        ips3 = new JLabel(ips0003);
        ips3.setBounds(1020,340, 130, 130);
        add(ips3);
        
        // IPS4 Image:
        ImageIcon ips04 = new ImageIcon(ClassLoader.getSystemResource("icons\\ips4.PNG"));
        Image ips004 = ips04.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);
        ips0004 = new ImageIcon(ips004);
        ips4 = new JLabel(ips0004);
        ips4.setBounds(1200,340, 130, 130);
        add(ips4);
        
        // IPS5 Image:
        ImageIcon ips05 = new ImageIcon(ClassLoader.getSystemResource("icons\\ips5.PNG"));
        Image ips005 = ips05.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);
        ips0005 = new ImageIcon(ips005);
        ips5 = new JLabel(ips0005);
        ips5.setBounds(1020,550, 130, 130);
        add(ips5);
        
        // IPS6 Image:
        ImageIcon ips06 = new ImageIcon(ClassLoader.getSystemResource("icons\\ips6.PNG"));
        Image ips006 = ips06.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);
        ips0006 = new ImageIcon(ips006);
        ips6 = new JLabel(ips0006);
        ips6.setBounds(1200,550, 130, 130);
        add(ips6);
        
        ips1L = new JLabel("IPS1: 1.2 KWH");
        ips1L.setBounds(1030,260,310,40);
        ips1L.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        ips1L.setForeground(Color.MAGENTA);
        add(ips1L);
        
        ips2L = new JLabel("IPS2: 2.4 KWH");
        ips2L.setBounds(1200,260,310,40);
        ips2L.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        ips2L.setForeground(Color.GREEN);
        add(ips2L);
        
        ips3L = new JLabel("IPS3: 3 KWH");
        ips3L.setBounds(1030,460,310,40);
        ips3L.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        ips3L.setForeground(Color.MAGENTA);
        add(ips3L);
        
        ips4L = new JLabel("IPS4: 3.5 KWH");
        ips4L.setBounds(1200,460,310,40);
        ips4L.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        ips4L.setForeground(Color.GREEN);
        add(ips4L);
        
        ips5L = new JLabel("IPS5: 4.5 KWH");
        ips5L.setBounds(1030,670,310,40);
        ips5L.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        ips5L.setForeground(Color.MAGENTA);
        add(ips5L);
        
        ips6L = new JLabel("IPS6: 6 KWH");
        ips6L.setBounds(1200,670,310,40);
        ips6L.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        ips6L.setForeground(Color.GREEN);
        add(ips6L);
        
        ipsMarket = new JLabel("PUB IPS Market");
        ipsMarket.setBounds(1060,70,310,40);
        ipsMarket.setFont(new Font("SAN_SARIF", Font.BOLD, 30));
        ipsMarket.setForeground(Color.MAGENTA);
        add(ipsMarket);
        
        // Market White Background Image:
        ImageIcon m = new ImageIcon(ClassLoader.getSystemResource("icons/market.png"));
        Image m1 = m.getImage().getScaledInstance(400, 660, Image.SCALE_DEFAULT);
        ImageIcon m2 = new ImageIcon(m1);
        JLabel market = new JLabel(m2);
        market.setBounds(1000,60, 350, 660);
        add(market);
        
        // Logo
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icons/logo2.png"));
        setIconImage(icon.getImage());
        
        // Background Image:
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bg.jpg"));
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
        setTitle("IPS Suggestor App");
        getContentPane().setBackground(new Color(100,100,100));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    // Button: Action Perform
    @Override
    public void actionPerformed(ActionEvent e) {        
        if(e.getSource()==check){           // when clicked on check button:
            int energyRequiredForLight = Integer.parseInt("0" + noOfLightsTF.getText())*Integer.parseInt(powerUsePerlightTF.getText());
            int energyRequiredForFan = Integer.parseInt("0" + noOfFansTF.getText())*Integer.parseInt(powerUsedPerFanTF.getText());
            int backUpHour = Integer.parseInt("0" + backUpTiemTF.getText());
            int totalEnergyRequired = (energyRequiredForLight+energyRequiredForFan)*backUpHour;
            resultTA.setBounds(60,560,520,100);
            resultTA.setText("Total Power Consumption: " + totalEnergyRequired + "  watt\n" + "BackUp Time: " + backUpHour + "  hour\n"  + "Required IPS Capacity atleast: " + totalEnergyRequired + "  watt or higher");

            suggestion.setBounds(680,240,300,50);
            sug3.setBounds(640,240, 300, 240);

            String capacity = "";
            if(totalEnergyRequired>=0 && totalEnergyRequired<=1200){
                capacity = "IPS1: 1.2 KWH";
                clearImage();
                sugIPS001.setBounds(720,300, 130, 130);
            }else if(totalEnergyRequired>1200 && totalEnergyRequired<=2400){
                capacity = "IPS2: 2.4 KWH";
                clearImage();
                sugIPS002.setBounds(720,300, 130, 130);
            }else if(totalEnergyRequired>2400 && totalEnergyRequired<=3000){
                capacity = "IPS3: 3 KWH";
                clearImage();
                sugIPS003.setBounds(720,300, 130, 130);
            }else if(totalEnergyRequired>3000 && totalEnergyRequired<=3500){
                capacity = "IPS4: 3.5 KWH";
                clearImage();
                sugIPS004.setBounds(720,300, 130, 130);
            }else if(totalEnergyRequired>3500 && totalEnergyRequired<=4500){
                capacity = "IPS5: 4.5 KWH";
                clearImage();
                sugIPS005.setBounds(720,300, 130, 130);
            }else if(totalEnergyRequired>4500){
                capacity = "IPS6: 6 KWH";
                clearImage();
                sugIPS006.setBounds(720,300, 130, 130);
            }

            ipsL.setText(capacity);
            ipsL.setBounds(700,380,300,130);
        }else if(e.getSource()==clear){     // When ckicked on clear button:
            noOfLightsTF.setText("");
            noOfFansTF.setText("");
            powerUsePerlightTF.setText("18");
            powerUsedPerFanTF.setText("75");
            backUpTiemTF.setText("");
            resultTA.setText("");

            resultTA.setBounds(0,0,0,0);
            suggestion.setBounds(0,0,0,0);
            sug3.setBounds(0,0,0,0);
            ipsL.setBounds(0,0,0,0);
            clearImage();
        }
    }

    static void clearImage(){
        sugIPS001.setBounds(0,0,0,0);
        sugIPS002.setBounds(0,0,0,0);
        sugIPS003.setBounds(0,0,0,0);
        sugIPS004.setBounds(0,0,0,0);
        sugIPS005.setBounds(0,0,0,0);
        sugIPS006.setBounds(0,0,0,0);
    }

    public static void main(String[] args) {
        new IPSSuggestorApp();
    }
}