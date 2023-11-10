import javax.swing.*;
import java.awt.*;

public class InputPanel extends JPanel {
    private JTextField numberField = new JTextField(10);
    private JTextField nameField = new JTextField(10);
    private JTextField arrayField = new JTextField(10);

    public InputPanel() {
        setLayout(new GridLayout(3, 2));
        JLabel numberLabel = new JLabel("Введите число:");
        add(numberLabel);
        add(numberField);
        add(new JLabel("Введите Имя:"));
        add(nameField);
        add(new JLabel("Введите массив чисел через пробел:"));
        add(arrayField);
    }

    public String getNumberText() {
        return numberField.getText();
    }

    public String getName() {
        return nameField.getText();
    }

    public String getArrayText() {
        return arrayField.getText();
    }
}
