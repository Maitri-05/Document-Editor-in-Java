package documenteditor;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class InsertImage extends JButton {

    public InsertImage(JLabel photo) {
             // Create the JFrame
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Insert Image Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);
            frame.setLayout(new BorderLayout());

            // Create a JLabel to display the image
            JLabel imageLabel = new JLabel();
            imageLabel.setHorizontalAlignment(JLabel.CENTER);
            frame.add(imageLabel, BorderLayout.CENTER);

            // Create a JPanel to hold the button
            JPanel panel = new JPanel();
            JButton insertImageButton = new JButton("Insert Image");
            
            // Add the button to the panel
            panel.add(insertImageButton);
            frame.add(panel, BorderLayout.SOUTH);

            // Action listener to trigger the image insertion
            insertImageButton.addActionListener(e -> new InsertImage(imageLabel));

            // Set frame visibility
            frame.setVisible(true);
        });   
    }
    
}
