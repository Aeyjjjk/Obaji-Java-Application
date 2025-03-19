import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleApp {
    public static void main(String[] args) {
        // Create Frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1));

        // Create input fields
        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();
        JLabel resultLabel = new JLabel("Result: ", SwingConstants.CENTER);

        // Create Buttons
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("×");
        JButton divButton = new JButton("÷");

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4));
        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        buttonPanel.add(mulButton);
        buttonPanel.add(divButton);

        // Add components to frame
        frame.add(new JLabel("Enter first number:", SwingConstants.CENTER));
        frame.add(num1Field);
        frame.add(new JLabel("Enter second number:", SwingConstants.CENTER));
        frame.add(num2Field);
        frame.add(buttonPanel);
        frame.add(resultLabel);

        // Action Listeners for buttons
        ActionListener calculate = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = 0;

                    if (e.getSource() == addButton) result = num1 + num2;
                    if (e.getSource() == subButton) result = num1 - num2;
                    if (e.getSource() == mulButton) result = num1 * num2;
                    if (e.getSource() == divButton) {
                        if (num2 == 0) {
                            resultLabel.setText("Cannot divide by zero!");
                            return;
                        }
                        result = num1 / num2;
                    }

                    resultLabel.setText(String.format("Result: %.2f", result));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid Input!");
                }
            }
        };

        // Attach event handlers
        addButton.addActionListener(calculate);
        subButton.addActionListener(calculate);
        mulButton.addActionListener(calculate);
        divButton.addActionListener(calculate);

        // Show the frame
        frame.setVisible(true);
    }
}
