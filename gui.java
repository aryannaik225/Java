import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class gui implements ActionListener {
    private JFrame frame;
    private JTextField textField;
    private double firstNumber, secondNumber, result;
    private String operator;
    public gui() {
        frame = new JFrame("Scientific Calculator");
        frame.setLayout(new BorderLayout());

        textField = new JTextField();
        frame.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "sqrt", "sin", "cos"
        };
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new gui());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = ((JButton) e.getSource()).getText();
        switch (command) {
            case "=":
                secondNumber = Double.parseDouble(textField.getText());
                result = performOperation();
                textField.setText(String.valueOf(result));
                break;
            case "C":
                textField.setText("");
                firstNumber = secondNumber = result = 0;
                operator = null;
                break;
            case "sqrt":
                result = Math.sqrt(Double.parseDouble(textField.getText()));
                textField.setText(String.valueOf(result));
                break;
            case "sin":
                result = Math.sin(Math.toRadians(Double.parseDouble(textField.getText())));
                textField.setText(String.valueOf(result));
                break;
            case "cos":
                result = Math.cos(Math.toRadians(Double.parseDouble(textField.getText())));
                textField.setText(String.valueOf(result));
                break;
            default:
                textField.setText(textField.getText() + command);
        }
    }
    private double performOperation() {
        switch (operator) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                return firstNumber / secondNumber;
            default:
                return secondNumber;
        }
    }
}