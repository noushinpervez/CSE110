package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

public class MyProject extends JFrame {
	private JButton BtnList = new JButton("List of Programs (21 programs)");
	
	private JButton BtnBasic = new JButton("Basic Programs (3)");
	private JButton BtnIfElse = new JButton("If-Else");
	private JButton BtnSwitchCase = new JButton("Switch Case");
	private JButton BtnSwap= new JButton("Swapping Two Numbers");
	
	private JButton BtnLoops = new JButton("Loops (5)");
	private JButton BtnBasicForLoop = new JButton("Basic for Loop");
	private JButton BtnBasicWhileLoop = new JButton("Basic while Loop");
	private JButton BtnBasicDoWhileLoop = new JButton("Basic do-while Loop");
	private JButton BtnSumofDigits = new JButton("Find Sum of Digits");
	private JButton BtnPalindrome = new JButton("Palindrome Program");
	
	private JButton BtnNumber = new JButton("Number Crunching (3)");
    private JButton BtnFactors = new JButton("Factors of a Number");
    private JButton BtnPrimeNumbers = new JButton("First n Prime Numbers");
    private JButton BtnArmstrong = new JButton("Armstrong Number");
    
    private JButton BtnArray = new JButton("Concept of Arrays (5)");
    private JButton BtnSum = new JButton("Sum of N Numbers");
	private JButton BtnLargestandSmallest = new JButton("Largest and Smallest Element");
	private JButton BtnReverse = new JButton("Reverse");
	private JButton BtnInsert = new JButton("Insert Element");
    private JButton BtnDelete = new JButton("Delete Element");
    
    private JButton BtnRecursion = new JButton("Concept of Recursion (2)");
    private JButton BtnFactorial = new JButton("Factorial");
    private JButton BtnFibonacci = new JButton("Fibonacci Series");
    
    private JButton BtnMiscellaneous = new JButton("Miscellaneous (3)");
    private JButton BtnAreaofTriangle = new JButton("Area of Triangle");
    private JButton BtnCelsiustoFahrenheit = new JButton("Celsius to Fahrenheit");
    private JButton BtnCircleAreaCircumference = new JButton("Area and Circumference of Circle");
    
    private JButton BtnProgram = new JButton("Selected Program Name");
    private JButton BtnC = new JButton("C Program");
    private JButton BtnJava = new JButton("Java Program");
    
	JTextArea taC = new JTextArea();
	JTextArea taJ = new JTextArea();
	
	Font font1 = new Font("SansSerif", Font.PLAIN, 15);
	Font font2 = new Font("SansSerif", Font.BOLD, 15);
	   
	private JPanel panelLeft = new JPanel(new GridLayout(0, 1));
	private JPanel panel = new JPanel(new GridLayout(0, 1));
	private JPanel panelTop = new JPanel(new GridLayout(1, 1));
	private JPanel panelRight = new JPanel(new GridLayout(1, 1));
	
	private JPanel panelM = new JPanel(new BorderLayout());
	private JPanel panelMain = new JPanel(new BorderLayout());
	
	public MyProject() {
		setTitle("CSE110 Mini Project");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
	    setSize(1500, 700);
	    
	    panelLeft.add(BtnList);
	    
	    panelLeft.add(BtnBasic);
	    panelLeft.add(BtnIfElse);
	    panelLeft.add(BtnSwitchCase);
	    panelLeft.add(BtnSwap);     
	 
	    panelLeft.add(BtnLoops);
	    panelLeft.add(BtnBasicForLoop);
	    panelLeft.add(BtnBasicWhileLoop);
        panelLeft.add(BtnBasicDoWhileLoop);
        panelLeft.add(BtnSumofDigits);
        panelLeft.add(BtnPalindrome);
	              
        panelLeft.add(BtnNumber);
	    panelLeft.add(BtnFactors);
	    panelLeft.add(BtnPrimeNumbers);
        panelLeft.add(BtnArmstrong);
	         
        panelLeft.add(BtnArray);
        panelLeft.add(BtnSum);
        panelLeft.add(BtnLargestandSmallest);
	    panelLeft.add(BtnReverse);
	    panelLeft.add(BtnInsert);
	    panelLeft.add(BtnDelete);
	         
	    panelLeft.add(BtnRecursion);
	    panelLeft.add(BtnFibonacci);
	    panelLeft.add(BtnFactorial);
	              
	    panelLeft.add(BtnMiscellaneous);
	    panelLeft.add(BtnAreaofTriangle);
	    panelLeft.add(BtnCelsiustoFahrenheit);
	    panelLeft.add(BtnCircleAreaCircumference);
	    
	    BtnList.setFont(font2);
	    BtnBasic.setFont(font2);
	    BtnLoops.setFont(font2);
	    BtnNumber.setFont(font2);
	    BtnArray.setFont(font2);
	    BtnRecursion.setFont(font2);
	    BtnMiscellaneous.setFont(font2);
	    
	    BtnList.setBackground(Color.GRAY);
	    BtnBasic.setBackground(Color.LIGHT_GRAY);
	    BtnLoops.setBackground(Color.LIGHT_GRAY);
	    BtnNumber.setBackground(Color.LIGHT_GRAY);
	    BtnArray.setBackground(Color.LIGHT_GRAY);
	    BtnRecursion.setBackground(Color.LIGHT_GRAY);
	    BtnMiscellaneous.setBackground(Color.LIGHT_GRAY);
	    
	    BtnIfElse.setBackground(Color.WHITE);
	    BtnSwitchCase.setBackground(Color.WHITE);
	    BtnSwap.setBackground(Color.WHITE);
	    BtnBasicForLoop.setBackground(Color.WHITE);
	    BtnBasicWhileLoop.setBackground(Color.WHITE);
	    BtnBasicDoWhileLoop.setBackground(Color.WHITE);
	    BtnSumofDigits.setBackground(Color.WHITE);
	    BtnPalindrome.setBackground(Color.WHITE);
	    BtnFactors.setBackground(Color.WHITE);
	    BtnPrimeNumbers.setBackground(Color.WHITE);
	    BtnArmstrong.setBackground(Color.WHITE);
	    BtnSum.setBackground(Color.WHITE);
	    BtnLargestandSmallest.setBackground(Color.WHITE);
	    BtnReverse.setBackground(Color.WHITE);
	    BtnInsert.setBackground(Color.WHITE);
	    BtnDelete.setBackground(Color.WHITE);
	    BtnFactorial.setBackground(Color.WHITE);
	    BtnFibonacci.setBackground(Color.WHITE);
	    BtnAreaofTriangle.setBackground(Color.WHITE);
	    BtnCelsiustoFahrenheit.setBackground(Color.WHITE);
	    BtnCircleAreaCircumference.setBackground(Color.WHITE);
	    
	    panelLeft.setBackground(Color.WHITE);
	    
	    BtnProgram.setFont(font2);
	    
	    BtnProgram.setBackground(Color.GRAY);
	    
	    BtnC.setFont(font2);
	    BtnJava.setFont(font2);
	    
	    BtnC.setBackground(Color.WHITE);
	    BtnJava.setBackground(Color.WHITE);
	    
	    JScrollPane scrollC = new JScrollPane(taC);
	    JScrollPane scrollJ = new JScrollPane(taJ);
	    
	    taC.setBackground(Color.white);
	    taJ.setBackground(Color.white);
	    
	    taC.setFont(font1);
	    taJ.setFont(font1);
	    
	    panel.add(BtnProgram);
	    
	    panelTop.add(BtnC);
	    panelTop.add(BtnJava);
	    
	    panelRight.add(scrollC);  
	    panelRight.add(scrollJ);
	    
	    panelM.add(panel, BorderLayout.PAGE_START);
	    panelM.add(panelTop, BorderLayout.CENTER);
	    
	    panelMain.add(panelM, BorderLayout.PAGE_START);
	    panelMain.add(panelRight, BorderLayout.CENTER);
	    
	    add(panelLeft, BorderLayout.WEST);
	    add(panelMain, BorderLayout.CENTER);
	    
	    
	 	BtnIfElse.addActionListener(new ActionListener() {	
	 		public void actionPerformed(ActionEvent e) {
	 			String data = readFile("C:\\project\\C\\IfElse.c");
	 			taC.setText(data);
	            data = readFile("C:\\project\\Java\\IfElse.java");
	            taJ.setText(data);
	            BtnProgram.setText("If-Else");
	 		}
	 	});
	 	
	    BtnSwap.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String data = readFile("C:\\project\\C\\Swap.c");
	    		taC.setText(data);
	    		data = readFile("C:\\project\\Java\\Swap.java");
	    		taJ.setText(data);
	    		BtnProgram.setText("Swapping Two Numbers");
	    	}
	    }); 
	    
	    BtnBasicForLoop.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String data = readFile("C:\\project\\C\\BasicForLoop.c");
	    		taC.setText(data);
	    		data = readFile("C:\\project\\Java\\BasicForLoop.java");
	    		taJ.setText(data);
	    		BtnProgram.setText("Basic for Loop");
	    	}
	    });
	    
	    BtnBasicWhileLoop.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String data = readFile("C:\\project\\C\\BasicWhileLoop.c");
	    		taC.setText(data);
	    		data = readFile("C:\\project\\Java\\BasicWhileLoop.java");
	    		taJ.setText(data);
	    		BtnProgram.setText("Basic while Loop");
	    	}
	    });
	 
	   BtnBasicDoWhileLoop.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\BasicDoWhileLoop.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\BasicDoWhileLoop.java");
			   taJ.setText(data);
			   BtnProgram.setText("Basic do-while Loop");
		   }
	   });
	   
	   BtnArmstrong.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\Armstrong.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\Armstrong.java");
			   taJ.setText(data);
			   BtnProgram.setText("Armstrong Number");
		   }
	   });
	   
	   BtnFactorial.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\Factorial.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\Factorial.java");
			   taJ.setText(data);
			   BtnProgram.setText("Factorial");
		   }
	   });
	               
	   BtnFactors.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\Factors.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\Factors.java");
			   taJ.setText(data);
			   BtnProgram.setText("Factors of a Number");
		   }
	   });
	                
	   BtnLargestandSmallest.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\LargestandSmallest.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\LargestandSmallest.java");
			   taJ.setText(data);
			   BtnProgram.setText("Largest and Smallest Element");
		   }
	   });
	               
	   BtnPrimeNumbers.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\PrimeNumbers.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\PrimeNumbers.java");
			   taJ.setText(data);
			   BtnProgram.setText("First n Prime Numbers");
		   }
	   });
	                  
	   BtnReverse.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\Reverse.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\Reverse.java");
			   taJ.setText(data);
			   BtnProgram.setText("Reverse");
		   }
	   });
	   
	   BtnSwitchCase.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\SwitchCase.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\SwitchCase.java");
			   taJ.setText(data);
			   BtnProgram.setText("Switch Case");
		   }
	   }); 
	                  
	   BtnPalindrome.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\Palindrome.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\Palindrome.java");
			   taJ.setText(data);
			   BtnProgram.setText("Palindrome Program");
		   }
	   });
	                    
	   BtnCelsiustoFahrenheit.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\CelsiustoFahrenheit.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\CelsiustoFahrenheit.java");
			   taJ.setText(data);
			   BtnProgram.setText("Celsius to Fahrenheit");
		   }
	   });
	                     
	   BtnFibonacci.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\Fibonacci.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\Fibonacci.java");
			   taJ.setText(data);
			   BtnProgram.setText("Fibonacci Series");
		   }
	   });
	                       
	   BtnCircleAreaCircumference.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\CircleAreaCircumference.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\CircleAreaCircumference.java");
			   taJ.setText(data);
			   BtnProgram.setText("Area and Circumference of Circle");
		   }
	   });
	                         
	   BtnInsert.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\Insert.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\Insert.java");
			   taJ.setText(data);
			   BtnProgram.setText("Insert Element");
		   }
	   });
	                                       
	   BtnAreaofTriangle.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\AreaofTriangle.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\AreaofTriangle.java");
			   taJ.setText(data);
			   BtnProgram.setText("Area of Triangle");
		   }
	   });       
	                                                 
	   BtnSum.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\Sum.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\Sum.java");
			   taJ.setText(data);
			   BtnProgram.setText("Sum of N numbers");
		   }
	   });                 
	                
	   BtnSumofDigits.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\SumofDigits.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\SumofDigits.java");
			   taJ.setText(data);
			   BtnProgram.setText("Find Sum of Digits");
		   }
	   });
	                                         
	   BtnDelete.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   String data = readFile("C:\\project\\C\\Delete.c");
			   taC.setText(data);
			   data = readFile("C:\\project\\Java\\Delete.java");
			   taJ.setText(data);
			   BtnProgram.setText("Delete Element");
		   }
	   });
	   
	 setVisible(true);
	 }
	 
	 public String readFile(String filePath) {
		 try {
			 File myObj = new File(filePath);
			 Scanner myReader = new Scanner(myObj);
			 String fileData = "";
			 while (myReader.hasNextLine()) {
				 fileData += myReader.nextLine()+"\n";
			 }
			 myReader.close();
			 return fileData;
		 } catch (Exception ex) {
			 System.out.println("ArithmeticException error occurred.");
		 } return null;
	 }
}