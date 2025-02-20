package Lab3Part2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab3Part2 extends JFrame {
    /**
     * constructor to make the GUI
     */
    public Lab3Part2() {
        JPanel cityPanel = makeCityPanel();
        getContentPane().add(cityPanel);
        settings();
    }
    /**
     * Creates a panel with two labels, a text field and a button
     *
     * @return Returns a panel with two labels, a text field and a button
     */
    private JPanel makeCityPanel() {
        JPanel cityPanel = new JPanel();
        JLabel inputLabel = new JLabel("Please enter the array index you wish to output: ");
        JTextField inputField = new JTextField(10);
        JLabel outputLabel = new JLabel();

        JButton inputButton = getJButton(inputField, outputLabel);

        cityPanel.setLayout(new GridLayout(2,2));
        cityPanel.add(inputLabel);
        cityPanel.add(inputField);
        cityPanel.add(inputButton);
        cityPanel.add(outputLabel);
        return cityPanel;
    }

    /**
     * Creates an Input button which uses the vars inputField, outputLabel, and cityArray
     * <p>
     * When user enters an index incorrect or not a try/catch
     * block will check if the input is within bounds, and outputs the index to outputLabel with the chosen city so for
     * example: an index of 1 will output "Dublin"
     * If otherwise the output label's text will be set to ask the user for a correct index between 0 and 3
     * @param inputField takes input from user
     * @param outputLabel outputs the city when the inputButton is pressed and an index is correct
     * @return returns the inputButton with the try/catch block and actionListener
     */
    private static JButton getJButton(JTextField inputField, JLabel outputLabel) {
        String [] cityArray = {"Cork","Dublin","Belfast","Galway"};
        JButton inputButton = new JButton("Click button to retrieve city");
        inputButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int arrayIndex = Integer.parseInt(inputField.getText());
                    outputLabel.setText("You have selected: " + cityArray[arrayIndex]);
                } catch (ArrayIndexOutOfBoundsException ex) {
                    outputLabel.setText("Index out of bounds, please enter a valid index between 0 and 3");
                }
            }
        });
        return inputButton;
    }

    /**
     * Configures the window settings for the GUI.
     */
    private void settings() {
        setTitle("City Selection");
        setSize(800, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    /**
     * @param args not used in program
     * Main method, calls on Lab3Part2 constructor
     */
    public static void main(String[] args) {new Lab3Part2();}
}
