import javax.swing.*;
import java.awt.event.*;

public class AConversionNumericaUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor Numérico");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel inputLabel = new JLabel("Ingrese un número:");
        inputLabel.setBounds(10, 20, 150, 25);
        panel.add(inputLabel);

        JTextField inputField = new JTextField(20);
        inputField.setBounds(150, 20, 200, 25);
        panel.add(inputField);

        JLabel resultLabel = new JLabel("Resultado:");
        resultLabel.setBounds(10, 50, 150, 25);
        panel.add(resultLabel);

        JTextField resultField = new JTextField(20);
        resultField.setBounds(150, 50, 200, 25);
        resultField.setEditable(false);
        panel.add(resultField);

        JButton hexToDecButton = new JButton("Hexadecimal a Decimal");
        hexToDecButton.setBounds(10, 80, 180, 25);
        panel.add(hexToDecButton);

        JButton decToHexButton = new JButton("Decimal a Hexadecimal");
        decToHexButton.setBounds(200, 80, 180, 25);
        panel.add(decToHexButton);

        JButton binToDecButton = new JButton("Binario a Decimal");
        binToDecButton.setBounds(10, 110, 180, 25);
        panel.add(binToDecButton);

        JButton decToBinButton = new JButton("Decimal a Binario");
        decToBinButton.setBounds(200, 110, 180, 25);
        panel.add(decToBinButton);

        JButton binToHexButton = new JButton("Binario a Hexadecimal");
        binToHexButton.setBounds(10, 140, 180, 25);
        panel.add(binToHexButton);

        JButton hexToBinButton = new JButton("Hexadecimal a Binario");
        hexToBinButton.setBounds(200, 140, 180, 25);
        panel.add(hexToBinButton);

        hexToDecButton.addActionListener(e -> {
            String input = inputField.getText();
            try {
                HexadecimalADecimal hexToDec = new HexadecimalADecimal(input);
                resultField.setText(Integer.toString(hexToDec.convertir()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Número hexadecimal no válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        decToHexButton.addActionListener(e -> {
            String input = inputField.getText();
            try {
                int decimal = Integer.parseInt(input, 10);
                DecimalAHexadecimal decToHex = new DecimalAHexadecimal(decimal);
                resultField.setText(decToHex.convertir());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Número decimal no válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        binToDecButton.addActionListener(e -> {
            String input = inputField.getText();
            try {
                BinarioADecimal binToDec = new BinarioADecimal(input);
                resultField.setText(Integer.toString(binToDec.convertir()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Número binario no válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        decToBinButton.addActionListener(e -> {
            String input = inputField.getText();
            try {
                int decimal = Integer.parseInt(input, 10);
                DecimalABinario decToBin = new DecimalABinario(decimal);
                resultField.setText(decToBin.convertir());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Número decimal no válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        binToHexButton.addActionListener(e -> {
            String input = inputField.getText();
            try {
                BinarioAHexadecimal binToHex = new BinarioAHexadecimal(input);
                resultField.setText(binToHex.convertir());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Número binario no válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        hexToBinButton.addActionListener(e -> {
            String input = inputField.getText();
            try {
                HexadecimalABinario hexToBin = new HexadecimalABinario(input);
                resultField.setText(hexToBin.convertir());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Número hexadecimal no válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}


