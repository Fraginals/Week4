package mvc;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame{
	
	
	// This class is the same view that 
	// we had before. The only difference is
	// that we don't have the action listener here
	
	// text fields must be global so
	// all methods can access them
	// However, they are private
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private Controller control;

	// Important!!!
	// My buttons will need the action listener
	// So, we need to get ir from outside in the 
	// constructor
	public View (Controller controllerFromOutside) {
		
		// Moving the controller from outside
		// into my internal reference
		this.control = controllerFromOutside;
		this.settings();
		this.creatingElements();
	}
	
	// This method holds only the settings
	// of the frame
	private void settings() {
		this.setVisible(true);
		this.setSize(800,200);
	}
	
	// This method organises the comonent 
	// on the frame
	private void creatingElements() {
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		tf3 = new JTextField(20);
		JButton btn = new JButton("Add");
		btn.addActionListener(control);
		btn.setActionCommand("add");
		
		JPanel panel = new JPanel();
		panel.add(tf1);
		panel.add(tf2);
		panel.add(btn);
		panel.add(tf3);
		
		this.add(panel);
		
		this.validate();
		this.repaint();		
		
	}
	
	// These methods allow access to the 
	// text fields
	
	// Set text in the text field 3
	public void setTextTF3(String data) {
		tf3.setText(data);
	}
	
	// Get text from the text field 1
	public String getTextTF1() {
		return tf1.getText();
	}
	
	// Get text from the text field 2
	public String getTextTF2() {
		return tf2.getText();
	}
	
}
