package exemplos;

import java.awt.*; 
import java.awt.event.WindowAdapter;    
import java.awt.event.WindowEvent;   

public class javaSwing2 extends Frame {     
		  
	// initializing using constructor  
	javaSwing2() {  
	  
	    // creating a Label  
	    Label l = new Label("Employee id:");   
	  
	    // creating a Button  
	    Button b = new Button("Submit");  
	  
	    // creating a TextField  
	    TextField t = new TextField();  
	  
	    // setting position of above components in the frame  
	    l.setBounds(20, 80, 80, 30);  
	    t.setBounds(20, 100, 80, 30);  
	    b.setBounds(100, 100, 80, 30);  
	  
	    // adding components into frame    
	    add(b);  
	    add(l);  
	    add(t);  
	  
	    // frame size 300 width and 300 height    
	    setSize(400,300);  
	  
	    // setting the title of frame  
	    setTitle("Employee info");   
	          
	    // no layout  
	    setLayout(null);   
	  
	    // now frame will be visible, by default it is not visible    
	    setVisible(true);  
	  
	    // adding window listener
	    addWindowListener(new WindowAdapter() {    
	        public void windowClosing(WindowEvent e) {    
	            dispose();    
	        }    
	    });    
	} 
	  
	// main method  
	public static void main(String args[]) {   
	  
	    // creating instance of Frame class   
	    javaSwing2 awt_obj = new javaSwing2();    
	  
	}  
}
