import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Calculator extends JFrame {
    private JLabel myLabel;
    private JTextField outputField;
    private ArrayList<Button> digits;
    private JButton plusSign;
    private JButton minusSign;
    private JButton multSign;
    private JButton divSign;
    private JButton eqSign;
    private JMenuItem add;
    private String currentOperation;
    private Double firstOperand;
    JMenuItem subtract;
    JMenuItem multiply;
    JMenuItem divide;
    JMenuItem clear;


    public Calculator() {
        this.currentOperation = "";
        this.firstOperand = 0.0;
        JPanel displayPanel = new JPanel(new FlowLayout());
        outputField = new JTextField("0", 20);
        displayPanel.add(outputField);


        JMenuBar menuB = new JMenuBar();
        UIManager.put("MenuBar.background", Color.ORANGE);
        JMenu menu = new JMenu("Menu");
        menuB.add(menu);
        add = new JMenuItem("Add");
        subtract = new JMenuItem("Subtract");
        multiply = new JMenuItem("Multiply");
        divide = new JMenuItem("Divide");
        clear = new JMenuItem("Clear");

        menu.add(add);
        menu.add(multiply);
        menu.add(subtract);
        menu.add(divide);
        menu.add(clear);
        myLabel = new JLabel("∂∂∂");
        ActionListener mAL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JMenuItem org = (JMenuItem) event.getSource();
                if (org == add) {
                    currentOperation = "+";
                } else if (org == subtract) {
                    currentOperation = "-";
                } else if (org == multiply) {
                    currentOperation = "*";
                } else if (org == divide) {
                    currentOperation = "/";
                } else if (org == clear) {
                    resetValues();
                }

                String inp = outputField.getText();
                try {
                    firstOperand = new Double(inp);
                    outputField.setText("0");

                } catch (NumberFormatException e) {
                    resetValues();
                }
            }
        };

        add.addActionListener(mAL);
        subtract.addActionListener(mAL);
        multiply.addActionListener(mAL);
        divide.addActionListener(mAL);
        clear.addActionListener(mAL);
        displayPanel.add(menuB);

        digits = new ArrayList<Button>();
        digits.add(new Button("0"));
        digits.add(new Button("1"));
        digits.add(new Button("2"));
        digits.add(new Button("3"));
        digits.add(new Button("4"));
        digits.add(new Button("5"));
        digits.add(new Button("6"));
        digits.add(new Button("7"));
        digits.add(new Button("8"));
        digits.add(new Button("9"));
        digits.add(new Button("."));
        digits.add(new Button("AC"));

        digits.get(10).setForeground(Color.MAGENTA);
        digits.get(11).setForeground(Color.MAGENTA);


        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        JPanel operatorButtonPanel = new JPanel(new GridLayout(4, 3));
        operatorButtonPanel.add(digits.get(0));
        operatorButtonPanel.add(digits.get(1));
        operatorButtonPanel.add(digits.get(2));
        operatorButtonPanel.add(digits.get(3));
        operatorButtonPanel.add(digits.get(4));
        operatorButtonPanel.add(digits.get(5));
        operatorButtonPanel.add(digits.get(6));
        operatorButtonPanel.add(digits.get(7));
        operatorButtonPanel.add(digits.get(8));
        operatorButtonPanel.add(digits.get(9));
        operatorButtonPanel.add(digits.get(10));
        operatorButtonPanel.add(digits.get(11));
        buttonPanel.add(operatorButtonPanel);
        displayPanel.add(buttonPanel);
        add(displayPanel);
        plusSign = new JButton(new ImageIcon(getClass().getResource("plus.png")));
        minusSign = new JButton(new ImageIcon(getClass().getResource("minus.png")));
        multSign = new JButton(new ImageIcon(getClass().getResource("multiply.png")));
        divSign = new JButton(new ImageIcon(getClass().getResource("divide.png")));
        eqSign = new JButton(new ImageIcon(getClass().getResource("equals.png")));


        operatorButtonPanel.add(plusSign);
        operatorButtonPanel.add(minusSign);
        operatorButtonPanel.add(multSign);
        operatorButtonPanel.add(divSign);
        operatorButtonPanel.add(eqSign);
        buttonPanel.add(operatorButtonPanel);
        digits.get(11).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resetValues();
            }
        });

        digits.get(10).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String currentText = outputField.getText();
                if (!currentText.contains(".")) {
                    outputField.setText(currentText + ".");
                }
            }
        });

        Calculator.OperatorListener opListener = new Calculator.OperatorListener();
        plusSign.addActionListener(opListener);
        minusSign.addActionListener(opListener);
        multSign.addActionListener(opListener);
        divSign.addActionListener(opListener);

        for (int i = 0; i <= 9; i++) {
            digits.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    String currentText = outputField.getText();
                    Button source = (Button) event.getSource();
                    String newDigit = "";

                    if (source == digits.get(0)) {
                        newDigit = "0";
                    } else if (source == digits.get(1)) {
                        newDigit = "1";
                    } else if (source == digits.get(2)) {
                        newDigit = "2";
                    } else if (source == digits.get(3)) {
                        newDigit = "3";
                    } else if (source == digits.get(4)) {
                        newDigit = "4";
                    } else if (source == digits.get(5)) {
                        newDigit = "5";
                    } else if (source == digits.get(6)) {
                        newDigit = "6";
                    } else if (source == digits.get(7)) {
                        newDigit = "7";
                    } else if (source == digits.get(8)) {
                        newDigit = "8";
                    } else if (source == digits.get(9)) {
                        newDigit = "9";
                    }

                    currentText = currentText + newDigit;
                    currentText = currentText.replaceFirst("^0+(?!$)", "");
                    outputField.setText(currentText);
                }
            });
        }

        eqSign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                double result = 0.0;
                String currentText = outputField.getText();
                try {
                    Double secondOperand = new Double(currentText);

                    if (currentOperation.equals("+")) {
                        result = firstOperand + secondOperand;
                    } else if (currentOperation.equals("-")) {
                        result = firstOperand - secondOperand;
                    } else if (currentOperation.equals("*")) {
                        result = firstOperand * secondOperand;
                    } else if (currentOperation.equals("/")) {
                        if (secondOperand != 0.0) {
                            result = firstOperand / secondOperand;
                        } else {
                            resetValues();
                            outputField.setBackground(Color.PINK);
                        }
                    }

                    outputField.setText(Double.toString(result));
                    firstOperand = result;
                } catch (NumberFormatException e) {
                    resetValues();
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });

        setTitle("Calculator");
        setSize(500, 200);
        setVisible(true);
    }

    private void resetValues() {
        currentOperation = "";
        firstOperand = 0.0;
        outputField.setText("0");
        outputField.setBackground(Color.WHITE);
    }


    private class OperatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            JButton source = (JButton) event.getSource();
            if (source == plusSign) {
                currentOperation = "+";
            } else if (source == minusSign) {
                currentOperation = "-";
            } else if (source == multSign) {
                currentOperation = "*";
            } else if (source == divSign) {
                currentOperation = "/";
            }

            String currentText = outputField.getText();
            try {
                firstOperand = new Double(currentText);
                outputField.setText("0");
            } catch (NumberFormatException e) {
                resetValues();
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

