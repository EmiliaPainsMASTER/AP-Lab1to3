package Lab1Part3;
import javax.swing.*;
import java.awt.*;
public class Lab1Part3 extends JFrame {
    public Lab1Part3(){
        makePanel();
        //settings
        settings();
    }
    public void makePanel(){
        JPanel inputPanel = new JPanel();
        Container contentPane = getContentPane();
        JTextField inputInitialsField = new JTextField("");
        JLabel initialsPromptLabel = new JLabel("Please enter your initials here: ");
        JLabel fullNameOutputLabel = new JLabel("Result of method call will appear here.");
        JButton initialsButton = new JButton("Click here to retrieve student name from initials.");
        //set layout and add to contentPane
        contentPane.setLayout(new BorderLayout());
        contentPane.add(inputPanel,BorderLayout.NORTH);
        contentPane.add(fullNameOutputLabel,BorderLayout.CENTER);
        contentPane.add(initialsButton, BorderLayout.SOUTH);
        //borders
        inputPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        fullNameOutputLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        initialsButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        //set layout and add to inputPanel
        inputPanel.setLayout(new GridLayout(1,2));
        inputPanel.add(initialsPromptLabel);
        inputPanel.add(inputInitialsField);

    }
    public void settings(){
        setTitle("Get Name From Initial");
        setSize(800, 200);
        setLocation(500, 500);
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Lab1Part3();
    }
}
