package mvc;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeWeek3 extends JFrame implements ActionListener {
	
	// Creating all of the buttons
	// They really don't have to be global.
	// Only the text field must be
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton cero = new JButton("0");
	JButton add = new JButton("+");
	JButton substract = new JButton("-");
	JButton mult = new JButton("X");
	JButton divide = new JButton("/");
	JButton dot = new JButton(".");
	JButton equal = new JButton("=");
	JButton plusminus = new JButton("+-");
	JButton CE = new JButton("CE");
	JButton C = new JButton("C");
	JButton delete = new JButton("del");
	JTextField screen = new JTextField(20);
	
	// My accumulated value
	int acc = 0;
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PracticeWeek3();
	}
	
	public PracticeWeek3() {
		
		// Setting my text field size
		screen.setPreferredSize(new Dimension(30,30));
		screen.setText("0");
		
		// Settings for the frame
		this.setSize(300,500);
		this.setVisible(true);
		this.setTitle("Calculator");
		
		// Layout manager for the frame
		BorderLayout frameManager = new BorderLayout();
		this.setLayout(frameManager);
		
		// Adding the text field to the top
		this.add(screen, BorderLayout.NORTH);
		
		// Creating a panel and adding a grid layout
		// Internally
		JPanel panel = new JPanel();
		GridLayout panelManager = new GridLayout(5,4);
		panel.setLayout(panelManager);
		
		// Adding all my buttons to the panel
		panel.add(CE);
		panel.add(C);
		panel.add(delete);
		panel.add(divide);
		
		// Only to the relevant buttons, adding
		// the Action Listener and setting the 
		// Action Command
		panel.add(seven);
		seven.addActionListener(this);
		seven.setActionCommand("seven");
		
		panel.add(eight);
		eight.addActionListener(this);
		eight.setActionCommand("eight");
		
		panel.add(nine);
		nine.addActionListener(this);
		nine.setActionCommand("nine");
		
		panel.add(mult);
		
		panel.add(four);
		four.addActionListener(this);
		four.setActionCommand("four");
		
		panel.add(five);
		five.addActionListener(this);
		five.setActionCommand("five");
		
		panel.add(six);
		six.addActionListener(this);
		six.setActionCommand("six");
		
		panel.add(substract);
		panel.add(one);
		one.addActionListener(this);
		one.setActionCommand("one");
		
		panel.add(two);
		two.addActionListener(this);
		two.setActionCommand("two");
		
		panel.add(three);
		three.addActionListener(this);
		three.setActionCommand("three");
		
		panel.add(add);
		add.addActionListener(this);
		add.setActionCommand("add");
		
		panel.add(plusminus);
		panel.add(cero);
		cero.addActionListener(this);
		cero.setActionCommand("cero");
		
		panel.add(dot);
		panel.add(equal);
		equal.addActionListener(this);
		equal.setActionCommand("equal");
		
		// Once all of the buttons are on the panel
		// Adding the panel to the frame, in the 
		// "center" position
		this.add(panel, BorderLayout.CENTER);
		
		// Don't forget these two bad boys
		this.validate();
		this.repaint();
		
		
	}
	
	// This is the generic method created to update the value
	// on the screen. It changes depending on the number pressed
	public void updateScreen(String val) {
		screen.setText(screen.getText().concat(val));
	}
	
	// This is my action performed method
	// Here, we define what to do when a button
	// has been pressed
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getActionCommand().equals("one")) {
			// For the numbers, I only need to call the
			// method described above
			updateScreen("1");	
		}
		else if(arg0.getActionCommand().equals("two")) {
			updateScreen("2");	
		}
		else if(arg0.getActionCommand().equals("three")) {
			updateScreen("3");	
		}		
		else if(arg0.getActionCommand().equals("four")) {
			updateScreen("4");	
		}
		else if(arg0.getActionCommand().equals("five")) {
			updateScreen("5");
		}
		else if(arg0.getActionCommand().equals("six")) {
			updateScreen("6");
		}
		else if(arg0.getActionCommand().equals("seven")) {
			updateScreen("7");
		}
		else if(arg0.getActionCommand().equals("eight")) {
			updateScreen("8");
		}
		else if(arg0.getActionCommand().equals("nine")) {
			updateScreen("9");
		}
		else if(arg0.getActionCommand().equals("cero")) {
			updateScreen("0");
		}
		else if(arg0.getActionCommand().equals("add")) {
			// Here, we only have to save the number on the
			// screen and clean it to type a new one
			acc = Integer.parseInt(screen.getText());
			screen.setText("");
		}
		else if(arg0.getActionCommand().equals("equal")) {
			// Here, we need to get the second number from
			// the screen, add it to the one we got before
			// and display the result
			int num = Integer.parseInt(screen.getText());
			int result = acc + num;
			screen.setText(String.valueOf(result));
		
				
		}
		
	}

}
