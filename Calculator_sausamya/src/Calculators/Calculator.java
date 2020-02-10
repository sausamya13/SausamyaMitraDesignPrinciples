package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.*;
public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String args[])
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 272, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtDisplay.setBounds(12, 13, 206, 43);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		//row 1

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
		 String EnterNumber=txtDisplay.getText()+btn7.getText();
		 txtDisplay.setText(EnterNumber );
		
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(12, 69, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=txtDisplay.getText()+btn8.getText();
				 txtDisplay.setText(EnterNumber );
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(74, 69, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=txtDisplay.getText()+btn9.getText();
				 txtDisplay.setText(EnterNumber );
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(136, 69, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="+"; 
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(198, 69, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		
		
		
		
		//row 2
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=txtDisplay.getText()+btn4.getText();
				 txtDisplay.setText(EnterNumber );
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(12, 140, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=txtDisplay.getText()+btn5.getText();
				 txtDisplay.setText(EnterNumber );
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(74, 140, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=txtDisplay.getText()+btn6.getText();
				 txtDisplay.setText(EnterNumber );
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(136, 140, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="-"; 
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(198, 140, 50, 50);
		frame.getContentPane().add(btnSub);
		
		
		//row 3
		
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						String EnterNumber=txtDisplay.getText()+btn1.getText();
						 txtDisplay.setText(EnterNumber );
						
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn1.setBounds(12, 210, 50, 50);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						String EnterNumber=txtDisplay.getText()+btn2.getText();
						 txtDisplay.setText(EnterNumber );
						
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn2.setBounds(74, 210, 50, 50);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						String EnterNumber=txtDisplay.getText()+btn3.getText();
						 txtDisplay.setText(EnterNumber );
						
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn3.setBounds(136, 210, 50, 50);
				frame.getContentPane().add(btn3);
				
				JButton btnMult = new JButton("*");
				btnMult.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum=Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations="*"; 
					}
				});
				btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnMult.setBounds(198, 210, 50, 50);
				frame.getContentPane().add(btnMult);
				
				
				
				//row 4
				
				
				
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						String EnterNumber=txtDisplay.getText()+btn0.getText();
						 txtDisplay.setText(EnterNumber );
						
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.setBounds(12, 280, 50, 50);
				frame.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDot.setBounds(74, 280, 50, 50);
				frame.getContentPane().add(btnDot);
				
				JButton btnEqual = new JButton("=");
				btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						String answer;
						secondnum=Double.parseDouble(txtDisplay.getText());
						if(operations =="+")
						{
							result=firstnum + secondnum ;
                            answer=String.format("%.2f",result);
                            txtDisplay.setText(answer);
						}
						else if(operations =="-")
				
						{
							result=firstnum  - secondnum;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);
						}
						else if(operations == "*")
						{
							result=firstnum  * secondnum;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);
						}
						
						else
							
						{
							result=firstnum  / secondnum;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);	
						}
						
					}
				});
				btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnEqual.setBounds(136, 280, 50, 50);
				frame.getContentPane().add(btnEqual);
				
				JButton btnDiv = new JButton("/");
				btnDiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum=Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations="/"; 
					}
				});
				btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDiv.setBounds(198, 280, 50, 50);
				frame.getContentPane().add(btnDiv);
				
				JButton btnC = new JButton("CANCEL");
				btnC.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						 txtDisplay.setText(null );

					}
				});
				btnC.setFont(new Font("Tahoma", Font.BOLD, 13));
				btnC.setBounds(74, 346, 97, 25);
				frame.getContentPane().add(btnC);
				
				
	}

	}

