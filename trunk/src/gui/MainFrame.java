package gui;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MainFrame extends JFrame{

	public MainFrame(){
		super();
		
		build();//On initialise notre fen�tre
	}
	
	private void build(){
		setTitle("Fen�tre qui affiche du texte"); //On donne un titre � l'application
		setSize(320,240); //On donne une taille � notre fen�tre
		setLocationRelativeTo(null); //On centre la fen�tre sur l'�cran
		setResizable(true); //On permet le redimensionnement
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit � l'application de se fermer lors du clic sur la croix
		setContentPane(buildContentPane());
	}

	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JButton bouton = new JButton("Cliquez ici !");
		panel.add(bouton);
		
		JButton bouton2 = new JButton("Ou l� !");
		panel.add(bouton2);
		
		return panel;
	}
}
