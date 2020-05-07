import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI implements ActionListener{
	
	int count = 0;

	private JLabel modLabel;
	private JLabel result;
	private JButton calcBtn;
	private JFrame frame;
	private JPanel panel;
	private JTextField input1;
	private JTextField input2;
	
	public GUI() {
		frame = new JFrame();
		
		
		input1 = new JTextField();
		input2 = new JTextField();
		
		
		calcBtn = new JButton("Calculate");
		calcBtn.addActionListener(this);
		
		result = new JLabel("Result");
		modLabel = new JLabel(" mod ");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(input1);
		panel.add(modLabel);
		panel.add(input2);
		panel.add(calcBtn);
		panel.add(result);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Modular Calculator");
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new GUI();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		double dResult;
		String sResult;
		int n;
		int m;
		int d;
		
		n = Integer.parseInt(input1.getText());
		m = Integer.parseInt(input2.getText());
		
		d = n % m;
		
		sResult = String.valueOf(d);
		
		
		result.setText(sResult);
		
	}

}
