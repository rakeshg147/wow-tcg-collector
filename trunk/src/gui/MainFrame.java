package gui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;

import sun.tools.jar.JarImageSource;

import common.Card;
import common.CardsList;

public class MainFrame extends JFrame implements ActionListener{

	private int W_CARD_MIN=312; // min width of the card image panel
	private int H_CARD_IM_MIN=445; // min height of the card image panel
	private int H_CARD_TXT_MIN=200; // min height of the card text panel
	private int H_CARD_MIN=H_CARD_TXT_MIN + H_CARD_IM_MIN; // min height of the card panel
	
	private int W_MAIN_MIN=400; // min width of the main panel
	private int H_MAIN_STAT_MIN=100; // min height of the main static Panel (filter...)
	private int H_MAIN_VAR_MIN=300; // min height of the main variable Panel (table...)
	private int H_MAIN_MIN=H_MAIN_VAR_MIN + H_MAIN_STAT_MIN; // min height of the main Panel (table...)
	
	private int W_MIN=W_CARD_MIN+W_MAIN_MIN; // min width of the window
	private int H_MIN=Math.max(H_CARD_MIN ,H_MAIN_MIN); //min height of the window

	private int W_START=800; // start width of the window
	private int H_START=600; //min height of the window

	private Image image;
	private ImagePane imagePane;
	
	private JSplitPane contentPane;
	private JSplitPane panelMainCollec;
	private JPanel panelMainCollecFilter;
	private JTable jTable;
	private JSplitPane panelCard;
	private JPanel panelCardImage;
	private JPanel panelCardText;

	public MainFrame(){
		super();
		build();
	}
	
	private void build(){
		setTitle("WoW TCG Collector"); 
		setSize(W_START,H_START); 
		setMinimumSize(new Dimension(W_MIN, H_MIN));
		setLocationRelativeTo(null); 
		setResizable(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setContentPane(builContentPane());
	}

	
	private JSplitPane builContentPane(){
		contentPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,buildPanelCard(),buildPanelMainCollec());
		contentPane.setOneTouchExpandable(false);
		contentPane.setDividerLocation(W_CARD_MIN);
		contentPane.setDividerSize(0); // 0: no devider
		contentPane.setResizeWeight(0); // 1: the left pane is resized, 0 the right pane is resized, 0.5 both are resized...
		return contentPane;
	}
	
	private JSplitPane buildPanelMainCollec(){
		panelMainCollec = new JSplitPane(JSplitPane.VERTICAL_SPLIT, buildPanelMainCollecTable(), buildPanelMainCollecFilter());
		panelMainCollec.setMinimumSize(new Dimension(312, 445));
		panelMainCollec.setOneTouchExpandable(false);
		panelMainCollec.setDividerLocation(H_START-H_MAIN_STAT_MIN);
		panelMainCollec.setDividerSize(0); // 0: no devider
		panelMainCollec.setResizeWeight(1); // 1: the bottom pane is resized, 0 the top pane is resized, 0.5 both are resized...
		return panelMainCollec;
	}
	
	
	private JPanel buildPanelMainCollecFilter(){
		panelMainCollecFilter = new JPanel();
		panelMainCollecFilter.setMinimumSize(new Dimension(W_MAIN_MIN, H_MAIN_STAT_MIN));
		JButton bouton = new JButton("Cliquez ici !");
		bouton.addActionListener(this);
		panelMainCollecFilter.add(bouton);
		return panelMainCollecFilter;
	}
	
	private JScrollPane buildPanelMainCollecTable(){
		jTable = new JTable(loadCardList());
		jTable.addMouseListener(new TableMouseListener());
		JScrollPane panelMainCollecTable = new JScrollPane(jTable);
		panelMainCollecTable.setMinimumSize(new Dimension(W_MAIN_MIN, H_MAIN_VAR_MIN));
		return panelMainCollecTable;
	}
	
	
	private JSplitPane buildPanelCard(){
		panelCard = new JSplitPane(JSplitPane.VERTICAL_SPLIT, buildPanelCardImage(), buildPanelCardText());
		panelCard.setMinimumSize(new Dimension(W_CARD_MIN, H_CARD_MIN));
		panelCard.setOneTouchExpandable(false);
		panelCard.setDividerLocation(H_CARD_IM_MIN);
		panelCard.setDividerSize(0); // 0: no devider
		panelCard.setResizeWeight(0); // 1: the left pane is resized, 0 the right pane is resized, 0.5 both are resized...
		return panelCard;
	}
	
	private JPanel buildPanelCardImage(){
		panelCardImage = new JPanel();
		panelCardImage.setMinimumSize(new Dimension(W_CARD_MIN, H_CARD_IM_MIN));
		image = Toolkit.getDefaultToolkit().getImage("img/back.jpg");
		imagePane= new ImagePane();
		panelCardImage.add(imagePane);
		return panelCardImage;
	}
	
	private JPanel buildPanelCardImage(String im){
		panelCardImage = new JPanel();
		panelCardImage.setMinimumSize(new Dimension(W_CARD_MIN, H_CARD_IM_MIN));
		image = Toolkit.getDefaultToolkit().getImage(im);
		imagePane= new ImagePane();
		panelCardImage.add(imagePane);
		return panelCardImage;
	}
	
	private JPanel buildPanelCardText(){
		panelCardText = new JPanel();
		panelCardText.setMinimumSize(new Dimension(W_CARD_MIN, H_CARD_TXT_MIN));
		JButton bouton = new JButton("Texte de carte");
		bouton.addActionListener(this);
		panelCardText.add(bouton);
		return panelCardText;
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Clic");

	}
	
	private TableCardList loadCardList(){
		TableCardList cardList = new TableCardList();	
		return cardList;
	}
	
    class ImagePane extends JPanel {
    	/** auto generated */
		private static final long serialVersionUID = 1L;
		ImagePane() {
    	    setPreferredSize(new Dimension(W_CARD_MIN,H_CARD_IM_MIN));
    	}	    
    	public void paintComponent(Graphics g) {
    	    super.paintComponent(g);
    	    g.drawImage(image, 6, 0, this);
    	}
    }
    
	class TableMouseListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			changeCurrentCard(CardsList.getCardByOrder(jTable.getSelectedRow())); //e.getComponent()
		}
			
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		
		private void changeCurrentCard(Card card){
			buildPanelCardImage("img/MoL/Mol-129.jpg");
			//image = Toolkit.getDefaultToolkit().getImage("img/MoL/Mol-129.jpg");
			//panelCardImage.imageUpdate(image, 0, 0, 0, 100, 100);
			System.out.println("0d0d");
		}
	}
}

