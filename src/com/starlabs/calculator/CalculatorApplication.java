package com.starlabs.calculator;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculatorApplication {

	private JFrame frame;
	private JTextField consoleArea;
	
	private String operand1;
	private String operand2;
	private String operator;
	
	private boolean isOperatorSelected;
	
	private NumberFormat formatter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CalculatorApplication window = new CalculatorApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 245, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Console Area
		consoleArea = new JTextField("0");
		consoleArea.setEditable(false);
		consoleArea.setFont(new Font("SansSerif", Font.PLAIN, 20));
		consoleArea.setHorizontalAlignment(SwingConstants.RIGHT);
		consoleArea.setBounds(10, 10, 215,65);
		frame.getContentPane().add(consoleArea);
		consoleArea.setColumns(9);
		
		// Keys Level 1
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				consoleArea.setText("0");
				operand1 = null;
				operand2 = null;
				operator = null;
				isOperatorSelected = false;
			}
		});
		btnAc.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnAc.setBounds(10, 85, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnAc);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Double doubleVal = Double.valueOf(consoleArea.getText());
				if (doubleVal % 1 == 0) {
					consoleArea.setText(String.valueOf(doubleVal.intValue() * -1));
				} else {
					consoleArea.setText(String.valueOf(doubleVal * -1));
				}
				operand2 = String.valueOf(doubleVal * -1);
			}
		});
		btnPlusMinus.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnPlusMinus.setBounds(65, 85, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double doubleVal = Double.valueOf(consoleArea.getText());
				double res = doubleVal * 0.01;
				formatter = new DecimalFormat("0.########");
				if (res < 0.000000001) {
					formatter = new DecimalFormat("0E00");
				}
				formatter.format(res);
				System.out.println(formatter.format(res));
				consoleArea.setText(formatter.format(res));
			}
		});
		btnPercent.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnPercent.setBounds(120, 85, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnPercent);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operand1 = consoleArea.getText();
				operator = "/";
				isOperatorSelected = true;
				consoleArea.setText(null);
			}
		});
		btnDivide.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnDivide.setBounds(175, 85, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnDivide);
		
		// Keys Level 2
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fillDisplay(consoleArea.getText(), btnSeven.getText());
			
			}
		});
		btnSeven.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnSeven.setBounds(10, 140, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fillDisplay(consoleArea.getText(), btnEight.getText());
			}
		});
		btnEight.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnEight.setBounds(65, 140, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fillDisplay(consoleArea.getText(), btnNine.getText());
			}
		});
		btnNine.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnNine.setBounds(120, 140, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnNine);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operand1 = consoleArea.getText();
				operator = "*";
				isOperatorSelected = true;
				consoleArea.setText(null);
			}
		});
		btnMultiply.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnMultiply.setBounds(175, 140, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnMultiply);
		
		// Keys Level 3
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fillDisplay(consoleArea.getText(), btnFour.getText());
			}
		});
		btnFour.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnFour.setBounds(10, 195, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fillDisplay(consoleArea.getText(), btnFive.getText());
			}
		});
		btnFive.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnFive.setBounds(65, 195, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fillDisplay(consoleArea.getText(), btnSix.getText());
			}
		});
		btnSix.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnSix.setBounds(120, 195, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnSix);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operand1 = consoleArea.getText();
				operator = "-";
				isOperatorSelected = true;
				consoleArea.setText(null);
			}
		});
		btnMinus.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnMinus.setBounds(175, 195, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnMinus);
		
		// Keys Level 4
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fillDisplay(consoleArea.getText(), btnOne.getText());
			}
		});
		btnOne.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnOne.setBounds(10, 250, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fillDisplay(consoleArea.getText(), btnTwo.getText());
			}
		});
		btnTwo.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnTwo.setBounds(65, 250, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fillDisplay(consoleArea.getText(), btnThree.getText());
			}
		});
		btnThree.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnThree.setBounds(120, 250, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnThree);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operand1 = consoleArea.getText();
				operator = "+";
				isOperatorSelected = true;
				consoleArea.setText(null);
			}
		});
		btnPlus.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnPlus.setBounds(175, 250, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnPlus);
		
		// Keys Level 5
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fillDisplay(consoleArea.getText(), btnZero.getText());
			}
		});
		btnZero.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnZero.setBounds(10, 305, AppConstants.BUTTON_WIDTH_2X_HORIZONTAL + 5, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnZero);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!consoleArea.getText().contains(".")) {
					fillDisplay(consoleArea.getText(), btnDecimal.getText());
				}
			}
		});
		btnDecimal.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnDecimal.setBounds(120, 305, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnDecimal);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String answer = "";
				double result = 0.0;
				isOperatorSelected = true;
				switch (operator) {
				case "+":
					result = Double.valueOf(operand1) + Double.valueOf(operand2);
					operand1 = String.valueOf(result);
					break;
				case "-":
					result = Double.valueOf(operand1) - Double.valueOf(operand2);
					operand1 = String.valueOf(result);
					break;
				case "*":
					result = Double.valueOf(operand1) * Double.valueOf(operand2);
					operand1 = String.valueOf(result);
					break;
				case "/":
					try {
						result = Double.valueOf(operand1) / Double.valueOf(operand2);
					} catch (ArithmeticException aEx) {
						aEx.printStackTrace();
						consoleArea.setText("Error");
					}
					operand1 = String.valueOf(result);
					//break;
				}
				answer = String.valueOf(result);
				displayResult(answer);
			}
		});
		btnEquals.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnEquals.setBounds(175, 305, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnEquals);
	}
	
	// Handling displayed values
	private void fillDisplay(String consoleAreaText, String toBeAdded) {
		String tempOperand = null;
		// Check if the consoleAreaText already contains a decimal
		if (consoleAreaText.contains(".")) {
			if (toBeAdded.equals(".") || consoleAreaText.length() > 9) {
				return;
			}
			tempOperand = consoleAreaText + toBeAdded;
			consoleArea.setText(consoleAreaText + toBeAdded);
		} else {
			if (consoleAreaText.length() < 9) {
				if (consoleAreaText.equals("0") && !toBeAdded.equals(".")) {
					tempOperand = toBeAdded;
					consoleArea.setText(toBeAdded);
				} else {
					tempOperand = consoleAreaText + toBeAdded;
					consoleArea.setText(consoleAreaText + toBeAdded);
				}
			}
		}
		if (isOperatorSelected) {
			operand2 = tempOperand;
		}
	}
	
	private void displayResult(String result) {
		String answer = null;
		Double doubleVal = Double.valueOf(result);
		if (doubleVal % 1 == 0) {
			int intVal = doubleVal.intValue();
			answer = String.valueOf(intVal);
		} else {
			answer = String.valueOf(doubleVal);
		}
		consoleArea.setText(answer);
	}
}
