package org.bonn.se2.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class FlexGUI implements ActionListener {
    
    // Das JFrame
	JFrame frame = new JFrame("FlexGUI");
    
    // Die Buttons
    JButton button = new JButton("Button");
    JButton button2 = new JButton("Button");
    JTextField field = new JTextField("0" , 5);
    JLabel label = new JLabel("Enter:");
    
 
    /*
    Methode wird nach dem Druecken des Buttons aufgerufen!
    */
    public void actionPerformed(ActionEvent e) {
        // aktualisiere den Titel des Buttons
    	String str = field.getText();
    	
    	if (  e.getActionCommand().equals("Add") ) {
    		// Container.addText (  str ) ; 
    	}

    }
   
    public void show() {
        button.setText("Add");
        button2.setText("Delete");
        // Registriere dieses Frame (= this!) als Listener des Buttons!
        button.addActionListener(this);
        
        // Setze den LayoutManager
        frame.setLayout(new FlowLayout());
        
        // Fuege GUI-Elemente dem Frame hinzu
        frame.add( label );
        frame.add( field );
        frame.add ( button );
        frame.add ( button2 );
        
        
        // Mache das Frame sichtbar!
        frame.setSize(250, 100);
        frame.setVisible(true);
    }
     
    public static void main(String[] args) {
        FlexGUI gui = new FlexGUI();
        gui.show();
    }
  
}
