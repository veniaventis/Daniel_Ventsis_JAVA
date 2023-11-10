import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnalysisPanel extends JPanel {
    private InputPanel inputPanel;
    private JTextArea resultTextArea = new JTextArea(10, 30);

    public AnalysisPanel(InputPanel inputPanel) {
        this.inputPanel = inputPanel;

        setLayout(new BorderLayout());

        JButton analyzeButton = new JButton("Analyze");
        analyzeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Algorithm.analyzeData(resultTextArea, inputPanel);
            }
        });

        add(analyzeButton, BorderLayout.NORTH);
        add(new JScrollPane(resultTextArea), BorderLayout.SOUTH);
    }
}
