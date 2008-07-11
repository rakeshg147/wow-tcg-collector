package common;

import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				//On crée une nouvelle instance de notre JDialog
				gui.MainFrame fenetre = new gui.MainFrame();
				fenetre.setVisible(true);//On la rend visible
			}
		});
	}

}
