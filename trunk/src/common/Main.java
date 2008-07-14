package common;

import javax.swing.SwingUtilities;
import xml.ReadCards;

public class Main {
	
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
			    Logs.start();
			    ReadCards.readCardsInXML();

				//Create and display the main frame
				gui.MainFrame mainFrame = new gui.MainFrame();
				mainFrame.setVisible(true); 
				
			}
		});
	}

}
