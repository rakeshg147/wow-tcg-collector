package gui;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MainFrame extends JFrame{

	public MainFrame(){
		super();
		
		build();//On initialise notre fenêtre
	}
	
	private void build(){
		setTitle("Fenêtre qui affiche du texte"); //On donne un titre à l'application
		setSize(320,240); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(true); //On permet le redimensionnement
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		setContentPane(buildContentPane());
	}

	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JButton bouton = new JButton("Cliquez ici !");
		panel.add(bouton);
		
		JButton bouton2 = new JButton("Ou là !");
		panel.add(bouton2);
		
		return panel;
	}
}
