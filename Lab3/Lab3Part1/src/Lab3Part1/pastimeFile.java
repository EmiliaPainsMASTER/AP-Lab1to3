package Lab3Part1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class pastimeFile extends JFrame {

    /**
     * Constructor which creates the PastimeFile GUI
     */
    public pastimeFile() {
        JPanel pastimePanel = makePastimes();
        getContentPane().add(pastimePanel);
        settings();
    }

    /**
     * Creates the GUI panel containing the button and label.
     *
     * @return A JPanel containing the button and label.
     */
    private JPanel makePastimes() {
        JPanel pastimePanel = new JPanel();
        JLabel pastimesLabel = new JLabel("Click button to retrieve pastimes from file");

        JButton pastimesButton = new JButton("Print My Pastimes From File");
        pastimesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pastimesLabel.setText(readPastimesFile());
            }
        });

        pastimePanel.setLayout(new BorderLayout());
        pastimePanel.add(pastimesButton, BorderLayout.NORTH);
        pastimePanel.add(pastimesLabel, BorderLayout.CENTER);
        return pastimePanel;
    }

    /**
     * Reads a single line from the pastime file.
     *
     * @return The line read from the file, or an error message if the file is missing or unreadable.
     */
    private String readPastimesFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jamie\\Documents\\GitHub\\AP-Lab1to3\\Lab3\\Lab3Part1\\src\\Lab3Part1\\myFavPastimes.txt"))) {
            return br.readLine();
        } catch (FileNotFoundException e) {
            return "Error: File not found!";
        } catch (IOException e) {
            return "Error: Could not read file!";
        }
    }

    /**
     * Configures the window settings for the GUI.
     */
    private void settings() {
        setTitle("Pastime Reader");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    /**
     * Main method to launch the application.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        new pastimeFile();
    }
}