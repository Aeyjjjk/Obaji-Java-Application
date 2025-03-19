import javax.swing.*;

public class SimpleApp {
    public static void main(String[] args) {
        // Ask for user input
        String name = JOptionPane.showInputDialog("Enter your name:");

        // Format the message
        String message = String.format("Hello, %s! Welcome to the Java App!", name);

        // Display in a GUI window
        JFrame frame = new JFrame("Welcome App");
        JLabel label = new JLabel(message, SwingConstants.CENTER);
        
        // Set frame properties
        frame.add(label);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
