package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

	// The controller should hold my
	// Action listener. This guy would be
	// in charge of "Listening" the view
	// and commanding to the model
	
	// This class must have an instance
	// of both, the view and the model
	View view;
	Model model;
	
	public Controller() {
		
		// The constructor, creates the 
		// new instances of the model and the
		// the view
		
		// Also, because the view contains the
		// the buttons, I need to provide a
		// Listener, and the listener is the 
		// controller.
		view = new View(this);
		model = new Model();
		
	}

	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getActionCommand().equals("add")) {
			
			// Here, what to do when the button
			// is clicked
			
			// Take the text from the text fields			
			String text1 = view.getTextTF1();
			String text2 = view.getTextTF2();
			
			// Convert that text into integers
			int a = Integer.parseInt(text1);
			int b = Integer.parseInt(text2);
			
			// Perform the addition using the 
			// model (remember that the model 
			// holds all the business logic)
			int result = model.add(a, b);
			
			// Convert the result into a string
			String resultText = String.valueOf(result);
			
			// Refresh the screen with the result
			view.setTextTF3(resultText);
		}
	}
	
	
	
}
