package Lab1Part3;

import Lab1Part1.Lab1Part1; // Import Lab1Part1 to use its method
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab1Part3 extends JFrame {
    /**
     * constructor for gui
     */
    public Lab1Part3() {
        makePanel();
        settings();
    }
    /**
     * Creates panel for input
     */
    public void makePanel() {
        JPanel inputPanel = new JPanel();
        Container contentPane = getContentPane();

        JTextField inputInitialsField = new JTextField("");
        JLabel initialsPromptLabel = new JLabel("Please enter your initials here: ");
        JLabel fullNameOutputLabel = new JLabel("Result of will appear here.");
        JButton initialsButton = createJButton(fullNameOutputLabel, inputInitialsField);
        contentPane.setLayout(new BorderLayout());
        contentPane.add(inputPanel, BorderLayout.NORTH);
        contentPane.add(fullNameOutputLabel, BorderLayout.CENTER);
        contentPane.add(initialsButton, BorderLayout.SOUTH);
        inputPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        fullNameOutputLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        initialsButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        // Set layout and add components to inputPanel
        inputPanel.setLayout(new GridLayout(1, 2));
        inputPanel.add(initialsPromptLabel);
        inputPanel.add(inputInitialsField);

    }
    private static JButton createJButton(JLabel fullNameOutputLabel, JTextField inputInitialsField) {
        JButton initialsButton = new JButton("Click here to retrieve name from initials.");
        initialsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fullNameOutputLabel.setText(Lab1Part1.getMyNameFromMyInitial(inputInitialsField.getText()));
            }
        });
        return initialsButton;
    }

    /**
     * Settings
     */
    public void settings() {
        setTitle("Get Name From Initial");
        setSize(800, 200);
        setLocation(500, 500);
        setResizable(false);
        setVisible(true);
    }

    /**
     * Main method
     */
    public static void main(String[] args) {
        new Lab1Part3();
    }
}
