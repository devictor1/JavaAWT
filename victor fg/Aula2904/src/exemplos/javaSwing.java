package exemplos;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class javaSwing extends Frame {
	  
	// initializing using constructor  
	javaSwing() {  
	  
	    // creating a button   
	    Button b = new Button("Click Me!!");  
	  
	    // setting button position on screen  
	    b.setBounds(30,100,80,30);  
	  
	    // adding button into frame    
	    add(b);  
	  
	    // frame size 300 width and 300 height    
	    setSize(300,300);  
	  
	    // setting the title of Frame  
	    setTitle("Basic AWT example");   
	          
	    // no layout manager   
	    setLayout(null);   
	  
	    // now frame will be visible, by default it is not visible    
	    setVisible(true); 
	    addWindowListener(new WindowAdapter() {    
	        public void windowClosing(WindowEvent e) {    
	            dispose();    
	        }    
	    });
	}
	  
	public static void main(String args[]) {   
	    // creating instance of Frame class   
	    javaSwing f = new javaSwing();    
	}  
}
