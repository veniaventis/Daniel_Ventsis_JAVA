import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("GUI Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800 , 600);
        frame.setLayout(new BorderLayout());

        InputPanel inputPanel = new InputPanel();
        AnalysisPanel analysisPanel = new AnalysisPanel(inputPanel);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(analysisPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
