package com.starlabs.calculator;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculatorApplication {

	private JFrame frame;
	private JTextField consoleArea;

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
		consoleArea = new JTextField();
		consoleArea.setFont(new Font("SansSerif", Font.PLAIN, 20));
		consoleArea.setHorizontalAlignment(SwingConstants.RIGHT);
		consoleArea.setBounds(10, 10, 215,65);
		frame.getContentPane().add(consoleArea);
		consoleArea.setColumns(10);
		
		// Keys Level 1
		JButton btnAc = new JButton("AC");
		btnAc.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnAc.setBounds(10, 85, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnAc);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnPlusMinus.setBounds(65, 85, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnPercent.setBounds(120, 85, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnPercent);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnDivide.setBounds(175, 85, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnDivide);
		
		// Keys Level 2
		JButton btnSeven = new JButton("7");
		btnSeven.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnSeven.setBounds(10, 140, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnEight.setBounds(65, 140, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnNine.setBounds(120, 140, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnNine);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnMultiply.setBounds(175, 140, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnMultiply);
		
		// Keys Level 3
		JButton btnFour = new JButton("4");
		btnFour.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnFour.setBounds(10, 195, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnFive.setBounds(65, 195, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnSix.setBounds(120, 195, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnSix);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnMinus.setBounds(175, 195, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnMinus);
		
		// Keys Level 4
		JButton btnOne = new JButton("1");
		btnOne.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnOne.setBounds(10, 250, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnTwo.setBounds(65, 250, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnThree.setBounds(120, 250, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnThree);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnPlus.setBounds(175, 250, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnPlus);
		
		// Keys Level 5
		JButton btnZero = new JButton("0");
		btnZero.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnZero.setBounds(10, 305, AppConstants.BUTTON_WIDTH_2X_HORIZONTAL + 5, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnZero);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnDecimal.setBounds(120, 305, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnDecimal);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setFont(new Font(AppConstants.FONT_STYLE, Font.BOLD, AppConstants.FONT_HEIGHT));
		btnEquals.setBounds(175, 305, AppConstants.BUTTON_WIDTH_NORMAL, AppConstants.BUTTON_HEIGHT_NORMAL);
		frame.getContentPane().add(btnEquals);
	}
}
