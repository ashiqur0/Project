import javax.swing.*;
import java.awt.*;

public class N {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Note App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Create a JTextArea for displaying the note content
            JTextArea textArea = new JTextArea();
            textArea.setLineWrap(true); // Enable line wrapping
            textArea.setWrapStyleWord(true); // Wrap at word boundaries

            // Add the JTextArea to the frame
            frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

            // Display the frame
            frame.setVisible(true);
        });
    }
}
