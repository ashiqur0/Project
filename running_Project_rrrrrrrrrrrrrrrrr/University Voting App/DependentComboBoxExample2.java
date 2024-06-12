import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DependentComboBoxExample2 extends JFrame {
    
    private JComboBox<String> countryComboBox;
    private JComboBox<String> stateComboBox;

    public DependentComboBoxExample2() {
        
        // Create the country combo box
        countryComboBox = new JComboBox<>();
        countryComboBox.addItem("USA");
        countryComboBox.addItem("Canada");
        countryComboBox.addItem("UK");
        
        stateComboBox = new JComboBox<>();
        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                if (selectedCountry != null) {
                    stateComboBox.removeAllItems();
                    if ("USA".equals(selectedCountry)) {
                        stateComboBox.addItem("California");
                        stateComboBox.addItem("New York");
                    } else if ("Canada".equals(selectedCountry)) {
                        stateComboBox.addItem("Ontario");
                        stateComboBox.addItem("Quebec");
                    } else if ("UK".equals(selectedCountry)) {
                        stateComboBox.addItem("England");
                        stateComboBox.addItem("Scotland");
                    }
                } else {
                    stateComboBox.setEnabled(false);
                }
            }
        });
        
        countryComboBox.setBounds(10,10,150,40);
        countryComboBox.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        countryComboBox.setForeground(new Color(122,0,2));
        add(countryComboBox);

        countryComboBox.setBounds(180,10,150,40);
        countryComboBox.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        stateComboBox.setForeground(new Color(122,0,2));
        add(stateComboBox);        
        
        setTitle("Dependent JComboBox Example");
        setBounds(0, 0, 700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new DependentComboBoxExample2();
    }
}
