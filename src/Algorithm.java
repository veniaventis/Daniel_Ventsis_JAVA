import javax.swing.*;
import java.util.ArrayList;

public class Algorithm {
    public static void analyzeData(JTextArea resultTextArea, InputPanel inputPanel) {
        String numberText = inputPanel.getNumberText();
        String name = inputPanel.getName();
        String arrayText = inputPanel.getArrayText();

        try {
            int number = Integer.parseInt(numberText);
            if (number > 7) {
                resultTextArea.setText("Привет'\n");
            } else {
                if (name.equals("Вячеслав\n")) {
                    resultTextArea.setText("Привет, Вячеслав'\n");
                } else {
                    resultTextArea.setText("Нет такого имени\n");
                }
            }
        } catch (NumberFormatException ex) {
            resultTextArea.setText("Ошибка: Введите корректное число.\n");
        }

        String[] arrayElements = arrayText.split(" ");
        ArrayList<Integer> array = new ArrayList<>();
        for (String element : arrayElements) {
            try {
                int value = Integer.parseInt(element);
                array.add(value);
            } catch (NumberFormatException ex) {
                resultTextArea.setText("Ошибка: Введите целые числа через пробел.\n");
                return;
            }
        }

        ArrayList<Integer> result = analyzeArray(array);

        StringBuilder resultText = new StringBuilder("Элементы массива, кратные 3:\n");
        for (int element : result) {
            resultText.append(element).append("\n");
        }

        resultTextArea.append(resultText.toString());
    }

    private static ArrayList<Integer> analyzeArray(ArrayList<Integer> array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int element : array) {
            if (element % 3 == 0) {
                result.add(element);
            }
        }
        return result;
    }
}
