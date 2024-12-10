package doancanhan;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator implements ActionListener {

    double number, answer;
    int calculator;

    JFrame frame;
    JLabel label;
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("On");
    JRadioButton offRadioButton = new JRadioButton("Off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprecal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");

    Calculator() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    private void prepareGUI() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(300, 500);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addComponents() {
        label = new JLabel();
        label.setBounds(250, 0, 50, 250);

        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Time New Roman", Font.BOLD, 20));
        textField.setEnabled(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);
        disable();

        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(false);
        onRadioButton.setFont(new Font("Time New Roman", Font.BOLD, 15));
        onRadioButton.setForeground(Color.BLACK);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Time New Roman", Font.BOLD, 15));
        offRadioButton.setForeground(Color.BLACK);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonSeven.setForeground(Color.WHITE);
        buttonSeven.setBackground(Color.GRAY);
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonEight.setForeground(Color.WHITE);
        buttonEight.setBackground(Color.GRAY);
        frame.add(buttonEight);

        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonNine.setForeground(Color.WHITE);
        buttonNine.setBackground(Color.GRAY);
        frame.add(buttonNine);

        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonFour.setForeground(Color.WHITE);
        buttonFour.setBackground(Color.GRAY);
        frame.add(buttonFour);

        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonFive.setForeground(Color.WHITE);
        buttonFive.setBackground(Color.GRAY);
        frame.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonSix.setForeground(Color.WHITE);
        buttonSix.setBackground(Color.GRAY);
        frame.add(buttonSix);

        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonOne.setForeground(Color.WHITE);
        buttonOne.setBackground(Color.GRAY);
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonTwo.setForeground(Color.WHITE);
        buttonTwo.setBackground(Color.GRAY);
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonThree.setForeground(Color.WHITE);
        buttonThree.setBackground(Color.GRAY);
        frame.add(buttonThree);

        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonDot.setForeground(Color.WHITE);
        buttonDot.setBackground(Color.GRAY);
        frame.add(buttonDot);

        buttonZero.setBounds(10, 410, 60, 40);
        buttonZero.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonZero.setForeground(Color.WHITE);
        buttonZero.setBackground(Color.GRAY);
        frame.add(buttonZero);

        buttonEqual.setBounds(220, 350, 60, 100);
        buttonEqual.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonEqual.setForeground(Color.WHITE);
        buttonEqual.setBackground(Color.GRAY);
        frame.add(buttonEqual);

        buttonDiv.setBounds(220, 110, 60, 40);
        buttonDiv.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonDiv.setForeground(Color.WHITE);
        buttonDiv.setBackground(Color.GRAY);
        frame.add(buttonDiv);

        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonSqrt.setForeground(Color.WHITE);
        buttonSqrt.setBackground(Color.GRAY);
        frame.add(buttonSqrt);

        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonMul.setForeground(Color.WHITE);
        buttonMul.setBackground(Color.GRAY);
        frame.add(buttonMul);

        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonMinus.setForeground(Color.WHITE);
        buttonMinus.setBackground(Color.GRAY);
        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonPlus.setForeground(Color.WHITE);
        buttonPlus.setBackground(Color.GRAY);
        frame.add(buttonPlus);

        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Time New Roman", Font.BOLD, 20));
        buttonSquare.setForeground(Color.WHITE);
        buttonSquare.setBackground(Color.GRAY);
        frame.add(buttonSquare);

        buttonReciprecal.setBounds(150, 170, 60, 40);
        buttonReciprecal.setFont(new Font("Time New Roman", Font.BOLD, 15));
        buttonReciprecal.setForeground(Color.WHITE);
        buttonReciprecal.setBackground(Color.GRAY);
        frame.add(buttonReciprecal);

        buttonDelete.setBounds(150, 110, 60, 40);
        buttonDelete.setFont(new Font("Time New Roman", Font.BOLD, 13));
        buttonDelete.setForeground(Color.BLACK);
        buttonDelete.setBackground(Color.ORANGE);
        frame.add(buttonDelete);

        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(new Font("Time New Roman", Font.BOLD, 13));
        buttonClear.setForeground(Color.BLACK);
        buttonClear.setBackground(Color.ORANGE);
        frame.add(buttonClear);
    }

    private void addActionEvent() {
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprecal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == onRadioButton) {
            enabled();
        } else if (source == offRadioButton) {
            disable();
        } else if (source == buttonClear) {
            label.setText("");
            textField.setText("");
        } else if (source == buttonDelete) {
            int lenght = textField.getText().length();
            int number = lenght - 1;

            if (lenght > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        } else if (source == buttonPlus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText(textField.getText() + "+");
            label.setText(str + "+");
            calculator = 1;
        } else if (source == buttonMinus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText(textField.getText() + "-");
            label.setText(str + "-");
            calculator = 2;
        } else if (source == buttonMul) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText(textField.getText() + "x");
            label.setText(str + "x");
            calculator = 3;
        } else if (source == buttonDiv) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText(textField.getText() + "/");
            label.setText(str + "/");
            calculator = 4;
        } else if (source == buttonSqrt) {
            try {
                number = Double.parseDouble(textField.getText());
                if (number < 0) {
                    textField.setText("Error: Nagative number!");
                } else {
                    Double sqrt = Math.sqrt(number);
                    textField.setText(Double.toString(sqrt).replace(".0", ""));
                }
            } catch (NumberFormatException ex) {
                textField.setText("Type number first!");
            }
        } else if (source == buttonSquare) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            label.setText("(sqr)" + str);
        } else if (source == buttonReciprecal) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == buttonEqual) {
            switch (calculator) {
                case 1: {
                    answer = number + Double.parseDouble(textField.getText().split("\\+")[1]);
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                }
                break;

                case 2: {
                    answer = number - Double.parseDouble(textField.getText().split("-")[1]);
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                }
                break;

                case 3: {
                    answer = number * Double.parseDouble(textField.getText().split("x")[1]);
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                }
                break;

                case 4: {
                    answer = number / Double.parseDouble(textField.getText().split("/")[1]);
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                }
                break;
            }
        }

    }

    private void enabled() {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        textField.setBackground(Color.WHITE);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprecal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
    }

    private void disable() {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setText("");
        textField.setBackground(Color.BLACK);
        label.setText("");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprecal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
    }

}
